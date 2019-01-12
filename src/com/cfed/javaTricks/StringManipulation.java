/**
 * 
 * Regional office kozhikode
 * 
 * input : String str = "aabbccA";
 * 
 * Output : a2A1b2c2
 * 
 */
package com.cfed.javaTricks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Consumerfed I T Section
 * 
 * 
 *
 */
public class StringManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aabbccA";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char chr = str.charAt(i);
			if(map.containsKey(chr)) {
				int val = map.get(chr);
				val = val + 1;
				map.put(chr, val);
			}else {
				map.put(chr, 1);
			}
		}
		
		for(Character key: map.keySet()) {
			System.out.print(key);
			System.out.print(map.get(key));
		}
		

	}

}
