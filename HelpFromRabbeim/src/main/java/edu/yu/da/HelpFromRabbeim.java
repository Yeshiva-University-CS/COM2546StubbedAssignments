package edu.yu.da;

/** Implements the HelpFromRabbeimI interface.
 *
 * Students MAY NOT change the provided constructor signature!
 * 
 * @author Avraham Leff
 */

import java.util.*;

import static edu.yu.da.HelpFromRabbeimI.HelpTopics.*;
import static edu.yu.da.HelpFromRabbeimI.Rebbe;

public class HelpFromRabbeim implements HelpFromRabbeimI {

  /** No-op constructor
   */
  public HelpFromRabbeim() {
    // no-op, students may change the implementation
  }

  @Override
  public Map<Integer, HelpTopics>
    scheduleIt(List<Rebbe> rabbeim,
               Map<HelpTopics, Integer> requestedHelp)
  {
      return Collections.emptyMap();
  }

} // HelpFromRabbeim
