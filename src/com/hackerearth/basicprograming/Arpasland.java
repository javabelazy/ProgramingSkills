/**
 * Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.
 */
package com.hackerearth.basicprograming;

import java.util.Arrays;
import java.util.Scanner;

public class Arpasland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String tagId = sc.nextLine();
		String tagId = "13A357-22";
		String[] vowels = { "A", "E", "I", "O", "U", "Y" };
		boolean isValid = true;
		String val = tagId.substring(2, 3);
		boolean contains = Arrays.stream(vowels).anyMatch(val::equals);
		if (contains) {
			isValid = false;
		}
		if (isValid) {
			for (int i = 1; i < tagId.length(); i++) {
				if (Character.isDigit(tagId.charAt(i - 1)) && Character.isDigit(tagId.charAt(i))) {
					if (((int) tagId.charAt(i - 1) + (int) tagId.charAt(i)) % 2 != 0) {
						isValid = false;
						break;
					}
				}
			}
		}
		System.out.println(isValid ? "valid" : "invalid");
	}

}
