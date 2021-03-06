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

import com.medico.ModuloMedicoclient.model.TipoDescuento;
import com.medico.ModuloMedicoclient.repository.DescuentoRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/descuento")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class DescuentoController {
	@Autowired
	private DescuentoRepo repositorio;

	@HystrixCommand
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<TipoDescuento> getDescuentoByPersona(@PathVariable("id") int id) {
		return this.repositorio.getDescuentoPersona(id);
	}

	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TipoDescuento addDescuento(@RequestBody TipoDescuento newbeneficio) {
		repositorio.getInactivos(newbeneficio.getFdiPersona().getId());
		return this.repositorio.save(newbeneficio);
	}

	@HystrixCommand
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TipoDescuento editDescuento(@RequestBody TipoDescuento editbeneficio) {
		return this.repositorio.save(editbeneficio);
	}

}
