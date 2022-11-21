package com.example.demows;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.jws.WebService;

@WebService(
		serviceName = "CalcHashFileService",
		portName = "CalcHashFilePort",
		targetNamespace = "http://service.ws.sample/",
		endpointInterface = "com.example.demows.CalcHashFileService" )
public class CalcHashFileServiceImpl implements CalcHashFileService {
	
	@Override
	public String calcHashFile(String pathToFile) throws IOException, NoSuchAlgorithmException 
	{
		MessageDigest md = MessageDigest.getInstance("MD5");
		File file = new File(pathToFile);
		FileInputStream fis = new FileInputStream(file);
		 
        byte[] byteArray = new byte[1024];
        int bytesCount = 0;
 
        while ((bytesCount = fis.read(byteArray)) != -1)
        {
            md.update(byteArray, 0, bytesCount);
        };
 
        fis.close();
		
		byte[] digest = md.digest();
		StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digest.length; i++) {
            sb.append(Integer
                    .toString((digest[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
 
        return sb.toString();
	}
}
 