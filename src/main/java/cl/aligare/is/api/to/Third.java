/**
 * @name Third.java 
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
public class Third implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String thirdOrderNumber = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String skuThird = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String thirdId = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String thirdName = " ";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Third [thirdOrderNumber=" + thirdOrderNumber + ", skuThird=" + skuThird + ", thirdId=" + thirdId
				+ ", thirdName=" + thirdName + "]";
	}

	/**
	 * @return the thirdOrderNumber
	 */
	public String getThirdOrderNumber() {
		return thirdOrderNumber;
	}

	/**
	 * @param thirdOrderNumber the thirdOrderNumber to set
	 */
	public void setThirdOrderNumber(String thirdOrderNumber) {
		this.thirdOrderNumber = thirdOrderNumber;
	}

	/**
	 * @return the skuThird
	 */
	public String getSkuThird() {
		return skuThird;
	}

	/**
	 * @param skuThird the skuThird to set
	 */
	public void setSkuThird(String skuThird) {
		this.skuThird = skuThird;
	}

	/**
	 * @return the thirdId
	 */
	public String getThirdId() {
		return thirdId;
	}

	/**
	 * @param thirdId the thirdId to set
	 */
	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}

	/**
	 * @return the thirdName
	 */
	public String getThirdName() {
		return thirdName;
	}

	/**
	 * @param thirdName the thirdName to set
	 */
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	

	
}
