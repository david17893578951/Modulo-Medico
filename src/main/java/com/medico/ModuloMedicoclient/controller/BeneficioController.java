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

import com.medico.ModuloMedicoclient.model.Beneficio;
import com.medico.ModuloMedicoclient.repository.BeneficioRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/beneficio")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class BeneficioController {

	@Autowired
	private BeneficioRepo repositorio;

	@HystrixCommand
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Beneficio> getBeneficioByPersona(@PathVariable("id") int id) {
		return this.repositorio.getBeneficioPersona(id);
	}
	 
	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Beneficio addBeneficio(@RequestBody Beneficio newbeneficio) {
		repositorio.getInactivos(newbeneficio.getFdiPersona().getId());
		return this.repositorio.save(newbeneficio);
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Beneficio editPutBeneficio(@RequestBody Beneficio editbeneficio) {
	return this.repositorio.save(editbeneficio);
	}
	
}
