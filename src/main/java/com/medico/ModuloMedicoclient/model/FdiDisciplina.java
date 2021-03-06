package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;


/**
 * The persistent class for the fdi_disciplina database table.
 * 
 */
@Entity
@Table(name="fdi_disciplina")
@NamedQuery(name="FdiDisciplina.findAll", query="SELECT f FROM FdiDisciplina f")
public class FdiDisciplina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_DISCIPLINA_DISCIPLINAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_DISCIPLINA_DISCIPLINAID_GENERATOR")
	@Column(name="disciplina_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer disciplinaId;

	@Column(name="disciplina_nombre")
	@JsonView(Perfiles.PublicView.class)
	private String disciplinaNombre;

	//uni-directional many-to-one association to EdCamposEntrenamiento
	@ManyToOne
	@JoinColumn(name="campentre_id")
	private EdCamposEntrenamiento edCamposEntrenamiento;

	public FdiDisciplina() {
	}

	public Integer getDisciplinaId() {
		return this.disciplinaId;
	}

	public void setDisciplinaId(Integer disciplinaId) {
		this.disciplinaId = disciplinaId;
	}

	public String getDisciplinaNombre() {
		return this.disciplinaNombre;
	}

	public void setDisciplinaNombre(String disciplinaNombre) {
		this.disciplinaNombre = disciplinaNombre;
	}

	public EdCamposEntrenamiento getEdCamposEntrenamiento() {
		return this.edCamposEntrenamiento;
	}

	public void setEdCamposEntrenamiento(EdCamposEntrenamiento edCamposEntrenamiento) {
		this.edCamposEntrenamiento = edCamposEntrenamiento;
	}

}