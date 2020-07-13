package com.konzerntech.tax;

/**
 * Main class to show how custom annotation works
 * 
 * @author Konzernites
 *
 */
public class Main {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, NoSuchMethodException {
		Insurance insurance = new Insurance();
		insurance.setMaketPrice(200);
		PriceModification priceModification = new PriceModification();
		insurance = (Insurance) priceModification.calculateTax(insurance);
		System.out.println(" supplier price : "+insurance.getMaketPrice());
	}
}
