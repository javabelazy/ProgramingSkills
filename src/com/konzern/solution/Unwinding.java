/**
 * Unwinding a matrix in java
 * Tested a 5 x 5 matrix
 */
package com.konzern.solution;

/**
 * @author Consumerfed IT Section kozhikode
 *
 */
public class Unwinding {

	/**
	 * @param amazon
	 */
	public static void main(String[] amazon) {
		Unwinding unwindMatrix = new Unwinding();
		int[][] matrix = unwindMatrix.getInput();
		unwindMatrix.display(matrix);
		int[] value = unwindMatrix.unwindMatix(matrix);
	}

	private void display(int[][] matrix) {
		System.out.println("The Input Matrix \n");
		int len = matrix.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

	private int[] unwindMatix(int[][] matrix) {
		System.out.println("\nThe Output Array \n");
		int len = matrix.length;
		int loopCount = len * len;
		int data[] = new int[loopCount];
		int flag = 0;
		int maxRow = len - 1;
		int maxCol = len - 1;
		int minRow = 0;
		int minCol = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < loopCount; i++) {
			data[i] = matrix[row][col];
			System.out.print(data[i] + " ");
			switch (flag) {
			case 0:
				col = col + 1;
				if (col > maxCol) {
					col = maxCol;
					row = row + 1;
					minRow++;
					flag = 1;
				}
				break;
			case 1:
				row = row + 1;
				if (row > maxRow) {
					row = maxRow;
					col--;
					maxCol--;
					flag = 2;
				}
				break;
			case 2:
				col = col - 1;
				if (col < minCol) {
					row = row - 1;
					col = col + 1;
					maxRow--;
					flag = 3;
				}
				break;

			case 3:
				row = row - 1;
				if (row < minRow) {
					row = row + 1;
					col = col + 1;
					minCol++;
					flag = 0;
				}
				break;
			default:
				break;
			}
		}
		return data;
	}

	private int[][] getInput() {
		int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		return matrix;
	}
}
