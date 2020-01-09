package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fdi_entrenador database table.
 * 
 */
@Entity
@Table(name="fdi_entrenador")
@NamedQuery(name="FdiEntrenador.findAll", query="SELECT f FROM FdiEntrenador f")
public class FdiEntrenador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_ENTRENADOR_ENTREID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_ENTRENADOR_ENTREID_GENERATOR")
	@Column(name="entre_id")
	private Integer entreId;

	@Column(name="entre_estado")
	private Boolean entreEstado;

	@Column(name="entre_foto")
	private String entreFoto;

	@Column(name="entre_foto_cedula")
	private String entreFotoCedula;

	//uni-directional many-to-one association to FdiCategoriaDisciplina
	@ManyToOne
	@JoinColumn(name="catdisci_id")
	private FdiCategoriaDisciplina fdiCategoriaDisciplina;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	private Persona fdiPersona;

	public FdiEntrenador() {
	}

	public Integer getEntreId() {
		return this.entreId;
	}

	public void setEntreId(Integer entreId) {
		this.entreId = entreId;
	}

	public Boolean getEntreEstado() {
		return this.entreEstado;
	}

	public void setEntreEstado(Boolean entreEstado) {
		this.entreEstado = entreEstado;
	}

	public String getEntreFoto() {
		return this.entreFoto;
	}

	public void setEntreFoto(String entreFoto) {
		this.entreFoto = entreFoto;
	}

	public String getEntreFotoCedula() {
		return this.entreFotoCedula;
	}

	public void setEntreFotoCedula(String entreFotoCedula) {
		this.entreFotoCedula = entreFotoCedula;
	}

	public FdiCategoriaDisciplina getFdiCategoriaDisciplina() {
		return this.fdiCategoriaDisciplina;
	}

	public void setFdiCategoriaDisciplina(FdiCategoriaDisciplina fdiCategoriaDisciplina) {
		this.fdiCategoriaDisciplina = fdiCategoriaDisciplina;
	}

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

}