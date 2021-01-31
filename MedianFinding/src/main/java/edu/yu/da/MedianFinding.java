package edu.yu.da;

/**
 *
 * @author Avraham Leff
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedianFinding {
  public static void main(String[] args) {
  }

  /** Immutable account class for pedagogic purposes only since it's not very
   * useful.
   */
  public static class Account implements Comparable<Account> {
    /** Initializes the account with an income field.
     */
    public Account(final double accountIncome) {
      income = accountIncome;
    }

    public double getIncome() { return income; }

    public int compareTo(final Account that) {
      return -1;
    }

    private final double income;
  } // static inner class

  /** Finds the median account (with respect to account income) over two sets
   * of accounts.  The two sets are of the same length.
   *
   * @param set1 A sorted, in ascending order, with respect to account
   * income, non-null array of accounts.  If the array is not sorted correctly,
   * the results of the method are undefined.
   * @param set2 A sorted, in ascending order, with respect to account
   * income, non-null array of accounts.  If the array is not sorted correctly,
   * the results of the method are undefined.
   * @return Account record that has the median income with respect to
   * all accounts in the union of set1 and set2.
   */
  public static Account findMedian(final Account[] set1, final Account[] set2) {
    return null;
  } // findMedian

  private final static Logger logger = LogManager.getLogger(MedianFinding.class);
}
