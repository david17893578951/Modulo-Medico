package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ed_deportista_entrenador database table.
 * 
 */
@Entity
@Table(name="ed_deportista_entrenador")
@NamedQuery(name="EdDeportistaEntrenador.findAll", query="SELECT e FROM EdDeportistaEntrenador e")
public class EdDeportistaEntrenador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ED_DEPORTISTA_ENTRENADOR_IDDEPENTRE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ED_DEPORTISTA_ENTRENADOR_IDDEPENTRE_GENERATOR")
	@Column(name="id_dep_entre")
	private Integer idDepEntre;

	//uni-directional many-to-one association to FdiDeportista
	@ManyToOne
	@JoinColumn(name="depor_id")
	private FdiDeportista fdiDeportista;

	//uni-directional many-to-one association to FdiEntrenador
	@ManyToOne
	@JoinColumn(name="entre_id")
	private FdiEntrenador fdiEntrenador;

	public EdDeportistaEntrenador() {
	}

	public Integer getIdDepEntre() {
		return this.idDepEntre;
	}

	public void setIdDepEntre(Integer idDepEntre) {
		this.idDepEntre = idDepEntre;
	}

	public FdiDeportista getFdiDeportista() {
		return this.fdiDeportista;
	}

	public void setFdiDeportista(FdiDeportista fdiDeportista) {
		this.fdiDeportista = fdiDeportista;
	}

	public FdiEntrenador getFdiEntrenador() {
		return this.fdiEntrenador;
	}

	public void setFdiEntrenador(FdiEntrenador fdiEntrenador) {
		this.fdiEntrenador = fdiEntrenador;
	}

}