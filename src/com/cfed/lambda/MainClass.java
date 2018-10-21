/**
 * sample lambda experssion in java 1.8
 * 
 */
package com.cfed.lambda;

public class MainClass {

	public static void main(String args[]) {
		
		NumericTest square  = (value) -> (value * value); 
		System.out.println(" the object square returns :"+square.computeTest(5));
		
		NumericTest cube  = (value) -> (value * value * value); 
		System.out.println(" the object cube returns :"+cube.computeTest(5));
		
		StringManip concatStr = (val) -> (val+val);
		System.out.println(" String concat is "+concatStr.operate("itsection"));
		
		StringManip reverseStr = (str) ->{
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
			
		};
		
		System.out.println(" The reverse of the string is :"+reverseStr.operate("consumerfed"));
	}

}
