/**
 * @name ItemSale.java 
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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class ItemSale implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String shippingOrderNumber = " ";
	
	private int itemsNumbers = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Promotion promotion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<Item> item ;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemSale [shippingOrderNumber=" + shippingOrderNumber + ", itemsNumbers=" + itemsNumbers
				+ ", promotion=" + promotion + ", item=" + item + "]";
	}

	/**
	 * @return the shippingOrderNumber
	 */
	public String getShippingOrderNumber() {
		return shippingOrderNumber;
	}

	/**
	 * @param shippingOrderNumber the shippingOrderNumber to set
	 */
	public void setShippingOrderNumber(String shippingOrderNumber) {
		this.shippingOrderNumber = shippingOrderNumber;
	}

	/**
	 * @return the itemsNumbers
	 */
	public int getItemsNumbers() {
		return itemsNumbers;
	}

	/**
	 * @param itemsNumbers the itemsNumbers to set
	 */
	public void setItemsNumbers(int itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	/**
	 * @return the promotion
	 */
	public Promotion getPromotion() {
		return promotion;
	}

	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	/**
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}

	
	

}
