package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_secundario database table.
 * 
 */
@Entity
@Table(name="mdc_secundario")
@NamedQuery(name="Secundario.findAll", query="SELECT s FROM Secundario s")
public class Secundario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_SECUNDARIO_ID_GENERATOR", sequenceName="MDC_SECUNDARIO_SCD_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_SECUNDARIO_ID_GENERATOR")
	@Column(name="scd_id")
	private Integer id;

	@Column(name="scd_instrumento")
	private String instrumento;

	@Column(name="scd_metodo")
	private String metodo;

	@Column(name="scd_observacion")
	private String observacion;

	//uni-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="ara_id")
	private Area mdcArea;

	//uni-directional many-to-one association to DiagnosticoMedico
	@ManyToOne
	@JoinColumn(name="dgm_id")
	private DiagnosticoMedico mdcDiagnosticoMedico;

	public Secundario() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInstrumento() {
		return this.instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getMetodo() {
		return this.metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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