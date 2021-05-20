package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * @author Apple
 *
 */

class Solution20 {
/*	public int singleNumber(int[] nums) {
		int length = nums.length;
		for (int i = 0; i < length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				int temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				i = -1;
			}
		}
		int i = 0;
		int ans = nums[length-1];
		while (i+1 < length) {
			if(nums[i]!=nums[i+1]) {
				ans =  nums[i];
				break;
			}
			i+=2;
		}
		return ans;
	}*/
	
public int singleNumber(int[] nums) {
	List<Integer> numList = new ArrayList<>();
	for(int val :nums) {
		if(numList.contains(val)) {
			numList.remove(Integer.valueOf(val));
		}else {
			numList.add(val);
		}
	}
	return numList.get(0);
}

/*	public int singleNumber(int[] nums) {
	int a = 0;
	for(int i : nums) {
		a^=i;
	}
	return a;
}*/

	public static void main(String[] args) {
		Solution20 s = new Solution20();
		int[] nums = { 4,1,2,1,2 }; 
		System.out.println(s.singleNumber(nums));
	}
}