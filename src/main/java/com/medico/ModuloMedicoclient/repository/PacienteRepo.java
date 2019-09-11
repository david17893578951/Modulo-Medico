package com.medico.ModuloMedicoclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medico.ModuloMedicoclient.model.Paciente;

public interface PacienteRepo extends JpaRepository<Paciente, Integer>{

	@Modifying
	@Query("SELECT p FROM Paciente p where p.fdiPersona.id=:nroId")
	public List<Paciente> getPacientePersona(@Param("nroId") int nroId);
	
}
