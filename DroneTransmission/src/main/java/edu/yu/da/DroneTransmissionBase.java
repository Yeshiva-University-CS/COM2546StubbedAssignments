package edu.yu.da;

/** Defines the API for the DroneTransmission assignment using an abstract base
 * class which students will extend to provide a concrete class named
 * DroneTransmission.  See the requirements document for more information.
 *
 * Students MAY NOT change, or add to, the public APIs below.  My test code
 * will only invoke the API defined below.
 *
 * Design note: implementors MUST assume a single-threaded environment.
 *
 * @author Avraham Leff
 */
public abstract class DroneTransmissionBase {

  /** Constructor supplies the drone transmission state.
   *
   * @param D a drone can only receive a message if it's within D units
   * distance from the drone transmitter.  Client's responsibility to only
   * provide a positive-valued parameter.
   * @param initialPositions the initial drone x-value positions in sorted
   * order (left-to-right on the one-dimensional world).
   *
   * It's the client's responsibility to ensure that values are not negative
   * and that they are in ascending position order.  It's the client's
   * responsibility to ensure that array size is at least one.  Client
   * maintains ownership.
   */
  public DroneTransmissionBase(double D, double[] initialPositions) {
  }
   
  /** Given the configuration state supplied in the constructor, returns the
   * minimum amount of time (in seconds) required for all drones to receive a
   * given message.
   */
  public abstract double doIt();
}
