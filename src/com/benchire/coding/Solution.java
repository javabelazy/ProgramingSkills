/**
 * 
 */
package com.benchire.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Apple
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> input = new ArrayList<>();
		input.add(3);
		input.add(5);
		input.add(-9);
		input.add(2);
		input.add(-11);
		input.add(2);
		input.add(5);

		List<Integer> neg = new ArrayList<>();
		List<Integer> post = new ArrayList<>();
		
		

		for (Integer inp : input) {
			if (inp < 0)
				neg.add(inp);
			else
				post.add(inp);
		}
		
		int len = 0;
		
		List<Integer> output = new ArrayList<>(input.size());
		
		if(neg.size() < post.size()) 
			len = neg.size();
		
		int position = 0;
		
		while(!neg.isEmpty()) {
			Integer val = post.get(position);
			output.add(val);
			post.remove(val);
			 val = neg.get(position);
			output.add(val);
			neg.remove(val);
			
		}
		
		
		if(neg.size() < post.size()) 
			for (Integer inp : post) 
				output.add(inp);
		else if(neg.size() > post.size())
			for (Integer inp : neg) 
				output.add(inp);
		
		System.out.println(output);

	}

}
