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

import com.medico.ModuloMedicoclient.model.Paciente;
import com.medico.ModuloMedicoclient.repository.PacienteRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/paciente")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class PacienteController {
	
	@Autowired
	private PacienteRepo repositorio;
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public List<Paciente> getAllPaciente() {
		return this.repositorio.findAll();
	}
	
	@RequestMapping(value = "/one/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public Optional<Paciente> getOnePacient(@PathVariable("id") int id) {
		return this.repositorio.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public List<Paciente> getPacient(@PathVariable("id") int id) {
		return this.repositorio.getPacientePersona(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand
	public Paciente setNuevoPaciente(@RequestBody Paciente newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand
	public Paciente seEditarPaciente(@RequestBody Paciente newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}
	
	
}
