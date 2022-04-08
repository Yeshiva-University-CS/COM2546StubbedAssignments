package edu.yu.da;

/** Specifies the API for the StockYourBookshelf problem (see the requirements
 * document for details).
 *
 * @author Avraham Leff
 */

import java.util.List;
import java.util.Map;

public interface StockYourBookshelfI {

  /** Given a budget for purchasing seforim, determines an allocation of
   * purchases from a set of seforim classes and associated seforim types and
   * price-per-type, such that the maximum amount of money is spent from the
   * budget on an allocation of one type from each class of sefer.
   *
   * @param M the budget for purchasing seforim, cannot be negative.
   * @param seforimClassToTypePrices Maps a String representation of a "seforim
   * class" (e.g., Tanakh and Mussar) to a List of prices for that "class's
   * types" (e.g., Koren and ArtScroll Tanakhs).  That is: the ith element of a
   * given List specifies the price of the ith seforim type.  Seforim classes
   * must be non-empty, prices must be greater than 0.  The solution is
   * undefined if these requirements are not met.  The client maintains
   * ownership of this parameter.
   * @return maximum amount of money that can be spent such that one type of
   * sefer is purchased from each of the seforim classes if possible, otherwise
   * Integer.MIN_VALUE to indicate that no solution is possible.
   */
  public int
    maxAmountThatCanBeSpent
    (int budget, Map<String, List<Integer>> seforimClassToTypePrices);

  /** Assuming that a solution exists such that a "max amount that can be
   * spent" can be computed, return the price of each sefer that was selected
   * from each class of sefer.  Specifically: the ith element of the returned
   * List contains the price of the sefer type that was selected from the ith
   * class of sefer.
   *
   * IMPORTANT: Implementations of this interface are allowed to throw
   * IllegalStateException if clients invoke this method before they invoke
   * maxAmountThatCanBeSpent()
   * 
   * IMPORTANT: although no "ordering" of sefer classes is specified for
   * maxAmountThatCanBeSpent(), this method requires that you order your List
   * by ASCENDING lexicographical order of sefer class.
   *
   * @return List of the sefer type prices selected by the solution, ordered
   * such that the ith element of the List specifies the price of the type
   * selected for the ith category of sefer where seforim classes are ordered
   * by ascending class name.  If no solution exists given the input
   * parameters, return an empty List.
   * @throws IllegalStateException if the client didn't previously invoke
   * maxAmountThatCanBeSpent() on an implemntation instance of this interface.
   */
  public List<Integer> solution();

} // StockYourBookshelfI
