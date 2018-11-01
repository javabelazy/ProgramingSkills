/**
 * Finding prime number upto given integer
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int number = 2;
		while(number<= limit) {
			boolean isPrime = true;
			for(int i =number/2; i>1;i--) {
				if((number%i)==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) 
				System.out.print(number+" ");
			number++;
		}
	}

}
