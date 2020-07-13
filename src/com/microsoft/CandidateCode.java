package com.microsoft;

import java.util.Scanner;

public class CandidateCode {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int no_of_ingrediant = scanner.nextInt();
		long [] ingrediant_needed =  new long[no_of_ingrediant];
		
		for(int i=0;i<no_of_ingrediant;i++) {
			ingrediant_needed[i] = scanner.nextInt();
		}
		
//		long [] total_ingrediant = new long[no_of_ingrediant];
		long min = Long.MAX_VALUE;
		
		for(int i=0;i<no_of_ingrediant;i++) {
			long total_ingrediant = scanner.nextInt();
			long value = total_ingrediant /ingrediant_needed[i];
			if(value<min)
				min = value;
		}

		System.out.println(min);
		
	}

}
