/**
 * Ankit is in maze. The command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.
 * For example if he is at (2, 0) and the command is L he will go to (1, 0).
 * 
 * SAMPLE INPUT : LLRDDR
 * SAMPLE OUTPUT : 0 -2
 * 
 */
package com.hackerearth.basicprograming;
import java.util.Scanner;
/**
 * @author consumerfed
 *
 */
public class EMazeIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		String traverse = sc.nextLine();
		for(int i=0;i<traverse.length();i++) {
			char movement = traverse.charAt(i);
			switch (movement) {
			case 'L':
				x =x -1;
				break;
			case 'D':
				y = y -1;
				break;
			case 'R':
				x = x + 1;
				break;
			case 'U':
				y = y + 1;
				break;

			default:
				break;
			}
		}
		System.out.println( x + " "+y );
	}
}
