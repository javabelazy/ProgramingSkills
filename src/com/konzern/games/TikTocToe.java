/**
 * Happy Birthday bestie !!!
 * 
 */
package com.konzern.games;

import java.util.Scanner;

/**
 * @author konzernites
 *
 */
public class TikTocToe {

	private int MATRIX_SIZE = 3;
	private char[][] matrix = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	private int moveCount = 1;
	private char USER_MOVE = 'X';
	private char COMP_MOVE = 'O';
	private ComputerMove computerMove = null;

	public TikTocToe() {
		intialize();
	}

	private void intialize() {
		computerMove = new ComputerMove(USER_MOVE, COMP_MOVE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" **** INSTRUCTION **** ");
		System.out.println(" User has to enter row and column ");
		System.out.println(" Postion starts from (0,0) to (2,2) ");
		TikTocToe t = new TikTocToe();
		t.startGame();
		System.out.println(" **** GAME OVER ***** ");
		System.out.println(" Developed by consumerfed I T section kozhikode ");

	}

	private void startGame() {
		char move = 'x';
		Scanner scanner = new Scanner(System.in);
		int rowMoved = 0;
		int colMoved = 0;
		while (moveCount < 9) {

			if (moveCount % 2 == 0) {

				matrix = computerMove.computeMove(matrix, moveCount, rowMoved, colMoved);
				System.out.println("** COMPUTER MOVE **");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {

				System.out.println("** YOUR MOVE **");
				System.out.println(" Enter the row (values from 0 to 2): ");
				int row = scanner.nextInt();
				validate(row);
				System.out.println(" Enter the col (values from 0 to 2): ");
				int col = scanner.nextInt();
				validate(col);
				matrix[row][col] = USER_MOVE;
				rowMoved = row;
				colMoved = col;
			}
			printMatrix();
			boolean winner = checkWinner(matrix, move);
			if (winner) {
				System.out.println("*** Congratulation *** ");
				System.out.println(move + " is the winner ");
				break;
			}
			moveCount++;
		}

	}

	private void validate(int value) {
		if (value < 0 || value > 2) {
			throw new IllegalArgumentException(" This value is not permitted");
		}
	}

	private void printMatrix() {
		for (int row = 0; row < MATRIX_SIZE; row++) {
			for (int col = 0; col < MATRIX_SIZE; col++) {
				System.out.print(matrix[row][col] + " | ");
			}
			System.out.println("");
		}
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
	}
}
