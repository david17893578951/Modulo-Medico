package com.medico.ModuloMedicoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModuloMedicoclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuloMedicoclientApplication.class, args);
	}
	
	@RequestMapping("/api")
	  public String findAll(){
	    return "Hello World!";
	  }

}
