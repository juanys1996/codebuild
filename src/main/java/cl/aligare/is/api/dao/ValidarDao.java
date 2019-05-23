/**
 * @name ValidarDao.java 
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
public interface ValidarDao {
	
	public boolean validateContext(String compania, String tienda, String canal, String pais);
	public boolean validateOrder(int orderNumber);
	public boolean validateOrderKiosco(int orderNumber);
}
