package com.leetcode.contest;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (i.e., buy one and sell one share of the stock
 * multiple times).
 * 
 * Note: You may not engage in multiple transactions at the same time (i.e., you
 * must sell the stock before you buy again).
 *
 */

class Solution5 {

	public int maxProfit4(int[] prices) {

		int ans = maxProfit(prices, prices.length, 2);
		return ans;
	}

	private int maxProfit(int[] price, int n, int k) {
		int profit[][] = new int[k + 1][n + 1];

		// For day 0, you can't earn money // irrespective of how many times yourade
		for (int i = 0; i <= k; i++)
			profit[i][0] = 0;

		// profit is 0 if we don't do any // transation (i.e. k =0)
		for (int j = 0; j <= n; j++)
			profit[0][j] = 0;
		// fill the table in bottom-up fashion
		for (int i = 1; i <= k; i++) {
			int prevDiff = Integer.MIN_VALUE;
			for (int j = 1; j < n; j++) {
				prevDiff = Math.max(prevDiff, profit[i - 1][j - 1] - price[j - 1]);
				profit[i][j] = Math.max(profit[i][j - 1], price[j] + prevDiff);
			}
		}

		return profit[k][n - 1];

	}

	public static void main(String[] args) {
//		int[] a = { 7, 1, 5, 3, 6, 4 };
//		int[] a = { 1, 2, 3, 4, 5 };
//		int []a = {7,6,4,3,1};
//		int[] a = { 1, 2, 3, 4, 1 };
		int[] a = { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println(new Solution5().maxProfit(a));
	}

	private int maxProfit(int[] prices) {
		int profit = 0;
		int profit2 = 0;
		int current = 0;
		int buy = 0;
		int total = 0;
		boolean increasing = false;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]>=prices[i-1]) {
				if(!increasing) {
					buy = prices[i-1];
				}
				increasing = true;
			}else {
				if(increasing) {
					int currentProfit = 0;
					if(prices.length ==i)
						currentProfit = prices[i]-buy;
					else
						currentProfit = prices[i-1] - buy;
					
					if(currentProfit > profit) {
						profit = currentProfit;
					}else if(currentProfit > profit2) {
						profit2 = currentProfit;
					}
				}
				increasing = false;
			}

		}
		total = profit+profit2;
		return total;
	}

	private int maxProfit1(int[] prices) {
		// store maximum profit gained
		int profit = 0;

		// initialize local minimum to first element's index
		int j = 0;

		// start from second element
		for (int i = 1; i < prices.length; i++) { // update local minimum if decreasing sequence is found
			if (prices[i - 1] > prices[i]) {
				j = i;
			}

			// sell shares if current element is peak // i.e. (previous <= current > next)
			if (prices[i - 1] <= prices[i] && (i + 1 == prices.length || prices[i] > prices[i + 1])) {
				profit += (prices[i] - prices[j]);
				System.out.printf("Buy on day %d and sell on day %d\n", j + 1, i + 1);
			}
		}

		return profit;
	}

	private int maxProfit2(int[] prices) {
		int profit = 0;
		int minimum = 0;
		for (int current = 1; current < prices.length; current++) {
			int previous = current - 1;
			int next = current + 1;
			if (prices[previous] > prices[current]) {
				minimum = current;
			}
			if (prices[previous] <= prices[current] && (next == prices.length || prices[current] > prices[next])) {
				profit += (prices[current] - prices[minimum]);
			}
		}
		return profit;
	}

}