package edu.yu.da;

/** Defines the HelpFromRabbeim interface and provides an important utility
 * implementation class.
 *
 * Students MAY NOT change the utility class in any way!
 * 
 * @author Avraham Leff
 */

import java.util.*;

public interface HelpFromRabbeimI {

  public enum HelpTopics {
    BAVA_KAMMA,
    SANHEDRIN,
    CHUMASH,
    NACH,
    MUSSAR,
    MISHNAYOS,
    BROCHOS,
    SHABBOS,
    BEITZA
  }
  

  /** Immutable by design.  Identity provided only by "id", not by which topics
   * he can help with.
   */
  public static class Rebbe {
    public Rebbe(final int id, final List<HelpTopics> helpTopics) {
      // Don't have to worry about deep copy with enum, but don't want to worry
      // about list ownership issues, hence the copy.
      _id = id;
      if (helpTopics == null) {
        throw new IllegalArgumentException("Null 'helpTopics' parameter");
      }
      _helpTopics = new ArrayList<>(helpTopics);
    }

    @Override
    public int hashCode() {
      // @todo may be too expensive for assignment usage?
      return Objects.hash(_id);
    }    

    @Override
    public boolean equals(final Object o) {
      if (o == this) return true;
      if (!(o instanceof Rebbe)) {
        return false;
      }
      
      final Rebbe that = (Rebbe) o;
      return _id == that._id;
    } // equals
    
    @Override
    public String toString() {
      return "{id: "+_id+", available topics: "+_helpTopics+"}";
    }
    
    // IMPORTANT: ivars are public (so no getters()) because class is supposed
    // to be immutable.  Yes, clients can mess with the List of _helpTopics but
    // that's an issue for a software engineering course ....
    public final int _id;
    public final List<HelpTopics> _helpTopics;
  }

  /** Given a list of rabbbeim (which specifies what topics each rebbe can help
   * with), and a map which associates the number of requests (integer)
   * requested for a given topic), creates a schedule that satisfies the
   * constraints.  If no such schedule exists, detects that fact, and reports
   * back to client.
   *
   * @param rabbeim List of rabbeim (and their "skill sets") available for that
   * day.  Client maintains ownership of this parameter.
   * @param requestedHelp how many requests per given topic.  Client maintains
   * ownership of this parameter.
   * @return a schedule that satisfies the specified constraints as a map from
   * rebbe (as uniquely specified by an integer) to the topic which he going to
   * be helping with.  If the schedule doesn't require a rebbe to help with
   * that day's requests, map that rebbe's id to null.  If no schedule can be
   * created to meet the constraints, return Collections.emptyMap().
   */
  public Map<Integer, HelpTopics>
    scheduleIt(List<Rebbe> rabbeim,
               Map<HelpTopics, Integer> requestedHelp);
} // HelpFromRabbeimI
