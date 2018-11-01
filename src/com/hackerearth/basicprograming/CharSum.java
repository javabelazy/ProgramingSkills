/**
 * sum of values of char from a to z
 * suppose if string is aaa then value should be 3
 * a is considered as 1 and z as 26
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class CharSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum = sum + (word.charAt(i) -96) ;
		}

		System.out.println(sum);
	}

}
