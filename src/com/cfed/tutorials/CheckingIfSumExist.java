/**
 * 
 */
package com.cfed.tutorials;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Apple
 *
 */
public class CheckingIfSumExist {

	private boolean sumExistOrNotSorted(int[] array, int sum) {
		int len = 0;
		if ((len = array.length) <= 0)
			return false;

		int low = 0;
		int high = len;

		while (low < high) {

		}

		return false;

	}

	private boolean sumExistOrNot(int[] array, int sum) {
		int len;
		if ((len = array.length) <= 0)
			return false;

		Set<Integer> complimentList = new HashSet<>();

		for (int i = 0; i < len; i++) {

			int value = array[i];

			if (complimentList.contains(value))
				return true;
			else {
				int complimentValue = sum - value;
				complimentList.add(complimentValue);
			}
		}

		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckingIfSumExist c = new CheckingIfSumExist();

		int[] array = { 1, 3, 9, 4 };
		System.out.println(c.sumExistOrNot(array, 8));

	}

}
