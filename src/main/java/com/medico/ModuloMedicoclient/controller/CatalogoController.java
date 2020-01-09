package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Catalogo;
import com.medico.ModuloMedicoclient.repository.CatalogoRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/catalogo")
@CrossOrigin(origins="*", allowCredentials="true",allowedHeaders="*")
public class CatalogoController {
	
	@Autowired
	private CatalogoRepo repositorio;
	
	@HystrixCommand
	@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Catalogo> getAllCatalogo(){
		return this.repositorio.findAll();
	}

}
