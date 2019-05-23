/**
 * @name Payment.java 
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

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import cl.aligare.is.api.constantes.Constantes;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment implements Serializable {

	private static final long serialVersionUID = 6666209296520283440L;

	private int conexionType = 0;

	private int paymentType = 0;

	private String currencyCode = " ";

	private String uniqueNumberTrx = " ";

	private String authorizationCode = " ";

	private String agreementCode = " ";

	private String cardNumber = " ";

	private int bin = 0;

	@XmlElement(name=Constantes.ID_HOLDER)
	private String idHolder = " ";

	private String observations = " ";

	private int bonusGC = 0;
	
	private String purchaseId = "";
	
	private AmountInfoPayment amountInfo;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payment [conexionType=" + conexionType + ", paymentType=" + paymentType + ", currencyCode="
				+ currencyCode + ", uniqueNumberTrx=" + uniqueNumberTrx + ", authorizationCode=" + authorizationCode
				+ ", agreementCode=" + agreementCode + ", cardNumber=" + cardNumber + ", bin=" + bin + ", idHolder="
				+ idHolder + ", observations=" + observations + ", bonusGC=" + bonusGC + ", purchaseId=" + purchaseId
				+ ", amountInfo=" + amountInfo + "]";
	}

	/**
	 * @return the conexionType
	 */
	public int getConexionType() {
		return conexionType;
	}

	/**
	 * @param conexionType the conexionType to set
	 */
	public void setConexionType(int conexionType) {
		this.conexionType = conexionType;
	}

	/**
	 * @return the paymentType
	 */
	public int getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the uniqueNumberTrx
	 */
	public String getUniqueNumberTrx() {
		return uniqueNumberTrx;
	}

	/**
	 * @param uniqueNumberTrx the uniqueNumberTrx to set
	 */
	public void setUniqueNumberTrx(String uniqueNumberTrx) {
		this.uniqueNumberTrx = uniqueNumberTrx;
	}

	/**
	 * @return the authorizationCode
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * @return the agreementCode
	 */
	public String getAgreementCode() {
		return agreementCode;
	}

	/**
	 * @param agreementCode the agreementCode to set
	 */
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the bin
	 */
	public int getBin() {
		return bin;
	}

	/**
	 * @param bin the bin to set
	 */
	public void setBin(int bin) {
		this.bin = bin;
	}

	/**
	 * @return the idHolder
	 */
	@JsonProperty(Constantes.ID_HOLDER)
	public String getIdHolder() {
		return idHolder;
	}

	/**
	 * @param idHolder the idHolder to set
	 */
	public void setIdHolder(String idHolder) {
		this.idHolder = idHolder;
	}

	/**
	 * @return the observations
	 */
	public String getObservations() {
		return observations;
	}

	/**
	 * @param observations the observations to set
	 */
	public void setObservations(String observations) {
		this.observations = observations;
	}

	/**
	 * @return the bonusGC
	 */
	public int getBonusGC() {
		return bonusGC;
	}

	/**
	 * @param bonusGC the bonusGC to set
	 */
	public void setBonusGC(int bonusGC) {
		this.bonusGC = bonusGC;
	}

	/**
	 * @return the purchaseId
	 */
	public String getPurchaseId() {
		return purchaseId;
	}

	/**
	 * @param purchaseId the purchaseId to set
	 */
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	/**
	 * @return the amountInfo
	 */
	public AmountInfoPayment getAmountInfo() {
		return amountInfo;
	}

	/**
	 * @param amountInfo the amountInfo to set
	 */
	public void setAmountInfo(AmountInfoPayment amountInfo) {
		this.amountInfo = amountInfo;
	}

	
	
}