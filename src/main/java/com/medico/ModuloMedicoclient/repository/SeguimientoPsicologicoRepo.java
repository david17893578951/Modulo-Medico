package com.medico.ModuloMedicoclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.medico.ModuloMedicoclient.model.SeguimientoPsicologico;

public interface SeguimientoPsicologicoRepo extends JpaRepository<SeguimientoPsicologico, Integer>{
	@Modifying
	@Query("SELECT s FROM SeguimientoPsicologico s where s.fdiPersona.id=:nroId ORDER BY s.estado")
	public List<SeguimientoPsicologico> getSeguimientoByPersona(@Param("nroId") int nroId);
	
	@Modifying
	@Transactional
	@Query(value="update psg_seguimiento_psicologico set sgp_estado=false where prs_id=? and sgp_estado=true", nativeQuery=true)
	public int getInactivos(@Param("nroId") int nroId);
}
