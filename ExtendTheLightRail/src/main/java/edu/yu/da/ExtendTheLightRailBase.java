package edu.yu.da;

/** Defines the API for specifying and solving the ExtendTheLightRail problem
 * (see the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class ExtendTheLightRailBase {

  /** Constructor.  
   *      
   * @param trainStops an array containing exactly n/2 jewish train stops and
   * exactly n/2 other ethnicity train stops.  Clients are responsible for
   * ensuring that the array isn't null, isn't empty, and contains exactly n/2
   * of each type.  Clients are responsible for ensuring that train stop
   * locations don't have negative-values, and are unique.
   */
  public ExtendTheLightRailBase(final TrainStop[] trainStops) {
  }

  /** Returns the minimum possible cost of extending the light rail with n/2
   * unique extensions, subject to the constraint that every extension must
   * link train stops associated with different ethono-religious groups.
   */
  abstract public int cost();

  /** After pairing the train stops, the ith element of the returned value
   * contains the location of a jewish train stop which is paired with the ith
   * element of the array returned by aLocations().
   *
   * @return array of size n/2 jewish train stop locations.
   */
  abstract public int[] jLocations();

  /** After pairing the train stops, the ith element of the returned value
   * contains the location of the other ethnicity train stop which is paired
   * with the ith element of the array returned by jLocations().
   *
   * @return array of size n/2 other ethicity train stop locations.
   */
  abstract public int[] aLocations();
      
  /** Returns the minimum possible duration time required to prepare ALL of the n
   * stations for extension work with work performed on n/2 pairs in parallel.
   */
  abstract public int minPreparationDuration();

  /** After pairing train stops such that the preparation work needed to do the
   * extensions will be performed as a unit, the ith element of prepWork1
   * stores the prepWorkCost of one train stop; the corresponding prepWorkCost of
   * the paired station is stored in the ith element of prepWork2.
   *
   * @return array of size n/2 containing one half of the preparation work pairs.
   */
  abstract public int[] prepWork1();

  /** After pairing train stops such that the preparation work needed to do the
   * extensions will be performed as a unit, the ith element of prepWork2
   * stores the prepWorkCost of one train stop; the corresponding prepWorkCost of
   * the paired station is stored in the ith element of prepWork1.
   *
   * @return array of size n/2 containing the other half of the preparation work pairs.
   */
  abstract public int[] prepWork2();
  
  /** Represents a single train stop.
   */
  public static class TrainStop {
    public TrainStop (final boolean isJewish, final int location, final int prepWorkCost) {
      this.isJewish = isJewish;
      this.location = location;
      this.prepWorkCost = prepWorkCost;
    }

    @Override
    public String toString() {
      final String x = isJewish ? "jewish" : "arab";
      return x + ","+location+","+prepWorkCost;
    }
    
    // Design note: ok not to have getters and setters because immutable object
    //
    // Design note: despite this being a value class, clients commit to not
    // requiring override of equals() and hashCode().
    public final boolean isJewish;
    public final int location;
    public final int prepWorkCost;
  } // inner class TrainStop

} // class
