/**
 * 
 */
package com.cfed.interfaces;

/**
 * @author nijesh
 *
 */
public interface EmployeeInf {
	
	public void printEmployee();
	
	default void log(String str) {
		System.out.println(" log in employee inf : "+str);
		
	}

}
