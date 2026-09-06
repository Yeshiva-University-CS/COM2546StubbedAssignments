package edu.yu.da;

/** Defines the API for the TreasureHunting assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * TreasureHunting.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: landmarks are uniquely identified by a positive integer, in the
 * range 1..N where N<=50,000, and are contiguous in the range 1..N
 *
 * Usage note: the intended life-cycle scenario is that a client can make any
 * number of (possibly interleaved) addRopeBridge and
 * addUpperBoundDistanceToTreasure invocation, followed by (at most) a single
 * invocation of whereToSearch.

 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

import java.util.Set;

public abstract class TreasureHuntingBase {

  /** Constructor.
   */
  public TreasureHuntingBase() {
    // no-op implementation
  }

  /** Specifies that a single rope-bridge makes it possible to navigate between
   * the specified landmarks.  Whatever the actual length of the rope-bridge,
   * its length is considered (from an algorithmic perspective) to be a single
   * unit in any given path.  A maximum of one rope-bridge connects these two
   * landmarks.  Because rope-bridges are bi-directional, (x, y) is a duplicate
   * of (y, x) and the implementation must throw IAE.  Similarly, the
   * implementation must throw an IAE if the client makes two calls that both
   * supply (x, y).
   *
   * @param u the id of one landmark, must be a positive integer
   * @param v the id of the other landmark, must be a positive integer that
   * differs from the parameter u.
   * @throws IllegalArgumentException if a client violates the specified
   * semantics.
   */
  public abstract void addRopeBridge(int u, int v);

  /** Specifies that the shortest path between the specified landmark and the
   * treasure landmark is less than or equal to the specified maximum distance.
   * At most one such specification may be made per landmark.  If a client
   * makes two calls for the same landmark, whether or not the two maxDistance
   * values agree, the implementation must throw IllegalArgumentException.
   *
   * @param landmark uniquely identifies an existing map landmark, must already
   * have been added to the map via a call to addRopeBridge().
   * @param maxDistance a non-negative distance metric of the shortest path
   * between the specified landmark and the treasure landmark.
   * @throws IllegalArgumentException if a client violates the specified
   * semantics.
   */
  public abstract void addUpperBoundDistanceToTreasure(int landmark, int maxDistance);

  /** Given the map topology defined by previous invocations of addRopeBridge()
   * and addUpperBoundDistanceToTreasure(), returns a Set of landmarks, each of
   * which is possibly the treaure landmark (where to search).  It is logically
   * impossible for any landmark that is not in the returned set to be the
   * treasure landmark.
   *
   * @return A set of possible treasure landmarks, Collections.emptySet() if no
   * map landmarks can possibly be a treasure landmark.
   */
  public abstract Set<Integer> whereToSearch();
} // abstract base class
