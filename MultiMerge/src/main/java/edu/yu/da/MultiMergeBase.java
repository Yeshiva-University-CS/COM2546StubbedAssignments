package edu.yu.da;

/** Specifies the divide-and-conquer MultiMerge API per the requirements
 * document.
 *
 * Students may not modify this class in any way, nor may they add any
 * constructors to this class.
 * 
 * @author Avraham Leff
 */

abstract public class MultiMergeBase {

  /** Constructor
   */
  public MultiMergeBase() {
    // no-op
  }

  /** Does a divide-and-conquer mergesort on the z integer-valued arrays (first
   * dimension is the ith array).
   * 
   * Note: the client maintains ownership of the input parameter,
   * i.e., invoking this method is a non-destructive operation.
   *
   * @param arrays z (z >= 1) integer valued arrays, each of which is sorted,
   * and of identical size n where n>0 and need not be a power of two.  Results
   * are undefined if the arrays aren't sorted, or if they aren't the same
   * size.
   * @return result array of size "z * n": when the method completes, holds the
   * sorted contents of all input arrays.
   */
  abstract public int[] merge(final int[][] arrays);

  /** This method must be invoked every time that the merge implementation
   * combines the result of a divide-and-conquer merge call.
   */
  public void combinedAMerge() {
    nCombinedMerges++;
  }

  public int getNCombinedMerges() {
    return nCombinedMerges;
  }

  private int nCombinedMerges = 0;

}
