package com.medico.ModuloMedicoclient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.medico.ModuloMedicoclient.model.TipoDescuento;

public interface DescuentoRepo extends JpaRepository<TipoDescuento, Integer>{
	@Modifying
	@Query("SELECT t FROM TipoDescuento t where t.fdiPersona.id=:nroId")
	public List<TipoDescuento> getDescuentoPersona(@Param("nroId") int nroId);
	
	@Modifying
	@Transactional
	@Query(value="update mdc_tipo_descuento set tdc_estado=false where prs_id=? and tdc_estado=true", nativeQuery=true)
	public int getInactivos(@Param("nroId") int nroId);
}
