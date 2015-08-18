package com.jorge.explorer.rest;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class GerarXSD {

	public static void main(String[] args) throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(ExplorerResource.class);
		context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName)
					throws IOException {
				return new StreamResult(new File("explorer.xsd"));
			}
		});
	}
}
