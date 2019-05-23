/**
 * @name Attributes.java 
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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @description
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class Attributes implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<Attribute> attribute;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Attributes [attribute=" + attribute + "]";
	}

	/**
	 * @return the attribute
	 */
	public List<Attribute> getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(List<Attribute> attribute) {
		this.attribute = attribute;
	}

	
	

}
