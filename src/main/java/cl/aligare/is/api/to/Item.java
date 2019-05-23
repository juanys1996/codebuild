/**
 * @name Item.java 
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
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int itemId = 0;
	
	private int sku = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String itemSaleName = " ";
	
	private int shippingType = 0;
	
	private int itsGif = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String giftMessage = " ";
	
	private int warrantyFlag = 0;
	
	private int warrantyType = 0;
	
	private int itsCombo = 0;
	
	private int skuFather = 0;
	
	private int departmentId = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String departmentName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String promotionCode = " ";
	
	private int typeSKU = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private AmountInfoItem amountInfo;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Attributes attributes;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Third third;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Taxes taxes;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Shipping shipping;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", sku=" + sku + ", itemSaleName=" + itemSaleName + ", shippingType="
				+ shippingType + ", itsGif=" + itsGif + ", giftMessage=" + giftMessage + ", warrantyFlag="
				+ warrantyFlag + ", warrantyType=" + warrantyType + ", itsCombo=" + itsCombo + ", skuFather="
				+ skuFather + ", departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", promotionCode=" + promotionCode + ", typeSKU=" + typeSKU + ", amountInfo=" + amountInfo
				+ ", attributes=" + attributes + ", third=" + third + ", taxes=" + taxes + ", shipping=" + shipping
				+ "]";
	}

	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	public int getSkuFather() {
		return skuFather;
	}

	/**
	 * @param skuFather the skuFather to set
	 */
	public void setSkuFather(int skuFather) {
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
	public String getPromotionCode() {
		return promotionCode;
	}

	/**
	 * @param promotionCode the promotionCode to set
	 */
	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	/**
	 * @return the typeSKU
	 */
	public int getTypeSKU() {
		return typeSKU;
	}

	/**
	 * @param typeSKU the typeSKU to set
	 */
	public void setTypeSKU(int typeSKU) {
		this.typeSKU = typeSKU;
	}

	/**
	 * @return the amountInfo
	 */
	public AmountInfoItem getAmountInfo() {
		return amountInfo;
	}

	/**
	 * @param amountInfo the amountInfo to set
	 */
	public void setAmountInfo(AmountInfoItem amountInfo) {
		this.amountInfo = amountInfo;
	}

	/**
	 * @return the attributes
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the third
	 */
	public Third getThird() {
		return third;
	}

	/**
	 * @param third the third to set
	 */
	public void setThird(Third third) {
		this.third = third;
	}

	/**
	 * @return the taxes
	 */
	public Taxes getTaxes() {
		return taxes;
	}

	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}

	/**
	 * @return the shipping
	 */
	public Shipping getShipping() {
		return shipping;
	}

	/**
	 * @param shipping the shipping to set
	 */
	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	

	
}
