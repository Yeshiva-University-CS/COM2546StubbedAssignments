package edu.yu.da;

/** Defines an interface for solving the simple equation problem using a
 * genetic algorithm (as described by the requirements document).  Also defines
 * an inner interface, and uses it as part of the SimpleEquationI API
 * definition.
 *
 * @author Avraham Leff
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface SimpleEquationI {

  public interface SolutionI {

    /** Returns the value of x for the equation's solution.
     */
    public int getX();

    /** Returns the value of y for the equation's solution.
     */
    public int getY();

    /** Returns the fitness of this solution.
     */
    public double fitness();

    /** Returns the number of generations that the genetic algorithm ran to 
     * produce this solution.
     */
    public int nGenerations();

  } // inner SolutionI interface

  /** Returns the best Solution found by a genetic algorithm for the simple
   * equation specified by the requirements document.
   *
   * @param gac contains properties needed by a genetic algorithm
   * @see GeneticAlgorithmConfig
   */
  public SolutionI solveIt(GeneticAlgorithmConfig gac);

} // SimpleEquationI interface
