package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mdc_asistencia_psicologico database table.
 * 
 */
@Entity
@Table(name="mdc_asistencia_psicologico")
@NamedQuery(name="AsistenciaPsicologico.findAll", query="SELECT a FROM AsistenciaPsicologico a")
public class AsistenciaPsicologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_ASISTENCIA_PSICOLOGICO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_ASISTENCIA_PSICOLOGICO_ID_GENERATOR")
	@Column(name="asp_id")
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="asp_hora_entrada")
	private Date horaEntrada;

	@Temporal(TemporalType.DATE)
	@Column(name="asp_hora_salida")
	private Date horaSalida;

	@Column(name="ass_sesion_actual")
	private Integer sesionActual;

	public AsistenciaPsicologico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getHoraEntrada() {
		return this.horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Integer getSesionActual() {
		return this.sesionActual;
	}

	public void setSesionActual(Integer sesionActual) {
		this.sesionActual = sesionActual;
	}

}