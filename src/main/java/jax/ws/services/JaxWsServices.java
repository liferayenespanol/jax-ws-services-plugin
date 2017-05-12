package jax.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = "jaxws=true", service = JaxWsServices.class)
@WebService
public class JaxWsServices{

	public JaxWsServices() {
	}
	
	@WebMethod
	public String working() {
		return "It works!";
	}

	@WebMethod
	public String hello() {
		return "Good morning!";
	}

	@WebMethod
	public String morning(String name, String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}

}