/**
 * 
 */
package com.hackerearth.basicprograming;

/**
 * @author Apple
 *
 */
public class CheckingVowels {
	
	private char charA = 'a';
	private char charE = 'e';
	private char charI = 'i';
	private char charO = 'o';
	private char charU = 'u';
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingVowels checkVowel = new CheckingVowels();
		String str = "hello";
		System.out.println(checkVowel.checkVowel(str));

	}



	private String checkVowel(String str) {
		// TODO Auto-generated method stub
		String strLower = str.toLowerCase();
		if(str.length() > 5) {
			for(int i = 0; i<strLower.length();i++) {
				if(strLower.charAt(i)==charA) {
					
				}
			}
		}
		
		return null;
	}

}
