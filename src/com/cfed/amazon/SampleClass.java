/**
 * find all element that satisfies
 * 
 * square of a = square of b + square of c
 * 
 */
package com.cfed.amazon;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1,2,3,4,5};
		
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar.length;j++) {
				
				for(int k=0;k<ar.length;k++) {
//					System.out.println(i+" -"+j+" - "+k);
					
					int a = ar[i] * ar[i];
					int b = ar[j] * ar[j];
					int c = ar[k] * ar[k];
					
					if(a==(b+c)) {
						System.out.println(a +" = "+ b + " + "+c);
					}
				}
			}
		}

	}

}
