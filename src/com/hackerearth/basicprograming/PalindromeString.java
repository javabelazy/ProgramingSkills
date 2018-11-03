/**
 * ABBA is the only palindromic band to have had a song in the UK charts that is also a palindrome
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();

			boolean isPaliondrome = true;
			int l = len;
			for (int i = 0; i < (len+1)/2; i++) {
				l--;
				if(str.charAt(i)!=str.charAt(l))
					isPaliondrome = false;
				
			}
			if(isPaliondrome)
				System.out.println("YES");
			else
				System.out.println("NO");

	}

}
