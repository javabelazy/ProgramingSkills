/**
 * 
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class FindFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = System.currentTimeMillis();
		int fact = 1;
		while(n>=2) {
			fact = fact * n;
			n--;
		}
		System.out.println(fact);
		System.out.println(System.currentTimeMillis()-t);
	}

}
