/**
 * @name Context.java 
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

/**
 * @description
 *
 */
public class Context implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String idCompany = " ";
	private String idCountry = " ";
	private String idStore   = " ";
	private String idChannel = " ";
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Context [idCompany=" + idCompany + ", idCountry=" + idCountry + ", idStore=" + idStore + ", idChannel="
				+ idChannel + "]";
	}

	/**
	 * @return the idCompany
	 */
	public String getIdCompany() {
		return idCompany;
	}

	/**
	 * @return the idCountry
	 */
	public String getIdCountry() {
		return idCountry;
	}

	/**
	 * @return the idStore
	 */
	public String getIdStore() {
		return idStore;
	}

	/**
	 * @return the idChannel
	 */
	public String getIdChannel() {
		return idChannel;
	}

	/**
	 * @param idCompany the idCompany to set
	 */
	public void setIdCompany(String idCompany) {
		this.idCompany = idCompany;
	}

	/**
	 * @param idCountry the idCountry to set
	 */
	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	/**
	 * @param idStore the idStore to set
	 */
	public void setIdStore(String idStore) {
		this.idStore = idStore;
	}

	/**
	 * @param idChannel the idChannel to set
	 */
	public void setIdChannel(String idChannel) {
		this.idChannel = idChannel;
	}

}
