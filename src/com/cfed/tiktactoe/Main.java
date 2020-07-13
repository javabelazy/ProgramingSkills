/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * Copyright (c) 1997-2017 Javabelazy and/or its affiliates. All rights reserved.
 *
 */
package com.cfed.tiktactoe;

/**
 * @author konzernites
 * @since 1.0
 *
 */
public class Main {

	private static final long serialVersionUID = 8683452581122892182L;
	/**
	 * @param args
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws IllegalAccessException {
		
		Matrix<Character> matrix = new Matrix<>(3, 3);

		System.out.println(" **** INSTRUCTIONS **** ");
		System.out.println(" User has to enter row and column ");
		System.out.println(" Postion starts from (0,0) to (2,2) ");
		
		TikTocToe tikTokToe = new TikTocToe(matrix);
		TikTocToe.isTwoPlayer = true;
		
		tikTokToe.startGame();
		
		System.out.println(" ***** GAME OVER ***** ");
		System.out.println(" Developed by consumerfed I T Section ");
		

	}

}
