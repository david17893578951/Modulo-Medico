package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_primario database table.
 * 
 */
@Entity
@Table(name="mdc_primario")
@NamedQuery(name="Primario.findAll", query="SELECT p FROM Primario p")
public class Primario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_PRIMARIO_ID_GENERATOR", sequenceName="MDC_PRIMARIO_PRM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_PRIMARIO_ID_GENERATOR")
	@Column(name="prm_id")
	private Integer id;

	@Column(name="prm_observacion")
	private String observacion;

	@Column(name="prm_tipo_examen")
	private String tipoExamen;

	//uni-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="ara_id")
	private Area mdcArea;

	//uni-directional many-to-one association to DiagnosticoMedico
	@ManyToOne
	@JoinColumn(name="dgm_id")
	private DiagnosticoMedico mdcDiagnosticoMedico;

	public Primario() {
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

	public String getTipoExamen() {
		return this.tipoExamen;
	}

	public void setTipoExamen(String tipoExamen) {
		this.tipoExamen = tipoExamen;
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