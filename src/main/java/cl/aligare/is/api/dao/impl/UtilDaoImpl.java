/**
 * @name UtilDaoImpl.java 
 * 
 * @version 1.0 
 * 
 * @date 13 jun. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.dao.impl;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.dao.UtilDao;
import cl.aligare.is.api.job.JobContext;

/**
 * @description
 *
 */
public class UtilDaoImpl implements UtilDao {
	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();

	@Override
	public boolean util() {
		logger.log("util");
		return false;
	}

}
