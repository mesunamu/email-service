package com.sample.emailservice.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sample.emailservice.model.BaseResponse;

@Path("/email")
public class EmailService {
	
	BaseResponse response = new BaseResponse();
	
	@GET
	@Path("/ping")
	@Produces(MediaType.APPLICATION_JSON)
	public BaseResponse ping() {
		response.setResponse("Ping Success...");
		return response;
	}

}
