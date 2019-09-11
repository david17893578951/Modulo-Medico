package com.medico.ModuloMedicoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medico.ModuloMedicoclient.model.Catalogo;
import com.medico.ModuloMedicoclient.repository.CatalogoRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/catalogo")
@CrossOrigin(origins="*", allowCredentials="true",allowedHeaders="*")
public class CatalogoController {
	
	@Autowired
	private CatalogoRepo repositorio;
	
	@RequestMapping(method=RequestMethod.GET)
	@HystrixCommand
	public List<Catalogo> getAllCatalogo(){
		return this.repositorio.findAll();
	}

}
