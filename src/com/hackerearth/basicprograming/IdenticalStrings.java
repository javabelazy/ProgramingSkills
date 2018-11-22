/**
 * 
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class IdenticalStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = 3;
		for(int i=0;i<t;i++) {
			String str = sc.nextLine();
			String[] strs = str.split("\\s");
			String str1 = strs[0];
			String str2 = strs[1];
			if(str1.length()!=str2.length())
				System.out.println("NO");
			else {
				for(int j=0;j<str1.length();j++) {
					char c = str1.charAt(j);
					if(str2.contains(c)) {
						
					}
				}
			}
			
			
		}
		

	}

}
