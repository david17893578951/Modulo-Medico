package com.medico.ModuloMedicoclient.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medico.ModuloMedicoclient.model.TipoBeneficio;

public interface TipoBeneficioRepo extends JpaRepository<TipoBeneficio, Integer> {
	@Modifying
	@Query("SELECT t FROM TipoBeneficio t where t.mdcBeneficio.id=:nroId")
	public List<TipoBeneficio> getTipoBeneficioPersona(@Param("nroId") int nroId);
}