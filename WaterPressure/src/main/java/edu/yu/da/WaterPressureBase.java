package edu.yu.da;

/** Defines the API for specifying and solving the WaterPressure problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Lifecycle: client creates instance, invokes addBlockage() 0..N-1 times,
 * optionally invokes addSecondInputPump(), invokes minAmount(), optionally
 * invokes addSecondInputPump() no more than once, and invokes minAmount().
 * Key point: clients may not invoke addBlockage() once they've invoked
 * minAmount().  These constraints are not intrinsically important: they are a
 * convenience for the implementation with respect to data-structure and state
 * maintenance.
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class WaterPressureBase {
  /** Constructor which supplies the initial input pump.
   *
   * @param initialStartPump, length must be greater than 0.
   * @throws IllegalArgumentException if the pre-conditions are violated.
   */
  public WaterPressureBase(String initialInputPump) {
    // sub-classed implementation may want to add code here
  }

  /** Adds a second input pump, differing from the initial input pump, to the
   * channel system.
   *
   * The second input pump must already be in the channel system (via
   * addBlockage): this method only designates the pump as also being an input
   * pump.
   *
   * @param secondInputPump, length must be greater than 0.
   * @throws IllegalArgumentException if the pre-conditions are violated.
   */   
  public abstract void addSecondInputPump(String secondInputPump);

  /** Specifies a blockage on a channel running from pump station v to pump
   * station w.  The presence of a blockage implies that water can only flow on
   * the channel if a quantity of water greater or equal to "blockage" is
   * pumped by pump station v to w.
   *
   * The two pump stations must differ from one another, and no channel can
   * already exist between the two pump stations.
   *
   * @param v specifies a pump station, length must be > 0.
   * @param w specifies a pump station, length must be > 0.
   * @param blockage the magnitude of the blockage on the channel, must be > 0.
   * @throws IllegalStateException if minAmount() has previously been invoked.
   * @throws IllegalArgumentException if the other pre-conditions are violated.
   */
  public abstract void addBlockage(String v, String w, double blockage);
  
  /** Client asks implementation to determine the minimum amount of water that
   * must be supplied to the initial input pump to ensure that water reaches
   * every pump station in the existing channel system.  If a second input pump
   * has been added to the channel system, the sematics of "minimum amount" is
   * the "minimum amount of water that must be supplied to BOTH input pump
   * stations".
   *
   * @return the minimum amount of water that must be supplied to the input
   * pump(s) to ensure that water reaches every pump station.  If the channel
   * system has been misconfigured such that no amount of water pumped from the
   * input pump stations can get water to all the pump stations, returns -1.0
   * as as sentinel value.
   */
  public abstract double minAmount();
} // class
