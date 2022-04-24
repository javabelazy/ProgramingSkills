/**
 * Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.
 */
package com.striver.sde.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apple
 *
 */
public class MatrixZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] input = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		MatrixZero m = new MatrixZero();
//		m.findSolution(input);
		m.findSolution2(input);

	}

	private void findSolution2(int[][] input) {
		int len = input.length;

		List rows = new ArrayList<>();
		List cols = new ArrayList<>();

		for (int row = 0; row < len; row++) {

			for (int col = 0; col < len; col++) {

				if (input[row][col] == 0) {
					rows.add(row);
					cols.add(col);
				}

			}

		}
		
		
		for (int row = 0; row < len; row++) {

			for (int col = 0; col < len; col++) {

				if(rows.contains(row)) {
					input[row][col] =0;
				}
				
				if(cols.contains(col)) {
					input[row][col] =0;
				}

			}

		}
		
		
		System.out.println(input);
	}

	private void findSolution(int[][] input) {

		int[][] output = input.clone();

		int len = input.length;

		for (int row = 0; row < len; row++) {

			for (int col = 0; col < len; col++) {

				if (input[row][col] == 0) {

					modifyMatrix(row, col, output, len);

				}

			}

		}

	}

	private void modifyMatrix(int row, int col, int[][] output, int len) {

		if (row == 0) {
			int r = row;
			while (r < len) {
				output[r][col] = 0;
				r = r + 1;
			}

		} else if (row == len) {
			int r = row;
			while (r >= 0) {
				output[r][col] = 0;
				r = r - 1;
			}

		} else {

		}

	}

}
