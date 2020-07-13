/**
 * 
 */
package com.konzern.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chippu
 *
 */
public class MergingList {
	
	public static<T> List<T> merge(List<T> one, List<T> two){
		List<T> list = one.stream().collect(Collectors.toList());
		list.addAll(two);
		return list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List one = new ArrayList<>();
		one.add(1);
		one.add(2);
		one.add(3);
		List two = new ArrayList<>();
		two.add(4);
		two.add(5);
		two.add(6);
		System.out.println(MergingList.merge(one, two));

	}

}
