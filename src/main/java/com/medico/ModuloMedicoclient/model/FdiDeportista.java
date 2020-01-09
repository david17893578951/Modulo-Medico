package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.math.BigDecimal;

/**
 * The persistent class for the fdi_deportistas database table.
 * 
 */
@Entity
@Table(name = "fdi_deportistas")
@NamedQuery(name = "FdiDeportista.findAll", query = "SELECT f FROM FdiDeportista f")
public class FdiDeportista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FDI_DEPORTISTAS_DEPORID_GENERATOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FDI_DEPORTISTAS_DEPORID_GENERATOR")
	@Column(name = "depor_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer deporId;

	@Column(name = "deport_baja_dificultad")
	private String deportBajaDificultad;

	@Column(name = "deport_baja_medidas_tomadas")
	private String deportBajaMedidasTomadas;

	@Column(name = "deport_baja_motivo_baja")
	private String deportBajaMotivoBaja;

	@Column(name = "deport_baja_observacion")
	private String deportBajaObservacion;

	@Column(name = "deport_baja_recomendacion")
	private String deportBajaRecomendacion;

	@Column(name = "deport_baja_tiempo_area")
	private String deportBajaTiempoArea;

	@Column(name = "deport_calzado")
	private BigDecimal deportCalzado;

	@Column(name = "deport_divisprueba")
	private String deportDivisprueba;

	@Column(name = "deport_estado")
	private Boolean deportEstado;

	@Column(name = "deport_estratosocial")
	private String deportEstratosocial;

	@Column(name = "deport_foto")
	private String deportFoto;

	@Column(name = "deport_fotocedula")
	private String deportFotocedula;

	@Column(name = "deport_instieducativa")
	private String deportInstieducativa;

	@Column(name = "deport_niveleducativo")
	private String deportNiveleducativo;

	@Column(name = "deport_nrohermanos")
	private Integer deportNrohermanos;

	@Column(name = "deport_tallaunif")
	private String deportTallaunif;

	@Column(name = "deport_tipodeport")
	private String deportTipodeport;

	// uni-directional many-to-one association to FdiCategoriaDisciplina
	@ManyToOne
	@JoinColumn(name = "catdisci_id")
	@JsonView(Perfiles.PublicView.class)
	private FdiCategoriaDisciplina fdiCategoriaDisciplina;

	// uni-directional many-to-one association to Persona
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prs_id")
	@JsonIgnoreProperties(value = { "fdiDeportistas" })
	private Persona fdiPersona;

	public FdiDeportista() {
	}

	public Integer getDeporId() {
		return this.deporId;
	}

	public void setDeporId(Integer deporId) {
		this.deporId = deporId;
	}

	public String getDeportBajaDificultad() {
		return this.deportBajaDificultad;
	}

	public void setDeportBajaDificultad(String deportBajaDificultad) {
		this.deportBajaDificultad = deportBajaDificultad;
	}

	public String getDeportBajaMedidasTomadas() {
		return this.deportBajaMedidasTomadas;
	}

	public void setDeportBajaMedidasTomadas(String deportBajaMedidasTomadas) {
		this.deportBajaMedidasTomadas = deportBajaMedidasTomadas;
	}

	public String getDeportBajaMotivoBaja() {
		return this.deportBajaMotivoBaja;
	}

	public void setDeportBajaMotivoBaja(String deportBajaMotivoBaja) {
		this.deportBajaMotivoBaja = deportBajaMotivoBaja;
	}

	public String getDeportBajaObservacion() {
		return this.deportBajaObservacion;
	}

	public void setDeportBajaObservacion(String deportBajaObservacion) {
		this.deportBajaObservacion = deportBajaObservacion;
	}

	public String getDeportBajaRecomendacion() {
		return this.deportBajaRecomendacion;
	}

	public void setDeportBajaRecomendacion(String deportBajaRecomendacion) {
		this.deportBajaRecomendacion = deportBajaRecomendacion;
	}

	public String getDeportBajaTiempoArea() {
		return this.deportBajaTiempoArea;
	}

	public void setDeportBajaTiempoArea(String deportBajaTiempoArea) {
		this.deportBajaTiempoArea = deportBajaTiempoArea;
	}

	public BigDecimal getDeportCalzado() {
		return this.deportCalzado;
	}

	public void setDeportCalzado(BigDecimal deportCalzado) {
		this.deportCalzado = deportCalzado;
	}

	public String getDeportDivisprueba() {
		return this.deportDivisprueba;
	}

	public void setDeportDivisprueba(String deportDivisprueba) {
		this.deportDivisprueba = deportDivisprueba;
	}

	public Boolean getDeportEstado() {
		return this.deportEstado;
	}

	public void setDeportEstado(Boolean deportEstado) {
		this.deportEstado = deportEstado;
	}

	public String getDeportEstratosocial() {
		return this.deportEstratosocial;
	}

	public void setDeportEstratosocial(String deportEstratosocial) {
		this.deportEstratosocial = deportEstratosocial;
	}

	public String getDeportFoto() {
		return this.deportFoto;
	}

	public void setDeportFoto(String deportFoto) {
		this.deportFoto = deportFoto;
	}

	public String getDeportFotocedula() {
		return this.deportFotocedula;
	}

	public void setDeportFotocedula(String deportFotocedula) {
		this.deportFotocedula = deportFotocedula;
	}

	public String getDeportInstieducativa() {
		return this.deportInstieducativa;
	}

	public void setDeportInstieducativa(String deportInstieducativa) {
		this.deportInstieducativa = deportInstieducativa;
	}

	public String getDeportNiveleducativo() {
		return this.deportNiveleducativo;
	}

	public void setDeportNiveleducativo(String deportNiveleducativo) {
		this.deportNiveleducativo = deportNiveleducativo;
	}

	public Integer getDeportNrohermanos() {
		return this.deportNrohermanos;
	}

	public void setDeportNrohermanos(Integer deportNrohermanos) {
		this.deportNrohermanos = deportNrohermanos;
	}

	public String getDeportTallaunif() {
		return this.deportTallaunif;
	}

	public void setDeportTallaunif(String deportTallaunif) {
		this.deportTallaunif = deportTallaunif;
	}

	public String getDeportTipodeport() {
		return this.deportTipodeport;
	}

	public void setDeportTipodeport(String deportTipodeport) {
		this.deportTipodeport = deportTipodeport;
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