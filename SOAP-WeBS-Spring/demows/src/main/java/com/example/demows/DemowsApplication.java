package com.example.demows;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemowsApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException

	{
		SpringApplication.run(DemowsApplication.class, args);
		CalcHashFileServiceImpl sent = new CalcHashFileServiceImpl();
		System.out.println(sent.calcHashFile("Akbota_Mautkazy_CV.docx"));
		    
	}

}
