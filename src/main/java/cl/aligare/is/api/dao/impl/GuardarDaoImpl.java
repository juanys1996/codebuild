/**
 * @name GuardarDaoImpl.java 
 * @version 1.0 
 * @date 13 jun. 2018 
 * @author JOSELUIS 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.GuardarDao;
import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.util.PropertiesUtil;
import cl.aligare.is.api.util.UtilBKO;

/**
 * @description
 *
 */
public class GuardarDaoImpl implements GuardarDao {
	
	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/** Esquema de la base de datos*/
	private static final String ESQUEMA = PropertiesUtil.getProperty("bd.esquema");

	/**
	 * Metodo que guarda la informacion de ordenes de estado
	 * 
	 * @param Integer, id de la orden de compra
	 * @param Integer,  estado
	 * @return boolean indicando true si se hizo la persistencia o false sino se hizo
	 */
	@Override
	public boolean saveOrderStatus(Integer idOrder, Integer status) {
		logger.log("saveOrderStatus");
		boolean resp = false;
		PreparedStatement pstmt = null;
		CallableStatement proc = null;
		Connection dbconn = UtilBKO.createConnection();
		try {
			logger.log("Objeto a persistir:" + idOrder);
			String sql = "{ call "+ESQUEMA+".sp_save_order_status(?,?) }";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, idOrder);
			proc.setInt(2, status);
			proc.registerOutParameter(1, Types.INTEGER);
			proc.execute();
			if(proc.getInt(1) > 0){
				resp = true;
			}
			dbconn.commit();
		} catch (Exception e) {
			logger.log(Errores.MENSAJE_ERROR_DAO);

			if (e.getMessage().contains(Errores.EXCEPTION_CONSTRAINT)) {
				logger.log(Errores.MENSAJE_CONSTRAINT);
				return false;
			}
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			logger.log(Errores.EXCEPTION_LOCALIZED + e.getLocalizedMessage());
			return false;

		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, null);
		}
		logger.log("ID del Objeto guardado:" + idOrder);
		logger.log("Fin:" + "saveOrderStatus");
		return resp;
	}

	/**
	 * Metodo que invoca al SP que tiene la logica para insertar la orden
	 * 
	 * @param String JSON de entrada
	 * @return boolean  logico con la respuesta de la ejecucion del SP
	 */
	@Override
	public boolean saveOrderBuy(String requestJson) {
		PreparedStatement pstmt = null;
		Connection dbconn = UtilBKO.createConnection();
		CallableStatement proc = null;
		boolean resp = false;
		try
		{
			String sql = "{call "+ESQUEMA+".sp_insert_order_buy(?::json, ?, ?)}";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setString(1, requestJson);
			proc.registerOutParameter(2, java.sql.Types.INTEGER);
			proc.registerOutParameter(3, java.sql.Types.VARCHAR);
			
			
			proc.execute();
			dbconn.commit();
			
			int resultado = proc.getInt(2);

			logger.log(Constantes.SP_CALL + "response : " + resultado);
			
			if(resultado == 200){
				logger.log("Respuesta Exitosa en la ejecucion de saveOrderBuy");
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
