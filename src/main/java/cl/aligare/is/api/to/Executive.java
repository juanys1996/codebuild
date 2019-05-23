/**
 * @name Executive.java 
 * 
 * @version 1.0 
 * 
 * @date 7 mar. 2018 
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
public class Executive implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String executiveId = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String executiveName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String executiveCompanyId = " ";
	
	private int executiveLocal = 0;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Executive [executiveId=" + executiveId + ", executiveName=" + executiveName + ", executiveCompanyId="
				+ executiveCompanyId + ", executiveLocal=" + executiveLocal + "]";
	}

	/**
	 * @return the executiveId
	 */
	public String getExecutiveId() {
		return executiveId;
	}

	/**
	 * @param executiveId the executiveId to set
	 */
	public void setExecutiveId(String executiveId) {
		this.executiveId = executiveId;
	}

	/**
	 * @return the executiveName
	 */
	public String getExecutiveName() {
		return executiveName;
	}

	/**
	 * @param executiveName the executiveName to set
	 */
	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}

	/**
	 * @return the executiveCompanyId
	 */
	public String getExecutiveCompanyId() {
		return executiveCompanyId;
	}

	/**
	 * @param executiveCompanyId the executiveCompanyId to set
	 */
	public void setExecutiveCompanyId(String executiveCompanyId) {
		this.executiveCompanyId = executiveCompanyId;
	}

	/**
	 * @return the executiveLocal
	 */
	public int getExecutiveLocal() {
		return executiveLocal;
	}

	/**
	 * @param executiveLocal the executiveLocal to set
	 */
	public void setExecutiveLocal(int executiveLocal) {
		this.executiveLocal = executiveLocal;
	}

	

}
