/**
 * 
 */
package com.hackerearth.basicprograming;

import java.util.Arrays;
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

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		
		String[] inputs = new String[count];
		for(int j=0;j<count;j++) {
			inputs[j] = sc.nextLine();
		}
		
		for(int j=0;j<count;j++) {
			
			String str1 = inputs[j].split("\\s")[0];
			String str2 = inputs[j].split("\\s")[1];
			
			char[] chr1 = new char[str1.length()];
			char[] chr2 = new char[str2.length()];
			for(int i=0;i<str1.length();i++) {
				chr1[i]=str1.charAt(i);
				chr2[i]=str2.charAt(i);
			}
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			
			if(Arrays.equals(chr1, chr2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
	

	}

}
