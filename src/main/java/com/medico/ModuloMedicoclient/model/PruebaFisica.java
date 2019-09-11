package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trp_prueba_fisica database table.
 * 
 */
@Entity
@Table(name="trp_prueba_fisica")
@NamedQuery(name="PruebaFisica.findAll", query="SELECT p FROM PruebaFisica p")
public class PruebaFisica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_PRUEBA_FISICA_ID_GENERATOR", sequenceName="TRP_PRUEBA_FISICA_PBF_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_PRUEBA_FISICA_ID_GENERATOR")
	@Column(name="pbf_id")
	private Integer id;

	@Column(name="pbf_area_afectada")
	private String areaAfectada;

	@Column(name="pbf_grado_movilidad")
	private String gradoMovilidad;

	@Column(name="pbf_instrumento")
	private String instrumento;

	@Column(name="pbf_musculo")
	private String musculo;

	@Column(name="pbf_observacion")
	private String observacion;

	//uni-directional many-to-one association to DiagnosticoFisioterapia
	@ManyToOne
	@JoinColumn(name="dgf_id")
	private DiagnosticoFisioterapia trpDiagnosticoFisioterapia;

	public PruebaFisica() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaAfectada() {
		return this.areaAfectada;
	}

	public void setAreaAfectada(String areaAfectada) {
		this.areaAfectada = areaAfectada;
	}

	public String getGradoMovilidad() {
		return this.gradoMovilidad;
	}

	public void setGradoMovilidad(String gradoMovilidad) {
		this.gradoMovilidad = gradoMovilidad;
	}

	public String getInstrumento() {
		return this.instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getMusculo() {
		return this.musculo;
	}

	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public DiagnosticoFisioterapia getTrpDiagnosticoFisioterapia() {
		return this.trpDiagnosticoFisioterapia;
	}

	public void setTrpDiagnosticoFisioterapia(DiagnosticoFisioterapia trpDiagnosticoFisioterapia) {
		this.trpDiagnosticoFisioterapia = trpDiagnosticoFisioterapia;
	}

}