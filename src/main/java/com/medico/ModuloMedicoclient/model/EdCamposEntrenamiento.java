package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ed_campos_entrenamiento database table.
 * 
 */
@Entity
@Table(name="ed_campos_entrenamiento")
@NamedQuery(name="EdCamposEntrenamiento.findAll", query="SELECT e FROM EdCamposEntrenamiento e")
public class EdCamposEntrenamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ED_CAMPOS_ENTRENAMIENTO_CAMPENTREID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ED_CAMPOS_ENTRENAMIENTO_CAMPENTREID_GENERATOR")
	@Column(name="campentre_id")
	private Integer campentreId;

	@Column(name="campentre_nombre")
	private String campentreNombre;

	//bi-directional many-to-one association to FdiDisciplina
	@OneToMany(mappedBy="edCamposEntrenamiento")
	private List<FdiDisciplina> fdiDisciplinas;

	public EdCamposEntrenamiento() {
	}

	public Integer getCampentreId() {
		return this.campentreId;
	}

	public void setCampentreId(Integer campentreId) {
		this.campentreId = campentreId;
	}

	public String getCampentreNombre() {
		return this.campentreNombre;
	}

	public void setCampentreNombre(String campentreNombre) {
		this.campentreNombre = campentreNombre;
	}

	public List<FdiDisciplina> getFdiDisciplinas() {
		return this.fdiDisciplinas;
	}

	public void setFdiDisciplinas(List<FdiDisciplina> fdiDisciplinas) {
		this.fdiDisciplinas = fdiDisciplinas;
	}

	public FdiDisciplina addFdiDisciplina(FdiDisciplina fdiDisciplina) {
		getFdiDisciplinas().add(fdiDisciplina);
		fdiDisciplina.setEdCamposEntrenamiento(this);

		return fdiDisciplina;
	}

	public FdiDisciplina removeFdiDisciplina(FdiDisciplina fdiDisciplina) {
		getFdiDisciplinas().remove(fdiDisciplina);
		fdiDisciplina.setEdCamposEntrenamiento(null);

		return fdiDisciplina;
	}

}