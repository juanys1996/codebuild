/**
 * @name RespLegacyHeader.java 
 * 
 * @version 1.0 
 * 
 * @date 4 mar. 2018 
 * 
 * @author JOSELUIS 
 * 
 * @copyright Aligare Consultores. All rights reserved.
 */
package cl.aligare.is.api.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import cl.aligare.is.api.constantes.Constantes;

/**
 * @description	Clase POJO serializable que conforma el elemento raiz (Root)
 * 				del xml/json generado por JAXB
 * 				La anotacion "@XmlElement" se incluye en la declaracion de variable
 * 				La anotacion "@JsonProperty" se encuentra en el getter asociado a la variable
 * 				Los atributos XML (@XmlAttribute) se anotan ademas con "@JsonProperty" 
 * 				para el mapeo JSON con Jackson
 * 				Este elemento envuelve el tag BODY del XML
 * 				No confundir con PETICION, tag que forma parte de BODY
 */
@XmlRootElement(name=Constantes.RESPLEGACYTYPE)
@XmlAccessorType(XmlAccessType.FIELD) 
public class RespLegacyHeader implements Serializable {
	
	private static final long	serialVersionUID	= 6666209296520283440L;
	
	/*Elementos XML/ Propiedades JSON*/
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty(Constantes.ORIGIN)
	@XmlAttribute(name=Constantes.ORIGIN)
	private String origin;
	
	@JsonProperty(Constantes.IDORDER)
	@XmlAttribute(name=Constantes.IDORDER)
	private int idOrder;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty(Constantes.STATUS)
	@XmlAttribute(name=Constantes.STATUS)
	private String	status;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty(Constantes.DESCRIPTION)
	@XmlAttribute(name=Constantes.DESCRIPTION)
	private String description;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty(Constantes.REQUEST)
	@XmlAttribute(name=Constantes.REQUEST)
	private String request;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty(Constantes.RESPONSE)
	@XmlAttribute(name=Constantes.RESPONSE)
	private String response;
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RespLegacyHeader [origin=" + origin + ", idOrder=" + idOrder + ", status=" + status + ", description="
				+ description + ", request=" + request + ", response=" + response + "]";
	}


	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}


	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}


	/**
	 * @return the idOrder
	 */
	public int getIdOrder() {
		return idOrder;
	}


	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}


	/**
	 * @param request the request to set
	 */
	public void setRequest(String request) {
		this.request = request;
	}


	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}


	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}
	

}
