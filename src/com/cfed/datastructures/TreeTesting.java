/**
 * 
 */
package com.cfed.datastructures;

/**
 * @author Apple
 *
 */
public class TreeTesting {

	public static void main(String[] args) {
		int arr[] = {8,6,7,4,3,1,2};
		BinaryTree binary = new BinaryTree();
		for(int i =0; i< arr.length; i++) {
			binary.addData(arr[i]);
		}
		
		System.out.println(binary);
	}
}
