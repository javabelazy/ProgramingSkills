/**
 * To get the peak value for one dimensional Array
 */
package com.cfed.algorithms;

/**
 * @author consumerfed
 *
 */
public class PeakFinders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ar = {3,8,10,13,5,25,4,8,9,1,1};
		PeakFinders pf = new PeakFinders();
		pf.findThePeakValue(ar,ar.length);
	}

	private void findThePeakValue(int[] ar,int len) {
		int peak = 0;
		for(int i=0;i<len-1;i++) {
			int comp = ar[i+1];
			if(comp>ar[i] && comp>ar[(i+2)] && comp > peak) {
				peak = comp;
			}
		}
		System.out.println("The peak value is : "+peak);
	}
}
