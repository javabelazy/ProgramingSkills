/**
 * 
 */
package com.konzern.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Apple
 *
 */
public class Main {
	
	private char[][] data = new char[3][3];
	private Scanner sc = null;
	private List<String> list = null;
	
	public Main() {
		sc = new Scanner(System.in);
		list = new ArrayList<>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.compute();

	}

	private void compute() {
		boolean status = true;
		char value = 'X';
		while(status) {
			System.out.println(" Enter the position (row,col) for user: "+value+" : ");
			String position = sc.next();
			char[] positionArr = position.toCharArray();
			int x = positionArr[0];
			int y = positionArr[2];
			if(list.contains(position)) 
				continue;
			list.add(position);
			data[x][y]= value;
			value = (value=='X') ? 'O' : 'X';
			checkWinner();
		}
	}

	private void checkWinner() {
		// TODO Auto-generated method stub
		
	}

}

