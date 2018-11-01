package com.cfed.hackerearth;
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input */
    	/*
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
		*/
        //Scanner
     /*   Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println(a*2);    // Writing output to STDOUT
        System.out.println(name);*/
        

        /*

        // Write your code here
    	Scanner s = new Scanner(System.in);
    	  int a = s.nextInt();
          String name = s.nextLine();  
    	  System.out.println(a*2);
        System.out.println(name); */
        
    	// Declare the object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 

		// String input 
		int age = sc.nextInt(); 
		sc.nextLine();
		String name = sc.nextLine();

		// Character input 
		char gender = sc.next().charAt(0); 

		// Numerical data input 
		// byte, short and float can be read 
		// using similar-named functions. 
		
		long mobileNo = sc.nextLong(); 
		double cgpa = sc.nextDouble();

		// Print the values to check if input was correctly obtained. 
		System.out.println("Name: "+name); 
		System.out.println("Gender: "+gender); 
		System.out.println("Age: "+age); 
		System.out.println("Mobile Number: "+mobileNo); 
		System.out.println("CGPA: "+cgpa); 
        

    }
}
