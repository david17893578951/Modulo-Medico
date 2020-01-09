package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fdi_categoria database table.
 * 
 */
@Entity
@Table(name="fdi_categoria")
@NamedQuery(name="FdiCategoria.findAll", query="SELECT f FROM FdiCategoria f")
public class FdiCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_CATEGORIA_CATEGORIAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_CATEGORIA_CATEGORIAID_GENERATOR")
	@Column(name="categoria_id")
	private Integer categoriaId;

	@Column(name="categoria_descripcion")
	private String categoriaDescripcion;

	@Column(name="categoria_nombre")
	private String categoriaNombre;

	public FdiCategoria() {
	}

	public Integer getCategoriaId() {
		return this.categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaDescripcion() {
		return this.categoriaDescripcion;
	}

	public void setCategoriaDescripcion(String categoriaDescripcion) {
		this.categoriaDescripcion = categoriaDescripcion;
	}

	public String getCategoriaNombre() {
		return this.categoriaNombre;
	}

	public void setCategoriaNombre(String categoriaNombre) {
		this.categoriaNombre = categoriaNombre;
	}

}