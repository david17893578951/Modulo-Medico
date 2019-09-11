package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_area database table.
 * 
 */
@Entity
@Table(name="mdc_area")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_AREA_ID_GENERATOR", sequenceName="MDC_AREA_ARA_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_AREA_ID_GENERATOR")
	@Column(name="ara_id")
	private Integer id;

	@Column(name="ara_subtipo")
	private String subtipo;

	@Column(name="ara_tipo")
	private String tipo;

	public Area() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubtipo() {
		return this.subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}