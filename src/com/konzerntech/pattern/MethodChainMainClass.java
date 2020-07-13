/**
 * 
 */
package com.konzerntech.pattern;

/**
 * @author Konzerntech
 *
 */
public class MethodChainMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel hotel = new Hotel();
		hotel.setHotelId(1).setHotelName("hyatt place").setHotelDescription(" 3 star hotel with all facility");
		Hotel hotel1 = new Hotel();
		hotel1.setHotelId(2).setHotelName("burj al arab").setHotelDescription("Worlds only 7 star hotel");
		System.out.println(hotel);
		System.out.println(hotel1);

	}

}
