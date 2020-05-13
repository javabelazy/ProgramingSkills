/**
 * 
 */
package com.konzern.spring.dependencyInjection;

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
		
		Shape s = new Triangle();
		
		Drawing drawing = new Drawing();
		drawing.setShape(s);
		drawing.toDraw();

	}

}
