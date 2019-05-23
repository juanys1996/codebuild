package cl.aligare.is.api.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.job.JobContext;
import com.amazonaws.services.lambda.runtime.LambdaLogger;


public class PropertiesUtil {
	/**
	 * 
	 */
	private PropertiesUtil() {
		super();
	}

	private static JobContext context = new JobContext();
	protected static final Properties props = new Properties();
	private static final String FILE_NAME = "lambda.properties";
	private static final LambdaLogger logger = context.getLogger();
	
	public static String getProperty(String key) {
			InputStream archivo = PropertiesUtil.class.getClassLoader().getResourceAsStream(FILE_NAME);
			try {
				props.load(archivo);
			} catch (IOException e) {
				logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			} finally {
				try {
					archivo.close();
				} catch (IOException e) {
					logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
				}
			}
		return props.getProperty(key);
	}
}
