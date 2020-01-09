package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ed_premios_deportista database table.
 * 
 */
@Entity
@Table(name="ed_premios_deportista")
@NamedQuery(name="EdPremiosDeportista.findAll", query="SELECT e FROM EdPremiosDeportista e")
public class EdPremiosDeportista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ED_PREMIOS_DEPORTISTA_IDPREMIOS_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ED_PREMIOS_DEPORTISTA_IDPREMIOS_GENERATOR")
	@Column(name="id_premios")
	private Integer idPremios;

	@Column(name="m_bronce")
	private Integer mBronce;

	@Column(name="m_oro")
	private Integer mOro;

	@Column(name="m_plata")
	private Integer mPlata;

	//uni-directional many-to-one association to Competencia
	@ManyToOne
	@JoinColumn(name="id_competencia")
	private Competencia competencia;

	//uni-directional many-to-one association to FdiDeportista
	@ManyToOne
	@JoinColumn(name="depor_id")
	private FdiDeportista fdiDeportista;

	public EdPremiosDeportista() {
	}

	public Integer getIdPremios() {
		return this.idPremios;
	}

	public void setIdPremios(Integer idPremios) {
		this.idPremios = idPremios;
	}

	public Integer getMBronce() {
		return this.mBronce;
	}

	public void setMBronce(Integer mBronce) {
		this.mBronce = mBronce;
	}

	public Integer getMOro() {
		return this.mOro;
	}

	public void setMOro(Integer mOro) {
		this.mOro = mOro;
	}

	public Integer getMPlata() {
		return this.mPlata;
	}

	public void setMPlata(Integer mPlata) {
		this.mPlata = mPlata;
	}

	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public FdiDeportista getFdiDeportista() {
		return this.fdiDeportista;
	}

	public void setFdiDeportista(FdiDeportista fdiDeportista) {
		this.fdiDeportista = fdiDeportista;
	}

}