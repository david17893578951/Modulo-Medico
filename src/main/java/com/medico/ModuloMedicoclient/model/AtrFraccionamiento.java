package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the atr_fraccionamiento database table.
 * 
 */
@Entity
@Table(name="atr_fraccionamiento")
@NamedQuery(name="AtrFraccionamiento.findAll", query="SELECT a FROM AtrFraccionamiento a")
public class AtrFraccionamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_FRACCIONAMIENTO_FRACCIOID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_FRACCIONAMIENTO_FRACCIOID_GENERATOR")
	@Column(name="fraccio_id")
	private Integer fraccioId;

	@Column(name="fraccio_difpesorealyestruckg")
	private BigDecimal fraccioDifpesorealyestruckg;

	@Column(name="fraccio_difpesorealyestrucprc")
	private BigDecimal fraccioDifpesorealyestrucprc;

	@Column(name="fraccio_mmuscularkg")
	private BigDecimal fraccioMmuscularkg;

	@Column(name="fraccio_mmuscularprc")
	private BigDecimal fraccioMmuscularprc;

	@Column(name="fraccio_mocabezakg")
	private BigDecimal fraccioMocabezakg;

	@Column(name="fraccio_mocabezaprc")
	private BigDecimal fraccioMocabezaprc;

	@Column(name="fraccio_mocuerpokg")
	private BigDecimal fraccioMocuerpokg;

	@Column(name="fraccio_mocuerpoprc")
	private BigDecimal fraccioMocuerpoprc;

	@Column(name="fraccio_moseatotalkg")
	private BigDecimal fraccioMoseatotalkg;

	@Column(name="fraccio_moseatotalprc")
	private BigDecimal fraccioMoseatotalprc;

	@Column(name="fraccio_mresidualkg")
	private BigDecimal fraccioMresidualkg;

	@Column(name="fraccio_mresidualprc")
	private BigDecimal fraccioMresidualprc;

	@Column(name="fraccio_pesoestructuradokg")
	private BigDecimal fraccioPesoestructuradokg;

	@Column(name="fraccio_pesoestructuradoprc")
	private BigDecimal fraccioPesoestructuradoprc;

	@Column(name="fraccio_pielkg")
	private BigDecimal fraccioPielkg;

	@Column(name="fraccio_pielprc")
	private BigDecimal fraccioPielprc;

	@Column(name="fraccio_sadiposo")
	private BigDecimal fraccioSadiposo;

	@Column(name="fraccio_smuscular")
	private BigDecimal fraccioSmuscular;

	@Column(name="fraccio_soseacuer")
	private BigDecimal fraccioSoseacuer;

	@Column(name="fraccio_sresidual")
	private BigDecimal fraccioSresidual;

	@Column(name="fraccio_tallamimbroinferiores")
	private BigDecimal fraccioTallamimbroinferiores;

	@Column(name="fraccio_tejidoadiposototalkg")
	private BigDecimal fraccioTejidoadiposototalkg;

	@Column(name="fraccio_tejidoadiposototalprc")
	private BigDecimal fraccioTejidoadiposototalprc;

	@Column(name="fraccio_tejidomagrototalkg")
	private BigDecimal fraccioTejidomagrototalkg;

	@Column(name="fraccio_tejidomagrototalprc")
	private BigDecimal fraccioTejidomagrototalprc;

	@Column(name="fraccio_zadiposo")
	private BigDecimal fraccioZadiposo;

	@Column(name="fraccio_zmuscular")
	private BigDecimal fraccioZmuscular;

	@Column(name="fraccio_zoseacabe")
	private BigDecimal fraccioZoseacabe;

	@Column(name="fraccio_zoseacuer")
	private BigDecimal fraccioZoseacuer;

	@Column(name="fraccio_zresidual")
	private BigDecimal fraccioZresidual;

	//uni-directional many-to-one association to AtrPlanillamedida
	@ManyToOne
	@JoinColumn(name="planilla_id")
	private AtrPlanillamedida atrPlanillamedida;

	public AtrFraccionamiento() {
	}

	public Integer getFraccioId() {
		return this.fraccioId;
	}

	public void setFraccioId(Integer fraccioId) {
		this.fraccioId = fraccioId;
	}

	public BigDecimal getFraccioDifpesorealyestruckg() {
		return this.fraccioDifpesorealyestruckg;
	}

	public void setFraccioDifpesorealyestruckg(BigDecimal fraccioDifpesorealyestruckg) {
		this.fraccioDifpesorealyestruckg = fraccioDifpesorealyestruckg;
	}

	public BigDecimal getFraccioDifpesorealyestrucprc() {
		return this.fraccioDifpesorealyestrucprc;
	}

	public void setFraccioDifpesorealyestrucprc(BigDecimal fraccioDifpesorealyestrucprc) {
		this.fraccioDifpesorealyestrucprc = fraccioDifpesorealyestrucprc;
	}

	public BigDecimal getFraccioMmuscularkg() {
		return this.fraccioMmuscularkg;
	}

	public void setFraccioMmuscularkg(BigDecimal fraccioMmuscularkg) {
		this.fraccioMmuscularkg = fraccioMmuscularkg;
	}

	public BigDecimal getFraccioMmuscularprc() {
		return this.fraccioMmuscularprc;
	}

	public void setFraccioMmuscularprc(BigDecimal fraccioMmuscularprc) {
		this.fraccioMmuscularprc = fraccioMmuscularprc;
	}

	public BigDecimal getFraccioMocabezakg() {
		return this.fraccioMocabezakg;
	}

	public void setFraccioMocabezakg(BigDecimal fraccioMocabezakg) {
		this.fraccioMocabezakg = fraccioMocabezakg;
	}

	public BigDecimal getFraccioMocabezaprc() {
		return this.fraccioMocabezaprc;
	}

	public void setFraccioMocabezaprc(BigDecimal fraccioMocabezaprc) {
		this.fraccioMocabezaprc = fraccioMocabezaprc;
	}

	public BigDecimal getFraccioMocuerpokg() {
		return this.fraccioMocuerpokg;
	}

	public void setFraccioMocuerpokg(BigDecimal fraccioMocuerpokg) {
		this.fraccioMocuerpokg = fraccioMocuerpokg;
	}

	public BigDecimal getFraccioMocuerpoprc() {
		return this.fraccioMocuerpoprc;
	}

	public void setFraccioMocuerpoprc(BigDecimal fraccioMocuerpoprc) {
		this.fraccioMocuerpoprc = fraccioMocuerpoprc;
	}

	public BigDecimal getFraccioMoseatotalkg() {
		return this.fraccioMoseatotalkg;
	}

	public void setFraccioMoseatotalkg(BigDecimal fraccioMoseatotalkg) {
		this.fraccioMoseatotalkg = fraccioMoseatotalkg;
	}

	public BigDecimal getFraccioMoseatotalprc() {
		return this.fraccioMoseatotalprc;
	}

	public void setFraccioMoseatotalprc(BigDecimal fraccioMoseatotalprc) {
		this.fraccioMoseatotalprc = fraccioMoseatotalprc;
	}

	public BigDecimal getFraccioMresidualkg() {
		return this.fraccioMresidualkg;
	}

	public void setFraccioMresidualkg(BigDecimal fraccioMresidualkg) {
		this.fraccioMresidualkg = fraccioMresidualkg;
	}

	public BigDecimal getFraccioMresidualprc() {
		return this.fraccioMresidualprc;
	}

	public void setFraccioMresidualprc(BigDecimal fraccioMresidualprc) {
		this.fraccioMresidualprc = fraccioMresidualprc;
	}

	public BigDecimal getFraccioPesoestructuradokg() {
		return this.fraccioPesoestructuradokg;
	}

	public void setFraccioPesoestructuradokg(BigDecimal fraccioPesoestructuradokg) {
		this.fraccioPesoestructuradokg = fraccioPesoestructuradokg;
	}

	public BigDecimal getFraccioPesoestructuradoprc() {
		return this.fraccioPesoestructuradoprc;
	}

	public void setFraccioPesoestructuradoprc(BigDecimal fraccioPesoestructuradoprc) {
		this.fraccioPesoestructuradoprc = fraccioPesoestructuradoprc;
	}

	public BigDecimal getFraccioPielkg() {
		return this.fraccioPielkg;
	}

	public void setFraccioPielkg(BigDecimal fraccioPielkg) {
		this.fraccioPielkg = fraccioPielkg;
	}

	public BigDecimal getFraccioPielprc() {
		return this.fraccioPielprc;
	}

	public void setFraccioPielprc(BigDecimal fraccioPielprc) {
		this.fraccioPielprc = fraccioPielprc;
	}

	public BigDecimal getFraccioSadiposo() {
		return this.fraccioSadiposo;
	}

	public void setFraccioSadiposo(BigDecimal fraccioSadiposo) {
		this.fraccioSadiposo = fraccioSadiposo;
	}

	public BigDecimal getFraccioSmuscular() {
		return this.fraccioSmuscular;
	}

	public void setFraccioSmuscular(BigDecimal fraccioSmuscular) {
		this.fraccioSmuscular = fraccioSmuscular;
	}

	public BigDecimal getFraccioSoseacuer() {
		return this.fraccioSoseacuer;
	}

	public void setFraccioSoseacuer(BigDecimal fraccioSoseacuer) {
		this.fraccioSoseacuer = fraccioSoseacuer;
	}

	public BigDecimal getFraccioSresidual() {
		return this.fraccioSresidual;
	}

	public void setFraccioSresidual(BigDecimal fraccioSresidual) {
		this.fraccioSresidual = fraccioSresidual;
	}

	public BigDecimal getFraccioTallamimbroinferiores() {
		return this.fraccioTallamimbroinferiores;
	}

	public void setFraccioTallamimbroinferiores(BigDecimal fraccioTallamimbroinferiores) {
		this.fraccioTallamimbroinferiores = fraccioTallamimbroinferiores;
	}

	public BigDecimal getFraccioTejidoadiposototalkg() {
		return this.fraccioTejidoadiposototalkg;
	}

	public void setFraccioTejidoadiposototalkg(BigDecimal fraccioTejidoadiposototalkg) {
		this.fraccioTejidoadiposototalkg = fraccioTejidoadiposototalkg;
	}

	public BigDecimal getFraccioTejidoadiposototalprc() {
		return this.fraccioTejidoadiposototalprc;
	}

	public void setFraccioTejidoadiposototalprc(BigDecimal fraccioTejidoadiposototalprc) {
		this.fraccioTejidoadiposototalprc = fraccioTejidoadiposototalprc;
	}

	public BigDecimal getFraccioTejidomagrototalkg() {
		return this.fraccioTejidomagrototalkg;
	}

	public void setFraccioTejidomagrototalkg(BigDecimal fraccioTejidomagrototalkg) {
		this.fraccioTejidomagrototalkg = fraccioTejidomagrototalkg;
	}

	public BigDecimal getFraccioTejidomagrototalprc() {
		return this.fraccioTejidomagrototalprc;
	}

	public void setFraccioTejidomagrototalprc(BigDecimal fraccioTejidomagrototalprc) {
		this.fraccioTejidomagrototalprc = fraccioTejidomagrototalprc;
	}

	public BigDecimal getFraccioZadiposo() {
		return this.fraccioZadiposo;
	}

	public void setFraccioZadiposo(BigDecimal fraccioZadiposo) {
		this.fraccioZadiposo = fraccioZadiposo;
	}

	public BigDecimal getFraccioZmuscular() {
		return this.fraccioZmuscular;
	}

	public void setFraccioZmuscular(BigDecimal fraccioZmuscular) {
		this.fraccioZmuscular = fraccioZmuscular;
	}

	public BigDecimal getFraccioZoseacabe() {
		return this.fraccioZoseacabe;
	}

	public void setFraccioZoseacabe(BigDecimal fraccioZoseacabe) {
		this.fraccioZoseacabe = fraccioZoseacabe;
	}

	public BigDecimal getFraccioZoseacuer() {
		return this.fraccioZoseacuer;
	}

	public void setFraccioZoseacuer(BigDecimal fraccioZoseacuer) {
		this.fraccioZoseacuer = fraccioZoseacuer;
	}

	public BigDecimal getFraccioZresidual() {
		return this.fraccioZresidual;
	}

	public void setFraccioZresidual(BigDecimal fraccioZresidual) {
		this.fraccioZresidual = fraccioZresidual;
	}

	public AtrPlanillamedida getAtrPlanillamedida() {
		return this.atrPlanillamedida;
	}

	public void setAtrPlanillamedida(AtrPlanillamedida atrPlanillamedida) {
		this.atrPlanillamedida = atrPlanillamedida;
	}

}