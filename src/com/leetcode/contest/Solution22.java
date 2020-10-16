package com.leetcode.contest;

/**

 *
 */

class Solution22 {

	public boolean searchMatrix(int[][] matrix, int target) {

		boolean found = false;

		int row = matrix.length;

		if (row > 0) {

			for (int i = 0; i < row; ++i) {

				if (!found) {
					for (int j = 0; j < matrix[i].length; ++j) {
						System.out.println(matrix[i][j]);

						if (target == matrix[i][j]) {

							found = true;
							break;
						}
					}
				}
			}

		}

		return found;
	}

	public static void main(String[] args) {
		Solution22 s = new Solution22();
		int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int target = 38;
		System.out.println(s.searchMatrix(nums, target));

	}
}