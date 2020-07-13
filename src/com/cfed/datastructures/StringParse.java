/**
 * 
 */
package com.cfed.datastructures;

/**
 * @author Apple
 *
 */
public class StringParse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr = {"hello=hi","nijesh= ","= "," =" };
		
		for(int i=0;i<arr.length;i++) {
			String[] result = arr[i].split("=");
			System.out.println(result.length);
			if(null==result[1]) {
				System.out.println("true");
			}
		}

	}

}
