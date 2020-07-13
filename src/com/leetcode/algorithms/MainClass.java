/**
 * 
 */
package com.leetcode.algorithms;

/**
 * @author Apple
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		
		System.out.println(989+989);
		
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(1);
	/*	l2.next = new ListNode(8);
		l2.next.next = new ListNode(9);*/
		
		ListNode a = s.addTwoNumbers(l1, l2);
		
//		System.out.println(a);
		
		while(a!=null) {
			System.out.print(a.val+" ");
			a=a.next;
		}

	}

}
