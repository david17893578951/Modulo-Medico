package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


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

}