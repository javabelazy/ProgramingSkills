package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only three types of characters: '(', ')' and '*',
 * write a function to check whether this string is valid. We define the
 * validity of a string by these rules:
 * 
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'. Any
 * right parenthesis ')' must have a corresponding left parenthesis '('. Left
 * parenthesis '(' must go before the corresponding right parenthesis ')'. '*'
 * could be treated as a single right parenthesis ')' or a single left
 * parenthesis '(' or an empty string. An empty string is also valid.
 * 
 * @author Apple
 *
 */

class Solution12 {

	/*
	 * public boolean checkValidString(String s) {
	 * ////(())((())()()(*)(*()(())())())()()((()())((()))(* boolean result = true;
	 * int i = 0; int val = 0; int star = 0; while (i < s.length()) { if
	 * (s.charAt(i) == ')') { // || (val > star && star!=0)) if (val > 0 || star >
	 * 0) { val = val - 1; } else { result = false; break; } } else if (s.charAt(i)
	 * == '(') val = val + 1; else if (s.charAt(i) == '*') star = star + 1; i++; }
	 * if (val != 0 && Math.abs(val) > star) result = false;
	 * System.out.println("val :" + val + "star :" + star); return result; }
	 */

	/*
	 * public boolean checkValidString(String s) { ////
	 * (())((())()()(*)(*()(())())())()()((()())((()))(* boolean result = true; int
	 * i = 0; int val = 0; int star = 0; while (i < s.length()) {
	 * 
	 * if (s.charAt(i) == '*') { if (val > 0) { val = val - 1; } else if (val < 0) {
	 * val = val + 1; } else { star = star + 1; } } else if (s.charAt(i) == ')') {
	 * // || (val > star && star!=0)) if (val > 0) val = val - 1; else if (star > 0)
	 * { val = val - 1; star = star - 1; } else { result = false; break; } } else if
	 * (s.charAt(i) == '(') val = val + 1; i++; } if (val != 0 && Math.abs(val) >
	 * star) result = false; System.out.println("val :" + val + "star :" + star);
	 * return result; }
	 */

/*	public boolean checkValidString(String s) {
		boolean result = true;
		boolean isOpen = false;
		boolean isClose = false;
		int o = 0;
		int c = 0;
		int r = 0;

		int val = 0;

		int i = 0;

		while (i < s.length()) {

			if (s.charAt(i) == '*') {
				if (!isOpen && !isClose) {
					isOpen = true;
					val = val + 1;
				} else if (isOpen) {
					val = val - 1;
					if (val == 0)
						isOpen = false;
				
				} else if (isClose) {
					val = val + 1;
					isOpen = true;
				}

			} else if (s.charAt(i) == ')') {
				if(isClose) {
					result = false;
					break;
				}else if(isOpen) {
					val = val-1;
					if(val ==0) {
						isOpen =false;
						isClose = true;
					}
				}

			} else if (s.charAt(i) == '(') {
				
				if(isOpen) {
					val = val+1;
					
				}else if(isClose) {
					val = val+1;
					isClose = false;
					isOpen = true;
				}

			}

			i++;

		}

		return result;

	}*/

	public static void main(String[] args) {
		System.out.println(new Solution12().checkValidString("()")); // true
//		System.out.println(new Solution12().checkValidString("(*)")); // true
//		System.out.println(new Solution12().checkValidString("()"));
		// (())((())()()(*)(*()(())())())()()((()())((()))(*
//		System.out.println(new Solution12().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*")); // false
	}

	private boolean checkValidString(String s) {
		// TODO Auto-generated method stub
		List<Character> lst = new ArrayList<Character>();
		boolean result = true;
		
		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == '(') {
				lst.add('(');
			}else if(s.charAt(i)==')') {
				if(lst.contains('(')) {
					lst.remove(Character.valueOf('('));
				}else {
					result = false;
				}
			}else if(s.charAt(i)=='*') {
				if(lst.contains('(')) {
					lst.remove(Character.valueOf('('));
				}else {
					lst.add('(');
				}
			}
			i++;
		}
		
		
		return result;
	}
}