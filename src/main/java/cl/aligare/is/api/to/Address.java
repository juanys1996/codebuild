/**
 * @name Address.java 
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
public class Address implements Serializable {
	
	private static final long serialVersionUID = 7514388432253828691L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String address1 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String address2 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String address3 = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String number = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String country = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int citycode;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String cityName = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int state = 0;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int postalCode = 0; 
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String detail = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String latitude = " ";
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String longitude = " ";

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", number="
				+ number + ", country=" + country + ", citycode=" + citycode + ", cityName=" + cityName + ", state="
				+ state + ", postalCode=" + postalCode + ", detail=" + detail + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the citycode
	 */
	public int getCitycode() {
		return citycode;
	}

	/**
	 * @param citycode the citycode to set
	 */
	public void setCitycode(int citycode) {
		this.citycode = citycode;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	


}
