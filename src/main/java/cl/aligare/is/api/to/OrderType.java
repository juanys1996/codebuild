/**
 * @name Ordertype.java 
 * 
 * @version 1.0 
 * 
 * @date 3 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import cl.aligare.is.api.constantes.Constantes;

/**
 * @description
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderType implements Serializable {

	private static final long serialVersionUID = 1L;

	private int orderNumber = 0;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String creationTime = " ";

	private int initialStatus = 0;

	@XmlElement(name=Constantes.ORDER_TYPE)
	private int ordenType = 0;

	private int documentType = 0;

	private int locationId = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderType [orderNumber=" + orderNumber + ", creationTime=" + creationTime + ", initialStatus="
				+ initialStatus + ", ordenType=" + ordenType + ", documentType=" + documentType + ", locationId="
				+ locationId + "]";
	}

	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the creationTime
	 */
	public String getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * @return the initialStatus
	 */
	public int getInitialStatus() {
		return initialStatus;
	}

	/**
	 * @param initialStatus the initialStatus to set
	 */
	public void setInitialStatus(int initialStatus) {
		this.initialStatus = initialStatus;
	}

	/**
	 * @return the ordenType
	 */
	@JsonProperty(Constantes.ORDER_TYPE)
	public int getOrdenType() {
		return ordenType;
	}

	/**
	 * @param ordenType the ordenType to set
	 */
	public void setOrdenType(int ordenType) {
		this.ordenType = ordenType;
	}

	/**
	 * @return the documentType
	 */
	public int getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	
	
	
	
}
