/**
 * 
 */
package com.cfed.tutorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author cfed
 *
 */
public class CollectionStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		arList.add(1);
		arList.add(11);
		arList.add(111);
		arList.add(1111);
		CollectionStreams cls = new CollectionStreams();
		cls.printValues(arList);
		

	}

	private void printValues(List<Integer> arList) {
		// TODO Auto-generated method stub
		
		Iterator<Integer> itr = arList.iterator();
		while (itr.hasNext()) {
			int var =itr.next();
			if(var>100)
			System.out.println(var);
			
		}
		
	}

}
