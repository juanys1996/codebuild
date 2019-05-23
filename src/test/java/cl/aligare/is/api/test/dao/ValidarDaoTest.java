/**
 * @name ValidarDaoTest.java 
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
import cl.aligare.is.api.dao.impl.ValidarDaoImpl;
import cl.aligare.is.api.job.JobContext;

/**
 * @description
 *
 */
public class ValidarDaoTest {

	private static ValidarDaoImpl validarDao = new ValidarDaoImpl();

	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	@Test
	public void validateContextTest() {

		try {
			boolean result = validarDao.validateContext("CENCOSUD", "PARIS", "KIOSCOS", "CL");
			assertTrue("Contexto no existe", result);
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void validateOrderTest() {
		try{
			boolean result = validarDao.validateOrder(40050682);
			assertTrue("Valida orden s no existe", result);
		}catch(Exception e){
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
    }
	
	@Test
	public void validateOrderKioscoTest() {
		try{
			boolean result = validarDao.validateOrderKiosco(500002613);
			assertTrue("Valida orden kiosco  no existe", result);
		}catch(Exception e){
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			Assert.fail(e.getMessage());
		}
    }

}
