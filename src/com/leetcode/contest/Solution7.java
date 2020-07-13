package com.leetcode.contest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * 
 * If there're duplicates in arr, count them seperately.
 * 
 * @author Apple
 *
 */

class Solution7 {

	public int countElements1(int[] arr) {

		Arrays.sort(arr);
		int count = 0;
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			if ((arr[i] != arr[i - 1] && (arr[i] == (arr[i - 1] + 1))) || (arr[i] == arr[i - 1] && i + 1 < len
					&& i + 2 < len && arr[i + 1] == (arr[i] + 1) && arr[i + 2] == (arr[i] + 1)))
				count++;

		}
		return count;
	}

	public int countElements2(int[] arr) {

		Arrays.sort(arr);
		int count = 0;
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			if (arr[i] != arr[i - 1] && (arr[i] == (arr[i - 1] + 1))) {
				count++;
			} else if (arr[i] == arr[i - 1]
					&& (i + 1 < len && arr[i + 1] == (arr[i] + 1) && arr[i + 1] == (arr[i - 1] + 1))) {
				count++;
			}
		}

		return count;
	}

	public int countElements(int[] arr) {

		Arrays.sort(arr);
		int count = 0;
		int len = arr.length;
		int duplicate = 1;
		for (int i = 1; i < len; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] == (arr[i - 1] + 1)) {
					count = count + duplicate;
				}
				duplicate = 1;
			} else if (arr[i] == arr[i - 1]) {
				duplicate++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };  //2
//		int[] arr = {1,1,3,3,5,5,7,7}; //0
//		int[] arr = {1,3,2,3,5,0}; //3
//		int[] arr = {1,1,2,2}; // output 2
//		int[] arr = {1,1,2}; // output 2'
//		int[] arr = { 6, 3, 11, 6, 11, 1, 11, 4, 7, 6, 13, 4, 1 }; // output 4
		System.out.println(new Solution7().countElements(arr));
	}

}