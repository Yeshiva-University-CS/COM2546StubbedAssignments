package edu.yu.da;

/** Skeleton class for implementing a dynamic programming solution for
 * minimizing a "word wrap penalty" function for a sequence of text.  
 *
 * @author Avraham Leff
 */

import java.util.*;

public class DPWordWrapping {

  /** No-argument constructor.
   *
   * @param words a non-null, non-empty, sequence of words
   * @param lineLength a positive value that defines the line length for all
   * lines in the computed display
   * @see requirements doc for details
   */
  public DPWordWrapping(final String[] words, final int lineLength) {
    // fill me in!
  }


  /** Using the rules and constraints defined in the requirements document,
   * return the value of the optimal total penalty for the specified sequence
   * of words and constant line length parameter supplied to the constructor.
   *
   * @return the optimal total penalty to layout the words
   */
  public int minimumPenalty() {
    return Integer.MAX_VALUE;
  }

  /** Returns the optimal layout for the specified sequence of words and
   * constant line parameter supplied to the constructor.  If no optimal total
   * penalty value can be computed per the requirements doc, the layout is undefined.
   *
   * @return layout A Map which associates with each line in the layout
   * (0..n-1), a sequence of words that conforms to the rules specified in the
   * requirements doc.
   */
  public Map<Integer, List<String>> getLayout() {
    return null;
  }
}
