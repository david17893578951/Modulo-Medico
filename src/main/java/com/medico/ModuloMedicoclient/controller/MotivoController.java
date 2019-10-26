package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Motivo;
import com.medico.ModuloMedicoclient.repository.MotivoRepo;

@RestController
@RequestMapping("/motivo")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class MotivoController {
	
	@Autowired
	private MotivoRepo repositorio;

	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Motivo> getAllPersona() {
		return this.repositorio.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Motivo addFisioterapiaByPersona(@RequestBody Motivo newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}

}
