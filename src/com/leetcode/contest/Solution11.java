package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * @author Apple
 *
 */

class Solution11 {
	public int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		int product = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				product = product * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 1)
				output[i] = product;
			else if (nums[i] != 0)
				output[i] = product / nums[i];
			
		}

		return output;

	}

	public static void main(String[] args) {
		int[] input = { 1, 0 };
		Solution11 s = new Solution11();
		int[] out = s.productExceptSelf(input);

		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}

	}
}