/**
 * Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing their work. They decided , they end up with a fun challenge who will put the last brick.

They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.

There are only N bricks, you need to help find the challenge result to find who put the last brick.
Input:

First line contains an integer N.

Output:

Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.

Constraints:

 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class BricksGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int noOfBricks = sc.nextInt();
		String currentPerson = "P";
		int step = 1;
		int intialValue = 1;
		int bricksMoved = 0;

		while ((noOfBricks - bricksMoved) > 0) {
			if ((step % 2) != 0) {
				currentPerson = "P";
				bricksMoved = bricksMoved + intialValue;
			} else {
				currentPerson = "M";
				bricksMoved = bricksMoved + (intialValue * 2);
				intialValue = intialValue + 1;
			}
			step = step + 1;
		}

		System.out.println(currentPerson);
	}

}
