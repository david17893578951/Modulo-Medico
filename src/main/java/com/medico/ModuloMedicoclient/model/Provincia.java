package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the provincia database table.
 * 
 */
@Entity
@NamedQuery(name="Provincia.findAll", query="SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROVINCIA_DPAPROVINCIA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROVINCIA_DPAPROVINCIA_GENERATOR")
	@Column(name="dpa_provincia")
	private String dpaProvincia;

	@Column(name="dpa_desprov")
	private String dpaDesprov;

	public Provincia() {
	}

	public String getDpaProvincia() {
		return this.dpaProvincia;
	}

	public void setDpaProvincia(String dpaProvincia) {
		this.dpaProvincia = dpaProvincia;
	}

	public String getDpaDesprov() {
		return this.dpaDesprov;
	}

	public void setDpaDesprov(String dpaDesprov) {
		this.dpaDesprov = dpaDesprov;
	}

}