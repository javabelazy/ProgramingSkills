package com.leetcode.algorithms;
/**
 * 
 * @author Apple
 *
 */
class Solution {

	private ListNode parentNode = null;

	private int carryforward = 0;

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int val1 = (null != l1) ? l1.val : 0;
		int val2 = (null != l2) ? l2.val : 0;
		
		int sum = val1 + val2 + carryforward;
		carryforward = sum / 10;
		int value = sum % 10;
		
		parentNode = insertValue(parentNode, value);

		ListNode n1 = (l1 == null || l1.next == null) ? null : l1.next;
		ListNode n2 = (l2 == null || l2.next == null) ? null : l2.next;

		if (n1 != null || n2 != null) {
			addTwoNumbers(n1, n2);
		}else if (carryforward > 0) {
			parentNode = insertValue(parentNode, carryforward);
			carryforward = 0;
		}
		return parentNode;
	}

	private ListNode insertValue(ListNode node, int data) {
		if (node == null) {
			return new ListNode(data);
		} else {
			node.next = insertValue(node.next, data);
		}
		return node;
	}
}