package com.medico.ModuloMedicoclient.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import com.medico.ModuloMedicoclient.model.Terapia;
import com.medico.ModuloMedicoclient.repository.TerapiaRepo;
import com.medico.ModuloMedicoclient.serializer.Perfiles;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/terapia")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class TerapiaController {
	@Autowired
	private TerapiaRepo repositorio;
	
	@JsonView(Perfiles.PublicView.class)
	@RequestMapping(value="/finicio/{fechaIni}/fin/{fechaFin}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public List<Terapia> getAllTerapias(@PathVariable("fechaIni") String fechaIni, @PathVariable("fechaFin") String fechaFin) {
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
		return this.repositorio.getTerapiaByRango(f1, f2);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@HystrixCommand
	public List<Terapia> getDescuentoPersona(@PathVariable("id") int id) {
		return this.repositorio.getTerapiaByDiagnostico(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand
	public Terapia addFisioterapiaByPersona(@RequestBody Terapia newbeneficio) {
		return this.repositorio.save(newbeneficio);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	@HystrixCommand
	public Terapia setPutDescuentoPersona(@RequestBody Terapia editbeneficio) {
	return this.repositorio.save(editbeneficio);
	}
	
	
	
	
}
