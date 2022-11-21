package com.example.demows;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.ws.sample/", name = "CalcHashFileService")
public interface CalcHashFileService {
	
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(
			localName = "calcHashFile",
			targetNamespace = "http://service.ws.sample/",
			className = "com.example.demows.RequestCalcHashFile")
	@WebMethod(action = "urn:CalcHashFile")
	@ResponseWrapper(
			localName = "calcHashFileResponse",
			targetNamespace = "http://service.ws.sample/",
			className = "com.example.demows.CalcHashFileResponse")
	String calcHashFile(@WebParam(name = "name", targetNamespace = "") String pathToFile) throws IOException, NoSuchAlgorithmException;

}
