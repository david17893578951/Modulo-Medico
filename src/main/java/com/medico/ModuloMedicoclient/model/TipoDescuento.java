package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mdc_tipo_descuento database table.
 * 
 */
@Entity
@Table(name="mdc_tipo_descuento")
@NamedQuery(name="TipoDescuento.findAll", query="SELECT t FROM TipoDescuento t")
public class TipoDescuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_TIPO_DESCUENTO_ID_GENERATOR", sequenceName="MDC_TIPO_DESCUENTO_TDC_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_TIPO_DESCUENTO_ID_GENERATOR")
	@Column(name="tdc_id")
	private Integer id;

	@Column(name="tdc_descuento")
	private String descuento;

	@Column(name="tdc_estado")
	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="tdc_fecha_asignacion")
	private Date fechaAsignacion;

	@Column(name="tdc_observacion")
	private String observacion;

	@Column(name="tdc_tipo")
	private String tipo;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	private Persona fdiPersona;

	public TipoDescuento() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescuento() {
		return this.descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaAsignacion() {
		return this.fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
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

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

}