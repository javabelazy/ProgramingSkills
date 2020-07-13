/**
 * 
 */
package com.konzerntech.pattern;

/**
 * @author Apple
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HotelThread hotel1 = new HotelThread(1, "hyatt", "diear");
		HotelThread hotel2 = new HotelThread(2, "burj al arab", "marina");
		HotelThread hotel3 = new HotelThread(3, "jw mariot", "dubai");
		
		Thread t1 = new Thread(hotel1);
		Thread t2 = new Thread(hotel2);
		Thread t3 = new Thread(hotel3);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(hotel1.getHotel());
		System.out.println(hotel2.getHotel());
		System.out.println(hotel3.getHotel());
		
	}

}
