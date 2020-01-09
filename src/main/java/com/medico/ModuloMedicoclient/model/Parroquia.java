package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parroquia database table.
 * 
 */
@Entity
@NamedQuery(name="Parroquia.findAll", query="SELECT p FROM Parroquia p")
public class Parroquia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARROQUIA_DPAPARR_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARROQUIA_DPAPARR_GENERATOR")
	@Column(name="dpa_parr")
	private String dpaParr;

	@Column(name="dpa_desparr")
	private String dpaDesparr;

	//uni-directional many-to-one association to Canton
	@ManyToOne
	@JoinColumn(name="dpa_canton")
	private Canton canton;

	public Parroquia() {
	}

	public String getDpaParr() {
		return this.dpaParr;
	}

	public void setDpaParr(String dpaParr) {
		this.dpaParr = dpaParr;
	}

	public String getDpaDesparr() {
		return this.dpaDesparr;
	}

	public void setDpaDesparr(String dpaDesparr) {
		this.dpaDesparr = dpaDesparr;
	}

	public Canton getCanton() {
		return this.canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}

}