package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.DiagnosticoTerapeutico;
import com.medico.ModuloMedicoclient.repository.DiagnosticoTerapeuticoRepo;

@RestController
@RequestMapping("/diagnostico")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class DiagnosticoTerapeuticoController {
	@Autowired
	private DiagnosticoTerapeuticoRepo repositorio;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<DiagnosticoTerapeutico> getDescuentoPersona(@PathVariable("id") int id) {
		return this.repositorio.getSeguimientoByPersona(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public DiagnosticoTerapeutico addFisioterapiaByPersona(@RequestBody DiagnosticoTerapeutico newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public DiagnosticoTerapeutico setPutDescuentoPersona(@RequestBody DiagnosticoTerapeutico editbeneficio) {
	return this.repositorio.save(editbeneficio);
	}
}
