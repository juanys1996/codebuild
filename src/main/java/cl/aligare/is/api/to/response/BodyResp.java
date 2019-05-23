/**
 * @name BodyResp.java 
 * 
 * @version 1.0 
 * 
 * @date 4 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.to.TrxHdr;
import cl.aligare.is.api.to.TrxIdentify;

/**
 * @description    
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement(name = Constantes.BODY)
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BodyResp implements Serializable {

	private static final long	serialVersionUID	= 6695883932484057201L;


	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String	orderStatus;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String	status;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String message;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private TrxHdr      trxHdr      = null;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private TrxIdentify trxIdentify = null;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BodyResp [orderStatus=" + orderStatus + ", status=" + status + ", message=" + message + ", trxHdr="
				+ trxHdr + ", trxIdentify=" + trxIdentify + "]";
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the trxHdr
	 */
	public TrxHdr getTrxHdr() {
		return trxHdr;
	}

	/**
	 * @param trxHdr the trxHdr to set
	 */
	public void setTrxHdr(TrxHdr trxHdr) {
		this.trxHdr = trxHdr;
	}

	/**
	 * @return the trxIdentify
	 */
	public TrxIdentify getTrxIdentify() {
		return trxIdentify;
	}

	/**
	 * @param trxIdentify the trxIdentify to set
	 */
	public void setTrxIdentify(TrxIdentify trxIdentify) {
		this.trxIdentify = trxIdentify;
	}

	

	
}
