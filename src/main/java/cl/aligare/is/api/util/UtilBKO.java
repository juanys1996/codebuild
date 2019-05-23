/**
 * @name UtilMIS.java 
 * 
 * @version 1.0 
 * 
 * @date 5 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.text.Document;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.amazonaws.protocol.json.SdkJsonGenerator.JsonGenerationException;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.to.response.BodyResp;

/**
 * @description
 *
 */
public class UtilBKO {
	
	/**
	 * 
	 */
	private UtilBKO() {
		super();
	}

	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();
	
	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/**
	* metodo que convierte los objetos BodyResp en un String basado en formato json
	* 
	* @param BodyResp con toda la informacion del objeto que sera convertido en json
	* @return String que representa la informacion de un objeto pero en formato json
	*/
	public static String getJSONString(BodyResp bodyResp) {
	
		ObjectMapper mapper = new ObjectMapper();
		
		try
		{
			return mapper.writeValueAsString(bodyResp);
			
		} catch (IOException|JsonGenerationException e)
		{
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		} 
		return "{\"error\": \"Exception\"}";
	}
	
	/**
	* metodo que convierte los objetos BodyResp en un document basado en XML
	* 
	* @param BodyResp con toda la informacion del objeto a convertir en XML
	* @return Document objeto bajo la representacion de XML
	*/
	public static Document unmarshalXML(BodyResp bodyResp) throws JAXBException {
	
		JAXBContext jaxbCtx = JAXBContext.newInstance(BodyResp.class);
		Marshaller marshaller = jaxbCtx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		/* El archivo se guarda como "xmlservice.xml" en el objeto xmlService
		   de la clase File a traves del Marshaller definido */
		File xmlService = new File("xmlservice.xml");
		marshaller.marshal(bodyResp, xmlService);
		
		// Se crea un documento XML de la clase Document a partir del archivo "xmlservice.xml"
		Document datos = null;
		logger.log("Se crea exitosamente el xml");
		return datos;
	}
	
	/**
	 * metodo que convierte InputStream en un String
	 * 
	 * @param InputStream con toda la informacion del request
	 * @return String que representa la informacion de un InputStream pero en formato String
	 */
	public static String getStringFromInputStream(InputStream is) {
		StringBuilder sb = new StringBuilder();
		String line;
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(is));	
				) {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		return sb.toString();
	}
	
	
	/**
	 * Metodo que cierra conexion
	 * 
	 * @param Connection conexion
	 * @param PreparedStatement
	 * @param BufferedWriter
	 * @return void
	 */
	public static void closeAll(Connection cnn, PreparedStatement pstmt, BufferedWriter bw, CallableStatement proc, ResultSet rs) {

		try {

			if (cnn != null) {
				cnn.close();
			}
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		try {

			if (pstmt != null) {

				pstmt.close();
			}
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		try {

			if (bw != null) {

				bw.flush();
				bw.close();
			}
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		try {

			if (proc != null) {
				proc.close();
			}
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		
	}

	/**
	 * Metodo que conecta a la base de datos
	 * 
	 * @return void
	 */
	public static Connection createConnection() {
		Connection dbconnection = null;
		try {

			Class.forName("org.postgresql.Driver");
			dbconnection = DriverManager.getConnection(PropertiesUtil.getProperty("bd.url"),
					PropertiesUtil.getProperty("bd.usuario"), PropertiesUtil.getProperty("bd.password"));
		} catch (Exception e) {
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		}
		return dbconnection;
	}

	/**
	 * Metodo que conecta a la base de datos
	 * 
	 * @return void
	 */
	public static int emptyInteger(int data) {
		int resp = 0;
		if ( data > 0 ) 
		{
			resp = data;
		} 
		return resp;
		
	}
	
	/**
	 * Metodo que conecta a la base de datos
	 * 
	 * @return void
	 */
	public static String emptyString(String data) {
		String resp = "";
		if ( data != null  && data != "") 
		{
			resp = data;
		} 
		return resp;
		
	}
	
	/**
	* metodo que valida el password del usuario
	* 
	* @param String password
	* @param Usuario user
	* @return boolean  
	*/
	public static boolean validarKiosco(String idChannel) {
		boolean result = false;
		try {
			
			if (idChannel.equalsIgnoreCase(Constantes.KIOSCOS.toUpperCase())){
				logger.log("[Utils] boolean validarKiosco 'password': valido");
				result = true;
			} 
		}catch (Exception e) {
			logger.log("[Utils] boolean validarKiosco 'password': Error al validar");
			result = false;
		}
		
		return result;
	}
	
	

}
