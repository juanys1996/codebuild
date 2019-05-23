/**
 * @name SaleData.java 
 * 
 * @version 1.0 
 * 
 * @date 4 abr. 2018 
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
public class OrderInfo implements Serializable {
	
	private static final long	serialVersionUID	= 6666209296520283442L;
	
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
	//CUSTOMER
	private int idCustomer;
	private int idOrderCustomer;			
	private int customerId;
	private int foreignFlag;
	private String foreignCountry;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private int emailFlag;
	private long phoneNumber1;
	private long phoneNumber2;
	//ADDRESS CUSTOMER
	private int idAddressCustomer;
	private int idAddressRelation;
	private int idAddressType;
	private String address1;
	private String address2;
	private String address3;
	private int number;
	private String country;
	private String city;
	private String cityName;
	private int state;
	private String postalCode;
	private String detail;
	private String latitude;
	private String longitude;
	//BILLING
	private int idBilling;
	private int idOrderBilling;
	private String companyName;
	private String companyTurn;
	private String contactFullname;
	private long phoneNumber;
	private String companyEmail;
	//ADDRESS BILLING
	private int idAddressBilling;
	private int idAddressRelationBilling;
	private int idAddressTypeBilling;
	private String address1Billing;
	private String address2Billing;
	private String address3Billing;
	private int numberAddressBilling;
	private String countryAddressBilling;
	private String cityAddressBilling;
	private String cityNameAddressBilling;
	private String stateAddressBilling;
	private String postalCodeAddressBilling;
	private String detailAddressBilling;
	private String latitudeAddressBilling;
	private String longitudeAddressBilling;
	//SPECIAL_PROGRAM
	private int idSpecialProgram;
	private int idOrderSpecialProgram;
	private String specialProgramType;
	private int specialProgramCode;
	private String names1;
	private String names2; 
	private String email1; 
	private String email2;
	private String messageText;
	private String isGift;
	//ADDRESS SPECIAL PROGRAM
	private int idAddress;
	private int idAddressRelationSpecialProgram;
	private int idAddressTypeSpecialProgram;
	private String address1SpecialProgram;
	private String address2SpecialProgram;
	private String address3SpecialProgram;
	private String numberSpecialProgram;
	private String countrySpecialProgram;
	private String citySpecialProgram;
	private String citynameSpecialProgram;
	private String stateSpecialProgram;
	private String postalCodeSpecialProgram;
	private String detailSpecialProgram;
	private String latitudeSpecialProgram;
	private String longitudeSpecialProgram;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderInfo [idOrder=" + idOrder + ", orderNumber=" + orderNumber + ", creationTime=" + creationTime
				+ ", amount=" + amount + ", shippingAmount=" + shippingAmount + ", taxAmount=" + taxAmount
				+ ", discountAmount=" + discountAmount + ", total=" + total + ", executiveId=" + executiveId
				+ ", executiveName=" + executiveName + ", executiveCompanyId=" + executiveCompanyId
				+ ", executiveLocal=" + executiveLocal + ", loyaltyId=" + loyaltyId + ", loyaltyBasePoint="
				+ loyaltyBasePoint + ", loyaltyPayPoint=" + loyaltyPayPoint + ", loyaltyPointId=" + loyaltyPointId
				+ ", orderType=" + orderType + ", documentType=" + documentType + ", locationId=" + locationId
				+ ", transactionNumber=" + transactionNumber + ", terminalId=" + terminalId + ", dteNumber=" + dteNumber
				+ ", dteDate=" + dteDate + ", ncDteNumber=" + ncDteNumber + ", urlDte=" + urlDte + ", urlNcDte="
				+ urlNcDte + ", idCustomer=" + idCustomer + ", idOrderCustomer=" + idOrderCustomer + ", customerId="
				+ customerId + ", foreignFlag=" + foreignFlag + ", foreignCountry=" + foreignCountry + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", email=" + email
				+ ", emailFlag=" + emailFlag + ", phoneNumber1=" + phoneNumber1 + ", phoneNumber2=" + phoneNumber2
				+ ", idAddressCustomer=" + idAddressCustomer + ", idAddressRelation=" + idAddressRelation
				+ ", idAddressType=" + idAddressType + ", address1=" + address1 + ", address2=" + address2
				+ ", address3=" + address3 + ", number=" + number + ", country=" + country + ", city=" + city
				+ ", cityName=" + cityName + ", state=" + state + ", postalCode=" + postalCode + ", detail=" + detail
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", idBilling=" + idBilling
				+ ", idOrderBilling=" + idOrderBilling + ", companyName=" + companyName + ", companyTurn=" + companyTurn
				+ ", contactFullname=" + contactFullname + ", phoneNumber=" + phoneNumber + ", companyEmail="
				+ companyEmail + ", idAddressBilling=" + idAddressBilling + ", idAddressRelationBilling="
				+ idAddressRelationBilling + ", idAddressTypeBilling=" + idAddressTypeBilling + ", address1Billing="
				+ address1Billing + ", address2Billing=" + address2Billing + ", address3Billing=" + address3Billing
				+ ", numberAddressBilling=" + numberAddressBilling + ", countryAddressBilling=" + countryAddressBilling
				+ ", cityAddressBilling=" + cityAddressBilling + ", cityNameAddressBilling=" + cityNameAddressBilling
				+ ", stateAddressBilling=" + stateAddressBilling + ", postalCodeAddressBilling="
				+ postalCodeAddressBilling + ", detailAddressBilling=" + detailAddressBilling
				+ ", latitudeAddressBilling=" + latitudeAddressBilling + ", longitudeAddressBilling="
				+ longitudeAddressBilling + ", idSpecialProgram=" + idSpecialProgram + ", idOrderSpecialProgram="
				+ idOrderSpecialProgram + ", specialProgramType=" + specialProgramType + ", specialProgramCode="
				+ specialProgramCode + ", names1=" + names1 + ", names2=" + names2 + ", email1=" + email1 + ", email2="
				+ email2 + ", messageText=" + messageText + ", isGift=" + isGift + ", idAddress=" + idAddress
				+ ", idAddressRelationSpecialProgram=" + idAddressRelationSpecialProgram
				+ ", idAddressTypeSpecialProgram=" + idAddressTypeSpecialProgram + ", address1SpecialProgram="
				+ address1SpecialProgram + ", address2SpecialProgram=" + address2SpecialProgram
				+ ", address3SpecialProgram=" + address3SpecialProgram + ", numberSpecialProgram="
				+ numberSpecialProgram + ", countrySpecialProgram=" + countrySpecialProgram + ", citySpecialProgram="
				+ citySpecialProgram + ", citynameSpecialProgram=" + citynameSpecialProgram + ", stateSpecialProgram="
				+ stateSpecialProgram + ", postalCodeSpecialProgram=" + postalCodeSpecialProgram
				+ ", detailSpecialProgram=" + detailSpecialProgram + ", latitudeSpecialProgram="
				+ latitudeSpecialProgram + ", longitudeSpecialProgram=" + longitudeSpecialProgram + "]";
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
	 * @return the idCustomer
	 */
	public int getIdCustomer() {
		return idCustomer;
	}

	/**
	 * @param idCustomer the idCustomer to set
	 */
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	/**
	 * @return the idOrderCustomer
	 */
	public int getIdOrderCustomer() {
		return idOrderCustomer;
	}

	/**
	 * @param idOrderCustomer the idOrderCustomer to set
	 */
	public void setIdOrderCustomer(int idOrderCustomer) {
		this.idOrderCustomer = idOrderCustomer;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
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
	public int getEmailFlag() {
		return emailFlag;
	}

	/**
	 * @param emailFlag the emailFlag to set
	 */
	public void setEmailFlag(int emailFlag) {
		this.emailFlag = emailFlag;
	}

	/**
	 * @return the phoneNumber1
	 */
	public long getPhoneNumber1() {
		return phoneNumber1;
	}

	/**
	 * @param phoneNumber1 the phoneNumber1 to set
	 */
	public void setPhoneNumber1(long phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	/**
	 * @return the phoneNumber2
	 */
	public long getPhoneNumber2() {
		return phoneNumber2;
	}

	/**
	 * @param phoneNumber2 the phoneNumber2 to set
	 */
	public void setPhoneNumber2(long phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	/**
	 * @return the idAddressCustomer
	 */
	public int getIdAddressCustomer() {
		return idAddressCustomer;
	}

	/**
	 * @param idAddressCustomer the idAddressCustomer to set
	 */
	public void setIdAddressCustomer(int idAddressCustomer) {
		this.idAddressCustomer = idAddressCustomer;
	}

	/**
	 * @return the idAddressRelation
	 */
	public int getIdAddressRelation() {
		return idAddressRelation;
	}

	/**
	 * @param idAddressRelation the idAddressRelation to set
	 */
	public void setIdAddressRelation(int idAddressRelation) {
		this.idAddressRelation = idAddressRelation;
	}

	/**
	 * @return the idAddressType
	 */
	public int getIdAddressType() {
		return idAddressType;
	}

	/**
	 * @param idAddressType the idAddressType to set
	 */
	public void setIdAddressType(int idAddressType) {
		this.idAddressType = idAddressType;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the idBilling
	 */
	public int getIdBilling() {
		return idBilling;
	}

	/**
	 * @param idBilling the idBilling to set
	 */
	public void setIdBilling(int idBilling) {
		this.idBilling = idBilling;
	}

	/**
	 * @return the idOrderBilling
	 */
	public int getIdOrderBilling() {
		return idOrderBilling;
	}

	/**
	 * @param idOrderBilling the idOrderBilling to set
	 */
	public void setIdOrderBilling(int idOrderBilling) {
		this.idOrderBilling = idOrderBilling;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the companyTurn
	 */
	public String getCompanyTurn() {
		return companyTurn;
	}

	/**
	 * @param companyTurn the companyTurn to set
	 */
	public void setCompanyTurn(String companyTurn) {
		this.companyTurn = companyTurn;
	}

	/**
	 * @return the contactFullname
	 */
	public String getContactFullname() {
		return contactFullname;
	}

	/**
	 * @param contactFullname the contactFullname to set
	 */
	public void setContactFullname(String contactFullname) {
		this.contactFullname = contactFullname;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @param companyEmail the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * @return the idAddressBilling
	 */
	public int getIdAddressBilling() {
		return idAddressBilling;
	}

	/**
	 * @param idAddressBilling the idAddressBilling to set
	 */
	public void setIdAddressBilling(int idAddressBilling) {
		this.idAddressBilling = idAddressBilling;
	}

	/**
	 * @return the idAddressRelationBilling
	 */
	public int getIdAddressRelationBilling() {
		return idAddressRelationBilling;
	}

	/**
	 * @param idAddressRelationBilling the idAddressRelationBilling to set
	 */
	public void setIdAddressRelationBilling(int idAddressRelationBilling) {
		this.idAddressRelationBilling = idAddressRelationBilling;
	}

	/**
	 * @return the idAddressTypeBilling
	 */
	public int getIdAddressTypeBilling() {
		return idAddressTypeBilling;
	}

	/**
	 * @param idAddressTypeBilling the idAddressTypeBilling to set
	 */
	public void setIdAddressTypeBilling(int idAddressTypeBilling) {
		this.idAddressTypeBilling = idAddressTypeBilling;
	}

	/**
	 * @return the address1Billing
	 */
	public String getAddress1Billing() {
		return address1Billing;
	}

	/**
	 * @param address1Billing the address1Billing to set
	 */
	public void setAddress1Billing(String address1Billing) {
		this.address1Billing = address1Billing;
	}

	/**
	 * @return the address2Billing
	 */
	public String getAddress2Billing() {
		return address2Billing;
	}

	/**
	 * @param address2Billing the address2Billing to set
	 */
	public void setAddress2Billing(String address2Billing) {
		this.address2Billing = address2Billing;
	}

	/**
	 * @return the address3Billing
	 */
	public String getAddress3Billing() {
		return address3Billing;
	}

	/**
	 * @param address3Billing the address3Billing to set
	 */
	public void setAddress3Billing(String address3Billing) {
		this.address3Billing = address3Billing;
	}

	/**
	 * @return the numberAddressBilling
	 */
	public int getNumberAddressBilling() {
		return numberAddressBilling;
	}

	/**
	 * @param numberAddressBilling the numberAddressBilling to set
	 */
	public void setNumberAddressBilling(int numberAddressBilling) {
		this.numberAddressBilling = numberAddressBilling;
	}

	/**
	 * @return the countryAddressBilling
	 */
	public String getCountryAddressBilling() {
		return countryAddressBilling;
	}

	/**
	 * @param countryAddressBilling the countryAddressBilling to set
	 */
	public void setCountryAddressBilling(String countryAddressBilling) {
		this.countryAddressBilling = countryAddressBilling;
	}

	/**
	 * @return the cityAddressBilling
	 */
	public String getCityAddressBilling() {
		return cityAddressBilling;
	}

	/**
	 * @param cityAddressBilling the cityAddressBilling to set
	 */
	public void setCityAddressBilling(String cityAddressBilling) {
		this.cityAddressBilling = cityAddressBilling;
	}

	/**
	 * @return the cityNameAddressBilling
	 */
	public String getCityNameAddressBilling() {
		return cityNameAddressBilling;
	}

	/**
	 * @param cityNameAddressBilling the cityNameAddressBilling to set
	 */
	public void setCityNameAddressBilling(String cityNameAddressBilling) {
		this.cityNameAddressBilling = cityNameAddressBilling;
	}

	/**
	 * @return the stateAddressBilling
	 */
	public String getStateAddressBilling() {
		return stateAddressBilling;
	}

	/**
	 * @param stateAddressBilling the stateAddressBilling to set
	 */
	public void setStateAddressBilling(String stateAddressBilling) {
		this.stateAddressBilling = stateAddressBilling;
	}

	/**
	 * @return the postalCodeAddressBilling
	 */
	public String getPostalCodeAddressBilling() {
		return postalCodeAddressBilling;
	}

	/**
	 * @param postalCodeAddressBilling the postalCodeAddressBilling to set
	 */
	public void setPostalCodeAddressBilling(String postalCodeAddressBilling) {
		this.postalCodeAddressBilling = postalCodeAddressBilling;
	}

	/**
	 * @return the detailAddressBilling
	 */
	public String getDetailAddressBilling() {
		return detailAddressBilling;
	}

	/**
	 * @param detailAddressBilling the detailAddressBilling to set
	 */
	public void setDetailAddressBilling(String detailAddressBilling) {
		this.detailAddressBilling = detailAddressBilling;
	}

	/**
	 * @return the latitudeAddressBilling
	 */
	public String getLatitudeAddressBilling() {
		return latitudeAddressBilling;
	}

	/**
	 * @param latitudeAddressBilling the latitudeAddressBilling to set
	 */
	public void setLatitudeAddressBilling(String latitudeAddressBilling) {
		this.latitudeAddressBilling = latitudeAddressBilling;
	}

	/**
	 * @return the longitudeAddressBilling
	 */
	public String getLongitudeAddressBilling() {
		return longitudeAddressBilling;
	}

	/**
	 * @param longitudeAddressBilling the longitudeAddressBilling to set
	 */
	public void setLongitudeAddressBilling(String longitudeAddressBilling) {
		this.longitudeAddressBilling = longitudeAddressBilling;
	}

	/**
	 * @return the idSpecialProgram
	 */
	public int getIdSpecialProgram() {
		return idSpecialProgram;
	}

	/**
	 * @param idSpecialProgram the idSpecialProgram to set
	 */
	public void setIdSpecialProgram(int idSpecialProgram) {
		this.idSpecialProgram = idSpecialProgram;
	}

	/**
	 * @return the idOrderSpecialProgram
	 */
	public int getIdOrderSpecialProgram() {
		return idOrderSpecialProgram;
	}

	/**
	 * @param idOrderSpecialProgram the idOrderSpecialProgram to set
	 */
	public void setIdOrderSpecialProgram(int idOrderSpecialProgram) {
		this.idOrderSpecialProgram = idOrderSpecialProgram;
	}

	/**
	 * @return the specialProgramType
	 */
	public String getSpecialProgramType() {
		return specialProgramType;
	}

	/**
	 * @param specialProgramType the specialProgramType to set
	 */
	public void setSpecialProgramType(String specialProgramType) {
		this.specialProgramType = specialProgramType;
	}

	/**
	 * @return the specialProgramCode
	 */
	public int getSpecialProgramCode() {
		return specialProgramCode;
	}

	/**
	 * @param specialProgramCode the specialProgramCode to set
	 */
	public void setSpecialProgramCode(int specialProgramCode) {
		this.specialProgramCode = specialProgramCode;
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
	public String getIsGift() {
		return isGift;
	}

	/**
	 * @param isGift the isGift to set
	 */
	public void setIsGift(String isGift) {
		this.isGift = isGift;
	}

	/**
	 * @return the idAddress
	 */
	public int getIdAddress() {
		return idAddress;
	}

	/**
	 * @param idAddress the idAddress to set
	 */
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	/**
	 * @return the idAddressRelationSpecialProgram
	 */
	public int getIdAddressRelationSpecialProgram() {
		return idAddressRelationSpecialProgram;
	}

	/**
	 * @param idAddressRelationSpecialProgram the idAddressRelationSpecialProgram to set
	 */
	public void setIdAddressRelationSpecialProgram(int idAddressRelationSpecialProgram) {
		this.idAddressRelationSpecialProgram = idAddressRelationSpecialProgram;
	}

	/**
	 * @return the idAddressTypeSpecialProgram
	 */
	public int getIdAddressTypeSpecialProgram() {
		return idAddressTypeSpecialProgram;
	}

	/**
	 * @param idAddressTypeSpecialProgram the idAddressTypeSpecialProgram to set
	 */
	public void setIdAddressTypeSpecialProgram(int idAddressTypeSpecialProgram) {
		this.idAddressTypeSpecialProgram = idAddressTypeSpecialProgram;
	}

	/**
	 * @return the address1SpecialProgram
	 */
	public String getAddress1SpecialProgram() {
		return address1SpecialProgram;
	}

	/**
	 * @param address1SpecialProgram the address1SpecialProgram to set
	 */
	public void setAddress1SpecialProgram(String address1SpecialProgram) {
		this.address1SpecialProgram = address1SpecialProgram;
	}

	/**
	 * @return the address2SpecialProgram
	 */
	public String getAddress2SpecialProgram() {
		return address2SpecialProgram;
	}

	/**
	 * @param address2SpecialProgram the address2SpecialProgram to set
	 */
	public void setAddress2SpecialProgram(String address2SpecialProgram) {
		this.address2SpecialProgram = address2SpecialProgram;
	}

	/**
	 * @return the address3SpecialProgram
	 */
	public String getAddress3SpecialProgram() {
		return address3SpecialProgram;
	}

	/**
	 * @param address3SpecialProgram the address3SpecialProgram to set
	 */
	public void setAddress3SpecialProgram(String address3SpecialProgram) {
		this.address3SpecialProgram = address3SpecialProgram;
	}

	/**
	 * @return the numberSpecialProgram
	 */
	public String getNumberSpecialProgram() {
		return numberSpecialProgram;
	}

	/**
	 * @param numberSpecialProgram the numberSpecialProgram to set
	 */
	public void setNumberSpecialProgram(String numberSpecialProgram) {
		this.numberSpecialProgram = numberSpecialProgram;
	}

	/**
	 * @return the countrySpecialProgram
	 */
	public String getCountrySpecialProgram() {
		return countrySpecialProgram;
	}

	/**
	 * @param countrySpecialProgram the countrySpecialProgram to set
	 */
	public void setCountrySpecialProgram(String countrySpecialProgram) {
		this.countrySpecialProgram = countrySpecialProgram;
	}

	/**
	 * @return the citySpecialProgram
	 */
	public String getCitySpecialProgram() {
		return citySpecialProgram;
	}

	/**
	 * @param citySpecialProgram the citySpecialProgram to set
	 */
	public void setCitySpecialProgram(String citySpecialProgram) {
		this.citySpecialProgram = citySpecialProgram;
	}

	/**
	 * @return the citynameSpecialProgram
	 */
	public String getCitynameSpecialProgram() {
		return citynameSpecialProgram;
	}

	/**
	 * @param citynameSpecialProgram the citynameSpecialProgram to set
	 */
	public void setCitynameSpecialProgram(String citynameSpecialProgram) {
		this.citynameSpecialProgram = citynameSpecialProgram;
	}

	/**
	 * @return the stateSpecialProgram
	 */
	public String getStateSpecialProgram() {
		return stateSpecialProgram;
	}

	/**
	 * @param stateSpecialProgram the stateSpecialProgram to set
	 */
	public void setStateSpecialProgram(String stateSpecialProgram) {
		this.stateSpecialProgram = stateSpecialProgram;
	}

	/**
	 * @return the postalCodeSpecialProgram
	 */
	public String getPostalCodeSpecialProgram() {
		return postalCodeSpecialProgram;
	}

	/**
	 * @param postalCodeSpecialProgram the postalCodeSpecialProgram to set
	 */
	public void setPostalCodeSpecialProgram(String postalCodeSpecialProgram) {
		this.postalCodeSpecialProgram = postalCodeSpecialProgram;
	}

	/**
	 * @return the detailSpecialProgram
	 */
	public String getDetailSpecialProgram() {
		return detailSpecialProgram;
	}

	/**
	 * @param detailSpecialProgram the detailSpecialProgram to set
	 */
	public void setDetailSpecialProgram(String detailSpecialProgram) {
		this.detailSpecialProgram = detailSpecialProgram;
	}

	/**
	 * @return the latitudeSpecialProgram
	 */
	public String getLatitudeSpecialProgram() {
		return latitudeSpecialProgram;
	}

	/**
	 * @param latitudeSpecialProgram the latitudeSpecialProgram to set
	 */
	public void setLatitudeSpecialProgram(String latitudeSpecialProgram) {
		this.latitudeSpecialProgram = latitudeSpecialProgram;
	}

	/**
	 * @return the longitudeSpecialProgram
	 */
	public String getLongitudeSpecialProgram() {
		return longitudeSpecialProgram;
	}

	/**
	 * @param longitudeSpecialProgram the longitudeSpecialProgram to set
	 */
	public void setLongitudeSpecialProgram(String longitudeSpecialProgram) {
		this.longitudeSpecialProgram = longitudeSpecialProgram;
	}
	
	
}
