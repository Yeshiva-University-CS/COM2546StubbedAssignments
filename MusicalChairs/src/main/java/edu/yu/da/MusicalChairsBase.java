package edu.yu.da;

/** Defines the API for specifying and solving the MusicalChairs problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

public abstract class MusicalChairsBase {

  /** Constructor.
   *
   * @param nPeople number of people who will attempt to sit down:
   * positive-integer valued.
   * @param nChairs number of chairs into which people will attempt to sit, no
   * more than one persion per chair: positive-integer valued.
   * @throws IllegalArgumentException as appropriate.
   */
  public MusicalChairsBase(int nPeople, int nChairs) {
    // no-op constructor
  }

  /** Returns true iff personId who can sit only in either chair1 or chair2 is
   * able to sit, false otherwise.  The rules that determine whether the person
   * is able to sit are specified in the requirements doc.
   *
   * @param personId non-negative-integer valued, uniquely identifies the
   * person, must not have appeared previously in the sequence of "sitting
   * attempts".  Must be in the range 0..nPeople (inclusive, inclusive).
   * People need not try to sit in the order of their id.
   * @param chair1 positive-integer valued, a valid chair possibility for this
   * person, differs from chair2.  Must be in the range 1..nChairs (inclusive, inclusive).
   * @param chair2 positive-integer valued, an alternative chair possibility
   * for this person.  Must be in the range 1..nChairs (inclusive, inclusive).
   * @return true iff the person gets a chair given the previous sequence of
   * persons attempting to sit, false otherwise.
   * @throws IllegalArgumentException as appropriate
   */
  abstract public boolean tryToSit(int personId, int chair1, int chair2);
} // base class
