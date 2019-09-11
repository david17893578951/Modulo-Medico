package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_jucio_medico database table.
 * 
 */
@Entity
@Table(name="mdc_jucio_medico")
@NamedQuery(name="JucioMedico.findAll", query="SELECT j FROM JucioMedico j")
public class JucioMedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_JUCIO_MEDICO_ID_GENERATOR", sequenceName="MDC_JUCIO_MEDICO_JCM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_JUCIO_MEDICO_ID_GENERATOR")
	@Column(name="jcm_id")
	private Integer id;

	@Column(name="jcm_observacion")
	private String observacion;

	//uni-directional many-to-one association to Enfermedad
	@ManyToOne
	@JoinColumn(name="nfm_id")
	private Enfermedad mdcEnfermedad;

	//uni-directional many-to-one association to SeguimientoMedico
	@ManyToOne
	@JoinColumn(name="sgm_id")
	private SeguimientoMedico mdcSeguimientoMedico;

	public JucioMedico() {
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

	public Enfermedad getMdcEnfermedad() {
		return this.mdcEnfermedad;
	}

	public void setMdcEnfermedad(Enfermedad mdcEnfermedad) {
		this.mdcEnfermedad = mdcEnfermedad;
	}

	public SeguimientoMedico getMdcSeguimientoMedico() {
		return this.mdcSeguimientoMedico;
	}

	public void setMdcSeguimientoMedico(SeguimientoMedico mdcSeguimientoMedico) {
		this.mdcSeguimientoMedico = mdcSeguimientoMedico;
	}

}