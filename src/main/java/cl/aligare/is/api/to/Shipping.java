/**
 * @name Shipping.java 
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
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class Shipping implements Serializable {

	private static final long serialVersionUID = 7514388432253828691L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingETADate = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingPreparationDate = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingDate = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingHour = " ";

	private int shippingLine = 0;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingOrder = " ";

	private int shippingType = 0;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingIdHolder = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingName = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingSurname = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String phoneNumber = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingEmail = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingObservation = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String nameWithdraw = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String lastNameRetira = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String withdrawId = " ";

	private int storeId = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Address address;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shipping [shippingETADate=" + shippingETADate + ", shippingPreparationDate=" + shippingPreparationDate
				+ ", shippingDate=" + shippingDate + ", shippingHour=" + shippingHour + ", shippingLine=" + shippingLine
				+ ", shippingOrder=" + shippingOrder + ", shippingType=" + shippingType + ", shippingIdHolder="
				+ shippingIdHolder + ", shippingName=" + shippingName + ", shippingSurname=" + shippingSurname
				+ ", phoneNumber=" + phoneNumber + ", shippingEmail=" + shippingEmail + ", shippingObservation="
				+ shippingObservation + ", nameWithdraw=" + nameWithdraw + ", lastNameRetira=" + lastNameRetira
				+ ", withdrawId=" + withdrawId + ", storeId=" + storeId + ", address=" + address + "]";
	}

	/**
	 * @return the shippingETADate
	 */
	public String getShippingETADate() {
		return shippingETADate;
	}

	/**
	 * @param shippingETADate the shippingETADate to set
	 */
	public void setShippingETADate(String shippingETADate) {
		this.shippingETADate = shippingETADate;
	}

	/**
	 * @return the shippingPreparationDate
	 */
	public String getShippingPreparationDate() {
		return shippingPreparationDate;
	}

	/**
	 * @param shippingPreparationDate the shippingPreparationDate to set
	 */
	public void setShippingPreparationDate(String shippingPreparationDate) {
		this.shippingPreparationDate = shippingPreparationDate;
	}

	/**
	 * @return the shippingDate
	 */
	public String getShippingDate() {
		return shippingDate;
	}

	/**
	 * @param shippingDate the shippingDate to set
	 */
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	/**
	 * @return the shippingHour
	 */
	public String getShippingHour() {
		return shippingHour;
	}

	/**
	 * @param shippingHour the shippingHour to set
	 */
	public void setShippingHour(String shippingHour) {
		this.shippingHour = shippingHour;
	}

	/**
	 * @return the shippingLine
	 */
	public int getShippingLine() {
		return shippingLine;
	}

	/**
	 * @param shippingLine the shippingLine to set
	 */
	public void setShippingLine(int shippingLine) {
		this.shippingLine = shippingLine;
	}

	/**
	 * @return the shippingOrder
	 */
	public String getShippingOrder() {
		return shippingOrder;
	}

	/**
	 * @param shippingOrder the shippingOrder to set
	 */
	public void setShippingOrder(String shippingOrder) {
		this.shippingOrder = shippingOrder;
	}

	/**
	 * @return the shippingType
	 */
	public int getShippingType() {
		return shippingType;
	}

	/**
	 * @param shippingType the shippingType to set
	 */
	public void setShippingType(int shippingType) {
		this.shippingType = shippingType;
	}

	/**
	 * @return the shippingIdHolder
	 */
	public String getShippingIdHolder() {
		return shippingIdHolder;
	}

	/**
	 * @param shippingIdHolder the shippingIdHolder to set
	 */
	public void setShippingIdHolder(String shippingIdHolder) {
		this.shippingIdHolder = shippingIdHolder;
	}

	/**
	 * @return the shippingName
	 */
	public String getShippingName() {
		return shippingName;
	}

	/**
	 * @param shippingName the shippingName to set
	 */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	/**
	 * @return the shippingSurname
	 */
	public String getShippingSurname() {
		return shippingSurname;
	}

	/**
	 * @param shippingSurname the shippingSurname to set
	 */
	public void setShippingSurname(String shippingSurname) {
		this.shippingSurname = shippingSurname;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the shippingEmail
	 */
	public String getShippingEmail() {
		return shippingEmail;
	}

	/**
	 * @param shippingEmail the shippingEmail to set
	 */
	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}

	/**
	 * @return the shippingObservation
	 */
	public String getShippingObservation() {
		return shippingObservation;
	}

	/**
	 * @param shippingObservation the shippingObservation to set
	 */
	public void setShippingObservation(String shippingObservation) {
		this.shippingObservation = shippingObservation;
	}

	/**
	 * @return the nameWithdraw
	 */
	public String getNameWithdraw() {
		return nameWithdraw;
	}

	/**
	 * @param nameWithdraw the nameWithdraw to set
	 */
	public void setNameWithdraw(String nameWithdraw) {
		this.nameWithdraw = nameWithdraw;
	}

	/**
	 * @return the lastNameRetira
	 */
	public String getLastNameRetira() {
		return lastNameRetira;
	}

	/**
	 * @param lastNameRetira the lastNameRetira to set
	 */
	public void setLastNameRetira(String lastNameRetira) {
		this.lastNameRetira = lastNameRetira;
	}

	/**
	 * @return the withdrawId
	 */
	public String getWithdrawId() {
		return withdrawId;
	}

	/**
	 * @param withdrawId the withdrawId to set
	 */
	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	/**
	 * @return the storeId
	 */
	public int getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
