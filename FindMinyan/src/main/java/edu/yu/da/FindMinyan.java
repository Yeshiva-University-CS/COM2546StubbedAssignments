package edu.yu.da;

/** Defines the API for specifying and solving the FindMinyan problem (see the
 * requirements document).  Also defines an inner interface, and uses it as
 * part of the ArithmeticPuzzleI API definition.
 *
 * Students MAY NOT change the public API of this class, nor may they add ANY
 * constructor.
 *
 * @author Avraham Leff
 */

import java.util.*;

public class FindMinyan {

  /** Constructor: clients specify the number of cities involved in the
   * problem.  Cities are numbered 1..n, and for convenience, the "start" city
   * is labelled as "1", and the goal city is labelled as "n".
   *
   * @param nCities number of cities, must be greater than 1.
   */
  public FindMinyan(final int nCities) {
    // fill me in!
  }

  /** Defines a highway leading (bi-directionally) between two cities, of
   * specified duration.
   *
   * @param city1 identifies a 1 <= city <= n, must differ from city2
   * @param city2 identifies a 1 <= city <= n, must differ from city1
   * @param duration the bi-directional duration of a trip between the two
   * cities on this highway, must be non-negative
   */
  public void addHighway(final int city1, final int duration, final int city2) {
    // fill me in!
  }

  /** Specifies that a minyan can be found in the specified city.
   *
   * @param city identifies a 1 <= city <= n
   */
  public void hasMinyan(final int city) {
    // fill me in!
  }

  /** Find a solution to the FindMinyan problem based on state specified by the
   * constructor, addHighway(), and hasMinyan() API.  Clients access the
   * solution through the shortestDuration() and nShortestDurationTrips() APIs.
   */
  public void solveIt() {
    // fill me in!
  }

  /** Returns the duration of the shortest trip satisfying the FindMinyan
   * constraints.  
   *
   * @return duration of the shortest trip, undefined if client hasn't
   * previously invoked solveIt().
   */
  public int shortestDuration() {
    return -1;
  }

  /** Returns the number of distinct trips that satisfy the FindMinyan
   * constraints.
   * 
   * @return number of shortest duration trips, undefined if client hasn't
   * previously invoked solveIt()..
   */
  public int numberOfShortestTrips() {
    return -1;
  }
  
} // FindMinyan
