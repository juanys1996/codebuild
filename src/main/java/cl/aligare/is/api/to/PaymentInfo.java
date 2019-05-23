/**
 * @name PaymentInfo.java 
 * 
 * @version 1.0 
 * 
 * @date 19 may. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

/**
 * @description
 *
 */
public class PaymentInfo implements Serializable {
	
	private static final long serialVersionUID = 6666209296520283440L;
	
	private int	idOrder;
	private int	orderNumber;
	private String creationTime;
	private int amount;
	private int shippingAmount;
	private int taxAmount;
	private int discountAmount;
	private int total;
	private int executiveId;
	private String executiveName;
	private int executiveCompanyId;
	private String executiveLocal;
	private int loyaltyId;
	private int loyaltyBasePoint;
	private int loyaltyPayPoint;
	private int loyaltyPointId;
	private int orderType;
	private int documentType;
	private int locationId;
	private int transactionNumber;
	private int terminalId;
	private int dteNumber;
    private String dteDate;
	private int ncDteNumber;
	private String urlDte;
	private String urlNcDte;
	//ORDER PAYMENT
	private int idOrderPayment;
	private int idOrderRelPayment;
	private int idChannel;
	private int idStore;
	private int idTransactio;
	private int idPayment;
	private int idCurrency;
	private int conexionType;
	private int paymentType;
	private int uniqueNumberTrx;
	private int authorizationCode;
	private int agreementCode;
	private int cardNumber;
	private int bin;
	private int idHolder;
	private String observations;
	private int payTotalAmount;
	private int payAmount;
	private int payAmountfee;
	private int payFeeType;
	private int payfees;
	private int payDeFerrefMonths;
	private int payFirstExpirationFee;
	private int payRate;
	private int bonusGc;
	//PAYMENT
	private int idPayment2;
	private int internatId;
	private String namePayment;
	//CURRENCY
	private int idCurrency2;
	private String currencyCode;
	private String nameCurrency;
	//TRANSACTION
	private int idTransaction;
	private String name;
	//PROMOTION
	private int idPromotion;
	private int idOrderPromotion;
	private String promotionCode;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentInfo [idOrder=" + idOrder + ", orderNumber=" + orderNumber + ", creationTime=" + creationTime
				+ ", amount=" + amount + ", shippingAmount=" + shippingAmount + ", taxAmount=" + taxAmount
				+ ", discountAmount=" + discountAmount + ", total=" + total + ", executiveId=" + executiveId
				+ ", executiveName=" + executiveName + ", executiveCompanyId=" + executiveCompanyId
				+ ", executiveLocal=" + executiveLocal + ", loyaltyId=" + loyaltyId + ", loyaltyBasePoint="
				+ loyaltyBasePoint + ", loyaltyPayPoint=" + loyaltyPayPoint + ", loyaltyPointId=" + loyaltyPointId
				+ ", orderType=" + orderType + ", documentType=" + documentType + ", locationId=" + locationId
				+ ", transactionNumber=" + transactionNumber + ", terminalId=" + terminalId + ", dteNumber=" + dteNumber
				+ ", dteDate=" + dteDate + ", ncDteNumber=" + ncDteNumber + ", urlDte=" + urlDte + ", urlNcDte="
				+ urlNcDte + ", idOrderPayment=" + idOrderPayment + ", idOrderRelPayment=" + idOrderRelPayment
				+ ", idChannel=" + idChannel + ", idStore=" + idStore + ", idTransactio=" + idTransactio
				+ ", idPayment=" + idPayment + ", idCurrency=" + idCurrency + ", conexionType=" + conexionType
				+ ", paymentType=" + paymentType + ", uniqueNumberTrx=" + uniqueNumberTrx + ", authorizationCode="
				+ authorizationCode + ", agreementCode=" + agreementCode + ", cardNumber=" + cardNumber + ", bin=" + bin
				+ ", idHolder=" + idHolder + ", observations=" + observations + ", payTotalAmount=" + payTotalAmount
				+ ", payAmount=" + payAmount + ", payAmountfee=" + payAmountfee + ", payFeeType=" + payFeeType
				+ ", payfees=" + payfees + ", payDeFerrefMonths=" + payDeFerrefMonths + ", payFirstExpirationFee="
				+ payFirstExpirationFee + ", payRate=" + payRate + ", bonusGc=" + bonusGc + ", idPayment2=" + idPayment2
				+ ", internatId=" + internatId + ", namePayment=" + namePayment + ", idCurrency2=" + idCurrency2
				+ ", currencyCode=" + currencyCode + ", nameCurrency=" + nameCurrency + ", idTransaction="
				+ idTransaction + ", name=" + name + ", idPromotion=" + idPromotion + ", idOrderPromotion="
				+ idOrderPromotion + ", promotionCode=" + promotionCode + "]";
	}

