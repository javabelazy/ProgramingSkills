/**
 * 
 */
package com.cfed.oopsconcepts;

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
		
		Animal animal = new Dog();
		System.out.println(" Dog ");
		animal.isReproduce();
		System.out.println(animal.lifeSpan());
		animal = new Cat();
		System.out.println(" Cat ");
		animal.isReproduce();
		System.out.println(animal.lifeSpan());
		//animal.bark(); 

	}

}
