package com.medico.ModuloMedicoclient.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medico.ModuloMedicoclient.model.Sesion;


public interface SesionRepo extends JpaRepository<Sesion, Integer>{
	
	@Modifying
	@Query("SELECT s FROM Sesion s where s.psgSeguimientoPsicologico.id=:nroId")
	public List<Sesion> getTerapiaByDiagnostico(@Param("nroId") int nroId);
	
	@Query("SELECT s FROM Sesion s where s.fecha BETWEEN :fechaIni AND :fechaFin")
	public List<Sesion> getSesionByRango(@Param("fechaIni") Date fechaIni, @Param("fechaFin") Date fechaFin);

	
}
