package edu.yu.da;

/** Defines the API for specifying and solving the WarGaming problem (see the
 * requirements document).
 *
 * Students MAY NOT change the public API of this class, nor may they ADD a
 * constructor (yes, the last clause is redundant).
 *
 * Design note: the core data-structure used in this class is a "list of String
 * lists".  The desired semantics are actually: "set of String sets".
 * Unfortunately, I think that I'm forced to use the list approach because of
 * peformance considerations.  The use of lists requires that we address the
 * fact that list semantics specify that "element order matters", but this IS
 * NOT true for the assignment's problems (where element order doesn't matter
 * (but see below).  I therefore REQUIRE that for a given set of elements, ONLY
 * the list possessing a "canonical order" be used to represent the set.  The
 * canonical order is "elements are ordered according to their order in the
 * threats parameter supplied to the constructor".  See example provided below.
 *
 * Design note: the implementation does not need to be thread-safe.
 *
 * @author Avraham Leff
 */

import java.util.*;
import java.util.function.Function;

public abstract class WarGamingBase {

  /** Constructor.
   *
   * @param threats a non-empty immutable list of potential threats to be
   * evaluated.  It's the client's responsibility to ensure that threat
   * elements are not null, not empty, and unique with respect to one another.
   * Ownership of this parameter remains with the client.
   */
  public WarGamingBase(final List<String> threats) {
    // no-op implementation
  }

  /** Returns a "list of lists" in which each list element is a unique (sub)set
   * of threats to be evaluated, and the top-level list contains every possible
   * "is present"/"not present" combination of threats to be evaluated.  Every
   * micro-list element must be one of the "threats" parameter supplied to the
   * constructor, and may containn no duplicates.  The ORDER of micro-lists in
   * the global list is implementation dependent.  Each micro-list MUST be
   * REPRESENTED by the version of the micro-list that is in "canonical order"
   * (see design note above).  Thus if the threats parameter is ["a", "c", "b",
   * "d"], one micro-list that must be returned is ["a", "d"], and the
   * implementation MAY NOT return ["d", "a"] either as a replacement for ["a",
   * "d"] or as an addition.  In order words, a given instance of a threat
   * vector represents all possible orderings of its elements, but MUST BE
   * represented exactly once in canonical order.
   *
   * @return a list of lists representing all possible threat vectors.
   */
  public abstract List<List<String>> getThreatsToEvaluate();

  /** Returns the index in the getThreatsToEvaluate() list that corresponds to
   * the "unexpectedly dangerous" threat.  The unexpected threat is one whose
   * score (when evaluated by the Function parameter) is higher than it should
   * be when compared to the default score returned by every other threat
   * vector.
   *
   * @param f a Function that evaluates a threat vector and returns a score for
   * the magnitude (larger score implies greater threat).  The default score
   * returned for a threat vector is the number of threat elements in the the
   * vector.
   * @return int the index in the getThreatsToEvaluate() list that corresponds
   * to the "unexpectedly dangerous" threat.  If no element in the list is an
   * unexpected threat, return -1.
   */
  public abstract int identifyTheUnexpectedThreat(Function<List<String>, Integer> f);

} // abstract base class
