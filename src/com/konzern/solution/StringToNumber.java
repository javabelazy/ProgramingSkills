/**
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "0.0"
	at java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.lang.Long.parseLong(Unknown Source)
	at java.lang.Long.parseLong(Unknown Source)
	at com.konzern.solution.StringToNumber.main(StringToNumber.java:18)
 */
package com.konzern.solution;

import java.math.BigDecimal;

/**
 * @author cfed
 *
 */
public class StringToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		String valueInString = "0.0";
		long valueInLong = Long.parseLong(valueInString);
		System.out.println(valueInLong);*/
		
		String valueInString = "0.0";
		BigDecimal valueInDecimal = new BigDecimal(valueInString);
		long valueInLong = valueInDecimal.longValue();
		System.out.println(valueInLong);

	}

}
