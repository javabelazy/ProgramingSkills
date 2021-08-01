/**
 * 
 */
package com.steffi.ideas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Apple
 * 
 *         <p>
 *         To find word between two strings
 *         
 *         The program will get list of ID from the string using regex
 *         </p>
 * 
 *         ID Pancard 
 *         ID Aadhaar 
 *         ID DrivingLicence
 * 
 *
 */
public class FindingSubstring {
	public static void main(String[] args) {
		String input = "I user abc is has with the following Identities ID: Pancard, ID: Aadhaar, ID: DrivingLicence";
		Pattern p = Pattern.compile("(ID):\\s*(\\w+)");
		Matcher m = p.matcher(input);
		while (m.find()) {
			System.out.println(m.group(1) + "\t" + m.group(2));
		}
	}
}
