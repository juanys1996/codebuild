/**
 * @name ActualizarDaoImp.java 
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

import cl.aligare.is.api.dao.ActualizarDao;
import cl.aligare.is.api.job.JobContext;

/**
 * @description
 *
 */
public class ActualizarDaoImp implements ActualizarDao {
	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();

	@Override
	public boolean update(int orderNumber) {
		logger.log("update");
		return false;
	}

}
