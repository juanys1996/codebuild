/**
 * @name Company.java 
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
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String companyId = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String companyName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String companyTurn = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String contactFullName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String phoneNumber = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String companyEmail = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Address address;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyTurn=" + companyTurn
				+ ", contactFullName=" + contactFullName + ", phoneNumber=" + phoneNumber + ", companyEmail="
				+ companyEmail + ", address=" + address + "]";
	}

	/**
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the companyTurn
	 */
	public String getCompanyTurn() {
		return companyTurn;
	}

	/**
	 * @param companyTurn the companyTurn to set
	 */
	public void setCompanyTurn(String companyTurn) {
		this.companyTurn = companyTurn;
	}

	/**
	 * @return the contactFullName
	 */
	public String getContactFullName() {
		return contactFullName;
	}

	/**
	 * @param contactFullName the contactFullName to set
	 */
	public void setContactFullName(String contactFullName) {
		this.contactFullName = contactFullName;
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
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @param companyEmail the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
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
