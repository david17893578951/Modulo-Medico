package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mdc_transferencia database table.
 * 
 */
@Entity
@Table(name="mdc_transferencia")
@NamedQuery(name="Transferencia.findAll", query="SELECT t FROM Transferencia t")
public class Transferencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_TRANSFERENCIA_ID_GENERATOR", sequenceName="MDC_TRANSFERENCIA_TRF_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_TRANSFERENCIA_ID_GENERATOR")
	@Column(name="trf_id")
	private Integer id;

	@Column(name="trf_caso")
	private String caso;

	@Temporal(TemporalType.DATE)
	@Column(name="trf_fecha_transferencia")
	private Date fechaTransferencia;

	@Column(name="trf_nombre_institucion")
	private String nombreInstitucion;

	@Column(name="trf_observacion")
	private String observacion;

	//uni-directional many-to-one association to Paciente
	@ManyToOne
	@JoinColumn(name="pct_id")
	private Paciente mdcPaciente;

	public Transferencia() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaso() {
		return this.caso;
	}

	public void setCaso(String caso) {
		this.caso = caso;
	}

	public Date getFechaTransferencia() {
		return this.fechaTransferencia;
	}

	public void setFechaTransferencia(Date fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getNombreInstitucion() {
		return this.nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
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