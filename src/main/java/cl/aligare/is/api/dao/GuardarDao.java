/**
 * @name GuardarDao.java 
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

/**
 * @description
 *
 */
public interface GuardarDao {
	
	public boolean saveOrderStatus(Integer idOrder, Integer status);
	public boolean saveOrderBuy(String requestJson);
	
}
