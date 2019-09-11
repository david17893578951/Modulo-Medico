package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_antecedente_familiar database table.
 * 
 */
@Entity
@Table(name="mdc_antecedente_familiar")
@NamedQuery(name="AntecedenteFamiliar.findAll", query="SELECT a FROM AntecedenteFamiliar a")
public class AntecedenteFamiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_ANTECEDENTE_FAMILIAR_ID_GENERATOR", sequenceName="MDC_ANTECEDENTE_FAMILIAR_ATF_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_ANTECEDENTE_FAMILIAR_ID_GENERATOR")
	@Column(name="atf_id")
	private Integer id;

	@Column(name="atf_enfermedad")
	private String enfermedad;

	@Column(name="atf_familiar")
	private String familiar;

	@Column(name="atf_observacion")
	private String observacion;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public AntecedenteFamiliar() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(String familiar) {
		this.familiar = familiar;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Paciente getMdcPaciente() {
		return this.mdcPaciente;
	}

	public void setMdcPaciente(Paciente mdcPaciente) {
		this.mdcPaciente = mdcPaciente;
	}

}