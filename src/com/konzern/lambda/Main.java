/**
 * 
 */
package com.konzern.lambda;

/**
 * @author Apple
 *
 */
public class Main implements Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Example e = new Example() {
			
			@Override
			public double calculate(double a, double b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};

		
		Example f = new Main();
		System.out.println(f.calculate(10, 5));
		
		Example c = (a,b) -> a*b;
		System.out.println(c);
	}

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}



}
