/**
 * @name AmountInfoPayment.java 
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
public class AmountInfoPayment implements Serializable {
	
	private static final long	serialVersionUID	= 6666209296520283440L;
	
	private int totalAmount = 0;
	
	private int amount = 0;
	
	private int amountFee = 0;
	
	private int typeFee = 0;
	
	private int fees = 0;
	
	private int deferredMonths = 0;
	
	private int firstExpirationDate = 0;
	
	private int rate = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AmountInfoPayment [totalAmount=" + totalAmount + ", amount=" + amount + ", amountFee=" + amountFee
				+ ", typeFee=" + typeFee + ", fees=" + fees + ", deferredMonths=" + deferredMonths
				+ ", firstExpirationDate=" + firstExpirationDate + ", rate=" + rate + "]";
	}

	/**
	 * @return the totalAmount
	 */
	public int getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
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
	 * @return the amountFee
	 */
	public int getAmountFee() {
		return amountFee;
	}

	/**
	 * @param amountFee the amountFee to set
	 */
	public void setAmountFee(int amountFee) {
		this.amountFee = amountFee;
	}

	/**
	 * @return the typeFee
	 */
	public int getTypeFee() {
		return typeFee;
	}

	/**
	 * @param typeFee the typeFee to set
	 */
	public void setTypeFee(int typeFee) {
		this.typeFee = typeFee;
	}

	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}

	/**
	 * @return the deferredMonths
	 */
	public int getDeferredMonths() {
		return deferredMonths;
	}

	/**
	 * @param deferredMonths the deferredMonths to set
	 */
	public void setDeferredMonths(int deferredMonths) {
		this.deferredMonths = deferredMonths;
	}

	/**
	 * @return the firstExpirationDate
	 */
	public int getFirstExpirationDate() {
		return firstExpirationDate;
	}

	/**
	 * @param firstExpirationDate the firstExpirationDate to set
	 */
	public void setFirstExpirationDate(int firstExpirationDate) {
		this.firstExpirationDate = firstExpirationDate;
	}

	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

	

}
