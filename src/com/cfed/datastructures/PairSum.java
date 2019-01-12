package com.cfed.datastructures;
/**
 * You have been given an integer array A and a number K. Now, you need to find out whether any two different elements of the array A sum to the number K. Two elements are considered to be different if they lie at different positions in the array. If there exists such a pair of numbers, print "YES" (without quotes), else print "NO" without quotes.

Input Format:

The first line consists of two integers N, denoting the size of array A and K. The next line consists of N space separated integers denoting the elements of the array A.

Output Format:

Print the required answer on a single line.


 * @author  Consumerfed IT Section kozhikode
 *
 */

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int v = 6;
		int[] ar = {1,2,3,4,5};
		boolean isFound = false;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if((ar[i]+ar[j])==v) {
					isFound = true;
					break;
				}
				
			}
			
		}
		if(isFound) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
