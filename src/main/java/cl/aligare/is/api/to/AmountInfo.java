/**
 * @name AmountInfo.java 
 * 
 * @version 1.0 
 * 
 * @date 7 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AmountInfo implements Serializable {

	private static final long serialVersionUID = 7514388432253828691L;

	private int amount = 0;

	private int shippingAmount = 0;

	private int taxAmount = 0;

	private int discountAmount = 0;

	private int total = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AmountInfo [amount=" + amount + ", shippingAmount=" + shippingAmount + ", taxAmount=" + taxAmount
				+ ", discountAmount=" + discountAmount + ", total=" + total + "]";
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the shippingAmount
	 */
	public int getShippingAmount() {
		return shippingAmount;
	}

	/**
	 * @param shippingAmount the shippingAmount to set
	 */
	public void setShippingAmount(int shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * @return the taxAmount
	 */
	public int getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the discountAmount
	 */
	public int getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @param discountAmount the discountAmount to set
	 */
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	

}
