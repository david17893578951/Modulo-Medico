package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Calendario;
import com.medico.ModuloMedicoclient.repository.CalendarioRepo;

@RestController
@RequestMapping("/calendario")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class CalendarioController {
	@Autowired
	private CalendarioRepo repositorioPersona;
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)

	public List<Calendario> getAllPersona() {
		return this.repositorioPersona.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Calendario setPersona(@RequestBody Calendario Persona) {
	return this.repositorioPersona.save(Persona);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Calendario setpersonal(@RequestBody Calendario Persona) {
	return this.repositorioPersona.save(Persona);
	}
}
