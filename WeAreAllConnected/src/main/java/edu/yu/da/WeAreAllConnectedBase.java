package edu.yu.da;

/** Defines the API for specifying and solving the WeAreAllConnected problem
 * (see the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they add ANY
 * constructor.
 *
 * @author Avraham Leff
 */

import java.util.List;

public class WeAreAllConnectedBase {

  /** Inner class defines the Segment interface for connecting city x to city y
   * with a communication link of specified duration.  
   *
   * Students MAY NOT change the public API of this class, nor may they add ANY
   * constructor, nor may they change the constructor implementation in any way.
   *
   * Students must provide a static implementation class (in WeAreAllConnected)
   * that extends SegmentBase.  The student-provided class may add methods to
   * taste, but my test code will only access the immutable instance variables
   * and the constructor.
   *
   * IMPORTANT: Instances of SegmentBase are returned by your implementation to
   * clients, including test clients.  Consider the implications thereof as you
   * code.
   */
  public static class SegmentBase {
    public final int x, y, duration;

    /** Constructor.
     *
     * @param x one end of a communication segment, specified by a city id
     * (0..n-1)
     * @param y one end of a communication segment, specified by a city id
     * (0..n-1).  You may assume that "x" differs from "y".
     * @param duration unit-less amount of time required for a message to
     * travel from either end of the segment to the other.  You may assume that
     * duration is non-negative.
     */
    public SegmentBase(final int x, final int y, final int duration) {
      this.x = x;
      this.y = y;
      this.duration = duration;
    }
  } // static inner Segment class

  /** Constructor.  No-op implementation.
   */
  public WeAreAllConnectedBase() {
    // any additional function to be provided by the subclassed implementation
  }

  /** Given a list of the current communication system's segments and a list of
   * possible segments that can be added to the current system, select exactly
   * one segment from the set of possibilities to be added to the current
   * communication system.  You may assume that all segments supplied by the
   * client satisfy Segment semantics.
   *
   * @param n the ids of all cities referenced by SegmentBase instances lie in
   * the range 0..n-1 (inclusive).
   * @param current the current communication system defined as a list of
   * segments.  The client maintains ownership of this parameter.
   * @param possibilities one possible segment will be selected from this list
   * to be added to the current communication system.  The client maintains
   * ownership of this parameter.
   * @return the segment from the set of possibilities that provides the best
   * improvement in the total duration of the current system.  Total duration
   * is defined as the sum of the durations between all pairs of cities x and y
   * in the current system.  If more than one segment qualifies, return any of
   * those possibilities.
   */
  public SegmentBase 
    findBest(int n, List<SegmentBase> current, List<SegmentBase> possibilities)
  {
    return null;
  }

} // WeAreAllConnectedBase
