package com.medico.ModuloMedicoclient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.medico.ModuloMedicoclient.model.Persona;
import com.medico.ModuloMedicoclient.repository.PersonaRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@Service
@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class PersonaController {

	@Autowired
	private PersonaRepo repositorioPersona;

	@HystrixCommand
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public 	@ResponseBody List<Persona> getAllPersona(){
		return this.repositorioPersona.findAll();
	}
	
	@HystrixCommand
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Optional<Persona> getPersonaId(@PathVariable("id") Integer id) {
		return this.repositorioPersona.findById(id);
	}

	@HystrixCommand
	@RequestMapping(value = "/find/{cedula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Persona> getPersonabyCedula(@PathVariable("cedula") String cedula) {
		return this.repositorioPersona.getPersonabyCedula(cedula);
	}

	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Persona addPersona(@RequestBody Persona Persona) {
		return this.repositorioPersona.save(Persona);
	}

	@HystrixCommand
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Persona EditPersona(@RequestBody Persona Persona) {
		return this.repositorioPersona.save(Persona);
	}

}
