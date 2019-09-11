package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_pronostico database table.
 * 
 */
@Entity
@Table(name="mdc_pronostico")
@NamedQuery(name="Pronostico.findAll", query="SELECT p FROM Pronostico p")
public class Pronostico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_PRONOSTICO_ID_GENERATOR", sequenceName="MDC_PRONOSTICO_PNT_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_PRONOSTICO_ID_GENERATOR")
	@Column(name="pnt_id")
	private Integer id;

	@Column(name="pnt_observacion")
	private String observacion;

	@Column(name="pnt_tipo")
	private String tipo;

	//uni-directional many-to-one association to Enfermedad
	@ManyToOne
	@JoinColumn(name="nfm_id")
	private Enfermedad mdcEnfermedad;

	//uni-directional many-to-one association to JucioMedico
	@ManyToOne
	@JoinColumn(name="jcm_id")
	private JucioMedico mdcJucioMedico;

	public Pronostico() {
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

	public Enfermedad getMdcEnfermedad() {
		return this.mdcEnfermedad;
	}

	public void setMdcEnfermedad(Enfermedad mdcEnfermedad) {
		this.mdcEnfermedad = mdcEnfermedad;
	}

	public JucioMedico getMdcJucioMedico() {
		return this.mdcJucioMedico;
	}

	public void setMdcJucioMedico(JucioMedico mdcJucioMedico) {
		this.mdcJucioMedico = mdcJucioMedico;
	}

}