	/**
	 * @return the idOrder
	 */
	public int getIdOrder() {
		return idOrder;
	}

	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
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
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the shippingAmount
	 */
	public int getShippingAmount() {
		return shippingAmount;
	}

	/**
	 * @param shippingAmount the shippingAmount to set
	 */
	public void setShippingAmount(int shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * @return the taxAmount
	 */
	public int getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount the taxAmount to set
	 */
	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the discountAmount
	 */
	public int getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @param discountAmount the discountAmount to set
	 */
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the executiveId
	 */
	public int getExecutiveId() {
		return executiveId;
	}

	/**
	 * @param executiveId the executiveId to set
	 */
	public void setExecutiveId(int executiveId) {
		this.executiveId = executiveId;
	}

	/**
	 * @return the executiveName
	 */
	public String getExecutiveName() {
		return executiveName;
	}

	/**
	 * @param executiveName the executiveName to set
	 */
	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}

	/**
	 * @return the executiveCompanyId
	 */
	public int getExecutiveCompanyId() {
		return executiveCompanyId;
	}

	/**
	 * @param executiveCompanyId the executiveCompanyId to set
	 */
	public void setExecutiveCompanyId(int executiveCompanyId) {
		this.executiveCompanyId = executiveCompanyId;
	}

	/**
	 * @return the executiveLocal
	 */
	public String getExecutiveLocal() {
		return executiveLocal;
	}

	/**
	 * @param executiveLocal the executiveLocal to set
	 */
	public void setExecutiveLocal(String executiveLocal) {
		this.executiveLocal = executiveLocal;
	}

	/**
	 * @return the loyaltyId
	 */
	public int getLoyaltyId() {
		return loyaltyId;
	}

	/**
	 * @param loyaltyId the loyaltyId to set
	 */
	public void setLoyaltyId(int loyaltyId) {
		this.loyaltyId = loyaltyId;
	}

	/**
	 * @return the loyaltyBasePoint
	 */
	public int getLoyaltyBasePoint() {
		return loyaltyBasePoint;
	}

	/**
	 * @param loyaltyBasePoint the loyaltyBasePoint to set
	 */
	public void setLoyaltyBasePoint(int loyaltyBasePoint) {
		this.loyaltyBasePoint = loyaltyBasePoint;
	}

	/**
	 * @return the loyaltyPayPoint
	 */
	public int getLoyaltyPayPoint() {
		return loyaltyPayPoint;
	}

	/**
	 * @param loyaltyPayPoint the loyaltyPayPoint to set
	 */
	public void setLoyaltyPayPoint(int loyaltyPayPoint) {
		this.loyaltyPayPoint = loyaltyPayPoint;
	}

	/**
	 * @return the loyaltyPointId
	 */
	public int getLoyaltyPointId() {
		return loyaltyPointId;
	}

	/**
	 * @param loyaltyPointId the loyaltyPointId to set
	 */
	public void setLoyaltyPointId(int loyaltyPointId) {
		this.loyaltyPointId = loyaltyPointId;
	}

