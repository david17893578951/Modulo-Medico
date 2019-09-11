package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_diagnostico_medico database table.
 * 
 */
@Entity
@Table(name="mdc_diagnostico_medico")
@NamedQuery(name="DiagnosticoMedico.findAll", query="SELECT d FROM DiagnosticoMedico d")
public class DiagnosticoMedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_DIAGNOSTICO_MEDICO_ID_GENERATOR", sequenceName="MDC_DIAGNOSTICO_MEDICO_DGM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_DIAGNOSTICO_MEDICO_ID_GENERATOR")
	@Column(name="dgm_id")
	private Integer id;

	@Column(name="dgm_anamnesis")
	private String anamnesis;

	//uni-directional many-to-one association to SeguimientoMedico
	@ManyToOne
	@JoinColumn(name="sgm_id")
	private SeguimientoMedico mdcSeguimientoMedico;

	public DiagnosticoMedico() {
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

	public SeguimientoMedico getMdcSeguimientoMedico() {
		return this.mdcSeguimientoMedico;
	}

	public void setMdcSeguimientoMedico(SeguimientoMedico mdcSeguimientoMedico) {
		this.mdcSeguimientoMedico = mdcSeguimientoMedico;
	}

}