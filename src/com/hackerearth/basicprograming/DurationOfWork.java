/**
 * To calculate the duration of each work
 * 
 * First input is the number of each work
 * 
 * second is the time (in the format start hr min & end hr min)
 * 
 *  output will be total time taken
 *  
 *  Memory used : Memory (KiB)

3137136
 */
package com.hackerearth.basicprograming;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class DurationOfWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int[][] output = new int[noOfRows][2];
		sc.nextLine();
		for(int i=0;i<noOfRows;i++) {
			String input = sc.nextLine();
			String[] inputs =input.split("\\s");
			int timeOne =Integer.parseInt(inputs[0]) * 60 + Integer.parseInt(inputs[1]);
			int timeTwo = Integer.parseInt(inputs[2]) * 60 + Integer.parseInt(inputs[3]);
			output[i][0] =(timeTwo - timeOne)/60;
			output[i][1] =(timeTwo - timeOne)%60;
		}
		
		for(int i =0;i<noOfRows;i++) {
			System.out.println(output[i][0] +" "+output[i][1]);
		}

	}

}
