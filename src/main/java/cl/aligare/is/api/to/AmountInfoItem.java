/**
 * @name AmountInfoItem.java 
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
public class AmountInfoItem implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;
	
	private int cost = 0;
	
	private int quantity = 0;
	
	private int unitAmount = 0;
	
	private int unitDiscountAmount = 0;
	
	private int totalDiscountAmount = 0;
	
	private int typeDiscount = 0;
	
	private int totalItemAmount = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AmountInfoItem [cost=" + cost + ", quantity=" + quantity + ", unitAmount=" + unitAmount
				+ ", unitDiscountAmount=" + unitDiscountAmount + ", totalDiscountAmount=" + totalDiscountAmount
				+ ", typeDiscount=" + typeDiscount + ", totalItemAmount=" + totalItemAmount + "]";
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitAmount
	 */
	public int getUnitAmount() {
		return unitAmount;
	}

	/**
	 * @param unitAmount the unitAmount to set
	 */
	public void setUnitAmount(int unitAmount) {
		this.unitAmount = unitAmount;
	}

	/**
	 * @return the unitDiscountAmount
	 */
	public int getUnitDiscountAmount() {
		return unitDiscountAmount;
	}

	/**
	 * @param unitDiscountAmount the unitDiscountAmount to set
	 */
	public void setUnitDiscountAmount(int unitDiscountAmount) {
		this.unitDiscountAmount = unitDiscountAmount;
	}

	/**
	 * @return the totalDiscountAmount
	 */
	public int getTotalDiscountAmount() {
		return totalDiscountAmount;
	}

	/**
	 * @param totalDiscountAmount the totalDiscountAmount to set
	 */
	public void setTotalDiscountAmount(int totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	/**
	 * @return the typeDiscount
	 */
	public int getTypeDiscount() {
		return typeDiscount;
	}

	/**
	 * @param typeDiscount the typeDiscount to set
	 */
	public void setTypeDiscount(int typeDiscount) {
		this.typeDiscount = typeDiscount;
	}

	/**
	 * @return the totalItemAmount
	 */
	public int getTotalItemAmount() {
		return totalItemAmount;
	}

	/**
	 * @param totalItemAmount the totalItemAmount to set
	 */
	public void setTotalItemAmount(int totalItemAmount) {
		this.totalItemAmount = totalItemAmount;
	}

	

}
