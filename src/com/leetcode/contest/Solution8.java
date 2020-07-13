package com.leetcode.contest;

import com.cfed.datastructures.Node;

/**
 * Given a non-empty, singly linked list with head node head, return a middle
 * node of linked list.
 * 
 * If there are two middle nodes, return the second middle node
 * 
 * @author Apple
 *
 */

class Solution8 {

	public ListNode middleNode(ListNode head) {

		ListNode result = head;
		ListNode loop = head;
		while (loop != null && loop.next != null) {
			result = result.next;
			loop = loop.next.next;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode l = new ListNode(1);
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		l.next.next.next.next.next = new ListNode(6);
		System.out.println(new Solution8().middleNode(l));
	}
}