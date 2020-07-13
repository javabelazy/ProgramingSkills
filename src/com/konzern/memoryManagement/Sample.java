/**
 * 
 */
package com.konzern.memoryManagement;

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
		
		Customer c = new Customer("test");
		renameCustomer(c);
		System.out.println(c.getName());

	}

	private static void renameCustomer(Customer cust) {
		// TODO Auto-generated method stub
		cust.setName("second");
		
	}

}
