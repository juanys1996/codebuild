/**
 * @name MISServices.java 
 * 
 * @version 1.0 
 * 
 * @date 4 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.services;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.to.response.BodyResp;

/**
 * @description Clase abstracta que define algunos atributos o metodos que seran comunes en los services,
 *              Asi como tambien sera usado algunos atributos en los interceptores
*/

public abstract class BKOServices {

	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();

	private BKOServices() {
		super();
	}
	
	/**
	* metodo que devuelve un objeto generico de respuesta para cuando alguno de los datos de 
	* entrada de la peticion son incorrectos
	* 
	* @return BodyResp  Objeto con una respuesta generica.
	*/
	public static BodyResp respuestaGenerica(String status, String message) {
		logger.log("respuestaGenerica");
		BodyResp bodyResp = new BodyResp();
		bodyResp.setStatus(status);
		bodyResp.setMessage(message);
		return bodyResp;
	}
}
