/**
 * 
 */
package com.cfed.oopsconcepts;

/**
 * @author Apple
 *
 */
public class Cat extends Animal {

	/* (non-Javadoc)
	 * @see com.cfed.oopsconcepts.Animal#lifeSpan()
	 */
	@Override
	public int lifeSpan() {
		// TODO Auto-generated method stub
		return 16;
	}
	
	/**
	 * This method cannot access through super class
	 * as the method is not declared in the super class
	 */
	public void bark() {
		System.out.println(" meow");
	}

}
