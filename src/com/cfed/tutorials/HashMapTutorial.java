/**
 * 
 */
package com.cfed.tutorials;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Apple
 *
 */
public class HashMapTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapTutorial h = new HashMapTutorial();
		h.calc();

	}

	private void calc() {
		// TODO Auto-generated method stub
//		Map<String, String> m = new HashMap<>();
		Map<String, String> m = new Hashtable<>();
		m.put("sachin", "123");
		m.put("rahul", "345");
		m.put("sachin", "123");
		m.put("sachin", "567");
		System.out.println(m.hashCode());
	}

}
