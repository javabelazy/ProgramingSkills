package com.leetcode.contest;

/**
 * Given two strings S and T, return if they are equal when both are typed into
 * empty text editors. # means a backspace character.
 * 
 * @author Apple
 *
 */

class Solution9 {

	public boolean backspaceCompare1(String S, String T) {
		boolean result = false;
		int sPtr = 0, tPtr = 0, loop = 0;
		char[] sChr = new char[S.length()];
		char[] tChr = new char[T.length()];
		while (loop < S.length()) {
			if (S.charAt(loop) == '#') {
				if (sPtr - 1 >= 0) {
					sChr[sPtr - 1] = ' ';
					sPtr--;
				}
			} else {
				sChr[sPtr] = S.charAt(loop);
				sPtr++;
			}
			loop++;
		}
		loop = 0;
		while (loop < T.length()) {
			if (T.charAt(loop) == '#') {
				if (tPtr - 1 >= 0) {
					tChr[tPtr - 1] = ' ';
					tPtr--;
				}
			} else {
				tChr[tPtr] = T.charAt(loop);
				tPtr++;
			}
			loop++;
		}
		String str1 = String.valueOf(sChr).trim().intern();
		String str2 = String.valueOf(tChr).trim().intern();
		if (str1.equals(str2))
			result = true;
		return result;
	}

	public boolean backspaceCompare(String S, String T) {
		boolean result = false;
		int sPtr = S.length()-1;
		int tPtr = T.length()-1;
		int loop = sPtr > tPtr ? sPtr : tPtr;
		while (sPtr > 0 && tPtr > 0) {
			char sChr = S.charAt(sPtr);
			char tChr = T.charAt(tPtr);
			if ('#' == sChr) {
				movePointer(sPtr, S, 0);
			}
			if ('#' == tChr) {
				movePointer(tPtr, T, 0);
			}
			if(S.charAt(sPtr)==T.charAt(tPtr)) { 
				sPtr--;
				tPtr--;
				result = true;
				continue;
			}
			else {
				result = false;
				break;
			}
		}
		return result;
	}
	private void movePointer(int ptr, String str, int count) {
		
		boolean isLoop = true;
		
		while (isLoop) {
			if ('#' == str.charAt(ptr)) {
				count = count + 1;
				movePointer(ptr - 1, str, count);
			} else {
				if (count > 0) {
					count = count - 1;
					movePointer(ptr-1, str, count);
				}else {
					isLoop = false;
				}
			}
		}
	}

	public static void main(String[] args) {

		
		 String s = "ab#c"; String t = "ad#c";
		 

		/*
		 * String s = "ab##"; String t = "c#d#";
		 */

//		String s = "a##c";
//		String t = "#a#c";

		/*
		 * String s = "a#c"; String t = "b";
		 */

		System.out.println(new Solution9().backspaceCompare(s, t));

	}

}