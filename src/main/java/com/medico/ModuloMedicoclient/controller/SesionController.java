package com.medico.ModuloMedicoclient.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonView;

import com.medico.ModuloMedicoclient.model.Sesion;
import com.medico.ModuloMedicoclient.repository.SesionRepo;
import com.medico.ModuloMedicoclient.serializer.Perfiles;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
@RestController
@RequestMapping("/sesion")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class SesionController {
	@Autowired
	private SesionRepo repositorio;
	
	@HystrixCommand
	@JsonView(Perfiles.PublicView.class)
	@RequestMapping(value="/finicio/{fechaIni}/fin/{fechaFin}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Sesion> getReportePsicologico(@PathVariable("fechaIni") String fechaIni, @PathVariable("fechaFin") String fechaFin) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date f1=null;
		Date f2=null;
		try {
			f1 = formato.parse(fechaIni);
			f2 = formato.parse(fechaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f1);
		System.out.println(f2);
		return this.repositorio.getSesionByRango(f1, f2);
	}
	
	@HystrixCommand
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Sesion> getSesionPsicologicaByPersona(@PathVariable("id") int id) {
		return this.repositorio.getTerapiaByDiagnostico(id);
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Sesion addSesionPsicologica(@RequestBody Sesion newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}
	
	@HystrixCommand
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Sesion editSesionPsicologica(@RequestBody Sesion editbeneficio) {
	return this.repositorio.save(editbeneficio);
	}
}
