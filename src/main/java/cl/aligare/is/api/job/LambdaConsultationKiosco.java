package cl.aligare.is.api.job;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.ValidarDao;
import cl.aligare.is.api.dao.impl.ConsultaDaoImpl;
import cl.aligare.is.api.dao.impl.ValidarDaoImpl;
import cl.aligare.is.api.services.BKOServices;
import cl.aligare.is.api.to.OrderFlujoInfo;
import cl.aligare.is.api.to.request.BodyReq;
import cl.aligare.is.api.to.response.BodyResp;
import cl.aligare.is.api.util.UtilBKO;

/**
 * @description Clase que ingresa la orden de compra en la base de datos
 *
 */
public class LambdaConsultationKiosco implements RequestStreamHandler {
	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();
	
	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/** Objeto que inicializa el dao de  Validar  */
	private static ValidarDao validarDao = new ValidarDaoImpl();
	

	/** Objeto que inicializa el dao de  Guardar  */
	private static ConsultaDaoImpl consutaDao = new ConsultaDaoImpl();

	@Override
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
		logger.log("Inicio Lambda modelo recive order, input\n" + inputStream.toString());
		BodyResp bodyResp = new BodyResp();
		ObjectMapper mapperRequest = new ObjectMapper();
		ObjectMapper mapperResponse = new ObjectMapper();
		StringWriter stringResponse = new StringWriter();
		StringWriter stringRequest = new StringWriter();
		String request = null;
		try {
			request = UtilBKO.getStringFromInputStream(inputStream);
			logger.log("request " + request);
			
			// convertir json cadena a objeto Request
			BodyReq eRequest = mapperRequest.readValue(request, BodyReq.class);
			logger.log("Lambda lambda_bko_consultation_kiosco: " + eRequest.getTrxIdentify().getIdOrder());
			
			// configurar asignador de objetos para impresión bonita
			mapperRequest.configure(SerializationFeature.INDENT_OUTPUT, true);
			
			// escribiendo en consola, escribir el flujo de entrada Request
			mapperRequest.writeValue(stringRequest, eRequest);
			
			// Se ejecuta el envio del mensaje y se obtiene una respuesta
			BodyResp eResponse = mapperResponse.readValue(request, BodyResp.class);
			eResponse.setTrxIdentify(null);
			eResponse.setTrxHdr(null);
			
			// Validamos el contexto
			if (validarDao.validateContext(eRequest.getTrxHdr().getContext().getIdCompany(),
					eRequest.getTrxHdr().getContext().getIdStore(), eRequest.getTrxHdr().getContext().getIdChannel(),
					eRequest.getTrxHdr().getContext().getIdCountry()))
			{
				// Se Valida que el numero de orden exista en el MTD
				if (validarDao.validateOrder(eRequest.getTrxIdentify().getIdOrder()))
				{
					// Se Valida que el numero de orden sea kiosco			  
					if (validarDao.validateOrderKiosco(eRequest.getTrxIdentify().getIdOrder()))
					{
						
						OrderFlujoInfo orderFlujoInfo = consutaDao.getOrderFlujoInfo(String.valueOf(eRequest.getTrxIdentify().getIdOrder()));
						
						logger.log("status " + orderFlujoInfo.getStatus());
						logger.log("Numero de Orden " + eRequest.getTrxIdentify().getIdOrder());
						
						eResponse.setStatus(Constantes.CODIGO_EXITO);
						eResponse.setMessage(orderFlujoInfo.getStatus());
					
						
					} else {
						eResponse.setStatus(Constantes.CODIGO_ERROR);
						eResponse.setMessage(Constantes.MENSAJE_ERROR);
					}
				} else 
				{
					logger.log("Algo fallo en la BD al validar el numero de orden");
					
					eResponse.setStatus(Constantes.CODIGO_ERROR_ORDEN_EXISTENTE);
					eResponse.setMessage(Constantes.MENSAJE_ERROR_ORDEN_EXISTENTE);
				}
			} else 
			{
				logger.log("Algo fallo en la BD al validar el contexto");
				
				eResponse.setStatus(Constantes.CODIGO_ERROR_CONTEXTO_NO_VALIDO);
				eResponse.setMessage(Constantes.MENSAJE_ERROR_CONTEXTO_NO_VALIDO);
			}
			// configurar asignador de objetos para impresión bonita
			mapperResponse.configure(SerializationFeature.INDENT_OUTPUT, true);
			// escribiendo en consola, puede escribir en cualquier flujo de
			mapperResponse.writeValue(stringResponse, eResponse);
		} catch (Exception ex) 
		{
	    	logger.log(Errores.MENSAJE_ERROR_SERVICES);
			logger.log(Errores.EXCEPTION_MESSAGE + ex.getMessage());
			bodyResp = BKOServices.respuestaGenerica(String.valueOf(Constantes.CODIGO_ERROR_GENERAL), Errores.EXCEPTION_MESSAGE + ex.getMessage());

			mapperResponse.configure(SerializationFeature.INDENT_OUTPUT, true);
			mapperResponse.writeValue(stringResponse, bodyResp);
		} 
		
		logger.log("Finaliza Lambda BKO Model BO, response\n" + stringResponse.toString());
		
		OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
		writer.write(stringResponse.toString());
		writer.close();
		
	}

}