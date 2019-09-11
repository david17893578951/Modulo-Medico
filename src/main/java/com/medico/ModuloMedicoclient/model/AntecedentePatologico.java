package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mcd_antecedente_patologico database table.
 * 
 */
@Entity
@Table(name="mcd_antecedente_patologico")
@NamedQuery(name="AntecedentePatologico.findAll", query="SELECT a FROM AntecedentePatologico a")
public class AntecedentePatologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MCD_ANTECEDENTE_PATOLOGICO_ID_GENERATOR", sequenceName="MCD_ANTECEDENTE_PATOLOGICO_ATP_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MCD_ANTECEDENTE_PATOLOGICO_ID_GENERATOR")
	@Column(name="atp_id")
	private Integer id;

	@Column(name="atp_antitetanica")
	private Boolean antitetanica;

	@Column(name="atp_inmunizacion")
	private Boolean inmunizacion;

	@Column(name="atp_lecion")
	private Boolean lecion;

	@Column(name="atp_motivo")
	private String motivo;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public AntecedentePatologico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAntitetanica() {
		return this.antitetanica;
	}

	public void setAntitetanica(Boolean antitetanica) {
		this.antitetanica = antitetanica;
	}

	public Boolean getInmunizacion() {
		return this.inmunizacion;
	}

	public void setInmunizacion(Boolean inmunizacion) {
		this.inmunizacion = inmunizacion;
	}

	public Boolean getLecion() {
		return this.lecion;
	}

	public void setLecion(Boolean lecion) {
		this.lecion = lecion;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Paciente getMdcPaciente() {
		return this.mdcPaciente;
	}

	public void setMdcPaciente(Paciente mdcPaciente) {
		this.mdcPaciente = mdcPaciente;
	}

}