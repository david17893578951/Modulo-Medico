package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ASISTENCIA_IDASISTENCIA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ASISTENCIA_IDASISTENCIA_GENERATOR")
	@Column(name="id_asistencia")
	private Integer idAsistencia;

	private Boolean asistio;

	private Integer entrenador;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String observaciones;

	//uni-directional many-to-one association to FdiDeportista
	@ManyToOne
	@JoinColumn(name="depor_id")
	private FdiDeportista fdiDeportista;

	public Asistencia() {
	}

	public Integer getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(Integer idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Boolean getAsistio() {
		return this.asistio;
	}

	public void setAsistio(Boolean asistio) {
		this.asistio = asistio;
	}

	public Integer getEntrenador() {
		return this.entrenador;
	}

	public void setEntrenador(Integer entrenador) {
		this.entrenador = entrenador;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public FdiDeportista getFdiDeportista() {
		return this.fdiDeportista;
	}

	public void setFdiDeportista(FdiDeportista fdiDeportista) {
		this.fdiDeportista = fdiDeportista;
	}

}