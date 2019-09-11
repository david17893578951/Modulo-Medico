package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.util.List;


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

	//bi-directional many-to-one association to AtrDisciplinascomparativa
	@OneToMany(mappedBy="fdiCategoriaDisciplina")
	@JsonIgnore
	private List<AtrDisciplinascomparativa> atrDisciplinascomparativas;

	//bi-directional many-to-one association to EdControlAsistencia
	@OneToMany(mappedBy="fdiCategoriaDisciplina")
	@JsonIgnore
	private List<EdControlAsistencia> edControlAsistencias;

	//bi-directional many-to-one association to FdiCategoria
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private FdiCategoria fdiCategoria;

	//bi-directional many-to-one association to FdiDisciplina
	@ManyToOne
	@JoinColumn(name="disciplina_id")
	@JsonView(Perfiles.PublicView.class)
	private FdiDisciplina fdiDisciplina;

	//bi-directional many-to-one association to FdiDeportista
	@OneToMany(mappedBy="fdiCategoriaDisciplina")
	@JsonIgnore
	private List<FdiDeportista> fdiDeportistas;

	//bi-directional many-to-one association to FdiEntrenador
	@OneToMany(mappedBy="fdiCategoriaDisciplina")
	@JsonIgnore
	private List<FdiEntrenador> fdiEntrenadors;

	public FdiCategoriaDisciplina() {
	}

	public Integer getCatdisciId() {
		return this.catdisciId;
	}

	public void setCatdisciId(Integer catdisciId) {
		this.catdisciId = catdisciId;
	}

	public List<AtrDisciplinascomparativa> getAtrDisciplinascomparativas() {
		return this.atrDisciplinascomparativas;
	}

	public void setAtrDisciplinascomparativas(List<AtrDisciplinascomparativa> atrDisciplinascomparativas) {
		this.atrDisciplinascomparativas = atrDisciplinascomparativas;
	}

	public AtrDisciplinascomparativa addAtrDisciplinascomparativa(AtrDisciplinascomparativa atrDisciplinascomparativa) {
		getAtrDisciplinascomparativas().add(atrDisciplinascomparativa);
		atrDisciplinascomparativa.setFdiCategoriaDisciplina(this);

		return atrDisciplinascomparativa;
	}

	public AtrDisciplinascomparativa removeAtrDisciplinascomparativa(AtrDisciplinascomparativa atrDisciplinascomparativa) {
		getAtrDisciplinascomparativas().remove(atrDisciplinascomparativa);
		atrDisciplinascomparativa.setFdiCategoriaDisciplina(null);

		return atrDisciplinascomparativa;
	}

	public List<EdControlAsistencia> getEdControlAsistencias() {
		return this.edControlAsistencias;
	}

	public void setEdControlAsistencias(List<EdControlAsistencia> edControlAsistencias) {
		this.edControlAsistencias = edControlAsistencias;
	}

	public EdControlAsistencia addEdControlAsistencia(EdControlAsistencia edControlAsistencia) {
		getEdControlAsistencias().add(edControlAsistencia);
		edControlAsistencia.setFdiCategoriaDisciplina(this);

		return edControlAsistencia;
	}

	public EdControlAsistencia removeEdControlAsistencia(EdControlAsistencia edControlAsistencia) {
		getEdControlAsistencias().remove(edControlAsistencia);
		edControlAsistencia.setFdiCategoriaDisciplina(null);

		return edControlAsistencia;
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

	public List<FdiDeportista> getFdiDeportistas() {
		return this.fdiDeportistas;
	}

	public void setFdiDeportistas(List<FdiDeportista> fdiDeportistas) {
		this.fdiDeportistas = fdiDeportistas;
	}

	public FdiDeportista addFdiDeportista(FdiDeportista fdiDeportista) {
		getFdiDeportistas().add(fdiDeportista);
		fdiDeportista.setFdiCategoriaDisciplina(this);

		return fdiDeportista;
	}

	public FdiDeportista removeFdiDeportista(FdiDeportista fdiDeportista) {
		getFdiDeportistas().remove(fdiDeportista);
		fdiDeportista.setFdiCategoriaDisciplina(null);

		return fdiDeportista;
	}

	public List<FdiEntrenador> getFdiEntrenadors() {
		return this.fdiEntrenadors;
	}

	public void setFdiEntrenadors(List<FdiEntrenador> fdiEntrenadors) {
		this.fdiEntrenadors = fdiEntrenadors;
	}

	public FdiEntrenador addFdiEntrenador(FdiEntrenador fdiEntrenador) {
		getFdiEntrenadors().add(fdiEntrenador);
		fdiEntrenador.setFdiCategoriaDisciplina(this);

		return fdiEntrenador;
	}

	public FdiEntrenador removeFdiEntrenador(FdiEntrenador fdiEntrenador) {
		getFdiEntrenadors().remove(fdiEntrenador);
		fdiEntrenador.setFdiCategoriaDisciplina(null);

		return fdiEntrenador;
	}

}