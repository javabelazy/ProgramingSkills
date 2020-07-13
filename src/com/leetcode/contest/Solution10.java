package com.leetcode.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * We have a collection of stones, each stone has a positive integer weight.
 * 
 * Each turn, we choose the two heaviest stones and smash them together. Suppose
 * the stones have weights x and y with x <= y. The result of this smash is:
 * 
 * If x == y, both stones are totally destroyed; If x != y, the stone of weight
 * x is totally destroyed, and the stone of weight y has new weight y-x. At the
 * end, there is at most 1 stone left. Return the weight of this stone (or 0 if
 * there are no stones left.)
 * 
 * @author Apple
 *
 */

class Solution10 {

	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1)
			return stones[0];
		List<Integer> lst = Arrays.stream(stones).boxed().collect(Collectors.toList());
		while (lst.size() > 1) {
			int x = Collections.max(lst);
			lst.remove(Integer.valueOf(x));
			int y = Collections.max(lst);
			lst.remove(Integer.valueOf(y));
			int z = Math.abs(x - y);
			if (z > 0) 
				lst.add(Integer.valueOf(z));
		}
		int res = (lst.size()>0) ?  lst.get(0) : 0;
		return res;
	}

	public static void main(String[] args) {

		int[] input = { 2, 7, 4, 1, 8, 1 };
//		int[] input = { 2, 2 };
		System.out.println(new Solution10().lastStoneWeight(input));

	}

}