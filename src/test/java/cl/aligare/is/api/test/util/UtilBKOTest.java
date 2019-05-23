/**
 * @name UtilBKOTest.java 
 * 
 * @version 1.0 
 * 
 * @date 12 jun. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.test.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.services.BKOServices;
import cl.aligare.is.api.test.job.TestContext;
import cl.aligare.is.api.util.PropertiesUtil;
import cl.aligare.is.api.util.UtilBKO;

/**
 * @description
 *
 */
public class UtilBKOTest {

	/** Objeto que gestiona el contexto del log */
	private static TestContext context = new TestContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();

	@Test
	public void getJSONStringTest() {
		logger.log(PropertiesUtil.getProperty("bd.url"));
		String result = UtilBKO.getJSONString(BKOServices.respuestaGenerica("", ""));
		assertNotNull("Resultado del objeto es nulo", result);
	}

	public void validarKioscoTest() {
		logger.log(""+UtilBKO.validarKiosco("www"));
		boolean result = UtilBKO.validarKiosco("KIOSCOS");
		assertTrue("This will succeed.", result);
	}

}
