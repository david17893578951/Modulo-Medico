package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ed_control_asistencia database table.
 * 
 */
@Entity
@Table(name="ed_control_asistencia")
@NamedQuery(name="EdControlAsistencia.findAll", query="SELECT e FROM EdControlAsistencia e")
public class EdControlAsistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ED_CONTROL_ASISTENCIA_IDCONTROLASIST_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ED_CONTROL_ASISTENCIA_IDCONTROLASIST_GENERATOR")
	@Column(name="id_control_asist")
	private Integer idControlAsist;

	private String desde;

	private String horario;

	private String mes;

	//uni-directional many-to-one association to Asistencia
	@ManyToOne
	@JoinColumn(name="id_asistencia")
	private Asistencia asistencia;

	//uni-directional many-to-one association to FdiCategoriaDisciplina
	@ManyToOne
	@JoinColumn(name="catdisci_id")
	private FdiCategoriaDisciplina fdiCategoriaDisciplina;

	public EdControlAsistencia() {
	}

	public Integer getIdControlAsist() {
		return this.idControlAsist;
	}

	public void setIdControlAsist(Integer idControlAsist) {
		this.idControlAsist = idControlAsist;
	}

	public String getDesde() {
		return this.desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Asistencia getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

	public FdiCategoriaDisciplina getFdiCategoriaDisciplina() {
		return this.fdiCategoriaDisciplina;
	}

	public void setFdiCategoriaDisciplina(FdiCategoriaDisciplina fdiCategoriaDisciplina) {
		this.fdiCategoriaDisciplina = fdiCategoriaDisciplina;
	}

}