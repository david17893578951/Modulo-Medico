package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mdc_beneficio database table.
 * 
 */
@Entity
@Table(name="mdc_beneficio")
@NamedQuery(name="Beneficio.findAll", query="SELECT b FROM Beneficio b")
public class Beneficio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_BENEFICIO_ID_GENERATOR", sequenceName="MDC_BENEFICIO_BNF_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_BENEFICIO_ID_GENERATOR")
	@Column(name="bnf_id")
	private Integer id;

	@Column(name="bnf_disposicion")
	private String disposicion;

	@Column(name="bnf_estado")
	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="bnf_fecha_asignacion")
	private Date fechaAsignacion;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	private Persona fdiPersona;

	public Beneficio() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDisposicion() {
		return this.disposicion;
	}

	public void setDisposicion(String disposicion) {
		this.disposicion = disposicion;
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

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

}