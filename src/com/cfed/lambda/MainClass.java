/**
 * sample lambda experssion in java 1.8
 * 
 */
package com.cfed.lambda;

import com.cfed.interfaces.EmployeeInf;
import com.cfed.interfaces.StudentInf;

public class MainClass implements StudentInf,EmployeeInf  {

	public static void main(String args[]) {
		
		NumericTest square  = (value) -> (value * value); 
		System.out.println(" the object square returns :"+square.computeTest(5));
		
		NumericTest cube  = (value) -> (value * value * value); 
		System.out.println(" the object cube returns :"+cube.computeTest(5));
		
		StringManip concatStr = (val) -> (val+val);
		System.out.println(" String concat is "+concatStr.operate("itsection"));
		
		NumericTest hex = (value) -> (value*value* value*value);	
		System.out.println(" String concat is "+hex.computeTest(10));
		
		
		StringManip reverseStr = (str) ->{
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
			
		};
		
		System.out.println(" The reverse of the string is :"+reverseStr.operate("consumerfed"));
		
		MainClass m = new MainClass();
		m.printStudent();
		m.log("hello");
		
		
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		System.out.println(" print Consumerfed Student");
		
	}

	@Override
	public void printEmployee() {
		// TODO Auto-generated method stub'
		System.out.println(" print Consumerfed employee");
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println(" Main class log "+str);
	}
	


}
