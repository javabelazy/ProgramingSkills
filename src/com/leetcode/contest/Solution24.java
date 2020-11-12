package com.leetcode.contest;

/**
 * Given the coordinates of four points in 2D space, return whether the four
 * points could construct a square.
 * 
 * The coordinate (x,y) of a point is represented by an integer array with two
 * integers.
 * 
 * @author Apple
 *
 */

class Solution24 {

	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

		double edge = 0;
		double diagonal = 0;

		int edgeCount = 0;
		int diagonalCount = 0;

		double p12 = findSquare(p1, p2);
		edge = p12;
		edgeCount++;
		double p13 = findSquare(p1, p3);

		if (edge == p13) {
			edgeCount++;
		} else {
			diagonal = p13;
			diagonalCount++;
		}

		double p24 = findSquare(p2, p4);

		if (edge == p24) {
			edgeCount++;
		} else if (diagonal == p24) {
			diagonalCount++;
		} else {
			return false;
		}

		double p34 = findSquare(p3, p4);

		if (edge == p34) {
			edgeCount++;
		} else if (diagonal == p34) {
			diagonalCount++;
		} else {
			return false;
		}

		double p14 = findSquare(p1, p4);

		if (edge == p14) {
			edgeCount++;
		} else if (diagonal == p14) {
			diagonalCount++;
		} else {
			return false;
		}

		double p23 = findSquare(p2, p3);
		if (edge == p23) {
			edgeCount++;
		} else if (diagonal == p23) {
			diagonalCount++;
		} else {
			return false;
		}

		if ((edgeCount == 2 && diagonalCount == 4) || (edgeCount == 4 && diagonalCount == 2))
			return true;

		return false;
	}

	private double findSquare(int[] p1, int[] p2) {
		double distance = Math.sqrt(((p2[0] - p1[0]) * (p2[0] - p1[0])) + ((p2[1] - p1[1]) * (p2[1] - p1[1])));
		return distance;
	}

	public static void main(String[] args) {

		Solution24 s = new Solution24();
		int[] p2 = { 1, 0 };
		int[] p1 = { 0, 1 };
		int[] p3 = { 0, -1 };
		int[] p4 = { -1, 0 };
		System.out.println(s.validSquare(p1, p2, p3, p4));
	}
}