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

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.impl.GuardarDaoImpl;
import cl.aligare.is.api.job.JobContext;

/**
 * @description
 *
 */
public class GuardarDaoTest {
	
	private static GuardarDaoImpl guardarDao = new GuardarDaoImpl();
	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	@Test
	public void saveOrderStatusTest() {
		try{
			boolean result = guardarDao.saveOrderStatus(21, 1);
			assertTrue("Valida orden  no existe", result);//	comprueba que expresión evalúe a true
		}catch(Exception e){
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
    }

}
