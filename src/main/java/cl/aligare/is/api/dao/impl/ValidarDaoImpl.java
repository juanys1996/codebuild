/**
 * @name ValidarDaoImpl.java 
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

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.ValidarDao;
import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.util.PropertiesUtil;
import cl.aligare.is.api.util.UtilBKO;

/**
 * @description
 *
 */
public class ValidarDaoImpl implements ValidarDao {

	public static final String CALL_PREFIX = "{call ";
	public static final String PARAM_1 = "param 1 : ";
	public static final String RESPONSE_PREFIX = "response : ";
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/** Esquema de la base de datos*/
	private static final String ESQUEMA = PropertiesUtil.getProperty("bd.esquema");

	/**
	 * Metodo que invoca al SP que tiene la logica de validacion de contexto
	 * 
	 * @param String compania
	 * @param String tienda
	 * @param String canal
	 * @param String pais
	 * @return boolean  logico con la respuesta de la ejecucion del SP
	 */
	@Override
	public boolean validateContext(String compania, String tienda, String canal, String pais) {
		PreparedStatement pstmt = null;
		Connection dbconn = UtilBKO.createConnection();
		CallableStatement proc = null;
		boolean resp = false;
		try
		{
			String sql = CALL_PREFIX +ESQUEMA+".sp_validate_context_kiosco(?, ?, ?, ?, ?, ?)}";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setString(1, compania);
			proc.setString(2, tienda);
			proc.setString(3, canal);
			proc.setString(4, pais);
			proc.registerOutParameter(5, java.sql.Types.INTEGER);
			proc.registerOutParameter(6, java.sql.Types.VARCHAR);
			
			logger.log(Constantes.SP_CALL + sql);
			logger.log(Constantes.SP_CALL + PARAM_1 + compania);
			logger.log(Constantes.SP_CALL + "param 2 : " + tienda);
			logger.log(Constantes.SP_CALL + "param 3 : " + canal);
			logger.log(Constantes.SP_CALL + "param 4 : " + pais);
			
			proc.execute();
			dbconn.commit();
			int resultado = proc.getInt(5);

			logger.log(Constantes.SP_CALL + RESPONSE_PREFIX + resultado);
			
			if(resultado == 200){
				logger.log("Respuesta Exitosa en la ejecucion de validateContext");
				resp = true;
			}
			
		} catch (Exception e){
			resp = false;
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, null);
		}
		return resp;
	}

	/**
	 * Metodo que invoca al SP que tiene la logica de validacion si existe la orden
	 * 
	 * @param int numero de orden de compra
	 * @return boolean  logico con la respuesta de la ejecucion del SP
	 */
	@Override
	public boolean validateOrder(int orderNumber) {
		PreparedStatement pstmt = null;
		Connection dbconn = UtilBKO.createConnection();
		CallableStatement proc = null;
		boolean resp = false;
		try
		{
			String sql = CALL_PREFIX +ESQUEMA+".sp_validate_order(?, ?, ?)}";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, orderNumber);
			proc.registerOutParameter(2, java.sql.Types.INTEGER);
			proc.registerOutParameter(3, java.sql.Types.VARCHAR);
			
			logger.log(Constantes.SP_CALL + sql);
			logger.log(Constantes.SP_CALL + PARAM_1 + orderNumber);
			
			proc.execute();
			dbconn.commit();
			int resultado = proc.getInt(2);
			
			logger.log(Constantes.SP_CALL + RESPONSE_PREFIX + resultado);
			
			if(resultado == 200){
				logger.log("Respuesta Exitosa en la ejecucion de validateOrder");
				resp = true;
			}
			
		} catch (Exception e){
			resp = false;
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, null);
		}
		return resp;
	}
	
	/**
	 * Metodo que invoca al SP que tiene la logica de validacion si existe la orden de kiosco
	 * 
	 * @param int numero de orden de compra
	 * @return boolean  logico con la respuesta de la ejecucion del SP
	 */
	@Override
	public boolean validateOrderKiosco(int orderNumber) {
		PreparedStatement pstmt = null;
		Connection dbconn = UtilBKO.createConnection();
		CallableStatement proc = null;
		boolean resp = false;
		try
		{
			String sql = CALL_PREFIX +ESQUEMA+".sp_validate_order_kiosco(?, ?, ?)}";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, orderNumber);
			proc.registerOutParameter(2, java.sql.Types.INTEGER);
			proc.registerOutParameter(3, java.sql.Types.VARCHAR);
			
			logger.log(Constantes.SP_CALL + sql);
			logger.log(Constantes.SP_CALL + PARAM_1 + orderNumber);
			
			proc.execute();
			dbconn.commit();
			int resultado = proc.getInt(2);
			
			logger.log(Constantes.SP_CALL + RESPONSE_PREFIX + resultado);
			
			if(resultado == 200){
				logger.log("Respuesta Exitosa en la ejecucion de validateOrderKiosco");
				resp = true;
			}
			
		} catch (Exception e){
			resp = false;
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, null);
		}
		return resp;
	}

}
