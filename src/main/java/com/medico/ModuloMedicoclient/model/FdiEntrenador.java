package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to AtrPlanillamedida
	@OneToMany(mappedBy="fdiEntrenador1")
	private List<AtrPlanillamedida> atrPlanillamedidas1;

	//bi-directional many-to-one association to AtrPlanillamedida
	@OneToMany(mappedBy="fdiEntrenador2")
	private List<AtrPlanillamedida> atrPlanillamedidas2;

	//bi-directional many-to-one association to EdDeportistaEntrenador
	@OneToMany(mappedBy="fdiEntrenador")
	private List<EdDeportistaEntrenador> edDeportistaEntrenadors;

	//bi-directional many-to-one association to FdiCategoriaDisciplina
	@ManyToOne
	@JoinColumn(name="catdisci_id")
	private FdiCategoriaDisciplina fdiCategoriaDisciplina;

	//bi-directional many-to-one association to Persona
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

	public List<AtrPlanillamedida> getAtrPlanillamedidas1() {
		return this.atrPlanillamedidas1;
	}

	public void setAtrPlanillamedidas1(List<AtrPlanillamedida> atrPlanillamedidas1) {
		this.atrPlanillamedidas1 = atrPlanillamedidas1;
	}

	public AtrPlanillamedida addAtrPlanillamedidas1(AtrPlanillamedida atrPlanillamedidas1) {
		getAtrPlanillamedidas1().add(atrPlanillamedidas1);
		atrPlanillamedidas1.setFdiEntrenador1(this);

		return atrPlanillamedidas1;
	}

	public AtrPlanillamedida removeAtrPlanillamedidas1(AtrPlanillamedida atrPlanillamedidas1) {
		getAtrPlanillamedidas1().remove(atrPlanillamedidas1);
		atrPlanillamedidas1.setFdiEntrenador1(null);

		return atrPlanillamedidas1;
	}

	public List<AtrPlanillamedida> getAtrPlanillamedidas2() {
		return this.atrPlanillamedidas2;
	}

	public void setAtrPlanillamedidas2(List<AtrPlanillamedida> atrPlanillamedidas2) {
		this.atrPlanillamedidas2 = atrPlanillamedidas2;
	}

	public AtrPlanillamedida addAtrPlanillamedidas2(AtrPlanillamedida atrPlanillamedidas2) {
		getAtrPlanillamedidas2().add(atrPlanillamedidas2);
		atrPlanillamedidas2.setFdiEntrenador2(this);

		return atrPlanillamedidas2;
	}

	public AtrPlanillamedida removeAtrPlanillamedidas2(AtrPlanillamedida atrPlanillamedidas2) {
		getAtrPlanillamedidas2().remove(atrPlanillamedidas2);
		atrPlanillamedidas2.setFdiEntrenador2(null);

		return atrPlanillamedidas2;
	}

	public List<EdDeportistaEntrenador> getEdDeportistaEntrenadors() {
		return this.edDeportistaEntrenadors;
	}

	public void setEdDeportistaEntrenadors(List<EdDeportistaEntrenador> edDeportistaEntrenadors) {
		this.edDeportistaEntrenadors = edDeportistaEntrenadors;
	}

	public EdDeportistaEntrenador addEdDeportistaEntrenador(EdDeportistaEntrenador edDeportistaEntrenador) {
		getEdDeportistaEntrenadors().add(edDeportistaEntrenador);
		edDeportistaEntrenador.setFdiEntrenador(this);

		return edDeportistaEntrenador;
	}

	public EdDeportistaEntrenador removeEdDeportistaEntrenador(EdDeportistaEntrenador edDeportistaEntrenador) {
		getEdDeportistaEntrenadors().remove(edDeportistaEntrenador);
		edDeportistaEntrenador.setFdiEntrenador(null);

		return edDeportistaEntrenador;
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