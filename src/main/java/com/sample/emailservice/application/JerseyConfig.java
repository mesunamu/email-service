package com.sample.emailservice.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.sample.emailservice.restapi.EmailService;

@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(EmailService.class);
	}
	
}
