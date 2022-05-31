package com.deploy.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class WelcomeLambda implements RequestHandler<Object, Object> {

	@Override
	public Object handleRequest(Object input, Context context) {
		System.out.println("Welcome to Lambda funtion  from our Maven Project");
		return null;
	}
  
}
