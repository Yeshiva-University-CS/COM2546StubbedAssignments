package edu.yu.da;

/** Defines the API for specifying and solving the DetectTerrorist problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they add ANY
 * constructor.
 *
 * @author Avraham Leff
 */

public class DetectTerrorist {

  /** Constructor: represents passengers to be detected as an array in which
   * the ith value is the weight of the ith passenger.  After the constructor
   * completes, clients can invoke getTerrorist() for a O(1) lookup cost.
   *
   * @param passengers an array of passenger weights, indexed 0..n-1.  All
   * passengers that are not terrorists have the same weight: that weight is
   * greater than the weight of the terrorist.  Exactly one passenger is a
   * terrorist.
   */
  public DetectTerrorist(final int[] passengers) {
    // fill me in!
  }   // constructor
  
  /** Returns the index of the passenger who has been determined to be a
   * terrorist.
   *
   * @return the index of the terrorist element.
   */
  public int getTerrorist() {
    return -1;
  }

} // DetectTerrorist
