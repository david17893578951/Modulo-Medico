package com.medico.ModuloMedicoclient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Persona;
import com.medico.ModuloMedicoclient.repository.PersonaRepo;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins="*", allowCredentials="true",allowedHeaders="*")
public class PersonaController {
	@Autowired
	private PersonaRepo repositorioPersona;
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Persona> getAllPersona() {
		return this.repositorioPersona.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Optional<Persona> getPersonaId (@PathVariable("id") Integer id) {
		return this.repositorioPersona.findById(id); 
	}

	@RequestMapping(value = "/find/{cedula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Persona> getPersonabyCedula(@PathVariable("cedula") String cedula) {
		return this.repositorioPersona.getPersonabyCedula(cedula);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Persona setPersona(@RequestBody Persona Persona) {
	return this.repositorioPersona.save(Persona);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Persona setpersonal(@RequestBody Persona Persona) {
	return this.repositorioPersona.save(Persona);
	}

}
