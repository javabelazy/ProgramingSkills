/**
 * 
 */
package com.steffi.ideas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Apple
 * 
 * <p> To find word between two strings
 *
 */
public class FindingSubstring {

	public static void main(String[] args) {
		
		String input = "I have the following TicketType: DJs, Truck: Ford, Van: Honda";

		Pattern p = Pattern.compile("(TicketType):\\s*(\\w+)");
		Matcher m = p.matcher(input);

		while (m.find()) {
		    System.out.println(m.group(1) + "\t" + m.group(2));
		}
		
	}
	
}
