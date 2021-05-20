/**
 * 
 */
package com.cfed.exceptions;

/**
 * @author Apple
 *
 */
public class Service {
	
	
	public void update() throws IllegalArgumentException  {
		try {
		throw new IllegalArgumentException("Service update method");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(" inside update method ");
			e.printStackTrace();
		}

	}

	public void insert() {
		throw new IllegalArgumentException("Serivce insert method");
		
	}

}
