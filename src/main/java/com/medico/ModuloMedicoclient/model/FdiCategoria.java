package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


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

	//bi-directional many-to-one association to FdiCategoriaDisciplina
	@OneToMany(mappedBy="fdiCategoria")
	@JsonIgnore
	private List<FdiCategoriaDisciplina> fdiCategoriaDisciplinas;

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

	public List<FdiCategoriaDisciplina> getFdiCategoriaDisciplinas() {
		return this.fdiCategoriaDisciplinas;
	}

	public void setFdiCategoriaDisciplinas(List<FdiCategoriaDisciplina> fdiCategoriaDisciplinas) {
		this.fdiCategoriaDisciplinas = fdiCategoriaDisciplinas;
	}

	public FdiCategoriaDisciplina addFdiCategoriaDisciplina(FdiCategoriaDisciplina fdiCategoriaDisciplina) {
		getFdiCategoriaDisciplinas().add(fdiCategoriaDisciplina);
		fdiCategoriaDisciplina.setFdiCategoria(this);

		return fdiCategoriaDisciplina;
	}

	public FdiCategoriaDisciplina removeFdiCategoriaDisciplina(FdiCategoriaDisciplina fdiCategoriaDisciplina) {
		getFdiCategoriaDisciplinas().remove(fdiCategoriaDisciplina);
		fdiCategoriaDisciplina.setFdiCategoria(null);

		return fdiCategoriaDisciplina;
	}

}