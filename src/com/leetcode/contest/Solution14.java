package com.leetcode.contest;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a
 * power of 4.
 * 
 * @author Apple
 *
 */

class Solution14 {

	public boolean isPowerOfFour(int num) {
		
		return num != 0 && ((num&(num-1)) == 0) && (num & 0xAAAAAAAA) == 0;
		
		/* return num > 0 &&
		            (num & (num - 1)) == 0 &&
		            (num & 0x55555555) != 0;*/

	
	}

	public static void main(String[] args) {

//		System.out.println(new Solution14().isPowerOfFour(16));
//		System.out.println(new Solution14().isPowerOfFour(64));
//		System.out.println(new Solution14().isPowerOfFour(256));
		System.out.println(new Solution14().isPowerOfFour(19));

	}
}