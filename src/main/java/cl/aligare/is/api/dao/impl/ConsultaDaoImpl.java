/**
 * @name ConsultaDaoImpl.java 
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
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.ConsultaDao;
import cl.aligare.is.api.job.JobContext;
import cl.aligare.is.api.to.ItemInfo;
import cl.aligare.is.api.to.OrderFlujoInfo;
import cl.aligare.is.api.to.OrderInfo;
import cl.aligare.is.api.to.PaymentInfo;
import cl.aligare.is.api.util.PropertiesUtil;
import cl.aligare.is.api.util.UtilBKO;

/**
 * @description
 *
 */
public class ConsultaDaoImpl implements ConsultaDao {

	public static final String ID_ORDER = "id_order";
	public static final String ORDERNUMBER = "ordernumber";
	public static final String CREATIONTIME = "creationtime";
	public static final String AMOUNT = "amount";
	public static final String SHIPPINGAMOUNT = "shippingamount";
	public static final String TAXAMOUNT = "taxamount";
	public static final String DISCOUNTAMOUNT = "discountamount";
	public static final String TOTAL = "total";
	public static final String EXECUTIVEID = "executiveid";
	public static final String EXECUTIVENAME = "executivename";
	public static final String EXECUTIVECOMPANYID = "executivecompanyid";
	public static final String EXECUTIVELOCAL = "executivelocal";
	public static final String LOYALTYID = "loyaltyid";
	public static final String LOYALTYBASEPOINT = "loyaltybasepoint";
	public static final String LOYALTYPAYPOINT = "loyaltypaypoint";
	public static final String LOYALTYPOINTID = "loyaltypointid";
	public static final String ORDERTYPE = "ordertype";
	public static final String DOCUMENTTYPE = "documenttype";
	public static final String LOCATIONID = "locationid";
	public static final String TRANSACTIONNUMBER = "transactionnumber";
	public static final String TERMINALID = "terminalid";
	public static final String DTENUMBER = "dtenumber";
	public static final String DTEDATE = "dtedate";
	public static final String NCDTENUMBER = "ncdtenumber";
	public static final String URLDTE = "urldte";
	public static final String URLNCDTE = "urlncdte";
	public static final String ID_CUSTOMER = "id_customer";
	public static final String TBC_ID_ORDER = "tbc_id_order";
	public static final String CUSTOMERID = "customerid";
	public static final String FOREIGNFLAG = "foreignflag";
	public static final String FOREIGNCOUNTRY = "foreigncountry";
	public static final String FIRSTNAME = "firstname";
	public static final String MIDDLENAME = "middlename";
	public static final String LASTNAME = "lastname";
	public static final String EMAIL = "email";
	public static final String EMAILFLAG = "emailflag";
	public static final String PHONENUMBER_1 = "phonenumber1";
	public static final String PHONENUMBER_2 = "phonenumber2";
	public static final String ID_ADDRESS = "id_address";
	public static final String ID_ADDRESSRELATION = "id_addressrelation";
	public static final String ID_ADDRESSTYPE = "id_addresstype";
	public static final String ADDRESS_1 = "address1";
	public static final String ADDRESS_2 = "address2";
	public static final String ADDRESS_3 = "address3";
	public static final String NUMBER = "number";
	public static final String COUNTRY = "country";
	public static final String CITY = "city";
	public static final String CITYNAME = "cityname";
	public static final String STATE = "state";
	public static final String POSTALCODE = "postalcode";
	public static final String DETAIL = "detail";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String ID_BILLING = "id_billing";
	public static final String TBB_ID_ORDER = "tbb_id_order";
	public static final String COMPANYNAME = "companyname";
	public static final String COMPANYTURN = "companyturn";
	public static final String CONTACTFULLNAME = "contactfullname";
	public static final String PHONENUMBER = "phonenumber";
	public static final String COMPANYEMAIL = "companyemail";
	public static final String TBA_B_ID_ADDRESS = "tba_b_id_address";
	public static final String TBA_B_ID_ADDRESSRELATION = "tba_b_id_addressrelation";
	public static final String TBA_B_ID_ADDRESSTYPE = "tba_b_id_addresstype";
	public static final String TBA_B_ADDRESS_1 = "tba_b_address1";
	public static final String TBA_B_ADDRESS_2 = "tba_b_address2";
	public static final String TBA_B_ADDRESS_3 = "tba_b_address3";
	public static final String TBA_B_NUMBER = "tba_b_number";
	public static final String TBA_B_COUNTRY = "tba_b_country";
	public static final String TBA_B_CITY = "tba_b_city";
	public static final String TBA_B_CITYNAME = "tba_b_cityname";
	public static final String TBA_B_STATE = "tba_b_state";
	public static final String TBA_B_POSTALCODE = "tba_b_postalcode";
	public static final String TBA_B_DETAIL = "tba_b_detail";
	public static final String TBA_B_LATITUDE = "tba_b_latitude";
	public static final String TBA_B_LONGITUDE = "tba_b_longitude";
	public static final String ID_SPECIALPROGRAM = "id_specialprogram";
	public static final String TBSP_ID_ORDER = "tbsp_id_order";
	public static final String SPECIALPROGRAMTYPE = "specialprogramtype";
	public static final String SPECIALPROGRAMCODE = "specialprogramcode";
	public static final String NAMES_1 = "names1";
	public static final String NAMES_2 = "names2";
	public static final String EMAIL_1 = "email1";
	public static final String EMAIL_2 = "email2";
	public static final String MESSAGETEXT = "messagetext";
	public static final String ISGIFT = "isgift";
	public static final String TBA_SP_ID_ADDRESS = "tba_sp_id_address";
	public static final String TBA_SP_ID_ADDRESSRELATION = "tba_sp_id_addressrelation";
	public static final String TBA_SP_ID_ADDRESSTYPE = "tba_sp_id_addresstype";
	public static final String TBA_SP_ADDRESS_1 = "tba_sp_address1";
	public static final String TBA_SP_ADDRESS_2 = "tba_sp_address2";
	public static final String TBA_SP_ADDRESS_3 = "tba_sp_address3";
	public static final String TBA_SP_NUMBER = "tba_sp_number";
	public static final String TBA_SP_COUNTRY = "tba_sp_country";
	public static final String TBA_SP_CITY = "tba_sp_city";
	public static final String TBA_SP_CITYNAME = "tba_sp_cityname";
	public static final String TBA_SP_STATE = "tba_sp_state";
	public static final String TBA_SP_POSTALCODE = "tba_sp_postalcode";
	public static final String TBA_SP_DETAIL = "tba_sp_detail";
	public static final String TBA_SP_LATITUDE = "tba_sp_latitude";
	public static final String TBA_SP_LONGITUDE = "tba_sp_longitude";
	public static final String ID_ITEM = "id_item";
	public static final String TBI_ID_ORDER = "tbi_id_order";
	public static final String ORDERLINE = "orderline";
	public static final String SKU = "sku";
	public static final String ITEMSALENAME = "itemsalename";
	public static final String TBI_SHIPPINGTYPE = "tbi_shippingtype";
	public static final String ITSGIF = "itsgif";
	public static final String GIFTMESSAGE = "giftmessage";
	public static final String WARRANTYFLAG = "warrantyflag";
	public static final String WARRANTYTYPE = "warrantytype";
	public static final String ITSCOMBO = "itscombo";
	public static final String SKUFATHER = "skufather";
	public static final String DEPARTMENTID = "departmentid";
	public static final String DEPARTMENTNAME = "departmentname";
	public static final String PROMOTIONCODE = "promotioncode";
	public static final String TYPESKU = "typesku";
	public static final String ITEMCOST = "itemcost";
	public static final String ITEMQUANTITY = "itemquantity";
	public static final String ITEMUNITAMOUNT = "itemunitamount";
	public static final String ITEMUNITDOSCOUNT = "itemunitdoscount";
	public static final String ITEMTOTALDISCOUNT = "itemtotaldiscount";
	public static final String ITEMDISCOUNTTYPE = "itemdiscounttype";
	public static final String ITEMTOTALAMOUNT = "itemtotalamount";
	public static final String ID_THIRD = "id_third";
	public static final String TBTH_ORDERNUMBER = "tbth_ordernumber";
	public static final String TBTH_SKU = "tbth_sku";
	public static final String THIRDID = "thirdid";
	public static final String THIRDNAME = "thirdname";
	public static final String TBTH_ID_ORDER = "tbth_id_order";
	public static final String TBTH_ID_ITEM = "tbth_id_item";
	public static final String RBIT_TAXAMOUNT = "rbit_taxamount";
	public static final String ID_TAX = "id_tax";
	public static final String TAXCODE = "taxcode";
	public static final String ID_SHIPPING = "id_shipping";
	public static final String SHIPPINGETADATE = "shippingetadate";
	public static final String SHIPPINGPREPARATIONDATE = "shippingpreparationdate";
	public static final String SHIPPINGDATE = "shippingdate";
	public static final String SHIPPINGHOUR = "shippinghour";
	public static final String ITEMSHIPPING = "itemshipping";
	public static final String SHIPPINGLINE = "shippingline";
	public static final String SHIPPINGORDER = "shippingorder";
	public static final String SHIPPINGTYPE = "shippingtype";
	public static final String SHIPPINGIDHOLDER = "shippingidholder";
	public static final String SHIPPINGNAME = "shippingname";
	public static final String SHIPPINGSURNAME = "shippingsurname";
	public static final String NAMEWITHDRAW = "namewithdraw";
	public static final String LASTNAMERETIRA = "lastnameretira";
	public static final String WITHDRAWID = "withdrawid";
	public static final String STOREID = "storeid";
	public static final String SHIPPINGEMAIL = "shippingemail";
	public static final String SHIPPINGOBSERVATION = "shippingobservation";
	public static final String ID_ORDERPAYMENT = "id_orderpayment";
	public static final String RBOP_ID_ORDER = "rbop_id_order";
	public static final String ID_CHANNEL = "id_channel";
	public static final String ID_STORE = "id_store";
	public static final String RBOP_ID_TRANSACTION = "rbop_id_transaction";
	public static final String RBOP_ID_PAYMENT = "rbop_id_payment";
	public static final String RBOP_ID_CURRENCY = "rbop_id_currency";
	public static final String CONEXIONTYPE = "conexiontype";
	public static final String PAYMENTTYPE = "paymenttype";
	public static final String UNIQUENUMBERTRX = "uniquenumbertrx";
	public static final String AUTHORIZATIONCODE = "authorizationcode";
	public static final String AGREEMENTCODE = "agreementcode";
	public static final String CARDNUMBER = "cardnumber";
	public static final String BIN = "bin";
	public static final String IDHOLDER = "idholder";
	public static final String OBSERVATIONS = "observations";
	public static final String PAYTOTALAMOUNT = "paytotalamount";
	public static final String PAYAMOUNT = "payamount";
	public static final String PAYAMOUNTFEE = "payamountfee";
	public static final String PAYFEETYPE = "payfeetype";
	public static final String PAYFEES = "payfees";
	public static final String PAYDEFERREFMONTHS = "paydeferrefmonths";
	public static final String PAYFIRSTEXPIRATIONFEE = "payfirstexpirationfee";
	public static final String PAYRATE = "payrate";
	public static final String BONUSGC = "bonusgc";
	public static final String ID_PAYMENT = "id_payment";
	public static final String INTERNATID = "internatid";
	public static final String CBP_NAME = "cbp_name";
	public static final String ID_CURRENCY = "id_currency";
	public static final String CURRENCYCODE = "currencycode";
	public static final String CBC_NAME = "cbc_name";
	public static final String ID_TRANSACTION = "id_transaction";
	public static final String CBT_NAME = "cbt_name";
	public static final String ID_PROMOTION = "id_promotion";
	public static final String TBP_ID_ORDER = "tbp_id_order";

