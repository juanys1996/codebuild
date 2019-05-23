package cl.aligare.is.api.to;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description	
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String customerId = " ";
	
	private int foreignFlag = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String foreignCountry = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String firstName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String middleName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String lastName = " ";

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String email = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String emailFlag = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String phoneNumber1 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String phoneNumber2 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Address address;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", foreignFlag=" + foreignFlag + ", foreignCountry="
				+ foreignCountry + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", email=" + email + ", emailFlag=" + emailFlag + ", phoneNumber1=" + phoneNumber1 + ", phoneNumber2="
				+ phoneNumber2 + ", address=" + address + "]";
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the foreignFlag
	 */
	public int getForeignFlag() {
		return foreignFlag;
	}

	/**
	 * @param foreignFlag the foreignFlag to set
	 */
	public void setForeignFlag(int foreignFlag) {
		this.foreignFlag = foreignFlag;
	}

	/**
	 * @return the foreignCountry
	 */
	public String getForeignCountry() {
		return foreignCountry;
	}

	/**
	 * @param foreignCountry the foreignCountry to set
	 */
	public void setForeignCountry(String foreignCountry) {
		this.foreignCountry = foreignCountry;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the emailFlag
	 */
	public String getEmailFlag() {
		return emailFlag;
	}

	/**
	 * @param emailFlag the emailFlag to set
	 */
	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}

	/**
	 * @return the phoneNumber1
	 */
	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	/**
	 * @param phoneNumber1 the phoneNumber1 to set
	 */
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	/**
	 * @return the phoneNumber2
	 */
	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	/**
	 * @param phoneNumber2 the phoneNumber2 to set
	 */
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
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
