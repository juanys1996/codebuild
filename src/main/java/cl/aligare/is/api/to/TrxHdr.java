/**
 * @name TrxHdr.java 
 * 
 * @version 1.0 
 * 
 * @date 28 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrxHdr implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String  version = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Context context;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String	trxClientExecDate = " "; // Ver luego como usar Date con Timestamp deserializado para ISO 8691  AAAA-MM-DDThh:mm:SS.mmm 

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrxHdr [version=" + version + ", context=" + context + ", trxClientExecDate=" + trxClientExecDate + "]";
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version.trim();
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the context
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * @return the trxClientExecDate
	 */
	public String getTrxClientExecDate() {
		return trxClientExecDate;
	}

	/**
	 * @param trxClientExecDate the trxClientExecDate to set
	 */
	public void setTrxClientExecDate(String trxClientExecDate) {
		this.trxClientExecDate = trxClientExecDate;
	}
	

}
