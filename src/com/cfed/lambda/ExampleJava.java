/**
 * To find the area of circle  & Multiplication Table
 */
package com.cfed.lambda;

import java.util.Scanner;

/**
 * @author consumerfed
 *
 */
public class ExampleJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleJava ex = new ExampleJava();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers ( to find the mul table upto 5 )");
		int mulNumb = sc.nextInt();
		ex.multiplicationTable(mulNumb);
		System.out.println(" Find the area of a circle ( Enter the radius)");
		float radius = sc.nextFloat();
		System.out.println(" The area of the circle with "+radius+" is "+ex.findAreaOfCircle(radius));;

	}



	private double findAreaOfCircle(float radius) {
		// TODO Auto-generated method stub
		double area = Math.PI * Math.sqrt(radius);
		return area;
	}



	private void multiplicationTable(int mulNumb) {
		// TODO Auto-generated method stub
		for(int i =1; i<=mulNumb; i++) {
			for(int j=1; j<=5;j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
	}

}
