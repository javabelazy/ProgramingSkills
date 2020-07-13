/**
 *  Copying an array in Java
 *  
 */
package com.cfed.tutorials;

import java.util.Arrays;

/**
 * @author consumerfed
 *
 */
public class CopingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Source array
		int a[] = {8,2,8,1,8,0,8,0,2,9};
		
		
		/**
		 * Since array is also an Object
		 * you can use clone method
		 * you can copy the whole object
		 * But partial copying is not possible
		 */
		int d[] = a.clone();
		System.out.println(" using clone method ");
		for(int i =0; i< d.length; i++) {
			System.out.print(d[i]+"\t");
		}

		
		/**
		 * The best way to copy array 
		 * you can do partial copying 
		 * From a source to destination to a different position
		 * 
		 * The below code will copy 4 elements from
		 * starting from first arrays second position to second arrays 3rd position
		 */
		System.out.println("\n using System.arrayCopy() method ");
		int b[] = new int[a.length];
		System.arraycopy(a, 2, b, 3, 4);
		for(int i =0; i< b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		
		/**
		 * If you want to copy array partially or fully
		 * use array copy method
		 */
		System.out.println("\n using Arrays.copyOf() method ");
		int c[] = Arrays.copyOf(a, a.length);
		for(int i =0; i< c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		
		/**
		 * If you want to copy array partially or fully
		 * use array copy method
		 */
		System.out.println("\n rusing Arrays.copyOfRange() method ");
		int e[] = Arrays.copyOfRange(a, 2 ,a.length);
		for(int i =0; i< e.length; i++) {
			System.out.print(e[i]+"\t");
		}

	}

}
