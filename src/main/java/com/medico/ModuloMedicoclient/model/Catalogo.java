package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mdc_catalogo database table.
 * 
 */
@Entity
@Table(name="mdc_catalogo")
@NamedQuery(name="Catalogo.findAll", query="SELECT c FROM Catalogo c")
public class Catalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MDC_CATALOGO_ID_GENERATOR", sequenceName="MDC_CATALOGO_CAT_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MDC_CATALOGO_ID_GENERATOR")
	@Column(name="cat_id")
	private Integer id;

	@Column(name="cat_clave")
	private String clave;

	@Column(name="cat_clave_padre")
	private String clavePadre;

	@Column(name="cat_descripcion")
	private String descripcion;

	@Column(name="cat_estado")
	private String estado;

	@Column(name="cat_nombre")
	private String nombre;

	public Catalogo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClavePadre() {
		return this.clavePadre;
	}

	public void setClavePadre(String clavePadre) {
		this.clavePadre = clavePadre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}