package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;


/**
 * The persistent class for the fdi_categoria_disciplina database table.
 * 
 */
@Entity
@Table(name="fdi_categoria_disciplina")
@NamedQuery(name="FdiCategoriaDisciplina.findAll", query="SELECT f FROM FdiCategoriaDisciplina f")
public class FdiCategoriaDisciplina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_CATEGORIA_DISCIPLINA_CATDISCIID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_CATEGORIA_DISCIPLINA_CATDISCIID_GENERATOR")
	@Column(name="catdisci_id")
	private Integer catdisciId;

	//uni-directional many-to-one association to FdiCategoria
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private FdiCategoria fdiCategoria;

	//uni-directional many-to-one association to FdiDisciplina
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	@JsonView(Perfiles.PublicView.class)
	private FdiDisciplina fdiDisciplina;

	public FdiCategoriaDisciplina() {
	}

	public Integer getCatdisciId() {
		return this.catdisciId;
	}

	public void setCatdisciId(Integer catdisciId) {
		this.catdisciId = catdisciId;
	}

	public FdiCategoria getFdiCategoria() {
		return this.fdiCategoria;
	}

	public void setFdiCategoria(FdiCategoria fdiCategoria) {
		this.fdiCategoria = fdiCategoria;
	}

	public FdiDisciplina getFdiDisciplina() {
		return this.fdiDisciplina;
	}

	public void setFdiDisciplina(FdiDisciplina fdiDisciplina) {
		this.fdiDisciplina = fdiDisciplina;
	}

}