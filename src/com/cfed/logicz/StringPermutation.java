/**
 * 
 */
package com.cfed.logicz;

import java.util.Scanner;

/**
 * @author Apple
 *
 */
public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		String[] inputs = new String[count];
		for(int j =0;j<count;j++) {
			inputs[j] = sc.nextLine();
		}
		
		for(String input : inputs) {
			String str1 = input.split("\\s")[0];
			String str2 = input.split("\\s")[1];
//			String str1 = "konzerntech";
//			String str2 = "consumerfed";
			int len = 0;
			if ((len = str1.length()) != str2.length()) {
				System.out.println("NO");
			} else {
				int val1 = 0;
				int val2 = 0;
				for (int i = 0; i < len; i++) {
					val1 = str1.charAt(i) + val1;
					val2 = str2.charAt(i) + val2;
				}
				if (val1 != val2) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
		}
	}
}
