/**
 * To Find the K th non repeated value in a String
 * 
 * input hello 3
 * output o
 */
package com.cfed.tutorials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author KonzernTechies
 * 
 *         Vishnu prasad varma
 *
 */
public class NonRepeatedElements {

	public char findNonRepeatElement(String inputStr, int k) {


//		Scanner sc = new Scanner(System.in);
//		String inputStr = "hello";
//		int k = 3;

		Map<Character, Integer> varCountMap = new HashMap<>();
		List<Character> nonRepeatChar = new ArrayList<>();

		int len = inputStr.length();

		for (int i = 0; i < len; i++) {
			Character thisChar = inputStr.charAt(i);
			int count = 1;
			if (varCountMap.get(thisChar) != null) {
				count = varCountMap.get(thisChar);
				count = count + 1;
				varCountMap.put(thisChar, count);
				if (nonRepeatChar.contains(thisChar))
					nonRepeatChar.remove(thisChar);

			} else {
				varCountMap.put(thisChar, count);
				nonRepeatChar.add(thisChar);
			}
		}

		System.out.println(nonRepeatChar.get(k - 1));

		return nonRepeatChar.get(k - 1);
	}


}
