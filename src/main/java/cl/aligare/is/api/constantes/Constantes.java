/**
 * @name Constantes.java 
 * 
 * @version 1.0 
 * 
 * @date 18 feb. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */

package cl.aligare.is.api.constantes;

/**
 * @description Clase que contiene todos los valores almacenados en constantes
 * necesarias para la aplicacion.
 * 
 */
public class Constantes {
	
	/**
	 * 
	 */
	private Constantes() {
		super();
	}
	
	/** Constantes de la aplicacion */

															
	public static final String	MENSAJE_EXITO							= "FIN FLUJO";

	public static final String	MENSAJE_ERROR							= "ORDEN DE COMPRA NO ES DE KIOSCO";
	
	public static final String	MENSAJE_ERROR_CONTEXTO_NO_VALIDO		= "CONTEXTO NO VALIDO PARA ESTE SERVICIO";
	
	public static final String	MENSAJE_ERROR_ORDEN_EXISTENTE			= "ORDEN DE COMPRA NO EXISTE EN MTD";

	public static final String	MENSAJE_ERROR_GENERAL					= "ERROR REINTENTAR";
	
	public static final String	CODIGO_EXITO								= "200";

	public static final String	CODIGO_ERROR								= "502";

	public static final String	CODIGO_ERROR_VACIO								= "";

	public static final String	CODIGO_ERROR_CONTEXTO_NO_VALIDO				= "400";
	
	public static final String	CODIGO_ERROR_ORDEN_EXISTENTE				= "404";

	public static final String	CODIGO_ERROR_GENERAL						= "500";

	public static final String	CODIGO_NUMERO_INTERNO						= "0";
	
	/** Tags y atributos de peticion/respuesta XML/JSON */
	
	public static final String	BODY									= "BODY";
	
	public static final String	ORIGIN									= "origin";
	
	public static final String	IDORDER									= "idOrder";
	
	public static final String	STATUS									= "status";

	public static final String	DESCRIPTION								= "description";

	public static final String	REQUEST									= "request";

	public static final String	RESPONSE								= "response";
	
	public static final String RESPLEGACYTYPE							= "respLegacyHeader";

	
	/** Tags y atributos para el legado */
	
	public static final String	ORIGIN_LEGACY							= "Ingreso_OC";

	public static final int	ID_ORDER_LEGACY								= 0;

	public static final String	STATUS_LEGACY							= "";

	public static final String	DESCRIPTION_LEGACY						= "";

	public static final String	REQUEST_LEGACY							= "";

	public static final String	RESPONSE_LEGACY							= "";
	
	public static final String	LAMBDA_CALCULO_PUNTOS					= "lambda_bko_dev_calculate_points";
	
	public static final String VACIO									= "";

	public static final String ORDER_TYPE									= "orderType";
															
	public static final String SP_CALL									= "STORE_PROCEDURE ";
	
	public static final String ID_HOLDER									= "IdHolder";
	
	public static final String KIOSCOS									= "KIOSCOS";
	
	}