	/**
	 * @return the orderType
	 */
	public int getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(int orderType) {
		this.orderType = orderType;
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

	/**
	 * @return the transactionNumber
	 */
	public int getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return the terminalId
	 */
	public int getTerminalId() {
		return terminalId;
	}

	/**
	 * @param terminalId the terminalId to set
	 */
	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * @return the dteNumber
	 */
	public int getDteNumber() {
		return dteNumber;
	}

	/**
	 * @param dteNumber the dteNumber to set
	 */
	public void setDteNumber(int dteNumber) {
		this.dteNumber = dteNumber;
	}

	/**
	 * @return the dteDate
	 */
	public String getDteDate() {
		return dteDate;
	}

	/**
	 * @param dteDate the dteDate to set
	 */
	public void setDteDate(String dteDate) {
		this.dteDate = dteDate;
	}

	/**
	 * @return the ncDteNumber
	 */
	public int getNcDteNumber() {
		return ncDteNumber;
	}

	/**
	 * @param ncDteNumber the ncDteNumber to set
	 */
	public void setNcDteNumber(int ncDteNumber) {
		this.ncDteNumber = ncDteNumber;
	}

	/**
	 * @return the urlDte
	 */
	public String getUrlDte() {
		return urlDte;
	}

	/**
	 * @param urlDte the urlDte to set
	 */
	public void setUrlDte(String urlDte) {
		this.urlDte = urlDte;
	}

	/**
	 * @return the urlNcDte
	 */
	public String getUrlNcDte() {
		return urlNcDte;
	}

	/**
	 * @param urlNcDte the urlNcDte to set
	 */
	public void setUrlNcDte(String urlNcDte) {
		this.urlNcDte = urlNcDte;
	}

	/**
	 * @return the idOrderPayment
	 */
	public int getIdOrderPayment() {
		return idOrderPayment;
	}

	/**
	 * @param idOrderPayment the idOrderPayment to set
	 */
	public void setIdOrderPayment(int idOrderPayment) {
		this.idOrderPayment = idOrderPayment;
	}

	/**
	 * @return the idOrderRelPayment
	 */
	public int getIdOrderRelPayment() {
		return idOrderRelPayment;
	}

	/**
	 * @param idOrderRelPayment the idOrderRelPayment to set
	 */
	public void setIdOrderRelPayment(int idOrderRelPayment) {
		this.idOrderRelPayment = idOrderRelPayment;
	}

	/**
	 * @return the idChannel
	 */
	public int getIdChannel() {
		return idChannel;
	}

	/**
	 * @param idChannel the idChannel to set
	 */
	public void setIdChannel(int idChannel) {
		this.idChannel = idChannel;
	}

	/**
	 * @return the idStore
	 */
	public int getIdStore() {
		return idStore;
	}

	/**
	 * @param idStore the idStore to set
	 */
	public void setIdStore(int idStore) {
		this.idStore = idStore;
	}

	/**
	 * @return the idTransactio
	 */
	public int getIdTransactio() {
		return idTransactio;
	}

	/**
	 * @param idTransactio the idTransactio to set
	 */
	public void setIdTransactio(int idTransactio) {
		this.idTransactio = idTransactio;
	}

	/**
	 * @return the idPayment
	 */
	public int getIdPayment() {
		return idPayment;
	}

	/**
	 * @param idPayment the idPayment to set
	 */
	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}

	/**
	 * @return the idCurrency
	 */
	public int getIdCurrency() {
		return idCurrency;
	}

