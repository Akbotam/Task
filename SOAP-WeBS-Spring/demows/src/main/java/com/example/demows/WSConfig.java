package com.example.demows;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WSConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint calcHashFileEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new CalcHashFileServiceImpl());
		endpoint.publish("/ServiceCalcHashFile");
		
		return endpoint;
	}

}
