package com.leetcode.solutions;

class Solution2 {
	public int firstMissingPositive(int[] nums) {
		int sum = 0;
		int low = 0;
		int high = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				sum += nums[i];
				if (low == 0)
					low = nums[i];
				if (nums[i] < low)
					low = nums[i];
				if (nums[i] > high)
					high = nums[i];
			}
		}
		System.out.println("sum = " + sum);
		int actualValue = ((high * (high + 1)/2)) - ((low - 1) / 2 * (low));
		System.out.println("actualval = " + actualValue);
		int missingvalue = actualValue - sum;
		if (low > 1)
			missingvalue = 1;
		else if (missingvalue <= 0)
			missingvalue = high + 1;
		return missingvalue;
	}

	public static void main(String[] args) {

		Solution2 s = new Solution2();
//		int[] a = { 1, 2, 0 };
//		int[] a = { 3,4,-1,1 };
//		int[] a = { 7, 8, 9, 11, 12 };
//		int[] a = {1,1};
//		int[] a = {1};
		int[] a = {1,1000};
//		int[] a = {1,2,3,5,6};
		System.out.println(s.firstMissingPositive(a));

	}

}