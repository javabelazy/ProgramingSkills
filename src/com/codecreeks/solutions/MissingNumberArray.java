/**
 * Find missing number in a sequence Minimum complexity (n Log n)
 * 
 * input : {1,2,3,5}
 * output : 4
 */
package com.codecreeks.solutions;

import java.util.Arrays;

/**
 * @author Consumerfed Information Technology Section
 *
 */
public class MissingNumberArray {
	
	private static int loopCount = 0;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] a = {1,2,3,4,6,7,8,9,10,11,12};
		int len = a.length;
		MissingNumberArray m = new MissingNumberArray();
		int value = 0;
		if(a[len-1]!=len) {
			value = m.findMissingNumber(a, 0, len);	
			System.out.println(" The Missing number in the array :"+Arrays.toString(a)+" is "+value);
		}else {
			loopCount++;
			System.out.println(" There is no missing number in the given array "+Arrays.toString(a));
		}
		System.out.println(" For "+len+" size array it tooks "+loopCount+" search to find the answer ");
		System.out.println(" Complexity :"+len*Math.log(len));
		System.out.println(" Time Taken : "+(System.currentTimeMillis() - startTime)+" ms");
		
	}
	
	private int findMissingNumber(int[] array, int startPstn, int endPstn) {
		loopCount++;
		int arraySize = endPstn - startPstn;
		int position = startPstn + arraySize / 2;
		if(arraySize==0) {
			return position +1;
		}else if (arraySize == 1) {
			return array[position] + 1;
		}
		else if (array[position] != position + 1) {
			return findMissingNumber(array, startPstn, position);
		} else {
			return findMissingNumber(array, position + 1, endPstn);
			
		}
	}
}
