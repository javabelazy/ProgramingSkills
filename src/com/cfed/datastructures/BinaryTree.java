/**
 * Adding values to tree
 */
package com.cfed.datastructures;

/**
 * @author Apple
 *
 */
public class BinaryTree {

	private Node root;

/*	private Node addRecursion(Node current, int data) {
		if (null == current) {
			return new Node(data);
		} else if( null == current.getLeft()) {
			current.setLeft(addRecursion(current.getLeft(), data));
		}else if(null == current.getRight()) {
			current.setRight(addRecursion(current.getRight(), data));
		}else {
			addRecursion(current.getLeft(), data);
		}
		return current;
	}*/
	
	private Node addRecursion(Node current, int data) {
		if (null == current) {
			return new Node(data);
		} else if(data < current.getData()) {
			current.setLeft(addRecursion(current.getLeft(), data));
		}else if(data > current.getData()) {
			current.setRight(addRecursion(current.getRight(), data));
		}/*else {
			addRecursion(current.getLeft(), data);
		}*/
		return current;
	}

	public void addData(int value) {
		root = addRecursion(root, value);
	}
}
