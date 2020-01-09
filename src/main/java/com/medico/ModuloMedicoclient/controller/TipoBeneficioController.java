package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.TipoBeneficio;
import com.medico.ModuloMedicoclient.repository.TipoBeneficioRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/tipobeneficio")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class TipoBeneficioController {
	
	@Autowired
	private TipoBeneficioRepo repositorio;
	
	@HystrixCommand
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<TipoBeneficio> getTipoBeneficiosbyPersona(@PathVariable("id") int id) {
		return this.repositorio.getTipoBeneficioPersona(id);
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TipoBeneficio addTipobeneficio(@RequestBody TipoBeneficio newtipobeneficio) {
		return this.repositorio.save(newtipobeneficio);
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public TipoBeneficio editTipobeneficio(@RequestBody TipoBeneficio Persona) {
	return this.repositorio.save(Persona);
	}
	
}
