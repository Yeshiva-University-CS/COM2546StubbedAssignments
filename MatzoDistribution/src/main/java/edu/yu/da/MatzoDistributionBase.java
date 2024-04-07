package edu.yu.da;

/** Defines the API for specifying and solving the MatzoDistribution problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class MatzoDistributionBase {

  /** Constructor: defines the two "endpoints" of the distribution network.
   *
   * @param sourceWarehouse names the warehouse that initiates the matzo
   * distribution, cannot be blank, must differ from destinationWarehouse.
   * @param sourceConstraint positive-valued-integer representing an upper
   * bound on the amount of matzo packages that can be distributed per day from
   * the source warehouse.
   * @param destinationWarehouse names the warehouse to which all matzos must
   * ultimately be delivered, cannot be blank, must differ from sourceWarehouse.
   * @throws IllegalArgumentException if the parameter pre-conditions are not
   * met.
   */
  public MatzoDistributionBase(final String sourceWarehouse,
                               final int sourceConstraint,
                               final String destinationWarehouse)
  {
    // sub-classed implementation may want to add function to its constructor
  }

  /** Adds a warehouse to the distribution network.
   *
   * @param warehouseId uniquely identifies the warehouse, cannot previously
   * have been added to the network, cannot be "blank".
   * @param constraint positive-valued-integer representing an upper bound on
   * the amount of matzo packages that can be distributed per day from that
   * warehouse.
   * @throws IllegalArgumentException if the parameter pre-conditions are not
   * met.
   */
  public abstract void addWarehouse(String warehouseId, int constraint);

  /** Specify that a road exists from warehouse1 to warehouse2 with a
   * constraint on the capacity of the road.
   *
   * @param w1 warehouse 1, must have already been added to the distribution
   * network, different from w2, cannot be blank.
   * @param w2 warehouse 2, must have already been added to the distribution
   * network, different from w1, cannot be blank.
   * @param constraint positive-valued-integer, representing an upper bound on
   * the amount of matzo packages per day that can be distributed on this road.
   */
  public abstract void roadExists(String w1, String w2, int constraint);

  /** Returns the maximum amount of matzos per day that the source warehouse
   * can deliver to the destination warehouse.
   *
   * @return the maximum per-day amount of matzos that can be distributed given
   * the distribution network's constraints.
   */
  public abstract int max();
} // class
