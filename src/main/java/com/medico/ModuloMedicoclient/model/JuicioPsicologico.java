package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_juicio_psicologico database table.
 * 
 */
@Entity
@Table(name="mdc_juicio_psicologico")
@NamedQuery(name="JuicioPsicologico.findAll", query="SELECT j FROM JuicioPsicologico j")
public class JuicioPsicologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_JUICIO_PSICOLOGICO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_JUICIO_PSICOLOGICO_ID_GENERATOR")
	@Column(name="jcp_id")
	private Integer id;

	@Column(name="jcp_observaciones")
	private String observaciones;

	//uni-directional many-to-one association to AsistenciaPsicologico
	@ManyToOne
	@JoinColumn(name="asp_id")
	private AsistenciaPsicologico mdcAsistenciaPsicologico;

	//uni-directional many-to-one association to SeguimientoPsicologico
	@ManyToOne
	@JoinColumn(name="sgp_id")
	private SeguimientoPsicologico mdcSeguimientoPsicologico;

	public JuicioPsicologico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public AsistenciaPsicologico getMdcAsistenciaPsicologico() {
		return this.mdcAsistenciaPsicologico;
	}

	public void setMdcAsistenciaPsicologico(AsistenciaPsicologico mdcAsistenciaPsicologico) {
		this.mdcAsistenciaPsicologico = mdcAsistenciaPsicologico;
	}

	public SeguimientoPsicologico getMdcSeguimientoPsicologico() {
		return this.mdcSeguimientoPsicologico;
	}

	public void setMdcSeguimientoPsicologico(SeguimientoPsicologico mdcSeguimientoPsicologico) {
		this.mdcSeguimientoPsicologico = mdcSeguimientoPsicologico;
	}

}