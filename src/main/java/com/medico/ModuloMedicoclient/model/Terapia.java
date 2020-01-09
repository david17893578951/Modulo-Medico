package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.util.Date;


/**
 * The persistent class for the trp_terapia database table.
 * 
 */
@Entity
@Table(name="trp_terapia")
@NamedQuery(name="Terapia.findAll", query="SELECT t FROM Terapia t")
public class Terapia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRP_TERAPIA_ID_GENERATOR", sequenceName="TRP_TERAPIA_TTM_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRP_TERAPIA_ID_GENERATOR")
	@Column(name="ttm_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer id;

	@Column(name="ttm_cqc")
	private String cqc;

	@Column(name="ttm_cqcb")
	private Boolean cqcb;

	@Column(name="ttm_crioterapia")
	private String crioterapia;

	@Column(name="ttm_crioterapiab")
	private Boolean crioterapiab;

	@Column(name="ttm_electroterapia")
	private String electroterapia;

	@Column(name="ttm_electroterapiab")
	private Boolean electroterapiab;

	@Column(name="ttm_estiramiento")
	private String estiramiento;

	@Column(name="ttm_estiramientob")
	private Boolean estiramientob;

	@Temporal(TemporalType.DATE)
	@Column(name="ttm_fecha")
	@JsonView(Perfiles.PublicView.class)
	private Date fecha;

	@Column(name="ttm_indicacion")
	@JsonView(Perfiles.PublicView.class)
	private String indicacion;

	@Column(name="ttm_isometrico")
	private String isometrico;

	@Column(name="ttm_isometricob")
	private Boolean isometricob;

	@Column(name="ttm_isotonico")
	private String isotonico;

	@Column(name="ttm_isotonicob")
	private Boolean isotonicob;

	@Column(name="ttm_laser")
	private String laser;

	@Column(name="ttm_laserb")
	private Boolean laserb;

	@Column(name="ttm_magneto")
	private String magneto;

	@Column(name="ttm_magnetob")
	private Boolean magnetob;

	@Column(name="ttm_numsesionactual")
	private Integer numsesionactual;

	@Column(name="ttm_otro")
	private String otro;

	@Column(name="ttm_otrob")
	private Boolean otrob;

	@Column(name="ttm_parafina")
	private String parafina;

	@Column(name="ttm_parafinab")
	private Boolean parafinab;

	@Column(name="ttm_porcentajeasistido")
	private Integer porcentajeasistido;

	@Column(name="ttm_propiocepcion")
	private String propiocepcion;

	@Column(name="ttm_propiocepcionb")
	private Boolean propiocepcionb;

	@Column(name="ttm_terapeutico")
	private String terapeutico;

	@Column(name="ttm_terapeuticob")
	private Boolean terapeuticob;

	@Column(name="ttm_u")
	private String u;

	@Column(name="ttm_ub")
	private Boolean ub;

	//uni-directional many-to-one association to DiagnosticoTerapeutico
	@ManyToOne
	@JoinColumn(name="pbf_id")
	@JsonView(Perfiles.PublicView.class)
	private DiagnosticoTerapeutico trpDiagnosticoTerapeutico;

	public Terapia() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCqc() {
		return this.cqc;
	}

	public void setCqc(String cqc) {
		this.cqc = cqc;
	}

	public Boolean getCqcb() {
		return this.cqcb;
	}

	public void setCqcb(Boolean cqcb) {
		this.cqcb = cqcb;
	}

	public String getCrioterapia() {
		return this.crioterapia;
	}

	public void setCrioterapia(String crioterapia) {
		this.crioterapia = crioterapia;
	}

	public Boolean getCrioterapiab() {
		return this.crioterapiab;
	}

	public void setCrioterapiab(Boolean crioterapiab) {
		this.crioterapiab = crioterapiab;
	}

	public String getElectroterapia() {
		return this.electroterapia;
	}

	public void setElectroterapia(String electroterapia) {
		this.electroterapia = electroterapia;
	}

	public Boolean getElectroterapiab() {
		return this.electroterapiab;
	}

	public void setElectroterapiab(Boolean electroterapiab) {
		this.electroterapiab = electroterapiab;
	}

	public String getEstiramiento() {
		return this.estiramiento;
	}

	public void setEstiramiento(String estiramiento) {
		this.estiramiento = estiramiento;
	}

	public Boolean getEstiramientob() {
		return this.estiramientob;
	}

	public void setEstiramientob(Boolean estiramientob) {
		this.estiramientob = estiramientob;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIndicacion() {
		return this.indicacion;
	}

	public void setIndicacion(String indicacion) {
		this.indicacion = indicacion;
	}

	public String getIsometrico() {
		return this.isometrico;
	}

	public void setIsometrico(String isometrico) {
		this.isometrico = isometrico;
	}

	public Boolean getIsometricob() {
		return this.isometricob;
	}

	public void setIsometricob(Boolean isometricob) {
		this.isometricob = isometricob;
	}

	public String getIsotonico() {
		return this.isotonico;
	}

	public void setIsotonico(String isotonico) {
		this.isotonico = isotonico;
	}

	public Boolean getIsotonicob() {
		return this.isotonicob;
	}

	public void setIsotonicob(Boolean isotonicob) {
		this.isotonicob = isotonicob;
	}

	public String getLaser() {
		return this.laser;
	}

	public void setLaser(String laser) {
		this.laser = laser;
	}

	public Boolean getLaserb() {
		return this.laserb;
	}

	public void setLaserb(Boolean laserb) {
		this.laserb = laserb;
	}

	public String getMagneto() {
		return this.magneto;
	}

	public void setMagneto(String magneto) {
		this.magneto = magneto;
	}

	public Boolean getMagnetob() {
		return this.magnetob;
	}

	public void setMagnetob(Boolean magnetob) {
		this.magnetob = magnetob;
	}

	public Integer getNumsesionactual() {
		return this.numsesionactual;
	}

	public void setNumsesionactual(Integer numsesionactual) {
		this.numsesionactual = numsesionactual;
	}

	public String getOtro() {
		return this.otro;
	}

	public void setOtro(String otro) {
		this.otro = otro;
	}

	public Boolean getOtrob() {
		return this.otrob;
	}

	public void setOtrob(Boolean otrob) {
		this.otrob = otrob;
	}

	public String getParafina() {
		return this.parafina;
	}

	public void setParafina(String parafina) {
		this.parafina = parafina;
	}

	public Boolean getParafinab() {
		return this.parafinab;
	}

	public void setParafinab(Boolean parafinab) {
		this.parafinab = parafinab;
	}

	public Integer getPorcentajeasistido() {
		return this.porcentajeasistido;
	}

	public void setPorcentajeasistido(Integer porcentajeasistido) {
		this.porcentajeasistido = porcentajeasistido;
	}

	public String getPropiocepcion() {
		return this.propiocepcion;
	}

	public void setPropiocepcion(String propiocepcion) {
		this.propiocepcion = propiocepcion;
	}

	public Boolean getPropiocepcionb() {
		return this.propiocepcionb;
	}

	public void setPropiocepcionb(Boolean propiocepcionb) {
		this.propiocepcionb = propiocepcionb;
	}

	public String getTerapeutico() {
		return this.terapeutico;
	}

	public void setTerapeutico(String terapeutico) {
		this.terapeutico = terapeutico;
	}

	public Boolean getTerapeuticob() {
		return this.terapeuticob;
	}

	public void setTerapeuticob(Boolean terapeuticob) {
		this.terapeuticob = terapeuticob;
	}

	public String getU() {
		return this.u;
	}

	public void setU(String u) {
		this.u = u;
	}

	public Boolean getUb() {
		return this.ub;
	}

	public void setUb(Boolean ub) {
		this.ub = ub;
	}

	public DiagnosticoTerapeutico getTrpDiagnosticoTerapeutico() {
		return this.trpDiagnosticoTerapeutico;
	}

	public void setTrpDiagnosticoTerapeutico(DiagnosticoTerapeutico trpDiagnosticoTerapeutico) {
		this.trpDiagnosticoTerapeutico = trpDiagnosticoTerapeutico;
	}

}