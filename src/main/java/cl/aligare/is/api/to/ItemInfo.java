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
public class ItemInfo implements Serializable {
	
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
	//ITEM
	private int idItem;
	private int idOrderItem;
	private int orderLine;
	private int skuItem;
	private String itemSaleName;
	private int shippingType;
	private int itsGif;
	private String giftMessage;
	private int warrantyFlag;
	private int warrantyType;
	private int itsCombo;
	private String skuFather;
	private int departmentId;
	private String departmentName;
	private int promotionCode;
	private int typeSku;
	private int itemCost;
	private int itemQuantity;
	private int itemUnitAmount;
	private int itemUnitdoscount;
	private int itemTotalDiscount;
	private int itemDiscountType;
	private int itemTotalAmount;
	//TERCERO
	private int idThird;
	private int orderNumberThird;
	private int sku;
	private int thirdId;
	private String thirdName;
	private int idOrderThird;
	private int idItemThird;
	//TAX
	private int taxAmountTax;
	private int idTax;
	private String taxCode;
	//SHIPPING
	private int idShipping;
	private String shippingEtaDate;
	private String shippingPreparationDate;
	private String shippingDate;
	private String shippingHour;
	private String itemShipping;
	private int shippingLine;
	private int shippingOrder;
	private int shippingTypeShipping;
	private int shippingIdHolder;
	private String shippingName;
	private String shippingSurname;
	private String nameWithDraw;
	private String lastNameRetira;
	private int withdrawId;
	private int storeId;
	private long phoneNumber;
	private String shippingEmail;
	private String shippingObservation;
	//SHIPPING ADDRESS
	private int idAddress;
	private int idAddressRelation;
	private int idAddressType;
	private String address1;
	private String address2;
	private String address3;
	private String number;
	private String country;
	private String city;
	private String cityName;
	private String state;
	private String postalCode;
	private String detail;
	private String latitude;
	private String longitude;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemInfo [idOrder=" + idOrder + ", orderNumber=" + orderNumber + ", creationTime=" + creationTime
				+ ", amount=" + amount + ", shippingAmount=" + shippingAmount + ", taxAmount=" + taxAmount
				+ ", discountAmount=" + discountAmount + ", total=" + total + ", executiveId=" + executiveId
				+ ", executiveName=" + executiveName + ", executiveCompanyId=" + executiveCompanyId
				+ ", executiveLocal=" + executiveLocal + ", loyaltyId=" + loyaltyId + ", loyaltyBasePoint="
				+ loyaltyBasePoint + ", loyaltyPayPoint=" + loyaltyPayPoint + ", loyaltyPointId=" + loyaltyPointId
				+ ", orderType=" + orderType + ", documentType=" + documentType + ", locationId=" + locationId
				+ ", transactionNumber=" + transactionNumber + ", terminalId=" + terminalId + ", dteNumber=" + dteNumber
				+ ", dteDate=" + dteDate + ", ncDteNumber=" + ncDteNumber + ", urlDte=" + urlDte + ", urlNcDte="
				+ urlNcDte + ", idItem=" + idItem + ", idOrderItem=" + idOrderItem + ", orderLine=" + orderLine
				+ ", skuItem=" + skuItem + ", itemSaleName=" + itemSaleName + ", shippingType=" + shippingType
				+ ", itsGif=" + itsGif + ", giftMessage=" + giftMessage + ", warrantyFlag=" + warrantyFlag
				+ ", warrantyType=" + warrantyType + ", itsCombo=" + itsCombo + ", skuFather=" + skuFather
				+ ", departmentId=" + departmentId + ", departmentName=" + departmentName + ", promotionCode="
				+ promotionCode + ", typeSku=" + typeSku + ", itemCost=" + itemCost + ", itemQuantity=" + itemQuantity
				+ ", itemUnitAmount=" + itemUnitAmount + ", itemUnitdoscount=" + itemUnitdoscount
				+ ", itemTotalDiscount=" + itemTotalDiscount + ", itemDiscountType=" + itemDiscountType
				+ ", itemTotalAmount=" + itemTotalAmount + ", idThird=" + idThird + ", orderNumberThird="
				+ orderNumberThird + ", sku=" + sku + ", thirdId=" + thirdId + ", thirdName=" + thirdName
				+ ", idOrderThird=" + idOrderThird + ", idItemThird=" + idItemThird + ", taxAmountTax=" + taxAmountTax
				+ ", idTax=" + idTax + ", taxCode=" + taxCode + ", idShipping=" + idShipping + ", shippingEtaDate="
				+ shippingEtaDate + ", shippingPreparationDate=" + shippingPreparationDate + ", shippingDate="
				+ shippingDate + ", shippingHour=" + shippingHour + ", itemShipping=" + itemShipping + ", shippingLine="
				+ shippingLine + ", shippingOrder=" + shippingOrder + ", shippingTypeShipping=" + shippingTypeShipping
				+ ", shippingIdHolder=" + shippingIdHolder + ", shippingName=" + shippingName + ", shippingSurname="
				+ shippingSurname + ", nameWithDraw=" + nameWithDraw + ", lastNameRetira=" + lastNameRetira
				+ ", withdrawId=" + withdrawId + ", storeId=" + storeId + ", phoneNumber=" + phoneNumber
				+ ", shippingEmail=" + shippingEmail + ", shippingObservation=" + shippingObservation + ", idAddress="
				+ idAddress + ", idAddressRelation=" + idAddressRelation + ", idAddressType=" + idAddressType
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", number=" + number
				+ ", country=" + country + ", city=" + city + ", cityName=" + cityName + ", state=" + state
				+ ", postalCode=" + postalCode + ", detail=" + detail + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
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
	 * @return the idItem
	 */
	public int getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the idOrderItem
	 */
	public int getIdOrderItem() {
		return idOrderItem;
	}

	/**
	 * @param idOrderItem the idOrderItem to set
	 */
	public void setIdOrderItem(int idOrderItem) {
		this.idOrderItem = idOrderItem;
	}

	/**
	 * @return the orderLine
	 */
	public int getOrderLine() {
		return orderLine;
	}

	/**
	 * @param orderLine the orderLine to set
	 */
	public void setOrderLine(int orderLine) {
		this.orderLine = orderLine;
	}

	/**
	 * @return the skuItem
	 */
	public int getSkuItem() {
		return skuItem;
	}

	/**
	 * @param skuItem the skuItem to set
	 */
	public void setSkuItem(int skuItem) {
		this.skuItem = skuItem;
	}

	/**
	 * @return the itemSaleName
	 */
	public String getItemSaleName() {
		return itemSaleName;
	}

	/**
	 * @param itemSaleName the itemSaleName to set
	 */
	public void setItemSaleName(String itemSaleName) {
		this.itemSaleName = itemSaleName;
	}

	/**
	 * @return the shippingType
	 */
	public int getShippingType() {
		return shippingType;
	}

	/**
	 * @param shippingType the shippingType to set
	 */
	public void setShippingType(int shippingType) {
		this.shippingType = shippingType;
	}

	/**
	 * @return the itsGif
	 */
	public int getItsGif() {
		return itsGif;
	}

	/**
	 * @param itsGif the itsGif to set
	 */
	public void setItsGif(int itsGif) {
		this.itsGif = itsGif;
	}

	/**
	 * @return the giftMessage
	 */
	public String getGiftMessage() {
		return giftMessage;
	}

	/**
	 * @param giftMessage the giftMessage to set
	 */
	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	/**
	 * @return the warrantyFlag
	 */
	public int getWarrantyFlag() {
		return warrantyFlag;
	}

	/**
	 * @param warrantyFlag the warrantyFlag to set
	 */
	public void setWarrantyFlag(int warrantyFlag) {
		this.warrantyFlag = warrantyFlag;
	}

	/**
	 * @return the warrantyType
	 */
	public int getWarrantyType() {
		return warrantyType;
	}

	/**
	 * @param warrantyType the warrantyType to set
	 */
	public void setWarrantyType(int warrantyType) {
		this.warrantyType = warrantyType;
	}

	/**
	 * @return the itsCombo
	 */
	public int getItsCombo() {
		return itsCombo;
	}

	/**
	 * @param itsCombo the itsCombo to set
	 */
	public void setItsCombo(int itsCombo) {
		this.itsCombo = itsCombo;
	}

	/**
	 * @return the skuFather
	 */
	public String getSkuFather() {
		return skuFather;
	}

	/**
	 * @param skuFather the skuFather to set
	 */
	public void setSkuFather(String skuFather) {
		this.skuFather = skuFather;
	}

	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the promotionCode
	 */
	public int getPromotionCode() {
		return promotionCode;
	}

	/**
	 * @param promotionCode the promotionCode to set
	 */
	public void setPromotionCode(int promotionCode) {
		this.promotionCode = promotionCode;
	}

	/**
	 * @return the typeSku
	 */
	public int getTypeSku() {
		return typeSku;
	}

	/**
	 * @param typeSku the typeSku to set
	 */
	public void setTypeSku(int typeSku) {
		this.typeSku = typeSku;
	}

	/**
	 * @return the itemCost
	 */
	public int getItemCost() {
		return itemCost;
	}

	/**
	 * @param itemCost the itemCost to set
	 */
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	/**
	 * @return the itemQuantity
	 */
	public int getItemQuantity() {
		return itemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * @return the itemUnitAmount
	 */
	public int getItemUnitAmount() {
		return itemUnitAmount;
	}

	/**
	 * @param itemUnitAmount the itemUnitAmount to set
	 */
	public void setItemUnitAmount(int itemUnitAmount) {
		this.itemUnitAmount = itemUnitAmount;
	}

	/**
	 * @return the itemUnitdoscount
	 */
	public int getItemUnitdoscount() {
		return itemUnitdoscount;
	}

	/**
	 * @param itemUnitdoscount the itemUnitdoscount to set
	 */
	public void setItemUnitdoscount(int itemUnitdoscount) {
		this.itemUnitdoscount = itemUnitdoscount;
	}

	/**
	 * @return the itemTotalDiscount
	 */
	public int getItemTotalDiscount() {
		return itemTotalDiscount;
	}

	/**
	 * @param itemTotalDiscount the itemTotalDiscount to set
	 */
	public void setItemTotalDiscount(int itemTotalDiscount) {
		this.itemTotalDiscount = itemTotalDiscount;
	}

	/**
	 * @return the itemDiscountType
	 */
	public int getItemDiscountType() {
		return itemDiscountType;
	}

	/**
	 * @param itemDiscountType the itemDiscountType to set
	 */
	public void setItemDiscountType(int itemDiscountType) {
		this.itemDiscountType = itemDiscountType;
	}

	/**
	 * @return the itemTotalAmount
	 */
	public int getItemTotalAmount() {
		return itemTotalAmount;
	}

	/**
	 * @param itemTotalAmount the itemTotalAmount to set
	 */
	public void setItemTotalAmount(int itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}

	/**
	 * @return the idThird
	 */
	public int getIdThird() {
		return idThird;
	}

	/**
	 * @param idThird the idThird to set
	 */
	public void setIdThird(int idThird) {
		this.idThird = idThird;
	}

	/**
	 * @return the orderNumberThird
	 */
	public int getOrderNumberThird() {
		return orderNumberThird;
	}

	/**
	 * @param orderNumberThird the orderNumberThird to set
	 */
	public void setOrderNumberThird(int orderNumberThird) {
		this.orderNumberThird = orderNumberThird;
	}

	/**
	 * @return the sku
	 */
	public int getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(int sku) {
		this.sku = sku;
	}

	/**
	 * @return the thirdId
	 */
	public int getThirdId() {
		return thirdId;
	}

	/**
	 * @param thirdId the thirdId to set
	 */
	public void setThirdId(int thirdId) {
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

	/**
	 * @return the idOrderThird
	 */
	public int getIdOrderThird() {
		return idOrderThird;
	}

	/**
	 * @param idOrderThird the idOrderThird to set
	 */
	public void setIdOrderThird(int idOrderThird) {
		this.idOrderThird = idOrderThird;
	}

	/**
	 * @return the idItemThird
	 */
	public int getIdItemThird() {
		return idItemThird;
	}

	/**
	 * @param idItemThird the idItemThird to set
	 */
	public void setIdItemThird(int idItemThird) {
		this.idItemThird = idItemThird;
	}

	/**
	 * @return the taxAmountTax
	 */
	public int getTaxAmountTax() {
		return taxAmountTax;
	}

	/**
	 * @param taxAmountTax the taxAmountTax to set
	 */
	public void setTaxAmountTax(int taxAmountTax) {
		this.taxAmountTax = taxAmountTax;
	}

	/**
	 * @return the idTax
	 */
	public int getIdTax() {
		return idTax;
	}

	/**
	 * @param idTax the idTax to set
	 */
	public void setIdTax(int idTax) {
		this.idTax = idTax;
	}

	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * @return the idShipping
	 */
	public int getIdShipping() {
		return idShipping;
	}

	/**
	 * @param idShipping the idShipping to set
	 */
	public void setIdShipping(int idShipping) {
		this.idShipping = idShipping;
	}

	/**
	 * @return the shippingEtaDate
	 */
	public String getShippingEtaDate() {
		return shippingEtaDate;
	}

	/**
	 * @param shippingEtaDate the shippingEtaDate to set
	 */
	public void setShippingEtaDate(String shippingEtaDate) {
		this.shippingEtaDate = shippingEtaDate;
	}

	/**
	 * @return the shippingPreparationDate
	 */
	public String getShippingPreparationDate() {
		return shippingPreparationDate;
	}

	/**
	 * @param shippingPreparationDate the shippingPreparationDate to set
	 */
	public void setShippingPreparationDate(String shippingPreparationDate) {
		this.shippingPreparationDate = shippingPreparationDate;
	}

	/**
	 * @return the shippingDate
	 */
	public String getShippingDate() {
		return shippingDate;
	}

	/**
	 * @param shippingDate the shippingDate to set
	 */
	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	/**
	 * @return the shippingHour
	 */
	public String getShippingHour() {
		return shippingHour;
	}

	/**
	 * @param shippingHour the shippingHour to set
	 */
	public void setShippingHour(String shippingHour) {
		this.shippingHour = shippingHour;
	}

	/**
	 * @return the itemShipping
	 */
	public String getItemShipping() {
		return itemShipping;
	}

	/**
	 * @param itemShipping the itemShipping to set
	 */
	public void setItemShipping(String itemShipping) {
		this.itemShipping = itemShipping;
	}

	/**
	 * @return the shippingLine
	 */
	public int getShippingLine() {
		return shippingLine;
	}

	/**
	 * @param shippingLine the shippingLine to set
	 */
	public void setShippingLine(int shippingLine) {
		this.shippingLine = shippingLine;
	}

	/**
	 * @return the shippingOrder
	 */
	public int getShippingOrder() {
		return shippingOrder;
	}

	/**
	 * @param shippingOrder the shippingOrder to set
	 */
	public void setShippingOrder(int shippingOrder) {
		this.shippingOrder = shippingOrder;
	}

	/**
	 * @return the shippingTypeShipping
	 */
	public int getShippingTypeShipping() {
		return shippingTypeShipping;
	}

	/**
	 * @param shippingTypeShipping the shippingTypeShipping to set
	 */
	public void setShippingTypeShipping(int shippingTypeShipping) {
		this.shippingTypeShipping = shippingTypeShipping;
	}

	/**
	 * @return the shippingIdHolder
	 */
	public int getShippingIdHolder() {
		return shippingIdHolder;
	}

	/**
	 * @param shippingIdHolder the shippingIdHolder to set
	 */
	public void setShippingIdHolder(int shippingIdHolder) {
		this.shippingIdHolder = shippingIdHolder;
	}

	/**
	 * @return the shippingName
	 */
	public String getShippingName() {
		return shippingName;
	}

	/**
	 * @param shippingName the shippingName to set
	 */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}

	/**
	 * @return the shippingSurname
	 */
	public String getShippingSurname() {
		return shippingSurname;
	}

	/**
	 * @param shippingSurname the shippingSurname to set
	 */
	public void setShippingSurname(String shippingSurname) {
		this.shippingSurname = shippingSurname;
	}

	/**
	 * @return the nameWithDraw
	 */
	public String getNameWithDraw() {
		return nameWithDraw;
	}

	/**
	 * @param nameWithDraw the nameWithDraw to set
	 */
	public void setNameWithDraw(String nameWithDraw) {
		this.nameWithDraw = nameWithDraw;
	}

	/**
	 * @return the lastNameRetira
	 */
	public String getLastNameRetira() {
		return lastNameRetira;
	}

	/**
	 * @param lastNameRetira the lastNameRetira to set
	 */
	public void setLastNameRetira(String lastNameRetira) {
		this.lastNameRetira = lastNameRetira;
	}

	/**
	 * @return the withdrawId
	 */
	public int getWithdrawId() {
		return withdrawId;
	}

	/**
	 * @param withdrawId the withdrawId to set
	 */
	public void setWithdrawId(int withdrawId) {
		this.withdrawId = withdrawId;
	}

	/**
	 * @return the storeId
	 */
	public int getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
		this.storeId = storeId;
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
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the shippingEmail
	 */
	public String getShippingEmail() {
		return shippingEmail;
	}

	/**
	 * @param shippingEmail the shippingEmail to set
	 */
	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}

	/**
	 * @return the shippingObservation
	 */
	public String getShippingObservation() {
		return shippingObservation;
	}

	/**
	 * @param shippingObservation the shippingObservation to set
	 */
	public void setShippingObservation(String shippingObservation) {
		this.shippingObservation = shippingObservation;
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
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
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
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
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
	
	
}
