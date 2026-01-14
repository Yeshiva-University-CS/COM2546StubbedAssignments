package edu.yu.da;

/** Defines the API for the NestedDAndC assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * NestedDAndC.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */
public abstract class NestedDAndCBase {

  /** Constructor supplies the arrays to be merged into a single sorted array.
   *
   * @param arrays z (z >= 1) integer valued arrays, each of which is sorted in
   * ascending order.  The arrays need not be the same size, nor need they be a
   * power of two, but are neither empty nor null.
   *
   * Client's responsibility to ensure that the arrays parameter satisfies
   * these constraints.  Client maintains ownership.
   */
  public NestedDAndCBase(int[][] arrays) {
  }
   
  /** Produces a single array containing all elements from the constructor's
   * arrays parameter: the result array is sorted in ascending order.
   */
  public abstract int[] doIt();
}
