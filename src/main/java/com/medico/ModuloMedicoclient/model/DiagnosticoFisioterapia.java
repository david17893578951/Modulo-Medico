package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trp_diagnostico_fisioterapia database table.
 * 
 */
@Entity
@Table(name="trp_diagnostico_fisioterapia")
@NamedQuery(name="DiagnosticoFisioterapia.findAll", query="SELECT d FROM DiagnosticoFisioterapia d")
public class DiagnosticoFisioterapia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_DIAGNOSTICO_FISIOTERAPIA_ID_GENERATOR", sequenceName="TRP_DIAGNOSTICO_FISIOTERAPIA_DGF_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_DIAGNOSTICO_FISIOTERAPIA_ID_GENERATOR")
	@Column(name="dgf_id")
	private Integer id;

	@Column(name="dgf_anamnesis")
	private String anamnesis;

	//uni-directional many-to-one association to SeguimientoFisioterapia
	@ManyToOne
	@JoinColumn(name="sgf_id")
	private SeguimientoFisioterapia trpSeguimientoFisioterapia;

	public DiagnosticoFisioterapia() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnamnesis() {
		return this.anamnesis;
	}

	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}

	public SeguimientoFisioterapia getTrpSeguimientoFisioterapia() {
		return this.trpSeguimientoFisioterapia;
	}

	public void setTrpSeguimientoFisioterapia(SeguimientoFisioterapia trpSeguimientoFisioterapia) {
		this.trpSeguimientoFisioterapia = trpSeguimientoFisioterapia;
	}

}