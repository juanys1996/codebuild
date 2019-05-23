/**
 * @name Promotion.java 
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

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
public class Promotion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String promotionCode = " ";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promotion [promotionCode=" + promotionCode + "]";
	}

	/**
	 * @return the promotionCode
	 */
	public String getPromotionCode() {
		return promotionCode;
	}

	/**
	 * @param promotionCode the promotionCode to set
	 */
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	

}
