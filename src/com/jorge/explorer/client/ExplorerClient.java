package com.jorge.explorer.client;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.jorge.explorer.dominio.Exploracao;
import com.jorge.explorer.dominio.Planeta;
import com.jorge.explorer.dominio.Sonda;
import com.jorge.explorer.enums.Direcao;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONJAXBContext;
import com.sun.jersey.api.json.JSONMarshaller;

/**
 * Classe resposavel por representar um client consumindo o servico de explorar planetas
 * @author Jorge Cassol
 *
 */
public class ExplorerClient {

	public static void main(String[] args) {

		try {

			ClientConfig config = new DefaultClientConfig();
			Client client = Client.create(config);

			WebResource webResource = client.resource("http://localhost:8080/explorer/explorar");
			
			Planeta planeta = new Planeta(5, 5);
			Sonda sonda1 = new Sonda(1, 2, Direcao.N, "LMLMLMLMM");
			Sonda sonda2 = new Sonda(3, 3, Direcao.E, "MMRMMRMRRM");
			List<Sonda> sondas = new ArrayList<>();
			sondas.add(sonda1);
			sondas.add(sonda2);
			
			Exploracao exploracao = new Exploracao();
			exploracao.setPlaneta(planeta);
			exploracao.setSondas(sondas);
			
			String json = marshalToJson(exploracao) ;

			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);

			System.out.println("Resposta: "+ response.getEntity(String.class));
			
		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
	/**
	 * Metodo responsavel por realizar o marshal do objeto para json
	 * @param obj Objeto que sera transformado
	 * @return String com o json
	 * @throws JAXBException
	 */
	public static String marshalToJson(Object obj) throws JAXBException {

	    StringWriter json = new StringWriter();
	    JAXBContext context = JSONJAXBContext.newInstance(obj.getClass());

	    Marshaller marshall = context.createMarshaller();
	    JSONMarshaller marshaller = JSONJAXBContext.getJSONMarshaller(marshall , context);
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshaller.marshallToJSON(obj, json);
	    
	    return json.toString();
	}
	
}
