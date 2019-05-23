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
public class OrderFlujoInfo implements Serializable {
	
	private static final long	serialVersionUID	= 6666209296520283442L;
	
	private long orderNumber;
	private int orderStatus;
	private String status;
	private String creationTime;
	private String ordertype;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderFlujoInfo [orderNumber=" + orderNumber + ", orderStatus=" + orderStatus + ", status=" + status
				+ ", creationTime=" + creationTime + ", ordertype=" + ordertype + "]";
	}
	/**
	 * @return the orderNumber
	 */
	public long getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
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
	 * @return the ordertype
	 */
	public String getOrdertype() {
		return ordertype;
	}
	/**
	 * @param ordertype the ordertype to set
	 */
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	/**
	 * @return the orderStatus
	 */
	public int getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	
	
	
}
