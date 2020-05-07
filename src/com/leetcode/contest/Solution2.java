package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers
 * 
 * @author Apple
 *
 */

class Solution2 {

	public boolean isHappy(int n) {
		boolean isHappy =true;
		List<Integer> numList = new ArrayList<>();
		numList.add(n);
		
		int num = n;	

		while (num!=1) {
			int square = 0;
			while (num != 0) {
				int a = num % 10;
				num = num / 10;
				square = square + (a*a);
			}
			num = square;
			if(numList.contains(num)) {
				isHappy =false;
				break;
			}
			numList.add(num);
		}
		return isHappy;
	}

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		System.out.println(s.isHappy(7));

	}

}