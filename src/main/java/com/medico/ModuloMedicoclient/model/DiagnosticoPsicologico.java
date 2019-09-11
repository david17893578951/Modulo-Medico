package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_diagnostico_psicologico database table.
 * 
 */
@Entity
@Table(name="mdc_diagnostico_psicologico")
@NamedQuery(name="DiagnosticoPsicologico.findAll", query="SELECT d FROM DiagnosticoPsicologico d")
public class DiagnosticoPsicologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_DIAGNOSTICO_PSICOLOGICO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_DIAGNOSTICO_PSICOLOGICO_ID_GENERATOR")
	@Column(name="dgp_id")
	private Integer id;

	@Column(name="dgp_tipo")
	private String tipo;

	//uni-directional many-to-one association to SeguimientoPsicologico
	@ManyToOne
	@JoinColumn(name="sgp_id")
	private SeguimientoPsicologico mdcSeguimientoPsicologico;

	public DiagnosticoPsicologico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public SeguimientoPsicologico getMdcSeguimientoPsicologico() {
		return this.mdcSeguimientoPsicologico;
	}

	public void setMdcSeguimientoPsicologico(SeguimientoPsicologico mdcSeguimientoPsicologico) {
		this.mdcSeguimientoPsicologico = mdcSeguimientoPsicologico;
	}

}