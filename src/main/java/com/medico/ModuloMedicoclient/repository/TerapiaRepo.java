package com.medico.ModuloMedicoclient.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medico.ModuloMedicoclient.model.Terapia;


public interface TerapiaRepo extends JpaRepository<Terapia, Integer>{
	
	@Query("SELECT t FROM Terapia t where t.trpDiagnosticoTerapeutico.id=:nroId")
	public List<Terapia> getTerapiaByDiagnostico(@Param("nroId") int nroId);
	
	@Query("SELECT t FROM Terapia t where t.fecha BETWEEN :fechaIni AND :fechaFin")
	public List<Terapia> getTerapiaByRango(@Param("fechaIni") Date fechaIni, @Param("fechaFin") Date fechaFin);
}
