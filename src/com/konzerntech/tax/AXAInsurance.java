package com.konzerntech.tax;

public class AXAInsurance extends Insurance {
	

	
	private String name = "AXA INSURANCES";
	
	
	private double supplierPrice;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the supplierPrice
	 */
	@Tax(name="VAT",amount =5, mode=TaxMode.PERCENTAGE, type=TaxTypes.INCLUSIVE)
	public double getSupplierPrice() {
		return supplierPrice;
	}

	/**
	 * @param supplierPrice the supplierPrice to set
	 */
	public void setSupplierPrice(double supplierPrice) {
		this.supplierPrice = supplierPrice;
	}
	
	



}
