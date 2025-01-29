package edu.yu.da;

/** Defines the API for specifying and solving the MaxTheKiddush problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class MaxTheKiddushBase {

  /** Constructor.
   *
   * @param bookings an ordered sequence of the number of tables required to be
   * booked by each member for a given kiddush.  May not be null or empty,
   * elements must be positive-integer-valued.
   * @param maxCapacity a positive integer representing the maximum number of
   * tables available in the kiddush room.
   * @throws IllegalArgumentException as warranted.
   */
  public MaxTheKiddushBase(int[] bookings, int maxCapacity) {
  }

  /** Returns the maximum number of members (possibly zero) that can scheduled
   * on a given Shabbos to share the kiddush room such that all potential
   * bookings respect all constraints specified in the requirements document.
   */
  abstract public int maxIt();
} // class
