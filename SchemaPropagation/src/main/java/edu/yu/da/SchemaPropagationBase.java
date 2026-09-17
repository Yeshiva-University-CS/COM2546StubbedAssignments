package edu.yu.da;

/** Defines the API for the SchemaPropagation assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * SchemaPropagation.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class SchemaPropagationBase {

  /** Represents a single database node in the network topology.
   *
   * @param id Non-negative integer that uniquely identifies the node.
   * @param transmissionCost Non-negative, the time (in minutes) it takes for
   * this specific node to transmit the schema to exactly any of its direct
   * children.
   * @param children List of direct child nodes in the network topology.
   */
  public record NetworkNode(int id, long transmissionCost, List<NetworkNode> children) {

    /** Immutable constructor.
     */
    public NetworkNode {
      if (id < 0) {
        throw new IllegalArgumentException("Node id cannot be negative.");
      }
      
      if (transmissionCost < 0) {
        throw new IllegalArgumentException("Transmission cost cannot be negative.");
      }

      // Defensively copy the list to prevent external mutation during traversal
      children = (children == null) ? List.of() : List.copyOf(children);
    }
  }

  /** Represents a proposed optimal transmission schedule.  As we've discussed,
   * there are often multiple, equally optimal solutions to a given problem.
   * For SchemaPropagation, if multiple children have subtrees that require the
   * same time to complete, any relative ordering between them is considered
   * optimal.  The implementation's PropagationPlan is evaluated "as is" to
   * determine whether it achieves the claimed "minimal time".
   * 
   * @param minimumTime The calculated minimum completion time (in minutes) for
   * the entire network.
   * @param broadcastOrder A map linking each parent's Node ID to the ordered
   * list of its children's Node IDs. This defines the exact sequence in which
   * the parent will transmit the schema.
   *
   * Important: only nodes that transmit to at least one child are included as
   * Map keys.  Leaf nodes (any node with no children) may not be keys (both to
   * reduce object allocation overhead and because such nodes don't transmit so
   * irrelevant to the solution).
   *
   */
  public record PropagationPlan(long minimumTime, Map<Integer, List<Integer>> broadcastOrder) {
    /** Immutable constructor.
     */
    public PropagationPlan {
      if (broadcastOrder == null || broadcastOrder.isEmpty()) {
        broadcastOrder = Map.of();
      }
      else {
        // Defensively copy the map to prevent mutation 
        int capacity = (int) Math.ceil(broadcastOrder.size() / 0.75);
        Map<Integer, List<Integer>> deepCopy = new HashMap<>(capacity);
        
        for (Map.Entry<Integer, List<Integer>> entry : broadcastOrder.entrySet()) {
          deepCopy.put(entry.getKey(), List.copyOf(entry.getValue()));
        }

        broadcastOrder = Collections.unmodifiableMap(deepCopy);
      } // else
    }   // constructor
  }     // record 

  /** Computes the minimum total time required to propagate a schema update
   * from the root node to all descendant nodes in the network, and constructs
   * the corresponding schema propagation plan.  The plan must meet the
   * requirements detailed in the requirements document.
   *
   * @param root The root node of the network topology from which the schema
   * update originates .  If the network is empty (root is null), the plan
   * should reflect a time of 0 and an empty broadcast order.
   * @return A PropagationPlan detailing both the total time and the
   * transmission sequence.
   */
  public abstract PropagationPlan calculateMinimumPropagationTime(NetworkNode root);
} // abstract base class
