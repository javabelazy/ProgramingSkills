package com.leetcode.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * 
 * Here follow means a full match, such that there is a bijection between a
 * letter in pattern and a non-empty word in str.
 * 
 * @author Apple
 *
 */

class Solution19 {
	public boolean wordPattern(String pattern, String str) {

		Map<Character,String> map = new HashMap<>();
		String[] value = str.split("\\s");
		
		for(int i=0;i<pattern.length(); i++) {
			char ch = pattern.charAt(i);
			if(map.get(ch)!=null) {
				if(!map.get(ch).equals(value[i]))
					return false;
			}
			map.put(ch, value[i]);
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
//		String pattern = "abba";
//		String str = "dog cat cat dog";
		String pattern = "abba";
//		String str = "dog cat cat fish";
		String str = "dog dog dog dog";
		System.out.println(new Solution19().wordPattern(pattern, str));
	}
}