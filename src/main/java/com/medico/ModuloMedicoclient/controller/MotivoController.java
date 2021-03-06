package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Motivo;
import com.medico.ModuloMedicoclient.repository.MotivoRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/motivo")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class MotivoController {
	
	@Autowired
	private MotivoRepo repositorio;

	@HystrixCommand
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Motivo> getAllMotivo() {
		return this.repositorio.findAll();
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Motivo addMotivo(@RequestBody Motivo newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}

}
