package com.konzerntech.tax;

/**
 * 
 */


/**
 * @author belazy
 *
 */
public class AIGInsuarnce extends Insurance {

	

	
	private String name = "AIG INSURANCES";
	
	@Tax(name="GST",amount =18, mode=TaxMode.PERCENTAGE, type=TaxTypes.INCLUSIVE)
	public double supplierPrice;

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
