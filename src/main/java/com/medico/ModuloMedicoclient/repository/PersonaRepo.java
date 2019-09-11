package com.medico.ModuloMedicoclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.medico.ModuloMedicoclient.model.Persona;

public interface PersonaRepo  extends JpaRepository<Persona, Integer>  {
	
	@Modifying
	@Query("SELECT p FROM Persona p where p.cedula=:nroId")
	public List<Persona> getPersonabyCedula(@Param("nroId") String nroId);
	
}
