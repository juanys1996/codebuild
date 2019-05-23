package cl.aligare.is.api.test.job;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import cl.aligare.is.api.constantes.Constantes;
import cl.aligare.is.api.constantes.Errores;
import cl.aligare.is.api.dao.impl.ConsultaDaoImpl;
import cl.aligare.is.api.dao.impl.ValidarDaoImpl;
import cl.aligare.is.api.services.BKOServices;
import cl.aligare.is.api.to.OrderFlujoInfo;
import cl.aligare.is.api.to.request.BodyReq;
import cl.aligare.is.api.to.response.BodyResp;
import cl.aligare.is.api.util.UtilBKO;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaConsultationKioscoTest {

	//private static final String SAMPLE_INPUT_STRING = " {\"trxHdr\": {\"version\": \"1.0\",\"context\": {\"idCompany\": \"CENCOSUD\",\"idCountry\": \"CL\",\"idStore\": \"PARIS\",\"idChannel\": \"WWW\"},\"trxClientExecDate\": \"2018-06-07 16:27:27.110\"},\"trxIdentify\": {\"orderType\": 1,\"idEvent\": 1,\"idOrder\": 63},\"trxOrigin\": { \"filename\": \"order_export_20181012201101277.xml\",\"incomingDate\": \"2018/10/12 20:11:04:362\"},\"trxData\": {\"ordertype\": {\"orderNumber\": 63,\"creationTime\": \"2018-10-12 19:56:33.000\",\"initialStatus\": 0,\"orderType\": 1,\"documentType\": 33,\"locationId\": 32},\"executive\": {\"executiveId\": \" \",\"executiveName\": \"storefront\",\"executiveCompanyId\": \" \",\"executiveLocal\": 0},\"amountInfo\": {\"amount\": 5866,\"shippingAmount\": 3990,\"taxAmount\": 1114,\"discountAmount\": 0,\"total\": 6980},\"loyalty\": {\"associatedId\": \"189327609\",\"basePoint\": 0,\"paymentPoint\": 0,\"pointId\": \"0\"},\"specialProgram\": {\"specialProgramType\": 0,\"specialProgramId\": 0,\"names1\": \"\",\"names2\": \"\",\"email1\": \"\",\"email2\": \"\",\"messageText\": \"\",\"isGift\": 0,\"address\": {\"address1\": \"\",\"address2\": \" \",\"address3\": \" \",\"number\": \" \",\"country\": \"\",\"citycode\": 0,\"cityName\": \"\",\"state\": 0,\"postalCode\": 0,\"detail\": \" \"}},\"customer\": {\"customerId\": \"189327609\",\"foreignFlag\": 0,\"foreignCountry\": \"CL\",\"firstName\": \"Javiera\",\"middleName\": \"\",\"lastName\": \"Uribe\",\"email\": \"jgarrido@aligare.cl\",\"emailFlag\": \"0\",\"phoneNumber1\": \"+56951482359\",\"phoneNumber2\": \"\",\"address\": {\"address1\": \"Sebastián Elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \"\",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"detail\": \" \"}},\"company\": {\"companyId\": \"189327609\",\"companyName\": \"Javiera\",\"companyTurn\": \"Javiera\",\"contactFullName\": \"Javiera\",\"phoneNumber\": \"+56951482359\",\"companyEmail\": \"javiera.uribevaldez@cencosud.cl\",\"address\": {\"address1\": \"Sebastián elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \" \",\"country\": \" \",\"citycode\": 0,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"detail\": \" \"}},\"itemSale\": {\"shippingOrderNumber\": \" 200040296\",\"itemsNumbers\": 0,\"promotion\": {},\"item\": [{\"itemId\": 1,\"sku\": 124009999,\"itemSaleName\": \"Toalla de Mano 45 x 90 Crudo 500 grs Lourdes\",\"shippingType\": 1,\"itsGif\": 0,\"giftMessage\": \" \",\"warrantyFlag\": 0,\"warrantyType\": 0,\"ItsCombo\": 0,\"skuFather\": 0,\"departmentId\": 721,\"departmentName\": \"BLANCO\",\"promotionCode\": \" \",\"typeSKU\": 1,\"amountInfo\": {\"cost\": 0,\"quantity\": 100,\"unitAmount\": 2990,\"unitDiscountAmount\": 0,\"totalDiscountAmount\": 0,\"typeDiscount\": 0,\"totalItemAmount\": 2990},\"attributes\": {\"attribute\": [{\"name\": \" \",\"value\": \" \"}]},\"third\": {\"thirdOrderNumber\": \" \",\"skuThird\": \" \",\"thirdId\": \"\",\"thirdName\": \" \"},\"taxes\": {\"tax\": {\"taxCode\": \"\",\"taxAmount\": 0}},\"shipping\": {\"shippingETADate\": \" \",\"shippingPreparationDate\": \" \",\"shippingDate\": \" \",\"shippingHour\": \" \",\"shippingLine\": 1,\"shippingOrder\": \"200040296\",\"shippingType\": 0,\"shippingIdHolder\": \"189327609\",\"shippingName\": \"Javiera\",\"shippingSurname\": \"Uribe\",\"phoneNumber\": \"+56951482359\",\"shippingEmail\": \"javiera.uribevaldez@cencosud.cl\",\"shippingObservation\": \" \",\"nameWithdraw\": \" \",\"lastNameRetira\": \" \",\"withdrawId\": \" \",\"storeId\": 0,\"address\": {\"address1\": \" \",\"address2\": \"Sebastián Elcano 1137\",\"address3\": \"1803\",\"number\": \" \",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"latitude\": \"-33.4197762\",\"longitude\": \"-70.57193910000001\",\"detail\": \" \"}}}, {\"itemId\": 2,\"sku\": 97721999,\"itemSaleName\": \"Shipping\",\"shippingType\": 1,\"itsGif\": 0,\"giftMessage\": \" \",\"warrantyFlag\": 0,\"warrantyType\": 0,\"ItsCombo\": 0,\"skuFather\": 0,\"departmentId\": 0,\"departmentName\": \"\",\"promotionCode\": \" \",\"typeSKU\": 5,\"amountInfo\": {\"cost\": 0,\"quantity\": 1,\"unitAmount\": 3990,\"unitDiscountAmount\": 0,\"totalDiscountAmount\": 0,\"typeDiscount\": 0,\"totalItemAmount\": 3990},\"attributes\": {\"attribute\": [{\"name\": \" \",\"value\": \" \"}]},\"third\": {\"thirdOrderNumber\": \" \",\"skuThird\": \" \",\"thirdId\": \" \",\"thirdName\": \" \"},\"taxes\": {\"tax\": {\"taxCode\": \"\",\"taxAmount\": 0}},\"shipping\": {\"shippingETADate\": \" \",\"shippingPreparationDate\": \" \",\"shippingDate\": \" \",\"shippingHour\": \" \",\"shippingLine\": 0,\"shippingOrder\": \"200040296\",\"shippingType\": 0,\"shippingIdHolder\": \"189327609\",\"shippingName\": \"Javiera\",\"shippingSurname\": \"Uribe\",\"phoneNumber\": \"+56951482359\",\"shippingEmail\": \"javiera.uribevaldez@cencosud.cl\",\"shippingObservation\": \" \",\"nameWithdraw\": \" \",\"lastNameRetira\": \" \",\"withdrawId\": \" \",\"storeId\": 0,\"address\": {\"address1\": \"Sebastián Elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \" \",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"latitude\": \"-33.4197762\",\"longitude\": \"-70.57193910000001\",\"detail\": \" \"}}}]},\"paymentGroups\": {\"payment\": [{\"conexionType\": 1,\"paymentType\": 20,\"currencyCode\": \"CLP\",\"amountInfo\": {\"totalAmount\": 6980,\"amount\": 6980,\"amountFee\": 0,\"typeFee\": 0,\"fees\": 1,\"deferredMonths\": 0,\"firstExpirationDate\": 0,\"rate\": 0},\"uniqueNumberTrx\": \"5393741944036854904084\",\"authorizationCode\": \"708554\",\"agreementCode\": \"\",\"cardNumber\": \"3151\",\"bin\": 522832,\"IdHolder\": \"189327609\",\"observations\": \" \",\"bonusGC\": \"0\"}]}}} ";
	//private static final String SAMPLE_INPUT_STRING = " {\"trxHdr\": {\"version\": \"1.0\",\"context\": {\"idCompany\": \"CENCOSUD\",\"idCountry\": \"CL\",\"idStore\": \"PARIS\",\"idChannel\": \"WWW\"},\"trxClientExecDate\": \"2018-06-07 16:27:27.110\"},\"trxIdentify\": {\"orderType\": 1,\"idEvent\": 1,\"idOrder\": 1002},\"trxOrigin\": { \"filename\": \"order_export_20181012201101277.xml\",\"incomingDate\": \"2018/10/12 20:11:04:362\"},\"trxData\": {\"ordertype\": {\"orderNumber\": 1002,\"creationTime\": \"2018-10-12 19:56:33.000\",\"initialStatus\": 0,\"orderType\": 1,\"documentType\": 33,\"locationId\": 32},\"executive\": {\"executiveId\": \" \",\"executiveName\": \"storefront\",\"executiveCompanyId\": \"189327609\",\"executiveLocal\": 0},\"amountInfo\": {\"amount\": 5866,\"shippingAmount\": 3990,\"taxAmount\": 1114,\"discountAmount\": 0,\"total\": 6980},\"loyalty\": {\"associatedId\": \"189327609\",\"basePoint\": 0,\"paymentPoint\": 0,\"pointId\": \"0\"},\"specialProgram\": {\"specialProgramType\": 0,\"specialProgramId\": 0,\"names1\": \"\",\"names2\": \"\",\"email1\": \"\",\"email2\": \"\",\"messageText\": \"\",\"isGift\": 0,\"address\": {\"address1\": \"\",\"address2\": \" \",\"address3\": \" \",\"number\": \" \",\"country\": \"\",\"citycode\": 0,\"cityName\": \"\",\"state\": 0,\"postalCode\": 0,\"detail\": \" \"}},\"customer\": {\"customerId\": \"189327609\",\"foreignFlag\": 0,\"foreignCountry\": \"CL\",\"firstName\": \"Javiera\",\"middleName\": \"\",\"lastName\": \"Uribe\",\"email\": \"jgarrido@aligare.cl\",\"emailFlag\": \"0\",\"phoneNumber1\": \"+56951482359\",\"phoneNumber2\": \"\",\"address\": {\"address1\": \"Sebastián Elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \"\",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"detail\": \" \"}},\"company\": {\"companyId\": \"189327609\",\"companyName\": \"Javiera\",\"companyTurn\": \"Javiera\",\"contactFullName\": \"Javiera\",\"phoneNumber\": \"+56951482359\",\"companyEmail\": \"javiera.uribevaldez@cencosud.cl\",\"address\": {\"address1\": \"Sebastián elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \" \",\"country\": \" \",\"citycode\": 0,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"detail\": \" \"}},\"itemSale\": {\"shippingOrderNumber\": \" 200040296\",\"itemsNumbers\": 0,\"promotion\": { \"promotionCode\":\"xxx\"},\"item\": [{\"itemId\": 1,\"sku\": 124009999,\"itemSaleName\": \"Toalla de Mano 45 x 90 Crudo 500 grs Lourdes\",\"shippingType\": 1,\"itsGif\": 0,\"giftMessage\": \" \",\"warrantyFlag\": 0,\"warrantyType\": 0,\"ItsCombo\": 0,\"skuFather\": 0,\"departmentId\": 721,\"departmentName\": \"BLANCO\",\"promotionCode\": \" \",\"typeSKU\": 1,\"amountInfo\": {\"cost\": 0,\"quantity\": 100,\"unitAmount\": 2990,\"unitDiscountAmount\": 0,\"totalDiscountAmount\": 0,\"typeDiscount\": 0,\"totalItemAmount\": 2990},\"attributes\": {\"attribute\": [{\"name\": \" \",\"value\": \" \"}]},\"third\": {\"thirdOrderNumber\": \" \",\"skuThird\": \" \",\"thirdId\": \"\",\"thirdName\": \" \"},\"taxes\": {\"tax\": {\"taxCode\": \"\",\"taxAmount\": 0}},\"shipping\": {\"shippingETADate\": \" \",\"shippingPreparationDate\": \" \",\"shippingDate\": \" \",\"shippingHour\": \" \",\"shippingLine\": 1,\"shippingOrder\": \"200040296\",\"shippingType\": 0,\"shippingIdHolder\": \"189327609\",\"shippingName\": \"Javiera\",\"shippingSurname\": \"Uribe\",\"phoneNumber\": \"+56951482359\",\"shippingEmail\": \"javiera.uribevaldez@cencosud.cl\",\"shippingObservation\": \" \",\"nameWithdraw\": \" \",\"lastNameRetira\": \" \",\"withdrawId\": \" \",\"storeId\": 0,\"address\": {\"address1\": \" \",\"address2\": \"Sebastián Elcano 1137\",\"address3\": \"1803\",\"number\": \" \",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"latitude\": \"-33.4197762\",\"longitude\": \"-70.57193910000001\",\"detail\": \" \"}}}, {\"itemId\": 2,\"sku\": 97721999,\"itemSaleName\": \"Shipping\",\"shippingType\": 1,\"itsGif\": 0,\"giftMessage\": \" \",\"warrantyFlag\": 0,\"warrantyType\": 0,\"ItsCombo\": 0,\"skuFather\": 0,\"departmentId\": 0,\"departmentName\": \"\",\"promotionCode\": \" \",\"typeSKU\": 5,\"amountInfo\": {\"cost\": 0,\"quantity\": 1,\"unitAmount\": 3990,\"unitDiscountAmount\": 0,\"totalDiscountAmount\": 0,\"typeDiscount\": 0,\"totalItemAmount\": 3990},\"attributes\": {\"attribute\": [{\"name\": \" \",\"value\": \" \"}]},\"third\": {\"thirdOrderNumber\": \" \",\"skuThird\": \" \",\"thirdId\": \" \",\"thirdName\": \" \"},\"taxes\": {\"tax\": {\"taxCode\": \"\",\"taxAmount\": 0}},\"shipping\": {\"shippingETADate\": \" \",\"shippingPreparationDate\": \" \",\"shippingDate\": \" \",\"shippingHour\": \" \",\"shippingLine\": 0,\"shippingOrder\": \"200040296\",\"shippingType\": 0,\"shippingIdHolder\": \"189327609\",\"shippingName\": \"Javiera\",\"shippingSurname\": \"Uribe\",\"phoneNumber\": \"+56951482359\",\"shippingEmail\": \"javiera.uribevaldez@cencosud.cl\",\"shippingObservation\": \" \",\"nameWithdraw\": \" \",\"lastNameRetira\": \" \",\"withdrawId\": \" \",\"storeId\": 0,\"address\": {\"address1\": \"Sebastián Elcano 1137\",\"address2\": \" \",\"address3\": \"1803\",\"number\": \" \",\"country\": \"CL\",\"citycode\": 130106,\"cityName\": \"LAS CONDES\",\"state\": 13,\"postalCode\": 0,\"latitude\": \"-33.4197762\",\"longitude\": \"-70.57193910000001\",\"detail\": \" \"}}}]},\"paymentGroups\": {\"payment\": [{\"conexionType\": 1,\"paymentType\": 20,\"currencyCode\": \"CLP\",\"amountInfo\": {\"totalAmount\": 6980,\"amount\": 6980,\"amountFee\": 0,\"typeFee\": 0,\"fees\": 1,\"deferredMonths\": 0,\"firstExpirationDate\": 0,\"rate\": 0},\"uniqueNumberTrx\": \"5393741944036854904084\",\"authorizationCode\": \"708554\",\"agreementCode\": \"\",\"cardNumber\": \"522832\",\"bin\": 0,\"IdHolder\": \"150982138\",\"observations\": \" \",\"bonusGC\": \"0\", \"purchaseId\": \"c98e121e-d85a-45bf-af7e-9779e15384a6\"}]}}} ";
	private static final String SAMPLE_INPUT_STRING = " {\"trxHdr\": {\"version\": \"1.0\",\"context\": {\"idCompany\": \"CENCOSUD\",\"idCountry\": \"CL\",\"idStore\": \"PARIS\",\"idChannel\": \"KIOSCOS\"},\"trxClientExecDate\": \"2018-11-24 01:41:16.000\"},\"trxIdentify\": {\"idOrder\": \"191914110\", \"trxOrigin\": { \"filename\": \"order_export_20181012201101277.xml\",\"incomingDate\": \"2018/10/12 20:11:04:362\"}}}";

	
	/** Objeto que gestiona el contexto del log */
	private static TestContext context = new TestContext();
	
	/** Variable que gestiona la impresion del log */
	private static final LambdaLogger logger = context.getLogger();
	
	/** Objeto que inicializa el dao de  Validar  */
	private static ValidarDaoImpl validarDao = new ValidarDaoImpl();
	
	/** Objeto que inicializa el dao de  Guardar  */
	private static ConsultaDaoImpl consutaDao = new ConsultaDaoImpl();

	@Test
	public void testLambdaFunctionHandler() throws IOException {
		logger.log("Inicio lambda_bko_consultation_kiosco\n");
		BodyResp bodyResp = new BodyResp();
		ObjectMapper mapperRequest = new ObjectMapper();
		ObjectMapper mapperResponse = new ObjectMapper();
		StringWriter stringResponse = new StringWriter();
		StringWriter stringRequest = new StringWriter();
		InputStream inputStream = new ByteArrayInputStream(SAMPLE_INPUT_STRING.getBytes());
		String request = null;
		try {
			request = UtilBKO.getStringFromInputStream(inputStream);
			logger.log("request " + request);
			
			// convertir json cadena a objeto Request
			BodyReq eRequest = mapperRequest.readValue(request, BodyReq.class);
			logger.log("Lambda lambda_bko_consultation_kiosco: " + eRequest.getTrxIdentify().getIdOrder());
			
			// configurar asignador de objetos para impresión bonita
			mapperRequest.configure(SerializationFeature.INDENT_OUTPUT, true);
			
			// escribiendo en consola, escribir el flujo de entrada Request
			mapperRequest.writeValue(stringRequest, eRequest);
			
			// Se ejecuta el envio del mensaje y se obtiene una respuesta
			BodyResp eResponse = mapperResponse.readValue(request, BodyResp.class);
			eResponse.setTrxIdentify(null);
			eResponse.setTrxHdr(null);
			
			// Validamos el contexto
			if (validarDao.validateContext(eRequest.getTrxHdr().getContext().getIdCompany(),
					eRequest.getTrxHdr().getContext().getIdStore(), eRequest.getTrxHdr().getContext().getIdChannel(),
					eRequest.getTrxHdr().getContext().getIdCountry()))
			{
				// Se Valida que el numero de orden exista en el MTD
				if (validarDao.validateOrder(eRequest.getTrxIdentify().getIdOrder()))
				{
					// Se Valida que el numero de orden sea kiosco			  
					if (validarDao.validateOrderKiosco(eRequest.getTrxIdentify().getIdOrder()))
					{
						
						OrderFlujoInfo orderFlujoInfo = consutaDao.getOrderFlujoInfo(String.valueOf(eRequest.getTrxIdentify().getIdOrder()));
						
						logger.log("status " + orderFlujoInfo.getStatus());
						logger.log("Numero de Orden " + eRequest.getTrxIdentify().getIdOrder());
						
						eResponse.setOrderStatus(String.valueOf(orderFlujoInfo.getOrderStatus()));
						eResponse.setStatus(Constantes.CODIGO_EXITO);
						eResponse.setMessage(orderFlujoInfo.getStatus());
					
						
					} else {
						eResponse.setOrderStatus(Constantes.CODIGO_ERROR_VACIO);
						eResponse.setStatus(Constantes.CODIGO_ERROR);
						eResponse.setMessage(Constantes.MENSAJE_ERROR);
					}
				} else 
				{
					logger.log("Algo fallo en la BD al validar el numero de orden");
					eResponse.setOrderStatus(Constantes.CODIGO_ERROR_VACIO);
					eResponse.setStatus(Constantes.CODIGO_ERROR_ORDEN_EXISTENTE);
					eResponse.setMessage(Constantes.MENSAJE_ERROR_ORDEN_EXISTENTE);
				}
			} else 
			{
				logger.log("Algo fallo en la BD al validar el contexto");
				eResponse.setOrderStatus(Constantes.CODIGO_ERROR_VACIO);
				eResponse.setStatus(Constantes.CODIGO_ERROR_CONTEXTO_NO_VALIDO);
				eResponse.setMessage(Constantes.MENSAJE_ERROR_CONTEXTO_NO_VALIDO);
			}
			// configurar asignador de objetos para impresión bonita
			mapperResponse.configure(SerializationFeature.INDENT_OUTPUT, true);
			// escribiendo en consola, puede escribir en cualquier flujo de
			mapperResponse.writeValue(stringResponse, eResponse);
			
			assertNotNull("Resultado es null", eResponse);
			assertTrue("Resultado falla", eResponse.getStatus() != "200");
			
			
		} catch (Exception ex) 
		{
	    	logger.log(Errores.MENSAJE_ERROR_SERVICES);
			logger.log(Errores.EXCEPTION_MESSAGE + ex.getMessage());
			bodyResp = BKOServices.respuestaGenerica(String.valueOf(Constantes.CODIGO_ERROR_GENERAL), Errores.EXCEPTION_MESSAGE + ex.getMessage());

			mapperResponse.configure(SerializationFeature.INDENT_OUTPUT, true);
			mapperResponse.writeValue(stringResponse, bodyResp);
			
			Assert.fail(ex.getMessage());	
		} 
		logger.log("\n Response: " + stringResponse);
		// OutputStreamWriter writer = new OutputStreamWriter(outputStream,
		// "UTF-8");
		// writer.write(stringResponse.toString());
		// writer.close();

	}
}
