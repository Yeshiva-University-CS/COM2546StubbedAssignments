package edu.yu.da;

/** Skeleton file for the MaxRectangle assignment.
 *
 * @author Avraham Leff
 */

public class MaxRectangle {

    public static class Answer {
	final int max;
	final int left;
	final int right;
	final int height;

	/** Constructor: do not change signature, or implementation.
	 */
	public Answer(final int max, final int left, final int right,
		      final int height)
	{
	    assert max >= 0: "max must be non-negative: "+max;
	    assert left >= 0: "left must be non-negative: "+left;
	    assert right >= 0: "right must be non-negative: "+right;
	    assert height >= 0: "height must be non-negative: "+height;

	    this.max = max;
	    this.left = left;
	    this.right = right;
	    this.height = height;
	}

	// you may add as many methods as you want
    }

    /** Returns the area of the biggest rectangle that can be constructed from
     * the "heights" representation.
     *
     * @param heights an array of integers which implicitly specify one or more
     * rectangles per the assignment's requirements doc.
     * @return an Answer "struct" containing the area of the biggest
     * rectangle that can be constructed, the left and right
     * x-coordinates of the selected rectangle, and the height of that
     * rectangle.
     * @throws IllegalArgumentException if null array or fewer than 2 elements
     */
    public static Answer get(final int[] heights) {
	return null;
    }

    // add as many methods as you want
}
