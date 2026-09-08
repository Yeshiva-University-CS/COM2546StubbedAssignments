package edu.yu.da;

/** Defines the API for the SinkholeFinder assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * SinkholeFinder.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */

public abstract class SinkholeFinderBase {

  /** Returned by SinkholeFinder.findSinkhole()
   */
  public record Sinkhole(int x, int y) {}

  /** Thrown when a client has performed too many "depth probes"
   */
  public static class TooManyProbesException extends Exception {
    public TooManyProbesException(final int limit, String message) {
      super(message);
      if (limit < 1) {
        throw new IllegalArgumentException("limit must be a positive integer: "+limit);
      }
      this.limit = limit;
    }

    // ok: immutable class
    public final int limit;
  } // TooManyProbesException

  /** Encapsulates a single depth probe of a N by N grid.
   */
  public interface TerrainProbe {
    /** Returns the depth at the given coordinates of the N by N grid.
     *
     * @param x x-coordinate, client responsible for ensuring that x is within
     * the grid bounds [0, N)
     * @param y y-coordinate, client responsible for ensuring that y is within
     * the grid bounds [0, N).
     * @throws TooManyProbesException thrown when the client has probed too
     * many times
     * @see SinkholeFinderBase#findSinkhole
     */
    int getDepth(int x, int y) throws TooManyProbesException;

    /** Given a grid of size N by N, getSize() returns N.
     */
    int getSize();
  }

  /** Constructor.
   */
  public SinkholeFinderBase() {
    // no-op implementation
  }

  /** Returns a Sinkhole (satisfying the definition provided by the
   * requirements document).
   *
   * @param probe Allows the implementation to probe the grid for the depth at
   * a given coordinate.  The probe can be invoked multiple times but
   * probe.getDepth() will throw TooManyProbesException when invoked more than
   * its internally defined limit.
   */
  public abstract Sinkhole findSinkhole(TerrainProbe probe) throws TooManyProbesException;

} // abstract base class
