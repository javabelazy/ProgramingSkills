package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.f
 * 
 * @author Apple
 *
 */

class Solution3 {

	public int maxSubArray(int[] nums) {
		int maxValue = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum > maxValue)
				maxValue = sum;
			if (0 > sum)
				sum = 0;
		}
		return maxValue;
	}

	/*
	 * public int maxSubArray(int[] nums) { int len = nums.length; int firstPtr = 0;
	 * int secondPtr = 0; int maxValue = 0; if (len == 1) { maxValue = nums[0]; }
	 * else if (len == 2) { maxValue = nums[0]; if (nums[1] > maxValue) maxValue =
	 * nums[1]; if (maxValue < (nums[1] + nums[0])) maxValue = nums[1] + nums[0];
	 * }else { for (int i = 0; i < len; i++) { if (nums[i] < 0) firstPtr = i; for
	 * (int j = 0; j < len; j++) { if (nums[j] < 0) { secondPtr = j; int value =
	 * sum(nums, i + 1, j - 1); if (maxValue < value) { maxValue = value; } } if (j
	 * == (len - 1)) { secondPtr = j; int value = sum(nums, i + 1, j); if (maxValue
	 * < value) { maxValue = value; } } } } } return maxValue;}
	 */

	/*
	 * private int sum(int[] nums, int i, int j) { int sum = 0; while (i < j) { sum
	 * = sum + nums[i]; i = i + 1; }
	 * 
	 * return sum; }
	 */

	public static void main(String[] args) {

		Solution3 s = new Solution3();
//		int[] a = { -2, 1, -3, 5, -1, 2, 1, -5, 4 }; // [-2,1,-3,4,-1,2,1,-5,4] -2, -3, 4, -1, -2, 1, 5, -3
//		int[] a = { -1, -2 };
//		int[] a = { -1, 5, 5, -4, 20 };
		int[] a = { -2, -3, -1 };
		System.out.println(" " + s.maxSubArray(a));
	}
}
