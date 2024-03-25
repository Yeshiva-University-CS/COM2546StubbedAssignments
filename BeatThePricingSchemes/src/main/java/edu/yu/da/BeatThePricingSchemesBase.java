package edu.yu.da;

/** Defines the API for specifying and solving the BeatThePricingSchemes
 * problem (see the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * Lifecycle note: the client may invoke addPricingScheme() N times (N >= 1)
 * and then invole cheapestPrice().  The implementation of cheapestPrice must
 * consider all pricing schemes supplied heretofore by the client.  The client
 * may continue supplying additional pricing schema, interspersed with
 * invocations of cheapestPrice().  Whenever cheapestPrice() is invoked, the
 * implementation must consider all currently defined pricing schemas.  Any
 * invocation of cheapestPrice() can be followed by an invocation of
 * optimalDecisions() which returns the List of decisions that correspond to
 * the cheapest price.
 *
 * @author Avraham Leff
 */

import java.util.List;

public abstract class BeatThePricingSchemesBase {

  /** Defines the maximum number of price schemes that a client may supply to a
   * given BeatThePricingSchemes instance.
   */
  public final static int MAX_SCHEMES = 20;

  /** Defines the maximum number of matzos that a customer may supply as their
   * purchase threshold.
   */
  public final static int MAX_MATZOS = 100;

  /** Identifies the "unit price" price scheme (all other pricing schemes are
   * identified by the order they were added 1..N
   */
  public final static int UNIT_PRICE_DECISION = 0;


  /** Constructor: client specifies the price of a single quantity of the
   * desired item.
   *
   * @param unitPrice the price-per-single-unit, must be greater than 0.
   * @throw IllegalArgumentException if the parameter pre-conditions are
   * violated.
   */
  public BeatThePricingSchemesBase(double unitPrice) {
    // sub-classed implementation may want to add code here
  }

  /** Adds a pricing scheme to be considered when making the "select optimal
   * pricing schemes" decision.
   *
   * @param price the price to be paid for the specified quantity, must be
   * greater than 0.
   * @param quantity, which for the sake of DP, cannot exceed MAX_MATZOS and
   * must be greater than zero.
   * @throw IllegalArgumentException if the parameter pre-conditions are violated.
   * @see MAX_SCHEMES
   */
  public abstract void addPricingScheme(double price, int quantity);

  /** Returns the cheapest price needed to buy at least threshold items.  Thus
   * the quantity bought may exceed the threshold, as long as that is the
   * cheapest price for threshold number of items given the current set of
   * price schemas.
   *
   * @param threshold the minimum number of items to be purchased, cannot
   * exceed MAX_MATZOS, and must be greater than zero.
   * @return the cheapest price required to purchase at least the threshold
   * quantity.
   * @throw IllegalArgumentException if the parameter pre-conditions are violated.
   * @see MAX_MATZOS
   */
  public abstract double cheapestPrice(int threshold);

  /** Returns a list of optimal price scheme decisions corresponding to the
   * cheapest price.  If a unit price decision is made, it's represented by the
   * UNIT_PRICE_DECISION constant.  Otherwise, a price scheme is represented by
   * the order in which it was added to this instance: 1..N
   *
   * @see UNIT_PRICE_DECISION
   * @see cheapestPrice
   */
  public abstract List<Integer> optimalDecisions();
} // class
