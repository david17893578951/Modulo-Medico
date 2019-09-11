package com.medico.ModuloMedicoclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medico.ModuloMedicoclient.model.DiagnosticoTerapeutico;



public interface DiagnosticoTerapeuticoRepo extends JpaRepository<DiagnosticoTerapeutico, Integer>{

	@Modifying
	@Query("SELECT d FROM DiagnosticoTerapeutico d where d.trpSeguimientoFisioterapia.id=:nroId")
	public List<DiagnosticoTerapeutico> getSeguimientoByPersona(@Param("nroId") int nroId);
	
}
