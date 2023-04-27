package edu.yu.da;

/** Defines the API for specifying and solving the OverfullGranaries problem
 * (see the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they add ANY
 * constructor.

 * @author Avraham Leff
 */


import java.util.*;

public class OverfullGranaries {

  /** Represents the 10_000 bushels of grain that must be moved from the
   * overfull granaries to the underfull granaries
   */
  public final static double BUSHELS_TO_MOVE = 10_000;

  /** Constructor.
   *
   * @param X labelling of the overfull granaries, must contain at least one
   * element and no duplicates.  No element of X can be an element of Y.
   * @param Y labelling of the underfull granaries, must contain at least one
   * element and no duplicates.  No element of Y can be an element of X.
   */
  public OverfullGranaries(final String[] X, final String[] Y) {
    // fill me in please!
  }

  /** Specifies that an edge exists from the specified src to the specified
   * dest of specified capacity.  It is legal to invoke edgeExists between
   * nodes in X, between nodes in Y, from a node in X to a node in Y, or for
   * src and dest to be hitherto unknown nodes.  The method cannot specify a
   * node in Y to be the src, nor can it specify a node in X to be the dest.
   *
   * @param src must contain at least one character
   * @param dest must contain at least one character, can't equal src
   * @param capacity must be greater than 0, and is specified implicitly to be
   * "bushels per hour"
   */
  public void edgeExists(final String src, final String dest, final int capacity)
  {
    // fill me in please
  }

  /** Solves the OverfullGranaries problem.
   *
   * @return the minimum number hours neeed to achieve the goal of moving
   * BUSHELS_TO_MOVE number of bushels from the X granaries to the Y granaries
   * along the specified road map.
   * @note clients may only invoke this method after all relevant edgeExists
   * calls have been successfully invoked.
   */
  public double solveIt() {
    return 0.0;
  }

  /** Return the names of all vertices in the X side of the min-cut, sorted by
   * ascending lexicographical order.
   *
   * @return only the names of the vertices in the X side of the min-cut
   * @note clients may only invoke this method after solveIt has been
   * successfully invoked.  Else throw an ISE.
   */
  public List<String> minCut() {
    return null;
  }

} // OverfullGranaries
