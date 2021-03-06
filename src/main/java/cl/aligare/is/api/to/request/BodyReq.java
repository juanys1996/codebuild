/**
 * @name BodyReq.java 
 * 
 * @version 1.0 
 * 
 * @date 2 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to.request;

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
public class BodyReq implements Serializable {
	
	private static final long	serialVersionUID	= 2257688156166956018L;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private TrxHdr      trxHdr      = null;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private TrxIdentify trxIdentify = null;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BodyReq [trxHdr=" + trxHdr + ", trxIdentify=" + trxIdentify + "]";
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
