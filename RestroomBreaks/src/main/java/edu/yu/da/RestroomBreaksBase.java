package edu.yu.da;

/** Defines the API for the RestroomBreaks assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * RestroomBreaks.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

public abstract class RestroomBreaksBase {

  /** Constructor.
   *
   * @param classDuration the number of minutes for which the class is
   * scheduled (class starts at exactly time=0 and continues for the specified
   * number of minutes). Must be greater than 0, client is responsible for
   * supplying a valid value.
   * @param studentBreakDurations non-null, non-empty array, containing at
   * least one element, representing the length of time that each student
   * occupies a restroom: the ith array element corresponds to the ith student.
   * Students are represented in 0..n-1 fashion.  Client is responsible for
   * supplying a valid value and maintains ownership.
   */
  public RestroomBreaksBase (int classDuration, int[] studentBreakDurations) {
  }

  /** The time that each student will stay in the classroom before leaving for
   * a restroom break.  Having left the classroom, the student immediately
   * begins the restroom break, stays for the specified duration, then leaves
   * the restroom and returns to the classroom.
   *
   * Either restroom, so long as it is available, can be used by any student.
   * The ith element of the returned array MUST correspond to the ith student
   * specified in the studentBreakDurations supplied in the constructor.
   *
   * @return the time (beginning at 0) that each student stays in the classroom
   * before leaving for their restroom break.
   */
  public abstract int[] scheduleThem();
} // abstract base class
