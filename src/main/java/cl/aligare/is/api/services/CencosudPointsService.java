package cl.aligare.is.api.services;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

import cl.aligare.is.api.to.request.BodyReq;
import cl.aligare.is.api.to.response.BodyResp;

public interface CencosudPointsService {
	@LambdaFunction
	BodyResp calculatePoints(BodyReq request);
}
