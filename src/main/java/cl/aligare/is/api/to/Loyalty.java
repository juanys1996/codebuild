/**
 * @name Loyalty.java 
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
public class Loyalty implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String associatedId = " ";

	private int basePoint = 0;

	private int paymentPoint = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String pointId = " ";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loyalty [associatedId=" + associatedId + ", basePoint=" + basePoint + ", paymentPoint=" + paymentPoint
				+ ", pointId=" + pointId + "]";
	}

	/**
	 * @return the associatedId
	 */
	public String getAssociatedId() {
		return associatedId.trim();
	}

	/**
	 * @param associatedId the associatedId to set
	 */
	public void setAssociatedId(String associatedId) {
		this.associatedId = associatedId;
	}

	/**
	 * @return the basePoint
	 */
	public int getBasePoint() {
		return basePoint;
	}

	/**
	 * @param basePoint the basePoint to set
	 */
	public void setBasePoint(int basePoint) {
		this.basePoint = basePoint;
	}

	/**
	 * @return the paymentPoint
	 */
	public int getPaymentPoint() {
		return paymentPoint;
	}

	/**
	 * @param paymentPoint the paymentPoint to set
	 */
	public void setPaymentPoint(int paymentPoint) {
		this.paymentPoint = paymentPoint;
	}

	/**
	 * @return the pointId
	 */
	public String getPointId() {
		return pointId;
	}

	/**
	 * @param pointId the pointId to set
	 */
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}


}
