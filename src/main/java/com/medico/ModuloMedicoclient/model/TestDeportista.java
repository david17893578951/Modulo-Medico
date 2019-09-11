package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the test_deportistas database table.
 * 
 */
@Entity
@Table(name="test_deportistas")
@NamedQuery(name="TestDeportista.findAll", query="SELECT t FROM TestDeportista t")
public class TestDeportista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TEST_DEPORTISTAS_IDTEST_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEST_DEPORTISTAS_IDTEST_GENERATOR")
	@Column(name="id_test")
	private Integer idTest;

	private String escalon;

	private String evaluacion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String mesociclo;

	@Column(name="nro_deportistas")
	private Integer nroDeportistas;

	private String objetivo;

	private String peso;

	private String talla;

	@Column(name="tipo_test")
	private String tipoTest;

	private String toma1;

	private String toma2;

	private String toma3;

	private String toma4;

	private String toma5;

	//bi-directional many-to-one association to EdDeportistaEntrenador
	@ManyToOne
	@JoinColumn(name="id_dep_entre")
	private EdDeportistaEntrenador edDeportistaEntrenador;

	public TestDeportista() {
	}

	public Integer getIdTest() {
		return this.idTest;
	}

	public void setIdTest(Integer idTest) {
		this.idTest = idTest;
	}

	public String getEscalon() {
		return this.escalon;
	}

	public void setEscalon(String escalon) {
		this.escalon = escalon;
	}

	public String getEvaluacion() {
		return this.evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMesociclo() {
		return this.mesociclo;
	}

	public void setMesociclo(String mesociclo) {
		this.mesociclo = mesociclo;
	}

	public Integer getNroDeportistas() {
		return this.nroDeportistas;
	}

	public void setNroDeportistas(Integer nroDeportistas) {
		this.nroDeportistas = nroDeportistas;
	}

	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getPeso() {
		return this.peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTalla() {
		return this.talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTipoTest() {
		return this.tipoTest;
	}

	public void setTipoTest(String tipoTest) {
		this.tipoTest = tipoTest;
	}

	public String getToma1() {
		return this.toma1;
	}

	public void setToma1(String toma1) {
		this.toma1 = toma1;
	}

	public String getToma2() {
		return this.toma2;
	}

	public void setToma2(String toma2) {
		this.toma2 = toma2;
	}

	public String getToma3() {
		return this.toma3;
	}

	public void setToma3(String toma3) {
		this.toma3 = toma3;
	}

	public String getToma4() {
		return this.toma4;
	}

	public void setToma4(String toma4) {
		this.toma4 = toma4;
	}

	public String getToma5() {
		return this.toma5;
	}

	public void setToma5(String toma5) {
		this.toma5 = toma5;
	}

	public EdDeportistaEntrenador getEdDeportistaEntrenador() {
		return this.edDeportistaEntrenador;
	}

	public void setEdDeportistaEntrenador(EdDeportistaEntrenador edDeportistaEntrenador) {
		this.edDeportistaEntrenador = edDeportistaEntrenador;
	}

}