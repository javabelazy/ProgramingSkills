package com.konzern.lambda;

public class Test {

	public static void main(String[] args) {
		
		  TestInf testInf = Test::calculate; //method reference
		  testInf.calculate();
		  
		  TestInf a = new Calculate();
		  a.calculate();
		  
		  TestInf b = () ->{};
		  b.calculate();
		
		  
		  
		  

	}
	
	
	public static void calculate() {
		System.out.println(" calculate ");
	}
	


}
