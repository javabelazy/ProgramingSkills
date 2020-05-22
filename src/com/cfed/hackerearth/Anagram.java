/**
 * Anagram solver
 */
package com.cfed.hackerearth;

/**
 * @author Konzern Technologies
 *
 */
public class Anagram {

	private int ptr = 0;
	private StringBuilder sb = null;
	
	public Anagram(StringBuilder sb) {
		this.sb = sb;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "BLACK";
		String str2 = "MAMBA";
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		StringBuilder sb = new StringBuilder();
		Anagram anagram = new Anagram(sb);
		String ans = (str1.length() < str2.length()) ? anagram.compute(char1, char2) : anagram.compute(char2, char1);
		System.out.println("Inputs Strings "+str1 +" & "+str2);
		System.out.println("Anagram :"+ans);
		System.out.println("Characters to remove "+((str1.length()+str2.length())-(ans.length()*2)));

	}

	private String compute(char[] charA, char[] charB) {
		for (int i = 0; i < charB.length; i++) {
			if (charA[ptr] == charB[i]) {
				sb.append(charA[ptr]);
				charB[i] =' ';
				break;
			}
		}
		ptr++;
		if (ptr >= (charA.length)) {
			return sb.toString();
		} else {
			return compute(charA, charB);
		}
	}



}
