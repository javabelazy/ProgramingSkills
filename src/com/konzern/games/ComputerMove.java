/**
 * Computer Moves for user move in tik toc toe
 * Developed by consumerfed kozhikode I T section
 * Version 1.0 
 * consfedkozhikode@gmail.com
 * 
 */
package com.konzern.games;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 * @author konzernites
 *
 */
public class ComputerMove {

	private char userMove = '\0';
	private char compMove = '\0';
	private int MATRIX_SIZE = 3;
	private static final char EMPTY_DATA = ' ';
	private Map<String, Integer> priorityPosition = null;
	private static final String techIssue = "EXPERIENCING SOME TECHNICAL ISSUE";
	private char[][] elementData = null;
	

	public ComputerMove(char userMove, char compMove) {
		this.compMove = compMove;
		this.userMove = userMove;

	}

	public char[][] computeMove(char[][] matrix, int moveCount, int rowMoved, int colMoved) {
		this.elementData = matrix;
		if (moveCount <= 2) {
			matrix = generateFirstCompMove(matrix);
		} else {
			matrix = generateCompMove(matrix, moveCount, rowMoved, colMoved);
		}
		return matrix;
	}

	private char[][] generateCompMove(char[][] matrix, int moveCount, int rowMoved, int colMoved) {
		priorityPosition = new HashMap<>();
		boolean isInserted = false;
		for (int row = 0; row < MATRIX_SIZE; row++) {
			for (int col = 0; col < MATRIX_SIZE; col++) {

				if (EMPTY_DATA == matrix[row][col]) {
					isInserted = findPriority(matrix, row, col);
					if (isInserted)
						return matrix;
				}

			}
		}

		if (!isInserted) {
			String key = maxUsingCollectionsMaxAndLambda(priorityPosition);
			int r = Integer.parseInt(key.substring(0, 1));
			int c = Integer.parseInt(key.substring(1, 2));
			if (isSpaceEmpty(matrix, r, c))
				matrix[r][c] = compMove;
		}
		return matrix;
	}

	private boolean findPriority(char[][] matrix, int row, int col) {

		boolean isInserted = true;
		if (diagonalOne(matrix, 0, 0)) {
			isInserted = true;
		} else if (diagonalTwo(matrix, 0, MATRIX_SIZE - 1)) {
			isInserted = true;
		} else if (rowCheck(matrix, row, col)) {
			matrix[row][col] = compMove;
		} else if (colCheck(matrix, row, col)) {
			matrix[row][col] = compMove;
		} else {
			isInserted = false;
		}
		return isInserted;
	}

	private boolean diagonalTwo(char[][] matrix, int row, int col) {
		boolean isPrior = false;
		boolean isSafe = false;
		int loopCount = 1;
		int value = 0;
		int r = 0;
		int c = 0;
		while (loopCount <= MATRIX_SIZE) {

			if (compMove == matrix[row][col]) {
				isSafe = true;
				break;
			} else if (userMove == matrix[row][col]) {
				value++;
			}
			if (EMPTY_DATA == matrix[row][col]) {
				r = row;
				c = col;
			}
			row++;
			col--;
			loopCount++;
		}

		if (!isSafe) {
			String key = String.valueOf(r + "" + c);
			priorityPosition.put(key, value);
		}

		if (value == 2 && !isSafe) {
			matrix[r][c] = compMove;
			isPrior = true;
		}
		return isPrior;
	}

	private boolean diagonalOne(char[][] matrix, int row, int col) {
		boolean isPrior = false;
		boolean isSafe = false;
		int loopCount = 1;
		int value = 0;
		int r = 0;
		int c = 0;
		while (loopCount <= MATRIX_SIZE) {

			if (compMove == matrix[row][col]) {
				isSafe = true;
				break;
			} else if (userMove == matrix[row][col]) {
				value++;
			}
			if (EMPTY_DATA == matrix[row][col]) {
				r = row;
				c = col;
			}
			row++;
			col++;
			loopCount++;
		}

		if (!isSafe) {
			String key = String.valueOf(r + "" + c);
			priorityPosition.put(key, value);
		}

		if (value == 2 && !isSafe) {
			matrix[r][c] = compMove;
			isPrior = true;
		}
		return isPrior;
	}

	private boolean colCheck(char[][] matrix, int row, int col) {
		boolean isPrior = false;
		boolean isSafe = false;
		int loopCount = 1;
		int value = 0;

		int r = row;
		int c = col;
		while (loopCount < MATRIX_SIZE) {
			if (r + 1 == MATRIX_SIZE) {
				r = 0;
			} else {
				r++;
			}
			if (compMove == matrix[r][c]) {
				isSafe = true;
				break;
			} else if (userMove == matrix[r][c]) {
				value++;
			}
			loopCount++;
		}

		if (!isSafe) {
			String key = String.valueOf(row + "" + col);
			priorityPosition.put(key, value);
		}

		if (value == 2 && !isSafe) {
			isPrior = true;
		}
		return isPrior;
	}

	private boolean rowCheck(char[][] matrix, int row, int col) {
		boolean isPrior = false;
		boolean isSafe = false;
		int loopCount = 1;
		int value = 0;

		int r = row;
		int c = col;
		while (loopCount < MATRIX_SIZE) {

			c = (c + 1 == MATRIX_SIZE) ? 0 : c + 1;

			if (compMove == matrix[r][c]) {
				isSafe = true;
				break;
			} else if (userMove == matrix[r][c]) {
				value++;
			}
			loopCount++;
		}

		if (!isSafe) {
			String key = String.valueOf(row + "" + col);
			priorityPosition.put(key, value);
		}

		if (value == 2 && !isSafe) {
			isPrior = true;
		}
		return isPrior;
	}

	private char[][] generateFirstCompMove(char[][] matrix) {
		int row = 0;
		int col = 0;
		if (EMPTY_DATA == matrix[1][1]) {
			matrix[1][1] = compMove;
		} else {
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
			col = (row == 1 && col == 1) ? col + 1 : col;
			matrix[row][col] = compMove;
		}
		return matrix;
	}

	private <K, V extends Comparable<V>> K maxUsingCollectionsMaxAndLambda(Map<K, V> map) {
		Entry<K, V> maxEntry = Collections.max(map.entrySet(),
				(Entry<K, V> e1, Entry<K, V> e2) -> e1.getValue().compareTo(e2.getValue()));
		return maxEntry.getKey();
	}

	public static void main(String[] args) {
		ComputerMove c = new ComputerMove('X', 'O');
		char[][] matrix = { { 'X', ' ', ' ' }, { ' ', 'X', ' ' }, { ' ', ' ', 'O' } };
		char[][] result = c.computeMove(matrix, 4, 1, 1);
		c.printMatrix(result);
	}

	private boolean isSpaceEmpty(char[][] matrix, int row, int col) {
		if (userMove == matrix[row][col] || compMove == matrix[row][col]) {
			throw new IllegalArgumentException(techIssue);
		}
		return true;
	}

	private void printMatrix(char[][] matrix) {

		for (int row = 0; row < MATRIX_SIZE; row++) {
			for (int col = 0; col < MATRIX_SIZE; col++) {
				System.out.print(matrix[row][col] + " | ");
			}
			System.out.println("");
		}

	}
}
