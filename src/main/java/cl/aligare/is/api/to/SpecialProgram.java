/**
 * @name SpecialProgram.java 
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
public class SpecialProgram implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;
	
	private int specialProgramType = 0;
	
	private int specialProgramId = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String names1 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String names2 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String email1 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String email2 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String messageText = " ";
	
	private int isGift = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Address address;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpecialProgram [specialProgramType=" + specialProgramType + ", specialProgramId=" + specialProgramId
				+ ", names1=" + names1 + ", names2=" + names2 + ", email1=" + email1 + ", email2=" + email2
				+ ", messageText=" + messageText + ", isGift=" + isGift + ", address=" + address + "]";
	}

	/**
	 * @return the specialProgramType
	 */
	public int getSpecialProgramType() {
		return specialProgramType;
	}

	/**
	 * @param specialProgramType the specialProgramType to set
	 */
	public void setSpecialProgramType(int specialProgramType) {
		this.specialProgramType = specialProgramType;
	}

	/**
	 * @return the specialProgramId
	 */
	public int getSpecialProgramId() {
		return specialProgramId;
	}

	/**
	 * @param specialProgramId the specialProgramId to set
	 */
	public void setSpecialProgramId(int specialProgramId) {
		this.specialProgramId = specialProgramId;
	}

	/**
	 * @return the names1
	 */
	public String getNames1() {
		return names1;
	}

	/**
	 * @param names1 the names1 to set
	 */
	public void setNames1(String names1) {
		this.names1 = names1;
	}

	/**
	 * @return the names2
	 */
	public String getNames2() {
		return names2;
	}

	/**
	 * @param names2 the names2 to set
	 */
	public void setNames2(String names2) {
		this.names2 = names2;
	}

	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}

	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}

	/**
	 * @param email2 the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * @return the isGift
	 */
	public int getIsGift() {
		return isGift;
	}

	/**
	 * @param isGift the isGift to set
	 */
	public void setIsGift(int isGift) {
		this.isGift = isGift;
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
