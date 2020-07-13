/**
 * 
 */
/**
 *  Java Sample to create an immutable class : Hotel
 */
package com.cfed.pattern.flyweight;

/**
 * @author Konzernites
 *
 */
// The class must be created as a final class in order to restrict the creation of child class
public final class Hotel {
	
	
	// Members in the class must be declared as final
	private final String hotelName;
	private final String hotelChain;
	private final int hotelId;
	
	
//	private final int hotelId =9; // Final method can be initialized only once.
	
	
	// A parameterized constructor , to set values to the object
	public Hotel(int hotelId, String hotelName, String hotelChain) {
		this.hotelId = hotelId;
		this.hotelChain = hotelChain;
		this.hotelName = hotelName;
	}

	// variable can be accessed only through getters method
	public String getHotelName() {
		return hotelName;
	}

	// No setters are allowed, the changing of value is restricted
	public String getHotelChain() {
		return hotelChain;
	}

	public int getHotelId() {
		return hotelId;
	}

}
