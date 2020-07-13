package com.konzern.eight;
public class FeedHandler {

    /**
     * Count number of distinct elements in the range of a byte array.
     *
     * @param buffer array to be evaluated.
     * @param offset index of the first array element (inclusive)
     * @param length number of array elements to be considered
     * @return number of distinct elements in <code>buffer[offset]</code>,
     *                <code>buffer[offset + 1]</code> ... <code>buffer[offset + length - 1]</code>
     */
    public static int handleFeed(byte[] buffer, int offset, int length) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        byte[] sample = { 1, 2, 3, 1, 2, 3 };
        System.out.println(handleFeed(sample, 0, sample.length)); // 3
    }
}