package com.medico.ModuloMedicoclient.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.medico.ModuloMedicoclient.model.SeguimientoFisioterapia;

public interface SeguimientoFisioterapiaRepo extends JpaRepository<SeguimientoFisioterapia, Integer>{
	
	@Modifying
	@Query("SELECT s FROM SeguimientoFisioterapia s where s.fdiPersona.id=:nroId ORDER BY s.estado")
	public List<SeguimientoFisioterapia> getSeguimientoByPersona(@Param("nroId") int nroId);
	
	

	@Modifying
	@Transactional
	@Query(value="update trp_seguimiento_fisioterapia set sgf_estado=false where prs_id=? and sgf_estado=true", nativeQuery=true)
	public int getInactivos(@Param("nroId") int nroId);
}
