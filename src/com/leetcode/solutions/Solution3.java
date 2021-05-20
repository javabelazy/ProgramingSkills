package com.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

class Solution3 {
	
	
	 public int removeDuplicates(int[] nums) {
		 
		 if(nums.length ==1)
			 return 1;
		 
		 
		 Set<Integer> temp = new HashSet<>();
		 for(int i =0; i<nums.length;i++) {
			 temp.add(nums[i]);
		 }
		 
	      return temp.size();  
	    }

	public static void main(String[] args) {

		Solution3 s = new Solution3();
//		int[] nums = {1,1,2};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(s.removeDuplicates(nums));

	}

}