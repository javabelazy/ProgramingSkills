/**
 * Amazon interview question rotating a matrix to 90 degree
 */
package com.cfed.amazon;

/**
 * @author Konzernties
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][] = new int[3][3];
		int val = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ar[i][j] = ++val;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" Rotated 90 degree to left ");
		
		for (int j = 2; j >= 0; j--) {
			for (int i = 0; i < 3; i++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
