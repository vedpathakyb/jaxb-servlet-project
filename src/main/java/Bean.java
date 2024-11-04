package com;
import java.util.Date;
import java.io.IOException;
import jakarta.xml.bind.*;
//import javax.xml.bind.*;
import java.io.File;

/*  import javax.jws.WebMethod;
  import javax.jws.WebParam;
  import javax.jws.WebResult;
  import javax.jws.WebService;
  import javax.jws.soap.SOAPBinding;
  import javax.xml.bind.*;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding; */


public class Bean
{
	public void Mar()
	{
		JAXBContext jaxbContext = null;
		try
		{
			jaxbContext = JAXBContext.newInstance(Fruit.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Fruit o = new Fruit();
			o.setId(1);
			o.setName("Banana");
			o.setPrice("9.99");
			jaxbMarshaller.marshal(o, new File("/home/yvedpath/NotBackedUp/JavaProjects/JaxB-Servlet/fruit.xml"));
			System.out.println("File cretaed");
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}


	}

	public void UnMar()
	{
		JAXBContext jaxbContext = null;
		try
		{
			jaxbContext = JAXBContext.newInstance(Fruit.class);
			File file = new File("/home/yvedpath/NotBackedUp/JavaProjects/JaxB-Servlet/fruit.xml");

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Fruit o = (Fruit) jaxbUnmarshaller.unmarshal(file);

			System.out.println(o);
			System.out.println("Object created");
		}
		catch (JAXBException e) {
			Throwable cause = e.getCause();
			System.err.println("MESSAGE = |" + cause.getMessage() + "|");
			System.err.println("LOCALIZED MESSAGE = |" + cause.getLocalizedMessage() + "|");
			System.err.println("STACK TRACE");
			e.printStackTrace();
		}

	}
}
