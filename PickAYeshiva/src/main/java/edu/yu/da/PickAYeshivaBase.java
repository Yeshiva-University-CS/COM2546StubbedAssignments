package edu.yu.da;

/** Defines the API for specifying and solving the PickAYeshiva problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class PickAYeshivaBase {
  /** Constructor which supplies the yeshiva rankings in terms of two factors
   * of interest.  The constructor executes a divide-and-conquer algorithm to
   * determine the minimum number of yeshiva-to-yeshiva comparisons required to
   * make a "which yeshiva to attend" decision.  The getters can be accessed in
   * O(1) time after the constructor executes successfully.
   *
   * It is the client's responsibility to ensure that no pair of
   * facultyRatioRankings and cookingRankings values are duplicates.
   *
   * @param facultyRatioRankings Array whose ith element is the value of the
   * ith yeshiva with respect to its faculty-to-student ratio (Rabbeim etc).
   * Client maintains ownership.  Can't be null and must be same length as the
   * other parameter.
   * @param cookingRankings Array whose ith element is the value of the ith
   * yeshiva with respect to the quality of the cooking.  Client maintains
   * ownership.  Can't be null and must be same length as other parameter.
   * @throws IllegalArgumentException if pre-conditions are violated.
   */
  public PickAYeshivaBase(double[] facultyRatioRankings, double[] cookingRankings) {
    // sub-classed implementation may want to add code here
  }

  /** Returns an array of yeshiva faculty ranking ratio values that MUST be
   * evaluated (along with the yeshiva's cooking rankings) to make the best
   * "which yeshiva to attend" decision.  
   *
   * @return An array, that together with the other getter, represents the
   * MINIMUM set of yeshivos that must be evaluated.  The ith element of this
   * array MUST BE associated with the ith element of the other getter's array.
   * @see getCookingRankings
   */
  public abstract double[] getFacultyRatioRankings();

  /** Returns an array of yeshiva cooking ranking values that MUST be evaluated
   * (along with the yeshiva's faculty ratio rankings) to make the best "which
   * yeshiva to attend" decision.  
   *
   * @return An array, that together with the other getter, represents the
   * MINIMUM set of yeshivos that must be evaluated.  The ith element of this
   * array MUST BE associated with the ith element of the other getter's array.
   * @see getFacultyRatioRankings
   */
  public abstract double[] getCookingRankings();
  

} // class