	/**
	 * @param idCurrency the idCurrency to set
	 */
	public void setIdCurrency(int idCurrency) {
		this.idCurrency = idCurrency;
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
	 * @return the uniqueNumberTrx
	 */
	public int getUniqueNumberTrx() {
		return uniqueNumberTrx;
	}

	/**
	 * @param uniqueNumberTrx the uniqueNumberTrx to set
	 */
	public void setUniqueNumberTrx(int uniqueNumberTrx) {
		this.uniqueNumberTrx = uniqueNumberTrx;
	}

	/**
	 * @return the authorizationCode
	 */
	public int getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(int authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * @return the agreementCode
	 */
	public int getAgreementCode() {
		return agreementCode;
	}

	/**
	 * @param agreementCode the agreementCode to set
	 */
	public void setAgreementCode(int agreementCode) {
		this.agreementCode = agreementCode;
	}

	/**
	 * @return the cardNumber
	 */
	public int getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(int cardNumber) {
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
	public int getIdHolder() {
		return idHolder;
	}

	/**
	 * @param idHolder the idHolder to set
	 */
	public void setIdHolder(int idHolder) {
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
	 * @return the payTotalAmount
	 */
	public int getPayTotalAmount() {
		return payTotalAmount;
	}

	/**
	 * @param payTotalAmount the payTotalAmount to set
	 */
	public void setPayTotalAmount(int payTotalAmount) {
		this.payTotalAmount = payTotalAmount;
	}

	/**
	 * @return the payAmount
	 */
	public int getPayAmount() {
		return payAmount;
	}

	/**
	 * @param payAmount the payAmount to set
	 */
	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	/**
	 * @return the payAmountfee
	 */
	public int getPayAmountfee() {
		return payAmountfee;
	}

	/**
	 * @param payAmountfee the payAmountfee to set
	 */
	public void setPayAmountfee(int payAmountfee) {
		this.payAmountfee = payAmountfee;
	}

	/**
	 * @return the payFeeType
	 */
	public int getPayFeeType() {
		return payFeeType;
	}

	/**
	 * @param payFeeType the payFeeType to set
	 */
	public void setPayFeeType(int payFeeType) {
		this.payFeeType = payFeeType;
	}

	/**
	 * @return the payfees
	 */
	public int getPayfees() {
		return payfees;
	}

	/**
	 * @param payfees the payfees to set
	 */
	public void setPayfees(int payfees) {
		this.payfees = payfees;
	}

	/**
	 * @return the payDeFerrefMonths
	 */
	public int getPayDeFerrefMonths() {
		return payDeFerrefMonths;
	}

	/**
	 * @param payDeFerrefMonths the payDeFerrefMonths to set
	 */
	public void setPayDeFerrefMonths(int payDeFerrefMonths) {
		this.payDeFerrefMonths = payDeFerrefMonths;
	}

	/**
	 * @return the payFirstExpirationFee
	 */
	public int getPayFirstExpirationFee() {
		return payFirstExpirationFee;
	}

	/**
	 * @param payFirstExpirationFee the payFirstExpirationFee to set
	 */
	public void setPayFirstExpirationFee(int payFirstExpirationFee) {
		this.payFirstExpirationFee = payFirstExpirationFee;
	}

	/**
	 * @return the payRate
	 */
	public int getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

	/**
	 * @return the bonusGc
	 */
	public int getBonusGc() {
		return bonusGc;
	}

	/**
	 * @param bonusGc the bonusGc to set
	 */
	public void setBonusGc(int bonusGc) {
		this.bonusGc = bonusGc;
	}

	/**
	 * @return the idPayment2
	 */
	public int getIdPayment2() {
		return idPayment2;
	}

	/**
	 * @param idPayment2 the idPayment2 to set
	 */
	public void setIdPayment2(int idPayment2) {
		this.idPayment2 = idPayment2;
	}

	/**
	 * @return the internatId
	 */
	public int getInternatId() {
		return internatId;
	}

	/**
	 * @param internatId the internatId to set
	 */
	public void setInternatId(int internatId) {
		this.internatId = internatId;
	}

	/**
	 * @return the namePayment
	 */
	public String getNamePayment() {
		return namePayment;
	}

	/**
	 * @param namePayment the namePayment to set
	 */
	public void setNamePayment(String namePayment) {
		this.namePayment = namePayment;
	}

	/**
	 * @return the idCurrency2
	 */
	public int getIdCurrency2() {
		return idCurrency2;
	}

	/**
	 * @param idCurrency2 the idCurrency2 to set
	 */
	public void setIdCurrency2(int idCurrency2) {
		this.idCurrency2 = idCurrency2;
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
	 * @return the nameCurrency
	 */
	public String getNameCurrency() {
		return nameCurrency;
	}

	/**
	 * @param nameCurrency the nameCurrency to set
	 */
	public void setNameCurrency(String nameCurrency) {
		this.nameCurrency = nameCurrency;
	}

	/**
	 * @return the idTransaction
	 */
	public int getIdTransaction() {
		return idTransaction;
	}

	/**
	 * @param idTransaction the idTransaction to set
	 */
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idPromotion
	 */
	public int getIdPromotion() {
		return idPromotion;
	}

	/**
	 * @param idPromotion the idPromotion to set
	 */
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

	/**
	 * @return the idOrderPromotion
	 */
	public int getIdOrderPromotion() {
		return idOrderPromotion;
	}

	/**
	 * @param idOrderPromotion the idOrderPromotion to set
	 */
	public void setIdOrderPromotion(int idOrderPromotion) {
		this.idOrderPromotion = idOrderPromotion;
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
