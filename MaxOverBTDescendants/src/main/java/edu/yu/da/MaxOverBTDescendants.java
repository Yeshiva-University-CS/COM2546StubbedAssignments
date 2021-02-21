package edu.yu.da;

/** Encapsulates a set of "ancestors and descendants", modeled as a binary
 * tree, whose vertices are represented as unique non-negative integers.  Each
 * vertex_i is associated with a double-valued value_i which need not be unique
 * over the set of vertices.
 *
 * @author Avraham Leff
 */

public class MaxOverBTDescendants {

  /** Constructor: initializes a binary tree to have a root and value, and
   * specifies the number of vertices that will eventually populate the tree.
   *
   * @param V the number of vertices that will eventually populate the tree,
   * must be >= 1 (because tree must at least have a root)
   * @param root must be >= 0 and < V-1, and specifies the root vertex of the tree.
   * @param value the value associated with the root.
   */
  public MaxOverBTDescendants(final int V, final int root, final double value) {
    // fill me in
  }

  /** Connects the specified child vertex to the specified parent (which must
   * already be connected to the tree)
   *
   * @param parent a non-negative integer that identifies a vertex already
   * connected to the tree
   * @param child a non-negative integer that identifies a vertex being added
   * for the first (and only) time to the tree.
   * @param value the value associated with the child node
   * @throw IllegalArgumentException if the invariants are violated
   */
  public void addChild(final int parent, final int child, final double value) {
    // fill me in!
  }

  /** Returns an array whose ith element is the the maximum value, over all
   * values associated with the ith element's descendants in the tree,
   * including the value associated with the ith element itself.
   *
   * @return array of doubles with the semantics specified above.
   */
  public double[] maxOverAllBTDescendants() {
    // fill me in
    return null;
  }

}
