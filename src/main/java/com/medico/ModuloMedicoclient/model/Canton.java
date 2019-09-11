package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the canton database table.
 * 
 */
@Entity
@NamedQuery(name="Canton.findAll", query="SELECT c FROM Canton c")
public class Canton implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CANTON_DPACANTON_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CANTON_DPACANTON_GENERATOR")
	@Column(name="dpa_canton")
	private String dpaCanton;

	@Column(name="dpa_descanton")
	private String dpaDescanton;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumn(name="dpa_provincia")
	private Provincia provincia;

	//bi-directional many-to-one association to Parroquia
	@OneToMany(mappedBy="canton")
	private List<Parroquia> parroquias;

	public Canton() {
	}

	public String getDpaCanton() {
		return this.dpaCanton;
	}

	public void setDpaCanton(String dpaCanton) {
		this.dpaCanton = dpaCanton;
	}

	public String getDpaDescanton() {
		return this.dpaDescanton;
	}

	public void setDpaDescanton(String dpaDescanton) {
		this.dpaDescanton = dpaDescanton;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Parroquia> getParroquias() {
		return this.parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	public Parroquia addParroquia(Parroquia parroquia) {
		getParroquias().add(parroquia);
		parroquia.setCanton(this);

		return parroquia;
	}

	public Parroquia removeParroquia(Parroquia parroquia) {
		getParroquias().remove(parroquia);
		parroquia.setCanton(null);

		return parroquia;
	}

}