package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements
 * appear twice and others appear once.
 * 
 * Find all the elements that appear twice in this array.
 * 
 * Could you do it without extra space and in O(n) runtime?
 * 
 * @author Konzerntech
 *
 */

class Solution15 {

/*	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> temp = new ArrayList<>(nums.length);
		List<Integer> twice = new ArrayList<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if (!temp.contains(val))
				temp.add(val);
			else {
				if (twice.contains(val))
					twice.remove(val);
				else
					twice.add(val);
			}
		}
		return twice;
	}*/
	
	 public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < nums.length; ++i) {
	            int index = Math.abs(nums[i])-1;
	            if (nums[index] < 0)
	                res.add(Math.abs(index+1));
	            nums[index] = -nums[index];
	        }
	        return res;
	    }

	public static void main(String[] args) {
		Solution15 s = new Solution15();
		int[] nums = { 4, 3, 2, 7, 9, 2, 3, 1 };
		System.out.println(s.findDuplicates(nums));
	}
}