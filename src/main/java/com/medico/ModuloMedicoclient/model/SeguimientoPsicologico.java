package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.util.Date;


/**
 * The persistent class for the psg_seguimiento_psicologico database table.
 * 
 */
@Entity
@Table(name="psg_seguimiento_psicologico")
@NamedQuery(name="SeguimientoPsicologico.findAll", query="SELECT s FROM SeguimientoPsicologico s")
public class SeguimientoPsicologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PSG_SEGUIMIENTO_PSICOLOGICO_ID_GENERATOR", sequenceName="PSG_SEGUIMIENTO_PSICOLOGICO_SGP_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PSG_SEGUIMIENTO_PSICOLOGICO_ID_GENERATOR")
	@Column(name="sgp_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer id;

	@Column(name="sgp_alcohol")
	private Boolean alcohol;

	@Column(name="sgp_anamnesi_familiar")
	private String anamnesiFamiliar;

	@Column(name="sgp_droga")
	private Boolean droga;

	@Column(name="sgp_estado")
	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="sgp_fecha")
	private Date fecha;

	@Column(name="sgp_medicamento")
	private Boolean medicamento;

	@Column(name="sgp_permanente")
	private String permanente;

	@Column(name="sgp_permanenteb")
	private Boolean permanenteb;

	@Column(name="sgp_psicoanamnesi_familiar")
	private String psicoanamnesiFamiliar;

	@Column(name="sgp_psicoanamnesi_personal")
	private String psicoanamnesiPersonal;

	@Column(name="sgp_sesionnum")
	private Integer sesionnum;

	@Column(name="sgp_tabaco")
	private Boolean tabaco;

	@Column(name="sgp_transitoria")
	private String transitoria;

	@Column(name="sgp_transitoriab")
	private Boolean transitoriab;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	@JsonView(Perfiles.PublicView.class)
	private Persona fdiPersona;

	//uni-directional many-to-one association to Motivo
	@ManyToOne
	@JoinColumn(name="mtv_id")
	@JsonView(Perfiles.PublicView.class)
	private Motivo trfMotivo;

	public SeguimientoPsicologico() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAlcohol() {
		return this.alcohol;
	}

	public void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}

	public String getAnamnesiFamiliar() {
		return this.anamnesiFamiliar;
	}

	public void setAnamnesiFamiliar(String anamnesiFamiliar) {
		this.anamnesiFamiliar = anamnesiFamiliar;
	}

	public Boolean getDroga() {
		return this.droga;
	}

	public void setDroga(Boolean droga) {
		this.droga = droga;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(Boolean medicamento) {
		this.medicamento = medicamento;
	}

	public String getPermanente() {
		return this.permanente;
	}

	public void setPermanente(String permanente) {
		this.permanente = permanente;
	}

	public Boolean getPermanenteb() {
		return this.permanenteb;
	}

	public void setPermanenteb(Boolean permanenteb) {
		this.permanenteb = permanenteb;
	}

	public String getPsicoanamnesiFamiliar() {
		return this.psicoanamnesiFamiliar;
	}

	public void setPsicoanamnesiFamiliar(String psicoanamnesiFamiliar) {
		this.psicoanamnesiFamiliar = psicoanamnesiFamiliar;
	}

	public String getPsicoanamnesiPersonal() {
		return this.psicoanamnesiPersonal;
	}

	public void setPsicoanamnesiPersonal(String psicoanamnesiPersonal) {
		this.psicoanamnesiPersonal = psicoanamnesiPersonal;
	}

	public Integer getSesionnum() {
		return this.sesionnum;
	}

	public void setSesionnum(Integer sesionnum) {
		this.sesionnum = sesionnum;
	}

	public Boolean getTabaco() {
		return this.tabaco;
	}

	public void setTabaco(Boolean tabaco) {
		this.tabaco = tabaco;
	}

	public String getTransitoria() {
		return this.transitoria;
	}

	public void setTransitoria(String transitoria) {
		this.transitoria = transitoria;
	}

	public Boolean getTransitoriab() {
		return this.transitoriab;
	}

	public void setTransitoriab(Boolean transitoriab) {
		this.transitoriab = transitoriab;
	}

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

	public Motivo getTrfMotivo() {
		return this.trfMotivo;
	}

	public void setTrfMotivo(Motivo trfMotivo) {
		this.trfMotivo = trfMotivo;
	}

}