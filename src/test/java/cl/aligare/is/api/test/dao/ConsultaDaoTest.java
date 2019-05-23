/**
 * @name GuardarDaoTest.java 
 * 
 * @version 1.0 
 * 
 * @date 13 jun. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.test.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.impl.ConsultaDaoImpl;
import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.to.ItemInfo;
import cl.aligare.is.api.to.OrderFlujoInfo;
import cl.aligare.is.api.to.OrderInfo;
import cl.aligare.is.api.to.PaymentInfo;

/**
 * @description
 *
 */
public class ConsultaDaoTest {
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	private static ConsultaDaoImpl consultaDao = new ConsultaDaoImpl();
	
	@Test
	public void getOrderInfoTest() {
		Integer orderNumber = new Integer(40050682);
		try{
			OrderInfo orderInfo = consultaDao.getOrderInfo(orderNumber);
			assertNotNull("Usuario es null", orderInfo);
			//assertTrue("Usuario no valido", orderInfo.getOrderNumber() == orderNumber);
		}catch(Exception e){
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
    }
	
	@Test
	public void getPaymentInfoTest() {
		Integer orderNumber = new Integer(40050682);
		List<PaymentInfo> payments = consultaDao.getPaymentInfo(orderNumber);
		assertNotNull("Listado pagos es null", payments);
		assertFalse("No hay pagos", payments.isEmpty());
    }
	
	@Test
	public void getItemInfoTest() {
		Integer orderNumber = new Integer(40050682);
		List<ItemInfo> items = consultaDao.getItemInfo(orderNumber);
		assertNotNull("Listado items es null", items);
		assertFalse("No hay items", items.isEmpty());
    }
	
	@Test
	public void getOrderFlujoInfoTest() {
		try{
			OrderFlujoInfo orderFlujoInfo = consultaDao.getOrderFlujoInfo("40050682");
			assertNotNull("Flujo es null",orderFlujoInfo);
			//assertTrue("Usuario no valido", orderInfo.getOrderNumber() == orderNumber);
		}catch(Exception e){
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
    }
	

}
