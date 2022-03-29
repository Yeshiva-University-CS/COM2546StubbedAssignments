package edu.yu.da;

/** Specifies the API for the WaitNoMore problem (see the requirements document
 * for details).
 *
 * @author Avraham Leff
 */

public interface WaitNoMoreI {

  /** Returns the minimum total waiting time required over a legal schedule in
   * which all of the specified jobs are performed and the schedule minimized
   * the total WEIGHTED waiting time.  A legal schedule is one in which jobs
   * execute sequentially, no job beginning execution until the previous job
   * has completed.  The method computes a schedule that minimizes the total
   * WEIGHTED waiting time, and returns (only) the total waiting time.
   *
   * The input parameters only specify a default schedule: determining the
   * minimum total WEIGHTED waiting time may require reordering the jobs.
   *
   * @param durations the ith array element specifies the duration of the ith
   * job.  The method's semantics are undefined if any value is less than or
   * equal to 0.  Method semantics are undefined if not the same length as the
   * weights parameter.  Client maintains ownership of the input parameter.
   * @param weights the ith array element by specifying the importance (weight) of
   * the ith job for the company.  The method's semantics are undefined if any
   * value is less than or equal to 0.  Method semantics are undefined if not
   * the same length as the durations parameter.  Client maintains ownership of
   * the input parameter.
   * @return the minimum total waiting time associated with a legal schedule
   * that minimizes the total WEIGHTED waiting of the input jobs.
   */
  public abstract int minTotalWaitingTime(int[] durations, int[] weights);
} // MaximizePayoutI
