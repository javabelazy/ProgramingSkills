package com.leetcode.contest;
/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 * @author Apple
 *
 */
class Solution21 {
	public void rotate(int[] nums, int k) {

		int len = nums.length;

		int[] temp = new int[k];

		int start = nums.length - k;

		for (int i = 0; i < k; i++) {
			
			temp[i] = nums[start];
			start++;
		}

		int[] temp2 = new int[start];
		int j = 0;
		for (int i = 0; i < start; i++) {

			temp2[i] = nums[j];
			j++;
		}
		j = 0;
		for (int i = 0; i < len; i++) {

			if (i < k) {
				nums[i] = temp[i];
			} else {
				nums[i] = temp2[j];
				j++;
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {
		Solution21 s = new Solution21();
		int[] nums = { -1};
		s.rotate(nums, 2);
	}
}