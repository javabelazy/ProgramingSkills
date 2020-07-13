/**
 * 
 */
package com.konzerntech.pattern;

/**
 * @author Apple
 *
 */
public class HotelThread implements Runnable {
	
	private final Hotel hotel = new Hotel();
	private int id;
	private String name;
	private String desc;
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public HotelThread(int hotelId, String name, String desc) {
		this.id = hotelId;
		this.name = name;
		this.desc = desc;
	}

	@Override
	public void run() {
		hotel.setHotelId(id).setHotelName(name).setHotelDescription(desc);
	}

}
