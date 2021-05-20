/**
 * 
 */
package com.cfed.exceptions;

/**
 * @author Apple
 *
 */
public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		c.callUpdate();

	}

	private void callUpdate() {
		try {
		Service s = new Service();
		s.update();
		s.insert();
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("inside call update");
			e.printStackTrace();
		}
	}

}
