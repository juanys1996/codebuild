/**
 * @name TrxData.java 
 * 
 * @version 1.0 
 * 
 * @date 28 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrxData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private OrderType ordertype;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Executive executive;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private AmountInfo amountInfo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Loyalty loyalty;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private SpecialProgram specialProgram;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Customer customer;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Company company;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private ItemSale itemSale;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private PaymentGroups paymentGroups;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrxData [ordertype=" + ordertype + ", executive=" + executive + ", amountInfo=" + amountInfo
				+ ", loyalty=" + loyalty + ", specialProgram=" + specialProgram + ", customer=" + customer
				+ ", company=" + company + ", itemSale=" + itemSale + ", paymentGroups=" + paymentGroups + "]";
	}

	/**
	 * @return the ordertype
	 */
	public OrderType getOrdertype() {
		return ordertype;
	}

	/**
	 * @param ordertype the ordertype to set
	 */
	public void setOrdertype(OrderType ordertype) {
		this.ordertype = ordertype;
	}

	/**
	 * @return the executive
	 */
	public Executive getExecutive() {
		return executive;
	}

	/**
	 * @param executive the executive to set
	 */
	public void setExecutive(Executive executive) {
		this.executive = executive;
	}

	/**
	 * @return the amountInfo
	 */
	public AmountInfo getAmountInfo() {
		return amountInfo;
	}

	/**
	 * @param amountInfo the amountInfo to set
	 */
	public void setAmountInfo(AmountInfo amountInfo) {
		this.amountInfo = amountInfo;
	}

	/**
	 * @return the loyalty
	 */
	public Loyalty getLoyalty() {
		return loyalty;
	}

	/**
	 * @param loyalty the loyalty to set
	 */
	public void setLoyalty(Loyalty loyalty) {
		this.loyalty = loyalty;
	}

	/**
	 * @return the specialProgram
	 */
	public SpecialProgram getSpecialProgram() {
		return specialProgram;
	}

	/**
	 * @param specialProgram the specialProgram to set
	 */
	public void setSpecialProgram(SpecialProgram specialProgram) {
		this.specialProgram = specialProgram;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the itemSale
	 */
	public ItemSale getItemSale() {
		return itemSale;
	}

	/**
	 * @param itemSale the itemSale to set
	 */
	public void setItemSale(ItemSale itemSale) {
		this.itemSale = itemSale;
	}

	/**
	 * @return the paymentGroups
	 */
	public PaymentGroups getPaymentGroups() {
		return paymentGroups;
	}

	/**
	 * @param paymentGroups the paymentGroups to set
	 */
	public void setPaymentGroups(PaymentGroups paymentGroups) {
		this.paymentGroups = paymentGroups;
	}

	
	

}
