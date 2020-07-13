package com.konzern.games;

import java.util.Scanner;

/**
 *  Tic Toc Toe Prototype developed in java
 *  Steffi Thomas
 */

/**
 * @author konzernites
 *
 */
public class TikTokToe {

	private int MATRIX_SIZE = 3;
	private char[][] matrix = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	private int moveCount = 0;

	public TikTokToe() {
		intialize();
	}

	private void intialize() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { 'x', 'o', 'x' }, { 'x', ' ', ' ' }, { 'o', 'x', 'x' } };
		TikTokToe t = new TikTokToe();
		t.startGame();
//		boolean isWin = t.checkWinner(matrix, 'x');
//		t.printMatrix();
		System.out.println(" Developed by consumerfed I T section kozhikode ");

	}

	private void startGame() {
		// TODO Auto-generated method stub
		char move = 'x';
		Scanner scanner = new Scanner(System.in);
		while (moveCount < 9) {
			System.out.println("** MOVE FOR " + move + " **");
			System.out.println(" Enter the row:");
			int row = scanner.nextInt();
			System.out.println(" Enter the col:");
			int col = scanner.nextInt();
			matrix[row][col] = move;
			printMatrix();
			boolean winner = checkWinner(matrix, move);
			if (winner) {
				System.out.println("*** Congratulation *** ");
				System.out.println(move + " is the winner ");
				break;
			}
			move = ('x' == move) ? 'o' : 'x';
		}

	}

	private void printMatrix() {
		// TODO Auto-generated method stub

		for (int row = 0; row < MATRIX_SIZE; row++) {
			for (int col = 0; col < MATRIX_SIZE; col++) {
				System.out.print(matrix[row][col] + " | ");
			}
			System.out.println("");
		}

	}

	private void checkWinner() {
		// TODO Auto-generated method stub

	}

	private boolean checkWinner(char[][] matrix, char move) {

		if (move == matrix[0][0] && move == matrix[0][1] && move == matrix[0][2]) {
			return true;
		} else if (move == matrix[1][0] && move == matrix[1][1] && move == matrix[1][2]) {
			return true;
		} else if (move == matrix[2][0] && move == matrix[2][1] && move == matrix[2][2]) {
			return true;
		} else if (move == matrix[0][0] && move == matrix[1][0] && move == matrix[2][0]) {
			return true;
		} else if (move == matrix[0][1] && move == matrix[1][1] && move == matrix[2][1]) {
			return true;
		} else if (move == matrix[0][2] && move == matrix[1][2] && move == matrix[2][2]) {
			return true;
		} else if (move == matrix[0][0] && move == matrix[1][1] && move == matrix[2][2]) {
			return true;
		} else if (move == matrix[0][2] && move == matrix[1][1] && move == matrix[2][0]) {
			return true;
		} else {
			return false;
		}
//		return false;
	}
}
