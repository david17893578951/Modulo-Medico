package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mdc_calendario database table.
 * 
 */
@Entity
@Table(name="mdc_calendario")
@NamedQuery(name="Calendario.findAll", query="SELECT c FROM Calendario c")
public class Calendario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_CALENDARIO_ID_GENERATOR", sequenceName="MDC_CALENDARIO_CLD_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_CALENDARIO_ID_GENERATOR")
	@Column(name="cld_id")
	private Integer id;

	@Column(name="cld_area")
	private String area;

	@Column(name="cld_descripcion")
	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="cld_fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="cld_fecha_inicio")
	private Date fechaInicio;

	public Calendario() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

}