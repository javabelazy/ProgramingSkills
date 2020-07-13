/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
 */
package com.leetcode.contest;

/**
 * @author Apple
 *
 */
public class Solution13 {
	//{ 1, 2, 1,2,1 };
	public int subarraySum(int[] nums, int k) {
		if (nums.length == 1 && nums[0] != k) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int ptr = i;
			int value = 0;
			while (value <= k) {
				value = value + nums[ptr];
				if (value == k) {
					count = count + 1;
					break;
				}
				ptr++;
				if (ptr == nums.length)
					break;
			}
		}
		return count;
	}

	/**
	 * @param args  [28,54,7,-70,22,65,-6]
100
	 */
	public static void main(String[] args) {
		int[] nums = { 28,54,7,-70,22,65,-6 };
		int k = 100;

		/*int[] nums = { 1, 1, 1 };
		int k = 2;*/
		
//		int[] nums = { 1, 2, 1,2,1 };
//		int k = 3;

		Solution13 s = new Solution13();
		System.out.println(s.subarraySum(nums, k));

	}

}
