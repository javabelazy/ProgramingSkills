/**
 * 
 */
package com.leetcode.contest;

/**
 * @author Apple
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(2147483646);
		obj.push(2147483646);
		obj.push(2147483647);

		System.out.println(obj.top());
		obj.pop();

		System.out.println(obj.getMin());
		obj.pop();

		System.out.println(obj.getMin());
		obj.pop();
		obj.push(2147483647);
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.push(-2147483648);
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.pop();

		System.out.println(obj.getMin());

	}

}
