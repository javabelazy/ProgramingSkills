/**
 * To print a random number between 1 to 100
 * 
 * 
 */
package com.cfed.regionaloffice;

/**
 * @author konzerntechies
 *
 */
public class RandomNumberGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long value = System.currentTimeMillis();
		System.out.println(value % 100);

	}

}
