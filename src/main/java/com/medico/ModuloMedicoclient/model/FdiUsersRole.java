package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fdi_users_roles database table.
 * 
 */
@Entity
@Table(name="fdi_users_roles")
@NamedQuery(name="FdiUsersRole.findAll", query="SELECT f FROM FdiUsersRole f")
public class FdiUsersRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_USERS_ROLES_USROLID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_USERS_ROLES_USROLID_GENERATOR")
	@Column(name="usrol_id")
	private Integer usrolId;

	private String clave;

	//uni-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="prs_id")
	private Persona fdiPersona;

	//uni-directional many-to-one association to FdiRol
	@ManyToOne
	@JoinColumn(name="rol_id")
	private FdiRol fdiRol;

	public FdiUsersRole() {
	}

	public Integer getUsrolId() {
		return this.usrolId;
	}

	public void setUsrolId(Integer usrolId) {
		this.usrolId = usrolId;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Persona getFdiPersona() {
		return this.fdiPersona;
	}

	public void setFdiPersona(Persona fdiPersona) {
		this.fdiPersona = fdiPersona;
	}

	public FdiRol getFdiRol() {
		return this.fdiRol;
	}

	public void setFdiRol(FdiRol fdiRol) {
		this.fdiRol = fdiRol;
	}

}