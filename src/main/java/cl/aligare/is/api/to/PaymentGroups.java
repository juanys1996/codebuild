/**
 * @name PaymentGroups.java 
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

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class PaymentGroups implements Serializable {
	
	private static final long	serialVersionUID	= 6666209296520283440L;
	
	private List<Payment> payment;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentGroups [payment=" + payment + "]";
	}

	/**
	 * @return the payment
	 */
	public List<Payment> getPayment() {
		return payment;
	}

	/**
	 * @param payment the payment to set
	 */
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	
	
	

}
