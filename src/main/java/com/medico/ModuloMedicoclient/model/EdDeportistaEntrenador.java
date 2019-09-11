package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to FdiDeportista
	@ManyToOne
	@JoinColumn(name="depor_id")
	private FdiDeportista fdiDeportista;

	//bi-directional many-to-one association to FdiEntrenador
	@ManyToOne
	@JoinColumn(name="entre_id")
	private FdiEntrenador fdiEntrenador;

	//bi-directional many-to-one association to TestDeportista
	@OneToMany(mappedBy="edDeportistaEntrenador")
	private List<TestDeportista> testDeportistas;

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

	public List<TestDeportista> getTestDeportistas() {
		return this.testDeportistas;
	}

	public void setTestDeportistas(List<TestDeportista> testDeportistas) {
		this.testDeportistas = testDeportistas;
	}

	public TestDeportista addTestDeportista(TestDeportista testDeportista) {
		getTestDeportistas().add(testDeportista);
		testDeportista.setEdDeportistaEntrenador(this);

		return testDeportista;
	}

	public TestDeportista removeTestDeportista(TestDeportista testDeportista) {
		getTestDeportistas().remove(testDeportista);
		testDeportista.setEdDeportistaEntrenador(null);

		return testDeportista;
	}

}