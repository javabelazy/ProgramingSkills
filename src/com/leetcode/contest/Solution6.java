package com.leetcode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given an array of strings, group anagrams together.
 * 
 * @author Apple
 *
 */

class Solution6 {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> groupAnagrams = new ArrayList<>();
		Map<String, List<String>> output = new HashMap<>();
		for (String str : strs) {
			char[] chr = str.toCharArray();
			Arrays.sort(chr);
			String str2 = String.valueOf(chr);
			if(output.containsKey(str2)) {
				output.get(str2).add(str);
			}else {
				List<String> ls = new ArrayList<>();
				ls.add(str);
				output.put(str2, ls);
			}
		}
		for (List<String> mapls : output.values())
			groupAnagrams.add(mapls);
		return groupAnagrams;
	}

	public static void main(String[] args) {
		Solution6 s = new Solution6();
//		String[] input = { "duh", "ill", "cab", "tin", "pew", "may", "buy", "bar", "max", "doc" };
		String[] input = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(s.groupAnagrams(input));
	}
}