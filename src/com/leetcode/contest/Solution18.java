/**
 * Sort Array By Parity
 */
package com.leetcode.contest;

/**
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition
 * 
 * @author cfed
 *
 */

class Solution18 {

	public int[] sortArrayByParity(int[] A) {
		int even = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				int temp = A[even];
				A[even] = A[i];
				A[i] = temp;
				even++;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		Solution18 s = new Solution18();
		int[] nums = { 3, 1, 2, 4 };
		System.out.println(s.sortArrayByParity(nums));
	}
}