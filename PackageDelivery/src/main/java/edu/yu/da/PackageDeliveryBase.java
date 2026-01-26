package edu.yu.da;

/** Defines the API for the PackageDelivery assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * PackageDelivery.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

public abstract class PackageDeliveryBase {

  /** Constructor: specify the width and length dimensions of the package
   * delivery area (width and length are the same size).  The height dimension
   * is defined implicitly by client invocations of addNavigableCube().
   *
   * @param areaDimensions width and length dimensions.
   * @throws IllegalArgumentException if areaDimensions is less than 2.
   * @see #addNavigableCube(int, int, int, boolean)
   */
  public PackageDeliveryBase(final int areaDimensions) {
  }

  /** The airspace through which a drone navigates is modeled as a
   * three-dimensional cube containing a set of one-unit cubes.  The location
   * of each one-unit cube is specified by a three dimensional (x, y, z) point
   * representing the center of the cube.  Drones can navigate through either
   * "empty" areas or "address" cubes.
   *
   * @param x width
   * @param y length
   * @param z height
   * @param isAddress, true if the coordinate specifies a package delivery
   * address, false otherwise (in that case, the 1-unit cube is a empty but
   * navigable 1-unit cube) address).
   * @throws IllegalArgumentException if any of the coordinate parameters are
   * less than 0.
   */
  public abstract void addNavigableCube(int x,  int y,  int z,  boolean isAddress);
  
  /** Specifies the warehouse address by supplying the origin coordinates of
   * its 1-unit cube.
   *
   * @param x width
   * @param y length
   * @param z height
   */
  public abstract void setViragoWarehouse( int x,  int y,  int z);

  /** Given the current set of 1-unit cubes (including the warehouse location),
   * compute a path that starts at the Virago warehouse "cube", delivers a
   * package to each address "cube", and returns to the warehouse such that the
   * path minimizes the "height gap".  The "height gap" is the difference
   * between the highest and lowest altitude adjacent "cubes" traversed by the
   * drone on a given legal path.
   *
   * @return the min possible height gap over all legal package delivery paths.
   */
  public abstract int minHeightGap();
} // abstract base class



