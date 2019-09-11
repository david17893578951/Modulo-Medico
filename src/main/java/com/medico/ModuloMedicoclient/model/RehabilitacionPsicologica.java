package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_rehabilitacion_psicologica database table.
 * 
 */
@Entity
@Table(name="mdc_rehabilitacion_psicologica")
@NamedQuery(name="RehabilitacionPsicologica.findAll", query="SELECT r FROM RehabilitacionPsicologica r")
public class RehabilitacionPsicologica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_REHABILITACION_PSICOLOGICA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_REHABILITACION_PSICOLOGICA_ID_GENERATOR")
	@Column(name="rhp_id")
	private Integer id;

	@Column(name="rhp__num_sesiones")
	private Integer numSesiones;

	@Column(name="rhp_porcentaje")
	private Integer porcentaje;

	//uni-directional many-to-one association to JuicioPsicologico
	@ManyToOne
	@JoinColumn(name="jcp_id")
	private JuicioPsicologico mdcJuicioPsicologico;

	public RehabilitacionPsicologica() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumSesiones() {
		return this.numSesiones;
	}

	public void setNumSesiones(Integer numSesiones) {
		this.numSesiones = numSesiones;
	}

	public Integer getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public JuicioPsicologico getMdcJuicioPsicologico() {
		return this.mdcJuicioPsicologico;
	}

	public void setMdcJuicioPsicologico(JuicioPsicologico mdcJuicioPsicologico) {
		this.mdcJuicioPsicologico = mdcJuicioPsicologico;
	}

}