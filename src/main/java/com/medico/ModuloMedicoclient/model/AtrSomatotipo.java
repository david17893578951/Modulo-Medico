package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the atr_somatotipo database table.
 * 
 */
@Entity
@Table(name="atr_somatotipo")
@NamedQuery(name="AtrSomatotipo.findAll", query="SELECT a FROM AtrSomatotipo a")
public class AtrSomatotipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_SOMATOTIPO_SOMATOID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_SOMATOTIPO_SOMATOID_GENERATOR")
	@Column(name="somato_id")
	private Integer somatoId;

	@Column(name="somato_componentecuatro")
	private BigDecimal somatoComponentecuatro;

	@Column(name="somato_componentedos")
	private BigDecimal somatoComponentedos;

	@Column(name="somato_componentetres")
	private BigDecimal somatoComponentetres;

	@Column(name="somato_componenteuno")
	private BigDecimal somatoComponenteuno;

	@Column(name="somato_ectomorfo")
	private BigDecimal somatoEctomorfo;

	@Column(name="somato_ejex")
	private BigDecimal somatoEjex;

	@Column(name="somato_ejey")
	private BigDecimal somatoEjey;

	@Column(name="somato_endomorfo")
	private BigDecimal somatoEndomorfo;

	@Column(name="somato_mesomorfo")
	private BigDecimal somatoMesomorfo;

	//bi-directional many-to-one association to AtrCategorizacion
	@OneToMany(mappedBy="atrSomatotipo")
	private List<AtrCategorizacion> atrCategorizacions;

	//bi-directional many-to-one association to AtrPlanillamedida
	@ManyToOne
	@JoinColumn(name="planilla_id")
	private AtrPlanillamedida atrPlanillamedida;

	public AtrSomatotipo() {
	}

	public Integer getSomatoId() {
		return this.somatoId;
	}

	public void setSomatoId(Integer somatoId) {
		this.somatoId = somatoId;
	}

	public BigDecimal getSomatoComponentecuatro() {
		return this.somatoComponentecuatro;
	}

	public void setSomatoComponentecuatro(BigDecimal somatoComponentecuatro) {
		this.somatoComponentecuatro = somatoComponentecuatro;
	}

	public BigDecimal getSomatoComponentedos() {
		return this.somatoComponentedos;
	}

	public void setSomatoComponentedos(BigDecimal somatoComponentedos) {
		this.somatoComponentedos = somatoComponentedos;
	}

	public BigDecimal getSomatoComponentetres() {
		return this.somatoComponentetres;
	}

	public void setSomatoComponentetres(BigDecimal somatoComponentetres) {
		this.somatoComponentetres = somatoComponentetres;
	}

	public BigDecimal getSomatoComponenteuno() {
		return this.somatoComponenteuno;
	}

	public void setSomatoComponenteuno(BigDecimal somatoComponenteuno) {
		this.somatoComponenteuno = somatoComponenteuno;
	}

	public BigDecimal getSomatoEctomorfo() {
		return this.somatoEctomorfo;
	}

	public void setSomatoEctomorfo(BigDecimal somatoEctomorfo) {
		this.somatoEctomorfo = somatoEctomorfo;
	}

	public BigDecimal getSomatoEjex() {
		return this.somatoEjex;
	}

	public void setSomatoEjex(BigDecimal somatoEjex) {
		this.somatoEjex = somatoEjex;
	}

	public BigDecimal getSomatoEjey() {
		return this.somatoEjey;
	}

	public void setSomatoEjey(BigDecimal somatoEjey) {
		this.somatoEjey = somatoEjey;
	}

	public BigDecimal getSomatoEndomorfo() {
		return this.somatoEndomorfo;
	}

	public void setSomatoEndomorfo(BigDecimal somatoEndomorfo) {
		this.somatoEndomorfo = somatoEndomorfo;
	}

	public BigDecimal getSomatoMesomorfo() {
		return this.somatoMesomorfo;
	}

	public void setSomatoMesomorfo(BigDecimal somatoMesomorfo) {
		this.somatoMesomorfo = somatoMesomorfo;
	}

	public List<AtrCategorizacion> getAtrCategorizacions() {
		return this.atrCategorizacions;
	}

	public void setAtrCategorizacions(List<AtrCategorizacion> atrCategorizacions) {
		this.atrCategorizacions = atrCategorizacions;
	}

	public AtrCategorizacion addAtrCategorizacion(AtrCategorizacion atrCategorizacion) {
		getAtrCategorizacions().add(atrCategorizacion);
		atrCategorizacion.setAtrSomatotipo(this);

		return atrCategorizacion;
	}

	public AtrCategorizacion removeAtrCategorizacion(AtrCategorizacion atrCategorizacion) {
		getAtrCategorizacions().remove(atrCategorizacion);
		atrCategorizacion.setAtrSomatotipo(null);

		return atrCategorizacion;
	}

	public AtrPlanillamedida getAtrPlanillamedida() {
		return this.atrPlanillamedida;
	}

	public void setAtrPlanillamedida(AtrPlanillamedida atrPlanillamedida) {
		this.atrPlanillamedida = atrPlanillamedida;
	}

}