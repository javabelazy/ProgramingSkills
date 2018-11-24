/**
 * 
 */
package com.cfed.logicz;

/**
 * @author Apple
 *
 */
public class StringManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = input.split("\\s")[0];
//		String str2 = input.split("\\s")[0];
		String str1 = "konzerntech";
		String str2 = "konzernteci";
		int len = 0;
		if ((len = str1.length()) != str2.length()) {
			System.out.println("invalid");
		} else {
			int val1 = 0;
			int val2 = 0;
			for (int i = 0; i < len; i++) {
				val1 = str1.charAt(i) + val1;
				val2 = str2.charAt(i) + val2;
			}
			System.out.println("val1 ="+val1+"val2 ="+val2);
			if (val1 != val2) {
				System.out.println("invalid");
			} else {
				System.out.println("valid");
			}
		}
	
		

	}

}
