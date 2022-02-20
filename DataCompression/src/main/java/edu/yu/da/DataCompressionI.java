package edu.yu.da;

/** Defines an interface for solving the data compression problem using a
 * genetic algorithm (as described by the requirements document).  Also defines
 * an inner interface, and uses it as part of the DataCompressionI API
 * definition.
 *
 * @author Avraham Leff
 */



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public interface DataCompressionI {

  public interface SolutionI {
    /** Returns the list associated with this solution: the elements are
     * identical to the original list, but may be ordered differently to
     * require fewer bytes when compressed.
     *
     * @return the solution's List.
     */
    public List<String> getList();

    /** Returns the original List.
     *
     * @return the original List.
     */
    public List<String> getOriginalList();

    /** Returns the ratio of the compressed number of bytes associated with the
     * original list (numerator) to the solution's compressed number of bytes
     * (denominator).
     *
     */
    public double relativeImprovement();

    /** Returns the number of generations required to generate the solution.
     *
     * @return number of generations required.
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

  /** Return the number of bytes when applying compression to the original
   * list.
   *
   * @return number of bytes
   */
  public int nCompressedBytesInOriginalList();

  public static int bytesCompressed(final List<String> list) {
    try {
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      final GZIPOutputStream gos = new GZIPOutputStream(baos);
      final ObjectOutputStream oos = new ObjectOutputStream(gos);
      oos.writeObject(list);
      oos.close();
      return baos.size();
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
      return 0;
    }
  }
  


} // DataCompressionI interface
