package com.konzern.eight;
class Node {
    private Node leftChild, rightChild;
    int h =0;
    
    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeftChild() {
        return this.leftChild;
    }
    
    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
    	
    	Node l = leftChild;
    	Node r = rightChild;
    	
    	
    	while(null!=l || null!=r) {
    		h = h+1;
    		if(null == l.leftChild && null!=l.rightChild) {
    			l= l.leftChild;
    		}else if(null ==l.rightChild && null!=l.leftChild)
    			l = l.rightChild;
    		else if(null ==l.rightChild && null==l.leftChild)
    			return h;
    	}
    	
    	
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	return h;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}