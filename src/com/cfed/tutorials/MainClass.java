/**
 * 
 */
package com.cfed.tutorials;

/**
 * @author Apple
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "LONDON India’s onetime jeweler to the stars. Nirav Modi, has been arrested in London and faces extradition to India to face allegations that he defrauded lenders. Nirav Modi built global jewelry empire, according to authorities, on web of illegal loans guaranteed by state-owned Punjab National Bank.Celebrity Jeweler Suspected in $2 Billion Fraud Arrested in London, Faces Extradition to India.";
		Paragraph p  = new Paragraph(s);
		System.out.println(p.getSentenceWithMaxWords());
	}

}
