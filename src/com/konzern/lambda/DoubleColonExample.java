/**
 * 
 */
package com.konzern.lambda;

/**
 * @author Apple
 *
 */
public class DoubleColonExample {

	
	public  void printName(){
		System.out.println(" Print the name");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DoubleColonExample()::printName;

	}

}
