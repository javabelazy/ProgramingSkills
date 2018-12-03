/**
 *  Find missing number in sorted elements in minimum time complexity say log n
 */
package com.cfed.tutorials;

import java.util.Arrays;

/**
 * @author Konzernites
 *
 */
public class MissingSortedNumber {
	
	
//	findMissingNumber();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sortedArray = {1,2,3,4,5,6,7,9,10};
		
		MissingSortedNumber m = new MissingSortedNumber();
		System.out.println(m.findMissingNumber(sortedArray,1,10));
		
		

	}

	private int findMissingNumber(int[] sortedArray,int start, int end) {
		int finalValue = end;
		int len = sortedArray.length;
		int mid = len/2;
		int value = start+mid;
		if(len==2) {
			if(end-start!=1) {
				return start + 1;
			}
		}else if(sortedArray[mid]==value) {
			int[] newArray = Arrays.copyOfRange(sortedArray, mid, len);
			findMissingNumber(newArray,value,finalValue);
		}else if(sortedArray[mid]>value) {
			int[] newArray = Arrays.copyOfRange(sortedArray,0, mid+1);
			findMissingNumber(newArray,start,sortedArray[mid]);
		}else {
			findMissingNumber(sortedArray,0,0);
		}
		return start + 1;
	}

}
