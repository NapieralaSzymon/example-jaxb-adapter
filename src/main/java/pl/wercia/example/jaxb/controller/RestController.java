package pl.wercia.example.jaxb.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pl.wercia.example.jaxb.dto.PersonDto;

@Path(value = "/")
public class RestController {

	@POST
	@Path(value = "echo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDto echo(PersonDto person) {
		return person;
	}

}
