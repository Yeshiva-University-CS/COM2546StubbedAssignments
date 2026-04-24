package edu.yu.da;

/** Defines the API for the CircularSarachek assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * CircularSarachek.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

public abstract class CircularSarachekBase {

  /** Constructor.
   *
   * @param teamASkills skill levels of team A.  Array contains at least one
   * element, number of elements is identical to the teamB skills parameter,
   * all elements are greater than 0.  Client is responsible for parameter
   * validation.
   * @param teamBSkills skill levels of team B.  Array contains at least one
   * element, number of elements is identical to the teamA skills parameter,
   * all elements are greater than 0.  Client is responsible for parameter
   * validation.
   * @param tentativeAssignment array whose ith element's value specifies the
   * team A player who the ith team B player is tentatively assigned to play
   * against.  All teams consist of the same number of players, players are
   * labelled as 1..N (inclusive).  N is guaranteed to be less than a million.
   */
  public CircularSarachekBase(int[] teamASkills, int[] teamBSkills, int[] tentativeAssignment) {
  }

  /** Returns the maximum number of wins that teamB can win against teamA
   * following the rules specified in the requirements document.
   */
  public abstract int maxTeamBWins();

} // abstract base class
