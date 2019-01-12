/**
 * 
 */
package com.cfed.tutorials;

/**
 * @author Apple
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		System.out.println(a.a);
		System.out.println(b.a);
		a.a = 2;
		System.out.println(a.a);
		System.out.println(b.a);
		A x = new B();
		x.sum();
		x.add();

	}

}
