package com.medico.ModuloMedicoclient.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.medico.ModuloMedicoclient.model.Beneficio;

public interface BeneficioRepo extends JpaRepository<Beneficio, Integer>{
	
	@Modifying
	@Query("SELECT b FROM Beneficio b where b.fdiPersona.id=:nroId")
	public List<Beneficio> getBeneficioPersona(@Param("nroId") int nroId);
	
	@Modifying
	@Transactional
	@Query(value="update mdc_beneficio set bnf_estado=false where prs_id=? and bnf_estado=true", nativeQuery=true)
	public int getInactivos(@Param("nroId") int nroId);
}
