/**
 *  you can invoke multiple methods in an object to create a object using method chaining
 *  
 */
package com.konzerntech.pattern;

/**
 * @author konzerntech
 *
 */
public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String hotelDescription;
	
	public Hotel setHotelId(int hotelId) {
		this.hotelId = hotelId;
		return this;
	}
	
	public Hotel setHotelName(String hotelName) {
		this.hotelName = hotelName;
		return this;
	}
	
	public Hotel setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
		return this;
	}

	
	@Override
	public String toString() {
		return hotelId +" @ "+hotelName +" @ "+hotelDescription;
	}
}