	/** Objeto que gestiona el contexto del log */
	private static JobContext context = new JobContext();

	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/** Esquema de la base de datos*/
	private static final String ESQUEMA = PropertiesUtil.getProperty("bd.esquema");

	/** LLamado al SP*/
	private static final String CALL = "call";
	/**
	 * Metodo que obtiene la informacion de ordenes
	 * 
	 * @param int orderNumber
	 * @param int idStore
	 * @return OrderInfo objeto con la informacion de las ordenes
	 */
	
	@Override
	public OrderInfo getOrderInfo(int orderNumber) {
		logger.log("getOrderInfo");
		OrderInfo result = null;
		PreparedStatement pstmt = null;
		CallableStatement proc = null;
		ResultSet rs = null;
		Connection dbconn = UtilBKO.createConnection();
		try {
			String sql = "{ call "+ESQUEMA+".sp_get_order_info(?) }";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, orderNumber);
			proc.registerOutParameter(1, Types.OTHER);
			proc.execute();
			rs = (ResultSet) proc.getObject(1);
			dbconn.commit();
			while (rs.next()) {
				OrderInfo orderInfo = new OrderInfo();
				orderInfo.setIdOrder(rs.getInt(ID_ORDER) > 0 ? rs.getInt(ID_ORDER) : 0);
				orderInfo.setOrderNumber(rs.getInt(ORDERNUMBER) > 0 ? rs.getInt(ORDERNUMBER) : 0);
				orderInfo.setCreationTime(rs.getTimestamp(CREATIONTIME).toString());
				orderInfo.setAmount(rs.getInt(AMOUNT) > 0 ? rs.getInt(AMOUNT) : 0);
				orderInfo.setShippingAmount(rs.getInt(SHIPPINGAMOUNT) > 0 ? rs.getInt(SHIPPINGAMOUNT) : 0);
				orderInfo.setTaxAmount(rs.getInt(TAXAMOUNT) > 0 ? rs.getInt(TAXAMOUNT) : 0);
				orderInfo.setDiscountAmount(rs.getInt(DISCOUNTAMOUNT) > 0 ? rs.getInt(DISCOUNTAMOUNT) : 0);
				orderInfo.setTotal(rs.getInt(TOTAL) > 0 ? rs.getInt(TOTAL) : 0);
				orderInfo.setExecutiveId(rs.getInt(EXECUTIVEID) > 0 ? rs.getInt(EXECUTIVEID) : 0);
				orderInfo.setExecutiveName(rs.getString(EXECUTIVENAME) != null ? rs.getString(EXECUTIVENAME) : "");
				orderInfo.setExecutiveCompanyId(rs.getInt(EXECUTIVECOMPANYID) > 0 ? rs.getInt(EXECUTIVECOMPANYID) : 0);
				orderInfo.setExecutiveLocal(rs.getString(EXECUTIVELOCAL) != null ? rs.getString(EXECUTIVELOCAL) : "");
				orderInfo.setLoyaltyId(rs.getInt(LOYALTYID) > 0 ? rs.getInt(LOYALTYID) : 0);
				orderInfo.setLoyaltyBasePoint(rs.getInt(LOYALTYBASEPOINT) > 0 ? rs.getInt(LOYALTYBASEPOINT) : 0);
				orderInfo.setLoyaltyPayPoint(rs.getInt(LOYALTYPAYPOINT) > 0 ? rs.getInt(LOYALTYPAYPOINT) : 0);
				orderInfo.setLoyaltyPointId(rs.getInt(LOYALTYPOINTID) > 0 ? rs.getInt(LOYALTYPOINTID) : 0);
				orderInfo.setOrderType(rs.getInt(ORDERTYPE) > 0 ? rs.getInt(ORDERTYPE) : 0);
				orderInfo.setDocumentType(rs.getInt(DOCUMENTTYPE) > 0 ? rs.getInt(DOCUMENTTYPE) : 0);
				orderInfo.setLocationId(rs.getInt(LOCATIONID) > 0 ? rs.getInt(LOCATIONID) : 0);
				orderInfo.setTransactionNumber(rs.getInt(TRANSACTIONNUMBER) > 0 ? rs.getInt(TRANSACTIONNUMBER) : 0);
				orderInfo.setTerminalId(rs.getInt(TERMINALID) > 0 ? rs.getInt(TERMINALID) : 0);
				orderInfo.setDteNumber(rs.getInt(DTENUMBER) > 0 ? rs.getInt(DTENUMBER) : 0);
				orderInfo.setDteDate(rs.getDate(DTEDATE).toString());
				orderInfo.setNcDteNumber(rs.getInt(NCDTENUMBER) > 0 ? rs.getInt(NCDTENUMBER) : 0);
				orderInfo.setUrlDte(rs.getString(URLDTE) != null ? rs.getString(URLDTE) : "");
				orderInfo.setUrlNcDte(rs.getString(URLNCDTE) != null ? rs.getString(URLNCDTE) : "");
				orderInfo.setIdCustomer(rs.getInt(ID_CUSTOMER) > 0 ? rs.getInt(ID_CUSTOMER) : 0);
				orderInfo.setIdOrderCustomer(rs.getInt(TBC_ID_ORDER) > 0 ? rs.getInt(TBC_ID_ORDER) : 0);
				orderInfo.setCustomerId(rs.getInt(CUSTOMERID) > 0 ? rs.getInt(CUSTOMERID) : 0);
				orderInfo.setForeignFlag(rs.getInt(FOREIGNFLAG) > 0 ? rs.getInt(FOREIGNFLAG) : 0);
				orderInfo.setForeignCountry(rs.getString(FOREIGNCOUNTRY) != null ? rs.getString(FOREIGNCOUNTRY) : "");
				orderInfo.setFirstName(rs.getString(FIRSTNAME) != null ? rs.getString(FIRSTNAME) : "");
				orderInfo.setMiddleName(rs.getString(MIDDLENAME) != null ? rs.getString(MIDDLENAME) : "");
				orderInfo.setLastName(rs.getString(LASTNAME) != null ? rs.getString(LASTNAME) : "");
				orderInfo.setEmail(rs.getString(EMAIL) != null ? rs.getString(EMAIL) : "");
				orderInfo.setEmailFlag(rs.getInt(EMAILFLAG) > 0 ? rs.getInt(EMAILFLAG) : 0);
				orderInfo.setPhoneNumber1(rs.getLong(PHONENUMBER_1) > 0 ? rs.getLong(PHONENUMBER_1) : 0);
				orderInfo.setPhoneNumber2(rs.getLong(PHONENUMBER_2) > 0 ? rs.getLong(PHONENUMBER_2) : 0);
				orderInfo.setIdAddressCustomer(rs.getInt(ID_ADDRESS) > 0 ? rs.getInt(ID_ADDRESS) : 0);
				orderInfo.setIdAddressRelation(rs.getInt(ID_ADDRESSRELATION) > 0 ? rs.getInt(ID_ADDRESSRELATION) : 0);
				orderInfo.setIdAddressType(rs.getInt(ID_ADDRESSTYPE) > 0 ? rs.getInt(ID_ADDRESSTYPE) : 0);
				orderInfo.setAddress1(rs.getString(ADDRESS_1) != null ? rs.getString(ADDRESS_1) : "");
				orderInfo.setAddress2(rs.getString(ADDRESS_2) != null ? rs.getString(ADDRESS_2) : "");
				orderInfo.setAddress3(rs.getString(ADDRESS_3) != null ? rs.getString(ADDRESS_3) : "");
				orderInfo.setNumber(rs.getInt(NUMBER) > 0 ? rs.getInt(NUMBER) : 0);
				orderInfo.setCountry(rs.getString(COUNTRY) != null ? rs.getString(COUNTRY) : "");
				orderInfo.setCity(rs.getString(CITY) != null ? rs.getString(CITY) : "");
				orderInfo.setCityName(rs.getString(CITYNAME) != null ? rs.getString(CITYNAME) : "");
				orderInfo.setState(rs.getInt(STATE) > 0 ? rs.getInt(STATE) : 0);
				orderInfo.setPostalCode(rs.getString(POSTALCODE) != null ? rs.getString(POSTALCODE) : "");
				orderInfo.setDetail(rs.getString(DETAIL) != null ? rs.getString(DETAIL) : "");
				orderInfo.setLatitude(rs.getString(LATITUDE) != null ? rs.getString(LATITUDE) : "");
				orderInfo.setLongitude(rs.getString(LONGITUDE) != null ? rs.getString(LONGITUDE) : "");
				orderInfo.setIdBilling(rs.getInt(ID_BILLING) > 0 ? rs.getInt(ID_BILLING) : 0);
				orderInfo.setIdOrderBilling(rs.getInt(TBB_ID_ORDER) > 0 ? rs.getInt(TBB_ID_ORDER) : 0);
				orderInfo.setCompanyName(rs.getString(COMPANYNAME) != null ? rs.getString(COMPANYNAME) : "");
				orderInfo.setCompanyTurn(rs.getString(COMPANYTURN) != null ? rs.getString(COMPANYTURN) : "");
				orderInfo.setContactFullname(rs.getString(CONTACTFULLNAME) != null ? rs.getString(CONTACTFULLNAME) : "");
				orderInfo.setPhoneNumber(rs.getLong(PHONENUMBER) > 0 ? rs.getLong(PHONENUMBER) : 0);
				orderInfo.setCompanyEmail(rs.getString(COMPANYEMAIL) != null ? rs.getString(COMPANYEMAIL) : "");
				orderInfo.setIdAddressBilling(rs.getInt(TBA_B_ID_ADDRESS) > 0 ? rs.getInt(TBA_B_ID_ADDRESS) : 0);
				orderInfo.setIdAddressRelationBilling(rs.getInt(TBA_B_ID_ADDRESSRELATION) > 0 ? rs.getInt(TBA_B_ID_ADDRESSRELATION) : 0);
				orderInfo.setIdAddressTypeBilling(rs.getInt(TBA_B_ID_ADDRESSTYPE) > 0 ? rs.getInt(TBA_B_ID_ADDRESSTYPE) : 0);
				orderInfo.setAddress1Billing(rs.getString(TBA_B_ADDRESS_1) != null ? rs.getString(TBA_B_ADDRESS_1) : "");
				orderInfo.setAddress2Billing(rs.getString(TBA_B_ADDRESS_2) != null ? rs.getString(TBA_B_ADDRESS_2) : "");
				orderInfo.setAddress3Billing(rs.getString(TBA_B_ADDRESS_3) != null ? rs.getString(TBA_B_ADDRESS_3) : "");
				orderInfo.setNumberAddressBilling(rs.getInt(TBA_B_NUMBER) > 0 ? rs.getInt(TBA_B_NUMBER) : 0);
				orderInfo.setCountryAddressBilling(rs.getString(TBA_B_COUNTRY) != null ? rs.getString(TBA_B_COUNTRY) : "");
				orderInfo.setCityAddressBilling(rs.getString(TBA_B_CITY) != null ? rs.getString(TBA_B_CITY) : "");
				orderInfo.setCityNameAddressBilling(rs.getString(TBA_B_CITYNAME) != null ? rs.getString(TBA_B_CITYNAME) : "");
				orderInfo.setStateAddressBilling(rs.getString(TBA_B_STATE) != null ? rs.getString(TBA_B_STATE) : "");
				orderInfo.setPostalCodeAddressBilling(rs.getString(TBA_B_POSTALCODE) != null ? rs.getString(TBA_B_POSTALCODE) : "");
				orderInfo.setDetailAddressBilling(rs.getString(TBA_B_DETAIL) != null ? rs.getString(TBA_B_DETAIL) : "");
				orderInfo.setLatitudeAddressBilling(rs.getString(TBA_B_LATITUDE) != null ? rs.getString(TBA_B_LATITUDE) : "");
				orderInfo.setLongitudeAddressBilling(rs.getString(TBA_B_LONGITUDE) != null ? rs.getString(TBA_B_LONGITUDE) : "");
				orderInfo.setIdSpecialProgram(rs.getInt(ID_SPECIALPROGRAM) > 0 ? rs.getInt(ID_SPECIALPROGRAM) : 0);
				orderInfo.setIdOrderSpecialProgram(rs.getInt(TBSP_ID_ORDER) > 0 ? rs.getInt(TBSP_ID_ORDER) : 0);
				orderInfo.setSpecialProgramType(rs.getString(SPECIALPROGRAMTYPE) != null ? rs.getString(SPECIALPROGRAMTYPE) : "");
				orderInfo.setSpecialProgramCode(rs.getInt(SPECIALPROGRAMCODE) > 0 ? rs.getInt(SPECIALPROGRAMCODE) : 0);
				orderInfo.setNames1(rs.getString(NAMES_1) != null ? rs.getString(NAMES_1) : "");
				orderInfo.setNames2(rs.getString(NAMES_2) != null ? rs.getString(NAMES_2) : "");
				orderInfo.setEmail1(rs.getString(EMAIL_1) != null ? rs.getString(EMAIL_1) : "");
				orderInfo.setEmail2(rs.getString(EMAIL_2) != null ? rs.getString(EMAIL_2) : "");
				orderInfo.setMessageText(rs.getString(MESSAGETEXT) != null ? rs.getString(MESSAGETEXT) : "");
				orderInfo.setIsGift(rs.getString(ISGIFT) != null ? rs.getString(ISGIFT) : "");
				orderInfo.setIdAddress(rs.getInt(TBA_SP_ID_ADDRESS) > 0 ? rs.getInt(TBA_SP_ID_ADDRESS) : 0);
				orderInfo.setIdAddressRelationSpecialProgram(rs.getInt(TBA_SP_ID_ADDRESSRELATION) > 0 ? rs.getInt(TBA_SP_ID_ADDRESSRELATION) : 0);
				orderInfo.setIdAddressTypeSpecialProgram(rs.getInt(TBA_SP_ID_ADDRESSTYPE) > 0 ? rs.getInt(TBA_SP_ID_ADDRESSTYPE) : 0);
				orderInfo.setAddress1SpecialProgram(rs.getString(TBA_SP_ADDRESS_1) != null ? rs.getString(TBA_SP_ADDRESS_1) : "");
				orderInfo.setAddress2SpecialProgram(rs.getString(TBA_SP_ADDRESS_2) != null ? rs.getString(TBA_SP_ADDRESS_2) : "");
				orderInfo.setAddress3SpecialProgram(rs.getString(TBA_SP_ADDRESS_3) != null ? rs.getString(TBA_SP_ADDRESS_3) : "");
				orderInfo.setNumberSpecialProgram(rs.getString(TBA_SP_NUMBER) != null ? rs.getString(TBA_SP_NUMBER) : "");
				orderInfo.setCountrySpecialProgram(rs.getString(TBA_SP_COUNTRY) != null ? rs.getString(TBA_SP_COUNTRY) : "");
				orderInfo.setCitySpecialProgram(rs.getString(TBA_SP_CITY) != null ? rs.getString(TBA_SP_CITY) : "");
				orderInfo.setCitynameSpecialProgram(rs.getString(TBA_SP_CITYNAME) != null ? rs.getString(TBA_SP_CITYNAME) : "");
				orderInfo.setStateSpecialProgram(rs.getString(TBA_SP_STATE) != null ? rs.getString(TBA_SP_STATE) : "");
				orderInfo.setPostalCodeSpecialProgram(rs.getString(TBA_SP_POSTALCODE) != null ? rs.getString(TBA_SP_POSTALCODE) : "");
				orderInfo.setDetailSpecialProgram(rs.getString(TBA_SP_DETAIL) != null ? rs.getString(TBA_SP_DETAIL) : "");
				orderInfo.setLatitudeSpecialProgram(rs.getString(TBA_SP_LATITUDE) != null ? rs.getString(TBA_SP_LATITUDE) : "");
				orderInfo.setLongitudeSpecialProgram(rs.getString(TBA_SP_LONGITUDE) != null ? rs.getString(TBA_SP_LONGITUDE) : "");
				result = orderInfo;
			}
		} catch (Exception e) {
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			logger.log(Errores.EXCEPTION_LOCALIZED + e.getLocalizedMessage());
			result = null;
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, rs);
		}
		logger.log("Fin: getOrderInfo");
		return result;
	}

	
	/**
	 * Metodo que obtiene la informacion de Items
	 * 
	 * @param int orderNumber
	 * @return List<ItemInfo> ItemInfo
	 */
	@Override
	public List<ItemInfo> getItemInfo(int orderNumber) {
		List<ItemInfo> result = new ArrayList<>();
		PreparedStatement pstmt = null;
		CallableStatement proc = null;
		ResultSet rs = null;
		Connection dbconn = UtilBKO.createConnection();
		try {
			String sql = "{ "+CALL+" "+ESQUEMA+".sp_get_items_info(?) }";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, orderNumber);
			proc.registerOutParameter(1, Types.OTHER);
			
			logger.log(Constantes.SP_CALL + sql);
			logger.log(Constantes.SP_CALL + "param 1 : " + orderNumber);
			
			proc.execute();
			rs = (ResultSet) proc.getObject(1);
			dbconn.commit();
			
			while (rs.next()) {
				ItemInfo itemInfo = new ItemInfo();
				itemInfo.setIdOrder(rs.getInt(ID_ORDER) > 0 ? rs.getInt(ID_ORDER) : 0);
				itemInfo.setOrderNumber(rs.getInt(ORDERNUMBER) > 0 ? rs.getInt(ORDERNUMBER) : 0);
				itemInfo.setCreationTime(rs.getTimestamp(CREATIONTIME).toString());
				itemInfo.setAmount(rs.getInt(AMOUNT) > 0 ? rs.getInt(AMOUNT) : 0);
				itemInfo.setShippingAmount(rs.getInt(SHIPPINGAMOUNT) > 0 ? rs.getInt(SHIPPINGAMOUNT) : 0);
				itemInfo.setTaxAmount(rs.getInt(TAXAMOUNT) > 0 ? rs.getInt(TAXAMOUNT) : 0);
				itemInfo.setDiscountAmount(rs.getInt(DISCOUNTAMOUNT) > 0 ? rs.getInt(DISCOUNTAMOUNT) : 0);
				itemInfo.setTotal(rs.getInt(TOTAL) > 0 ? rs.getInt(TOTAL) : 0);
				itemInfo.setExecutiveId(rs.getInt(EXECUTIVEID) > 0 ? rs.getInt(EXECUTIVEID) : 0);
				itemInfo.setExecutiveName(rs.getString(EXECUTIVENAME) != null ? rs.getString(EXECUTIVENAME) : "");
				itemInfo.setExecutiveCompanyId(rs.getInt(EXECUTIVECOMPANYID) > 0 ? rs.getInt(EXECUTIVECOMPANYID) : 0);
				itemInfo.setExecutiveLocal(rs.getString(EXECUTIVELOCAL) != null ? rs.getString(EXECUTIVELOCAL) : "");
				itemInfo.setLoyaltyId(rs.getInt(LOYALTYID) > 0 ? rs.getInt(LOYALTYID) : 0);
				itemInfo.setLoyaltyBasePoint(rs.getInt(LOYALTYBASEPOINT) > 0 ? rs.getInt(LOYALTYBASEPOINT) : 0);
				itemInfo.setLoyaltyPayPoint(rs.getInt(LOYALTYPAYPOINT) > 0 ? rs.getInt(LOYALTYPAYPOINT) : 0);
				itemInfo.setLoyaltyPointId(rs.getInt(LOYALTYPOINTID) > 0 ? rs.getInt(LOYALTYPOINTID) : 0);
				itemInfo.setOrderType(rs.getInt(ORDERTYPE) > 0 ? rs.getInt(ORDERTYPE) : 0);
				itemInfo.setDocumentType(rs.getInt(DOCUMENTTYPE) > 0 ? rs.getInt(DOCUMENTTYPE) : 0);
				itemInfo.setLocationId(rs.getInt(LOCATIONID) > 0 ? rs.getInt(LOCATIONID) : 0);
				itemInfo.setTransactionNumber(rs.getInt(TRANSACTIONNUMBER) > 0 ? rs.getInt(TRANSACTIONNUMBER) : 0);
				itemInfo.setTerminalId(rs.getInt(TERMINALID) > 0 ? rs.getInt(TERMINALID) : 0);
				itemInfo.setDteNumber(rs.getInt(DTENUMBER) > 0 ? rs.getInt(DTENUMBER) : 0);
				itemInfo.setDteDate(rs.getDate(DTEDATE).toString());
				itemInfo.setNcDteNumber(rs.getInt(NCDTENUMBER) > 0 ? rs.getInt(NCDTENUMBER) : 0);
				itemInfo.setUrlDte(rs.getString(URLDTE) != null ? rs.getString(URLDTE) : "");
				itemInfo.setUrlNcDte(rs.getString(URLNCDTE) != null ? rs.getString(URLNCDTE) : "");
				
				itemInfo.setIdItem(rs.getInt(ID_ITEM) > 0 ? rs.getInt(ID_ITEM) : 0);
				itemInfo.setIdOrderItem(rs.getInt(TBI_ID_ORDER) > 0 ? rs.getInt(TBI_ID_ORDER) : 0);
				itemInfo.setOrderLine(rs.getInt(ORDERLINE) > 0 ? rs.getInt(ORDERLINE) : 0);
				itemInfo.setSkuItem(rs.getInt(SKU) > 0 ? rs.getInt(SKU) : 0);
				itemInfo.setItemSaleName(rs.getString(ITEMSALENAME) != null ? rs.getString(ITEMSALENAME) : "");
				itemInfo.setShippingType(rs.getInt(TBI_SHIPPINGTYPE) > 0 ? rs.getInt(TBI_SHIPPINGTYPE) : 0);
				itemInfo.setItsGif(rs.getInt(ITSGIF) > 0 ? rs.getInt(ITSGIF) : 0);
				itemInfo.setGiftMessage(rs.getString(GIFTMESSAGE) != null ? rs.getString(GIFTMESSAGE) : "");
				itemInfo.setWarrantyFlag(rs.getInt(WARRANTYFLAG) > 0 ? rs.getInt(WARRANTYFLAG) : 0);
				itemInfo.setWarrantyType(rs.getInt(WARRANTYTYPE) > 0 ? rs.getInt(WARRANTYTYPE) : 0);
				itemInfo.setItsCombo(rs.getInt(ITSCOMBO) > 0 ? rs.getInt(ITSCOMBO) : 0);
				itemInfo.setSkuFather(rs.getString(SKUFATHER) != null ? rs.getString(SKUFATHER) : "");
				itemInfo.setDepartmentId(rs.getInt(DEPARTMENTID) > 0 ? rs.getInt(DEPARTMENTID) : 0);
				itemInfo.setDepartmentName(rs.getString(DEPARTMENTNAME) != null ? rs.getString(DEPARTMENTNAME) : "");
				itemInfo.setPromotionCode(rs.getInt(PROMOTIONCODE) > 0 ? rs.getInt(PROMOTIONCODE) : 0);
				itemInfo.setTypeSku(rs.getInt(TYPESKU) > 0 ? rs.getInt(TYPESKU) : 0);
				itemInfo.setItemCost(rs.getInt(ITEMCOST) > 0 ? rs.getInt(ITEMCOST) : 0);
				itemInfo.setItemQuantity(rs.getInt(ITEMQUANTITY) > 0 ? rs.getInt(ITEMQUANTITY) : 0);
				itemInfo.setItemUnitAmount(rs.getInt(ITEMUNITAMOUNT) > 0 ? rs.getInt(ITEMUNITAMOUNT) : 0);
				itemInfo.setItemUnitdoscount(rs.getInt(ITEMUNITDOSCOUNT) > 0 ? rs.getInt(ITEMUNITDOSCOUNT) : 0);
				itemInfo.setItemTotalDiscount(rs.getInt(ITEMTOTALDISCOUNT) > 0 ? rs.getInt(ITEMTOTALDISCOUNT) : 0);
				itemInfo.setItemDiscountType(rs.getInt(ITEMDISCOUNTTYPE) > 0 ? rs.getInt(ITEMDISCOUNTTYPE) : 0);
				itemInfo.setItemTotalAmount(rs.getInt(ITEMTOTALAMOUNT) > 0 ? rs.getInt(ITEMTOTALAMOUNT) : 0);
				itemInfo.setIdThird(rs.getInt(ID_THIRD) > 0 ? rs.getInt(ID_THIRD) : 0);
				itemInfo.setOrderNumberThird(rs.getInt(TBTH_ORDERNUMBER) > 0 ? rs.getInt(TBTH_ORDERNUMBER) : 0);
				itemInfo.setSku(rs.getInt(TBTH_SKU) > 0 ? rs.getInt(TBTH_SKU) : 0);
				itemInfo.setThirdId(rs.getInt(THIRDID) > 0 ? rs.getInt(THIRDID) : 0);
				itemInfo.setThirdName(rs.getString(THIRDNAME) != null ? rs.getString(THIRDNAME) : "");
				itemInfo.setIdOrderThird(rs.getInt(TBTH_ID_ORDER) > 0 ? rs.getInt(TBTH_ID_ORDER) : 0);
				itemInfo.setIdItemThird(rs.getInt(TBTH_ID_ITEM) > 0 ? rs.getInt(TBTH_ID_ITEM) : 0);
				itemInfo.setTaxAmountTax(rs.getInt(RBIT_TAXAMOUNT) > 0 ? rs.getInt(RBIT_TAXAMOUNT) : 0);
				itemInfo.setIdTax(rs.getInt(ID_TAX) > 0 ? rs.getInt(ID_TAX) : 0);
				itemInfo.setTaxCode(rs.getString(TAXCODE) != null ? rs.getString(TAXCODE) : "");
				itemInfo.setIdShipping(rs.getInt(ID_SHIPPING) > 0 ? rs.getInt(ID_SHIPPING) : 0);
				itemInfo.setShippingEtaDate(rs.getString(SHIPPINGETADATE) != null ? rs.getString(SHIPPINGETADATE) : "");
				itemInfo.setShippingPreparationDate(rs.getString(SHIPPINGPREPARATIONDATE) != null ? rs.getString(SHIPPINGPREPARATIONDATE) : "");
				itemInfo.setShippingDate(rs.getString(SHIPPINGDATE) != null ? rs.getString(SHIPPINGDATE) : "");
				itemInfo.setShippingHour(rs.getString(SHIPPINGHOUR) != null ? rs.getString(SHIPPINGHOUR) : "");
				itemInfo.setItemShipping(rs.getString(ITEMSHIPPING) != null ? rs.getString(ITEMSHIPPING) : "");
				itemInfo.setShippingLine(rs.getInt(SHIPPINGLINE) > 0 ? rs.getInt(SHIPPINGLINE) : 0);
				itemInfo.setShippingOrder(rs.getInt(SHIPPINGORDER) > 0 ? rs.getInt(SHIPPINGORDER) : 0);
				itemInfo.setShippingTypeShipping(rs.getInt(SHIPPINGTYPE) > 0 ? rs.getInt(SHIPPINGTYPE) : 0);
				itemInfo.setShippingIdHolder(rs.getInt(SHIPPINGIDHOLDER) > 0 ? rs.getInt(SHIPPINGIDHOLDER) : 0);
				itemInfo.setShippingName(rs.getString(SHIPPINGNAME) != null ? rs.getString(SHIPPINGNAME) : "");
				itemInfo.setShippingSurname(rs.getString(SHIPPINGSURNAME) != null ? rs.getString(SHIPPINGSURNAME) : "");
				itemInfo.setNameWithDraw(rs.getString(NAMEWITHDRAW) != null ? rs.getString(NAMEWITHDRAW) : "");
				itemInfo.setLastNameRetira(rs.getString(LASTNAMERETIRA) != null ? rs.getString(LASTNAMERETIRA) : "");
				itemInfo.setWithdrawId(rs.getInt(WITHDRAWID) > 0 ? rs.getInt(WITHDRAWID) : 0);
				itemInfo.setStoreId(rs.getInt(STOREID) > 0 ? rs.getInt(STOREID) : 0);
				itemInfo.setPhoneNumber(rs.getLong(PHONENUMBER) > 0 ? rs.getLong(PHONENUMBER) : 0);
				itemInfo.setShippingEmail(rs.getString(SHIPPINGEMAIL) != null ? rs.getString(SHIPPINGEMAIL) : "");
				itemInfo.setShippingObservation(rs.getString(SHIPPINGOBSERVATION) != null ? rs.getString(SHIPPINGOBSERVATION) : "");
				itemInfo.setIdAddress(rs.getInt(ID_ADDRESS) > 0 ? rs.getInt(ID_ADDRESS) : 0);
				itemInfo.setIdAddressRelation(rs.getInt(ID_ADDRESSRELATION) > 0 ? rs.getInt(ID_ADDRESSRELATION) : 0);
				itemInfo.setIdAddressType(rs.getInt(ID_ADDRESSTYPE) > 0 ? rs.getInt(ID_ADDRESSTYPE) : 0);
				itemInfo.setAddress1(rs.getString(ADDRESS_1) != null ? rs.getString(ADDRESS_1) : "");
				itemInfo.setAddress2(rs.getString(ADDRESS_2) != null ? rs.getString(ADDRESS_2) : "");
				itemInfo.setAddress3(rs.getString(ADDRESS_3) != null ? rs.getString(ADDRESS_3) : "");
				itemInfo.setNumber(rs.getString(NUMBER) != null ? rs.getString(NUMBER) : "");
				itemInfo.setCountry(rs.getString(COUNTRY) != null ? rs.getString(COUNTRY) : "");
				itemInfo.setCity(rs.getString(CITY) != null ? rs.getString(CITY) : "");
				itemInfo.setCityName(rs.getString(CITYNAME) != null ? rs.getString(CITYNAME) : "");
				itemInfo.setState(rs.getString(STATE) != null ? rs.getString(STATE) : "");
				itemInfo.setPostalCode(rs.getString(POSTALCODE) != null ? rs.getString(POSTALCODE) : "");
				itemInfo.setDetail(rs.getString(DETAIL) != null ? rs.getString(DETAIL) : "");
				itemInfo.setLatitude(rs.getString(LATITUDE) != null ? rs.getString(LATITUDE) : "");
				itemInfo.setLongitude(rs.getString(LONGITUDE) != null ? rs.getString(LONGITUDE) : "");
				result.add(itemInfo);
			}
			
			logger.log(Constantes.SP_CALL + "response : " + result.toString());
			
		} catch (Exception e) {
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			result = null;
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, rs);
		}

		return result;
	}

	/**
	 * Metodo que obtiene la informacion de los pagos
	 * 
	 * @param int orderNumber
	 * @return List<PaymentInfo> objeto con la informacion de los pagos de la orden
	 */
	@Override
	public List<PaymentInfo> getPaymentInfo(int orderNumber) {
		logger.log("getPaymentInfo");
		List<PaymentInfo> result = new ArrayList<>();
		PreparedStatement pstmt = null;
		CallableStatement proc = null;
		ResultSet rs = null;
		Connection dbconn = UtilBKO.createConnection();
		
		try {
			
			String sql = "{ "+CALL+" "+ESQUEMA+".sp_get_payment_info(?) }";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setInt(1, orderNumber);
			proc.registerOutParameter(1, Types.OTHER);
			
			logger.log(Constantes.SP_CALL + sql);
			logger.log(Constantes.SP_CALL + "param 1 : " + orderNumber);
			
			proc.execute();
			rs = (ResultSet) proc.getObject(1);
			dbconn.commit();
			
			while (rs.next()) {
				PaymentInfo paymentInfo = new PaymentInfo();
				paymentInfo.setIdOrder(rs.getInt(ID_ORDER) > 0 ? rs.getInt(ID_ORDER) : 0);
				paymentInfo.setOrderNumber(rs.getInt(ORDERNUMBER) > 0 ? rs.getInt(ORDERNUMBER) : 0);
				paymentInfo.setCreationTime(rs.getTimestamp(CREATIONTIME).toString());
				paymentInfo.setAmount(rs.getInt(AMOUNT) > 0 ? rs.getInt(AMOUNT) : 0);
				paymentInfo.setShippingAmount(rs.getInt(SHIPPINGAMOUNT) > 0 ? rs.getInt(SHIPPINGAMOUNT) : 0);
				paymentInfo.setTaxAmount(rs.getInt(TAXAMOUNT) > 0 ? rs.getInt(TAXAMOUNT) : 0);
				paymentInfo.setDiscountAmount(rs.getInt(DISCOUNTAMOUNT) > 0 ? rs.getInt(DISCOUNTAMOUNT) : 0);
				paymentInfo.setTotal(rs.getInt(TOTAL) > 0 ? rs.getInt(TOTAL) : 0);
				paymentInfo.setExecutiveId(rs.getInt(EXECUTIVEID) > 0 ? rs.getInt(EXECUTIVEID) : 0);
				paymentInfo.setExecutiveName(rs.getString(EXECUTIVENAME) != null ? rs.getString(EXECUTIVENAME) : "");
				paymentInfo.setExecutiveCompanyId(rs.getInt(EXECUTIVECOMPANYID) > 0 ? rs.getInt(EXECUTIVECOMPANYID) : 0);
				paymentInfo.setExecutiveLocal(rs.getString(EXECUTIVELOCAL) != null ? rs.getString(EXECUTIVELOCAL) : "");
				paymentInfo.setLoyaltyId(rs.getInt(LOYALTYID) > 0 ? rs.getInt(LOYALTYID) : 0);
				paymentInfo.setLoyaltyBasePoint(rs.getInt(LOYALTYBASEPOINT) > 0 ? rs.getInt(LOYALTYBASEPOINT) : 0);
				paymentInfo.setLoyaltyPayPoint(rs.getInt(LOYALTYPAYPOINT) > 0 ? rs.getInt(LOYALTYPAYPOINT) : 0);
				paymentInfo.setLoyaltyPointId(rs.getInt(LOYALTYPOINTID) > 0 ? rs.getInt(LOYALTYPOINTID) : 0);
				paymentInfo.setOrderType(rs.getInt(ORDERTYPE) > 0 ? rs.getInt(ORDERTYPE) : 0);
				paymentInfo.setDocumentType(rs.getInt(DOCUMENTTYPE) > 0 ? rs.getInt(DOCUMENTTYPE) : 0);
				paymentInfo.setLocationId(rs.getInt(LOCATIONID) > 0 ? rs.getInt(LOCATIONID) : 0);
				paymentInfo.setTransactionNumber(rs.getInt(TRANSACTIONNUMBER) > 0 ? rs.getInt(TRANSACTIONNUMBER) : 0);
				paymentInfo.setTerminalId(rs.getInt(TERMINALID) > 0 ? rs.getInt(TERMINALID) : 0);
				paymentInfo.setDteNumber(rs.getInt(DTENUMBER) > 0 ? rs.getInt(DTENUMBER) : 0);
				paymentInfo.setDteDate(rs.getDate(DTEDATE).toString());
				paymentInfo.setNcDteNumber(rs.getInt(NCDTENUMBER) > 0 ? rs.getInt(NCDTENUMBER) : 0);
				paymentInfo.setUrlDte(rs.getString(URLDTE) != null ? rs.getString(URLDTE) : "");
				paymentInfo.setUrlNcDte(rs.getString(URLNCDTE) != null ? rs.getString(URLNCDTE) : "");
				paymentInfo.setIdOrderPayment(rs.getInt(ID_ORDERPAYMENT) > 0 ? rs.getInt(ID_ORDERPAYMENT) : 0);
				paymentInfo.setIdOrderRelPayment(rs.getInt(RBOP_ID_ORDER) > 0 ? rs.getInt(RBOP_ID_ORDER) : 0);
				paymentInfo.setIdChannel(rs.getInt(ID_CHANNEL) > 0 ? rs.getInt(ID_CHANNEL) : 0);
				paymentInfo.setIdStore(rs.getInt(ID_STORE) > 0 ? rs.getInt(ID_STORE) : 0);
				paymentInfo.setIdTransactio(rs.getInt(RBOP_ID_TRANSACTION) > 0 ? rs.getInt(RBOP_ID_TRANSACTION) : 0);
				paymentInfo.setIdPayment(rs.getInt(RBOP_ID_PAYMENT) > 0 ? rs.getInt(RBOP_ID_PAYMENT) : 0);
				paymentInfo.setIdCurrency(rs.getInt(RBOP_ID_CURRENCY) > 0 ? rs.getInt(RBOP_ID_CURRENCY) : 0);
				paymentInfo.setConexionType(rs.getInt(CONEXIONTYPE) > 0 ? rs.getInt(CONEXIONTYPE) : 0);
				paymentInfo.setPaymentType(rs.getInt(PAYMENTTYPE) > 0 ? rs.getInt(PAYMENTTYPE) : 0);
				paymentInfo.setUniqueNumberTrx(rs.getInt(UNIQUENUMBERTRX) > 0 ? rs.getInt(UNIQUENUMBERTRX) : 0);
				paymentInfo.setAuthorizationCode(rs.getInt(AUTHORIZATIONCODE) > 0 ? rs.getInt(AUTHORIZATIONCODE) : 0);
				paymentInfo.setAgreementCode(rs.getInt(AGREEMENTCODE) > 0 ? rs.getInt(AGREEMENTCODE) : 0);
				paymentInfo.setCardNumber(rs.getInt(CARDNUMBER) > 0 ? rs.getInt(CARDNUMBER) : 0);
				paymentInfo.setBin(rs.getInt(BIN) > 0 ? rs.getInt(BIN) : 0);
				paymentInfo.setIdHolder(rs.getInt(IDHOLDER) > 0 ? rs.getInt(IDHOLDER) : 0);
				paymentInfo.setObservations(rs.getString(OBSERVATIONS) != null ? rs.getString(OBSERVATIONS) : "");
				paymentInfo.setPayTotalAmount(rs.getInt(PAYTOTALAMOUNT) > 0 ? rs.getInt(PAYTOTALAMOUNT) : 0);
				paymentInfo.setPayAmount(rs.getInt(PAYAMOUNT) > 0 ? rs.getInt(PAYAMOUNT) : 0);
				paymentInfo.setPayAmountfee(rs.getInt(PAYAMOUNTFEE) > 0 ? rs.getInt(PAYAMOUNTFEE) : 0);
				paymentInfo.setPayFeeType(rs.getInt(PAYFEETYPE) > 0 ? rs.getInt(PAYFEETYPE) : 0);
				paymentInfo.setPayfees(rs.getInt(PAYFEES) > 0 ? rs.getInt(PAYFEES) : 0);
				paymentInfo.setPayDeFerrefMonths(rs.getInt(PAYDEFERREFMONTHS) > 0 ? rs.getInt(PAYDEFERREFMONTHS) : 0);
				paymentInfo.setPayFirstExpirationFee(rs.getInt(PAYFIRSTEXPIRATIONFEE) > 0 ? rs.getInt(PAYFIRSTEXPIRATIONFEE) : 0);
				paymentInfo.setPayRate(rs.getInt(PAYRATE) > 0 ? rs.getInt(PAYRATE) : 0);
				paymentInfo.setBonusGc(rs.getInt(BONUSGC) > 0 ? rs.getInt(BONUSGC) : 0);
				paymentInfo.setIdPayment2(rs.getInt(ID_PAYMENT) > 0 ? rs.getInt(ID_PAYMENT) : 0);
				paymentInfo.setInternatId(rs.getInt(INTERNATID) > 0 ? rs.getInt(INTERNATID) : 0);
				paymentInfo.setNamePayment(rs.getString(CBP_NAME) != null ? rs.getString(CBP_NAME) : "");
				paymentInfo.setIdCurrency2(rs.getInt(ID_CURRENCY) > 0 ? rs.getInt(ID_CURRENCY) : 0);
				paymentInfo.setCurrencyCode(rs.getString(CURRENCYCODE) != null ? rs.getString(CURRENCYCODE) : "");
				paymentInfo.setNameCurrency(rs.getString(CBC_NAME) != null ? rs.getString(CBC_NAME) : "");
				paymentInfo.setIdTransaction(rs.getInt(ID_TRANSACTION) > 0 ? rs.getInt(ID_TRANSACTION) : 0);
				paymentInfo.setName(rs.getString(CBT_NAME) != null ? rs.getString(CBT_NAME) : "");
				paymentInfo.setIdPromotion(rs.getInt(ID_PROMOTION) > 0 ? rs.getInt(ID_PROMOTION) : 0);
				paymentInfo.setIdOrderPromotion(rs.getInt(TBP_ID_ORDER) > 0 ? rs.getInt(TBP_ID_ORDER) : 0);
				paymentInfo.setPromotionCode(rs.getString(PROMOTIONCODE) != null ? rs.getString(PROMOTIONCODE) : "");
				result.add(paymentInfo);
			}
			
			logger.log(Constantes.SP_CALL + "response : " + result.toString());
			
		} catch (Exception e) {
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			result = null;
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, rs);
		}

		return result;
	}


	/**
	 * Metodo que obtiene la informacion de ordenes con el flujo 
	 * 
	 * @param int orderNumber
	 * @param int idStore
	 * @return OrderInfo objeto con la informacion de las ordenes
	 */
	public OrderFlujoInfo getOrderFlujoInfo(String orderNumber) {
		logger.log("getOrderFlujoInfo");
		OrderFlujoInfo result = null;
		PreparedStatement pstmt = null;
		CallableStatement proc = null;
		ResultSet rs = null;
		Connection dbconn = UtilBKO.createConnection();
		try {
			String sql = "{ call "+ESQUEMA+".sp_get_order_info_flujo(?) }";
			dbconn.setAutoCommit(false);
			pstmt = dbconn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			proc = dbconn.prepareCall(sql);
			proc.setString(1, orderNumber);
			proc.registerOutParameter(1, Types.OTHER);
			proc.execute();
			rs = (ResultSet) proc.getObject(1);
			dbconn.commit();
			while (rs.next()) {
				OrderFlujoInfo orderFlujoInfo = new OrderFlujoInfo();
				orderFlujoInfo.setOrderNumber(rs.getInt(ORDERNUMBER) > 0 ? rs.getInt(ORDERNUMBER) : 0);
				orderFlujoInfo.setStatus(rs.getString("status"));
				orderFlujoInfo.setCreationTime(rs.getString(CREATIONTIME));
				orderFlujoInfo.setOrdertype(rs.getString(ORDERTYPE));
				orderFlujoInfo.setOrderStatus(rs.getInt("orderstatus"));
				result = orderFlujoInfo;
			}
		} catch (Exception e) {
			logger.log(Errores.MENSAJE_ERROR_DAO);
			logger.log(Errores.EXCEPTION_MESSAGE + e.getMessage());
			logger.log(Errores.EXCEPTION_LOCALIZED + e.getLocalizedMessage());
			result = null;
		} finally {
			UtilBKO.closeAll(dbconn, pstmt, null, proc, rs);
		}
		logger.log("Fin: getOrderFlujoInfo");
		return result;
	}

}
