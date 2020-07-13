/**
 * FibonacciSeries using recursion
 */
package com.cfed.logicz;

/**
 * @author Alwin
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FibonacciSeries f = new FibonacciSeries();
		int count = 50;
		int first = 0;
		int second = 1;
		f.fibonacci(first, second, count);
	}

	private void fibonacci(int first, int second, int count) {
		if (count != 0) {
			System.out.print(first + " ");
			fibonacci(second, first + second, count - 1);
		}
	}

}
