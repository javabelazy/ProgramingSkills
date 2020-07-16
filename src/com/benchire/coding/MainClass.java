/**
 * alternative postive negative array sorting
 * 
 * input array = [3,5,-9,2,-11,2,5]

output array = [3,-9, 5,-11,2, 2 ,5]
 */
package com.benchire.coding;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Integer> input = new ArrayList<>();
		input.add(3);
		input.add(5);
		input.add(-9);
		input.add(2);
		input.add(-11);
		input.add(2);
		input.add(5);

		List<Integer> output = new ArrayList<>();

		boolean isPositive = true;
		boolean isCompleted = false;

		while (!input.isEmpty() && !isCompleted) {

			if (isPositive) {

				int count = 0;

				for (Integer val : input) {

					if (val >= 0) {
						output.add(val);
						input.remove(val);
						isPositive = false;
						break;
					}

					count++;

				}

				if (count == input.size())
					isCompleted = true;

			} else {

				int count = 0;
				for (Integer val : input) {

					if (val < 0) {
						output.add(val);
						input.remove(val);
						isPositive = true;
						break;
					}
					count++;
				}

				if (count == input.size())
					isCompleted = true;

			}

		}

		for (Integer value : input) {
			output.add(value);
		}

		System.out.println(output);

	}

}
