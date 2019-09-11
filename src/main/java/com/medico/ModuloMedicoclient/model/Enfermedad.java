package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_enfermedad database table.
 * 
 */
@Entity
@Table(name="mdc_enfermedad")
@NamedQuery(name="Enfermedad.findAll", query="SELECT e FROM Enfermedad e")
public class Enfermedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_ENFERMEDAD_ID_GENERATOR", sequenceName="MDC_ENFERMEDAD_NFM_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_ENFERMEDAD_ID_GENERATOR")
	@Column(name="nfm_id")
	private Integer id;

	@Column(name="nfm_categoria")
	private String categoria;

	@Column(name="nfm_codigo")
	private String codigo;

	@Column(name="nfm_nombre")
	private String nombre;

	@Column(name="nfm_tipo")
	private String tipo;

	public Enfermedad() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}