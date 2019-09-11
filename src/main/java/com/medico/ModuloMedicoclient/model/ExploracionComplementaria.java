package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_exploracion_complementaria database table.
 * 
 */
@Entity
@Table(name="mdc_exploracion_complementaria")
@NamedQuery(name="ExploracionComplementaria.findAll", query="SELECT e FROM ExploracionComplementaria e")
public class ExploracionComplementaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_EXPLORACION_COMPLEMENTARIA_ID_GENERATOR", sequenceName="MDC_EXPLORACION_COMPLEMENTARIA_EXC_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_EXPLORACION_COMPLEMENTARIA_ID_GENERATOR")
	@Column(name="exc_id")
	private Integer id;

	@Column(name="exc_observacion")
	private String observacion;

	@Column(name="exc_tipo")
	private String tipo;

	//uni-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="ara_id")
	private Area mdcArea;

	//uni-directional many-to-one association to DiagnosticoMedico
	@ManyToOne
	@JoinColumn(name="dgm_id")
	private DiagnosticoMedico mdcDiagnosticoMedico;

	public ExploracionComplementaria() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Area getMdcArea() {
		return this.mdcArea;
	}

	public void setMdcArea(Area mdcArea) {
		this.mdcArea = mdcArea;
	}

	public DiagnosticoMedico getMdcDiagnosticoMedico() {
		return this.mdcDiagnosticoMedico;
	}

	public void setMdcDiagnosticoMedico(DiagnosticoMedico mdcDiagnosticoMedico) {
		this.mdcDiagnosticoMedico = mdcDiagnosticoMedico;
	}

}