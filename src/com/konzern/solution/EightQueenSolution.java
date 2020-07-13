/**
 * 
 */
package com.konzern.solution;

/**
 * @author Consumerfed
 *
 */
public class EightQueenSolution {

	private int x = 0;
	private int y = 0;
	private int queens = 0;
	private int currentQueen = 0;
	private int MAX_X = 8;
	private int MAX_Y = 8;
	private int[][] chessBoard = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 } };

	public EightQueenSolution(int queens) {
		this.queens = queens;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int queens = 8;
		EightQueenSolution solution = new EightQueenSolution(queens);
		solution.solve();

	}

	private void solve() {
		int n = 1;
		while (n <= queens) {
			currentQueen = n;
			placeQueen(n);
			n++;
		}

	}

	private void placeQueen(int queen) {
		boolean isAttack = checkForAttack(x, y);
		if (isAttack) {
			currentQueen = queen -1;
			placeQueen(currentQueen);
		} else {
			chessBoard[x][y] = 1;
			y = y + 1;
			if (y >= MAX_Y) {
				y = 0;
			}
		}
	}

	private boolean checkForAttack(int row, int col) {
		if(chessBoard[row][col]==1) {
			return true;
		}else {
			
		}
		return false;
	}

}
