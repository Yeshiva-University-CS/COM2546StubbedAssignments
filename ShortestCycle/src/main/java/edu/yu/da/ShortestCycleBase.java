package edu.yu.da;

/** Specifies the API for the Shortest Cycle problem (see the requirements
 * document for details).
 *
 * Students MAY NOT modify the static Edge inner class in any way.
 *
 * Students MAY NOT modify this base class in any way.

 * @author Avraham Leff
 */

import java.util.List;
import java.util.Objects;

abstract public class ShortestCycleBase {

  /** Design note: edge vertices are represented by an integer 0..n-1
   * where the number of vertices in the graph is n.  Weights can be
   * negative.  This class represents an undirected edge.
   */
  public static class Edge {

    /** Constructor.
     *
     * @param  v one vertex
     * @param  w the other vertex
     * @param  weight
     * @throws IllegalArgumentException if either vertex is a negative integer
     */
    public Edge(final int v, final int w, final double weight) {
      if (v < 0) throw new IllegalArgumentException("vertex index must be a non-negative integer");
      if (w < 0) throw new IllegalArgumentException("vertex index must be a non-negative integer");
      if (Double.isNaN(weight)) throw new IllegalArgumentException("Weight is NaN");
      this.v = v;
      this.w = w;
      this.weight = weight;
    }

    public double weight() {
      return weight;
    }

    public int v() { return v; }
    public int w() { return w; }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Edge)) {
        return false;
      }

      final Edge other = (Edge) o;

      // tricky because other edge may have been constructed with "flipped" vertices
      return (v() == other.v() && w() == other.w() ||
              v() == other.w() && w() == other.v()) &&
        // I don't like the performance implications of this but see no choice:
        // must convert to Double
        Double.valueOf(weight()).equals(Double.valueOf(other.weight()));
    } // equals

    @Override
    public int hashCode() {
      // If performance suffers, supply a by-hand implementation
      //
      // per S Newmark: hashCode must maintain the same "edge with
      // inverted vertices is equal to the original edge" semantics
	return Objects.hash(v() * w(), weight());
    }

    @Override
    public String toString() {
      return "{(" + v() + "," + w() + "), weight="+
        String.format("%.2f", weight) + "}";
    }

    private final int v;
    private final int w;
    private final double weight;
  } // static class Edge
  
  /** Constructor
   *
   * @param edges List of edges that, in toto, represent a weighted undirected
   * graph.  The client maintains ownership of the List: the implementation may
   * not modify this input parameter.  The client guarantees that the List is
   * not null, and doesn't contains any null edges.
   * @param e One of the graph's edges, the "edge of interest" since we want to
   * determine the shortest cycle containing this edge.
   */
  public ShortestCycleBase(final List<Edge> edges, final Edge e) {
    // no-op implementation, real work should be done in override by child class
  }

  /** Finds the shortest cycle in the graph with respect to the specified edge
   * as detailed by the requirements document.
   *
   * @return List of edges representing the shortest cyle containing the "edge
   * of interest".  The List can begin with any edge from the cycle, but must
   * be a sequence that begins and ends at the same vertex and contain the
   * "edge of interest".
   */
  abstract public List<Edge> doIt();
}
