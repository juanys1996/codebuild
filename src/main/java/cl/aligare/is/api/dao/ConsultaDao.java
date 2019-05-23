/**
 * @name ConsultaDao.java 
 * 
 * @version 1.0 
 * 
 * @date 13 jun. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.dao;

import java.util.List;

import cl.aligare.is.api.to.ItemInfo;
import cl.aligare.is.api.to.OrderFlujoInfo;
import cl.aligare.is.api.to.OrderInfo;
import cl.aligare.is.api.to.PaymentInfo;

/**
 * @description
 *
 */
public interface ConsultaDao {
	
	public OrderInfo getOrderInfo(int orderNumber);
	public List<ItemInfo> getItemInfo(int orderNumber) ;
	public List<PaymentInfo> getPaymentInfo(int orderNumber);
	public OrderFlujoInfo getOrderFlujoInfo(String orderNumber);


}
