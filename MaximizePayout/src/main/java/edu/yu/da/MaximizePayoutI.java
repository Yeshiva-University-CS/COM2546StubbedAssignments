package edu.yu.da;

/** Specifies the API for the MaximizePayout problem (see the requirements
 * document for details).
 *
 * @author Avraham Leff
 */

import java.util.List;

public interface MaximizePayoutI {

  /** Computes the maximum payout (per definition in the requirements doc) of
   * the two sets.  The results are undefined if any set element is less than
   * or equal to 0.
   *
   * @param A List of non-negative long elements, client maintains ownership
   * @param B List of non-negative long elements, client maintains ownership
   * @return the maximum payout possible given the input parameters.
   * @throws IllegalArgumentException if the two lists aren't the same size, if
   * sets are null, or if the sets are empty.
   */
  public long max(final List<Long> A, final List<Long> B);
} // MaximizePayoutI
