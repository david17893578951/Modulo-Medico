package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the atr_indiceestadosalud database table.
 * 
 */
@Entity
@Table(name="atr_indiceestadosalud")
@NamedQuery(name="AtrIndiceestadosalud.findAll", query="SELECT a FROM AtrIndiceestadosalud a")
public class AtrIndiceestadosalud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ATR_INDICEESTADOSALUD_INDIID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ATR_INDICEESTADOSALUD_INDIID_GENERATOR")
	@Column(name="indi_id")
	private Integer indiId;

	@Column(name="indi_acril")
	private BigDecimal indiAcril;

	@Column(name="indi_acril_clf")
	private String indiAcrilClf;

	@Column(name="indi_adimus")
	private BigDecimal indiAdimus;

	@Column(name="indi_adimus_clf")
	private String indiAdimusClf;

	@Column(name="indi_bodmas")
	private BigDecimal indiBodmas;

	@Column(name="indi_bodmas_clf")
	private String indiBodmasClf;

	@Column(name="indi_braq")
	private BigDecimal indiBraq;

	@Column(name="indi_braq_clf")
	private String indiBraqClf;

	@Column(name="indi_cintucade")
	private BigDecimal indiCintucade;

	@Column(name="indi_cintucade_clf")
	private String indiCintucadeClf;

	@Column(name="indi_coni")
	private BigDecimal indiConi;

	@Column(name="indi_coni_clf")
	private String indiConiClf;

	@Column(name="indi_cor")
	private BigDecimal indiCor;

	@Column(name="indi_cor_clf")
	private String indiCorClf;

	@Column(name="indi_crur")
	private BigDecimal indiCrur;

	@Column(name="indi_crur_clf")
	private String indiCrurClf;

	@Column(name="indi_enver")
	private BigDecimal indiEnver;

	@Column(name="indi_enver_clf")
	private String indiEnverClf;

	@Column(name="indi_esq")
	private BigDecimal indiEsq;

	@Column(name="indi_esq_clf")
	private String indiEsqClf;

	@Column(name="indi_estapred")
	private BigDecimal indiEstapred;

	@Column(name="indi_estapred_clf")
	private String indiEstapredClf;

	@Column(name="indi_interm")
	private BigDecimal indiInterm;

	@Column(name="indi_interm_clf")
	private String indiIntermClf;

	@Column(name="indi_irei")
	private BigDecimal indiIrei;

	@Column(name="indi_irei_clf")
	private String indiIreiClf;

	@Column(name="indi_ires")
	private BigDecimal indiIres;

	@Column(name="indi_ires_clf")
	private String indiIresClf;

	@Column(name="indi_mushue")
	private BigDecimal indiMushue;

	@Column(name="indi_mushue_clf")
	private String indiMushueClf;

	//bi-directional many-to-one association to AtrFraccionamiento
	@ManyToOne
	@JoinColumn(name="fraccio_id")
	private AtrFraccionamiento atrFraccionamiento;

	public AtrIndiceestadosalud() {
	}

	public Integer getIndiId() {
		return this.indiId;
	}

	public void setIndiId(Integer indiId) {
		this.indiId = indiId;
	}

	public BigDecimal getIndiAcril() {
		return this.indiAcril;
	}

	public void setIndiAcril(BigDecimal indiAcril) {
		this.indiAcril = indiAcril;
	}

	public String getIndiAcrilClf() {
		return this.indiAcrilClf;
	}

	public void setIndiAcrilClf(String indiAcrilClf) {
		this.indiAcrilClf = indiAcrilClf;
	}

	public BigDecimal getIndiAdimus() {
		return this.indiAdimus;
	}

	public void setIndiAdimus(BigDecimal indiAdimus) {
		this.indiAdimus = indiAdimus;
	}

	public String getIndiAdimusClf() {
		return this.indiAdimusClf;
	}

	public void setIndiAdimusClf(String indiAdimusClf) {
		this.indiAdimusClf = indiAdimusClf;
	}

	public BigDecimal getIndiBodmas() {
		return this.indiBodmas;
	}

	public void setIndiBodmas(BigDecimal indiBodmas) {
		this.indiBodmas = indiBodmas;
	}

	public String getIndiBodmasClf() {
		return this.indiBodmasClf;
	}

	public void setIndiBodmasClf(String indiBodmasClf) {
		this.indiBodmasClf = indiBodmasClf;
	}

	public BigDecimal getIndiBraq() {
		return this.indiBraq;
	}

	public void setIndiBraq(BigDecimal indiBraq) {
		this.indiBraq = indiBraq;
	}

	public String getIndiBraqClf() {
		return this.indiBraqClf;
	}

	public void setIndiBraqClf(String indiBraqClf) {
		this.indiBraqClf = indiBraqClf;
	}

	public BigDecimal getIndiCintucade() {
		return this.indiCintucade;
	}

	public void setIndiCintucade(BigDecimal indiCintucade) {
		this.indiCintucade = indiCintucade;
	}

	public String getIndiCintucadeClf() {
		return this.indiCintucadeClf;
	}

	public void setIndiCintucadeClf(String indiCintucadeClf) {
		this.indiCintucadeClf = indiCintucadeClf;
	}

	public BigDecimal getIndiConi() {
		return this.indiConi;
	}

	public void setIndiConi(BigDecimal indiConi) {
		this.indiConi = indiConi;
	}

	public String getIndiConiClf() {
		return this.indiConiClf;
	}

	public void setIndiConiClf(String indiConiClf) {
		this.indiConiClf = indiConiClf;
	}

	public BigDecimal getIndiCor() {
		return this.indiCor;
	}

	public void setIndiCor(BigDecimal indiCor) {
		this.indiCor = indiCor;
	}

	public String getIndiCorClf() {
		return this.indiCorClf;
	}

	public void setIndiCorClf(String indiCorClf) {
		this.indiCorClf = indiCorClf;
	}

	public BigDecimal getIndiCrur() {
		return this.indiCrur;
	}

	public void setIndiCrur(BigDecimal indiCrur) {
		this.indiCrur = indiCrur;
	}

	public String getIndiCrurClf() {
		return this.indiCrurClf;
	}

	public void setIndiCrurClf(String indiCrurClf) {
		this.indiCrurClf = indiCrurClf;
	}

	public BigDecimal getIndiEnver() {
		return this.indiEnver;
	}

	public void setIndiEnver(BigDecimal indiEnver) {
		this.indiEnver = indiEnver;
	}

	public String getIndiEnverClf() {
		return this.indiEnverClf;
	}

	public void setIndiEnverClf(String indiEnverClf) {
		this.indiEnverClf = indiEnverClf;
	}

	public BigDecimal getIndiEsq() {
		return this.indiEsq;
	}

	public void setIndiEsq(BigDecimal indiEsq) {
		this.indiEsq = indiEsq;
	}

	public String getIndiEsqClf() {
		return this.indiEsqClf;
	}

	public void setIndiEsqClf(String indiEsqClf) {
		this.indiEsqClf = indiEsqClf;
	}

	public BigDecimal getIndiEstapred() {
		return this.indiEstapred;
	}

	public void setIndiEstapred(BigDecimal indiEstapred) {
		this.indiEstapred = indiEstapred;
	}

	public String getIndiEstapredClf() {
		return this.indiEstapredClf;
	}

	public void setIndiEstapredClf(String indiEstapredClf) {
		this.indiEstapredClf = indiEstapredClf;
	}

	public BigDecimal getIndiInterm() {
		return this.indiInterm;
	}

	public void setIndiInterm(BigDecimal indiInterm) {
		this.indiInterm = indiInterm;
	}

	public String getIndiIntermClf() {
		return this.indiIntermClf;
	}

	public void setIndiIntermClf(String indiIntermClf) {
		this.indiIntermClf = indiIntermClf;
	}

	public BigDecimal getIndiIrei() {
		return this.indiIrei;
	}

	public void setIndiIrei(BigDecimal indiIrei) {
		this.indiIrei = indiIrei;
	}

	public String getIndiIreiClf() {
		return this.indiIreiClf;
	}

	public void setIndiIreiClf(String indiIreiClf) {
		this.indiIreiClf = indiIreiClf;
	}

	public BigDecimal getIndiIres() {
		return this.indiIres;
	}

	public void setIndiIres(BigDecimal indiIres) {
		this.indiIres = indiIres;
	}

	public String getIndiIresClf() {
		return this.indiIresClf;
	}

	public void setIndiIresClf(String indiIresClf) {
		this.indiIresClf = indiIresClf;
	}

	public BigDecimal getIndiMushue() {
		return this.indiMushue;
	}

	public void setIndiMushue(BigDecimal indiMushue) {
		this.indiMushue = indiMushue;
	}

	public String getIndiMushueClf() {
		return this.indiMushueClf;
	}

	public void setIndiMushueClf(String indiMushueClf) {
		this.indiMushueClf = indiMushueClf;
	}

	public AtrFraccionamiento getAtrFraccionamiento() {
		return this.atrFraccionamiento;
	}

	public void setAtrFraccionamiento(AtrFraccionamiento atrFraccionamiento) {
		this.atrFraccionamiento = atrFraccionamiento;
	}

}