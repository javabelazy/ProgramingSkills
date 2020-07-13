/**
 *  Sample Insurance class where the custom annotation is applied
 */
package com.konzerntech.tax;

/**
 * @author belazy
 * 
 */
public class Insurance {
	private String name;
	private double supplierPrice;
	private double maketPrice;
	private double basePrice;
	private double profit;
	private double commision;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
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
	 * @param supplierPrice
	 *            the supplierPrice to set
	 */

	public void setSupplierPrice(double supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	/**
	 * @return the maketPrice
	 */
	@Tax(name = "VAT", amount = 5, mode = TaxMode.PERCENTAGE, type = TaxTypes.INCLUSIVE)
	public double getMaketPrice() {
		return maketPrice;
	}

	/**
	 * @param maketPrice
	 *            the maketPrice to set
	 */
	public void setMaketPrice(double maketPrice) {
		this.maketPrice = maketPrice;
	}

	/**
	 * @return the basePrice
	 */
	@Tax(name = "VAT", amount = 5, mode = TaxMode.PERCENTAGE, type = TaxTypes.INCLUSIVE)
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice
	 *            the basePrice to set
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the profit
	 */
	@Tax(name = "VAT", amount = 100, mode = TaxMode.AMOUNT, type = TaxTypes.EXCLUSIVE)
	public double getProfit() {
		return profit;
	}

	/**
	 * @param profit
	 *            the profit to set
	 */
	public void setProfit(double profit) {
		this.profit = profit;
	}

	/**
	 * @return the commision
	 */
	@Tax(name = "VAT", amount = 1, mode = TaxMode.PERCENTAGE, type = TaxTypes.EXCLUSIVE)
	public double getCommision() {
		return commision;
	}

	/**
	 * @param commision
	 *            the commision to set
	 */
	public void setCommision(double commision) {
		this.commision = commision;
	}

}
