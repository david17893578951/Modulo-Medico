package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.AntecedentePatologico;
import com.medico.ModuloMedicoclient.repository.AntecedentePatologicoRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/patologicio")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class AntecedentePatologicoController {

	@Autowired
	private AntecedentePatologicoRepo repositorio;
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public List<AntecedentePatologico> getAllPaciente() {
		return this.repositorio.findAll();
	}
}
