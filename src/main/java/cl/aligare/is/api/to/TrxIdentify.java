package cl.aligare.is.api.to;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @description
 */
// @JsonInclude(JsonInclude.Include.NON_NULL)
// @XmlRootElement(name = Constantes.DATOSSALIDA)
// @XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrxIdentify implements Serializable {

	private static final long serialVersionUID = 1L;

	private int orderType = 0;

	private int idEvent = 0;

	private int idOrder = 0; // verificar que sea factible

	public TrxIdentify() {
		// constructor stub
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrxIdentify [orderType=" + orderType + ", idEvent=" + idEvent + ", idOrder=" + idOrder + "]";
	}

	/**
	 * @return the orderType
	 */
	public int getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the idEvent
	 */
	public int getIdEvent() {
		return idEvent;
	}

	/**
	 * @param idEvent
	 *            the idEvent to set
	 */
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	/**
	 * @return the idOrder
	 */
	public int getIdOrder() {
		return idOrder;
	}

	/**
	 * @param idOrder
	 *            the idOrder to set
	 */
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

}
