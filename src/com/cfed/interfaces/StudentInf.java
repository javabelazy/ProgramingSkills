/**
 * 
 */
package com.cfed.interfaces;

/**
 * @author cfed
 *
 */
public interface StudentInf {
	
	public void printStudent();
	
	default void log(String str) {
		System.out.println(" log :"+str);
	}

}
