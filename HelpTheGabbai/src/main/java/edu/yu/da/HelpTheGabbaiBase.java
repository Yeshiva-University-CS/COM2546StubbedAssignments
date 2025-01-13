package edu.yu.da;

/** Defines the API for specifying and solving the HelpTheGabbai problem (see
 * the requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

import java.util.Iterator;

public abstract class HelpTheGabbaiBase {

  /** Constructor: client supplies at least one member and a corresponding
   * number of "amudGrants" such that the ith member is associated woth the ith
   * amudGrants element.
   *
   * @param members at least one element.  It's the client's responsbility to
   * ensure that the parameter isn't null, that member names are not null, not
   * empty, and unique.
   * @param amudGrants number of times that the corresponding member will lead
   * the services.  It's the client's responsibiliity to ensure that all
   * elements have values greater than 0.
   */
  public HelpTheGabbaiBase(final String members[], final int[] amudGrants) {
  }

  /** Returns an iterator over the member ids.  The implementation of Iterator
   * MUST produce a stream of member ids that, over some reasonable period,
   * very closely reflects the number of each member's amudGrants.  More
   * proficient members will be selected more often to lead prayer services
   * than less proficient members; less proficient members will be selected to
   * the extent that their amudGrants entitles them.  As explained in the
   * requirements document, your implementation need not assign members their
   * exact number of assigned assigned amud grants: your algorithm will be
   * evaluated in terms of how "overall" all members leading the services often
   * enough with respected to their assigned amud grants.  The iterator is
   * exhausted when all amud grants have been used.
   *
   * IMPORTANT: your implementation need not implement "remove()".
   *
   * IMPORTANT: your implementation must use the default Iterator
   * implementation of "forEachRemaining()".
   */
  public abstract Iterator<String> iterator();
} // class
