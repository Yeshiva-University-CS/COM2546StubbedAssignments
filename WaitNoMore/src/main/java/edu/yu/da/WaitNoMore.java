package edu.yu.da;

/** Implements the WaitNoMoreI API.
 *
 * Students MAY NOT change the provided constructor signature!
 * 
 * @author Avraham Leff
 */

public class WaitNoMore implements WaitNoMoreI {

  /** No-op constructor
   */
  public WaitNoMore() {
    // no-op, students may change the implementation
  }

  @Override
  public int minTotalWaitingTime(final int[] durations, final int[] weights) {
      return -1;
  }
} // WaitNoMore
