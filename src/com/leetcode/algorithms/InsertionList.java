/**
 * 
 */
package com.leetcode.algorithms;

/**
 * @author Apple
 *
 */
public class InsertionList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		InsertionList in = new InsertionList();
		ListNode node = null;
		for (int i = 0; i <= 3; i++) {
			 node = in.insert(node ,arr[i]);
		}
		System.out.println(node);
	}

	private ListNode insert(ListNode node, int data) {
		if(null == node) {
			return new ListNode(data);
		}else {
			node.next = insert(node.next, data);
		}
		return node;
	}

}
