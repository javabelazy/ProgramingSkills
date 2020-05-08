package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * You must do this in-place without making a copy of the array. Minimize the
 * total number of operations.
 * 
 * In-place means we should not be allocating any space for extra array. But we
 * are allowed to modify the existing array. However, as a first step, try
 * coming up with a solution that makes use of additional space. For this
 * problem as well, first apply the idea discussed using an additional array and
 * the in-place solution will pop up eventually.
 * 
 * A two-pointer approach could be helpful here. The idea would be to have one
 * pointer for iterating the array and another pointer that just works on the
 * non-zero elements of the array.
 * 
 * @author Apple
 *
 */

class Solution4 {

/*	public void moveZeroes(int[] nums) {
		int len = nums.length;
		
		int zeroPtr = -1;
		int nonZeroPtr = 0;
		
		int i =0;
		
		while(i <nums.length) {
			
		
			
			if(nums[i]==0) 
				zeroPtr = i;
			
			if(zeroPtr < nonZeroPtr) {
				int temp = nums[nonZeroPtr];
				nums[nonZeroPtr] = nums[zeroPtr];
				nums[zeroPtr] = temp;
				zeroPtr = nonZeroPtr;
			}
			
			if(nums[i]!=0) 
				nonZeroPtr = i;
			
			i = i+1;
			
		}
		
		System.out.println(nums);

	}*/
	
	public void moveZeroes(int[] nums){
		int n = nums.length;
		 int nonZero = 0;  
	        for (int i = 0; i < n; i++) { 
	            if (nums[i] != 0) { 
	            	nums[nonZero] = nums[i];
	            	nonZero = nonZero + 1;
	            }
	        }
	        while (nonZero < n) 
	        	nums[nonZero++] = 0;
	        
	        System.out.println(nums);
	}

	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 3, 12 }; // 0,0,0,1  1,0,0 
		Solution4 s = new Solution4();
		s.moveZeroes(input);
	}

}