package edu.yu.da;

/** Defines the API for specifying and solving the MinimizeLinelandTaxes
 * problem (see the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

import java.util.*;

public abstract class MinimizeLinelandTaxesBase {

  /** Constructor.  Client supplies an array of 1..n tax requirements (the
   * array is of size 0..n, but the 0th element ISN'T USED) such that the ith
   * value specifies the tax requirement for use of the ith port, and ports are
   * labelled 1..n.
   *
   * When the constructor returns, the client must be able to invoke all
   * getters in O(1) cost: i.e., the constructor does all the work.
   *
   * @param taxes An array, of size at least 3, containing the tax requirements
   * for usage of a given port.  Values are non-negative-integer valued,
   * client's responsibility to ensure these semantics.  Client maintains
   * ownership.
   */
  public MinimizeLinelandTaxesBase(int[] taxes) {
  }

  /** Returns the cost of the route that minimizes the tax fees incurred when
   * travelling from port 1 to port n.
   *
   * @return the minimum cost.  If no route is possible, returns -1.
   */
  public abstract int minTaxRouteCost();

  /** Returns the optimal route from port 1 to port n as a sequence of
   * TripSegments.  If no route is possible, returns an empty list.
   */
  public abstract List<TripSegment> minTaxRoute();

  public static class TripSegment {
    public TripSegment (final int from, final int to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public String toString() {
      return from + " -> " + to;
    }
    
    // Design note: ok not to have getters and setters because immutable object
    //
    // Design note: despite this being a value class, clients commit to not
    // requiring override of equals() and hashCode().
    public final int from;
    public final int to;    
  } // static class TripSegment

  
} // abstract base class
