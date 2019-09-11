package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fdi_rol database table.
 * 
 */
@Entity
@Table(name="fdi_rol")
@NamedQuery(name="FdiRol.findAll", query="SELECT f FROM FdiRol f")
public class FdiRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_ROL_ROLID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_ROL_ROLID_GENERATOR")
	@Column(name="rol_id")
	private Integer rolId;

	@Column(name="rol_name")
	private String rolName;

	//bi-directional many-to-one association to FdiUsersRole
	@OneToMany(mappedBy="fdiRol")
	private List<FdiUsersRole> fdiUsersRoles;

	public FdiRol() {
	}

	public Integer getRolId() {
		return this.rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public String getRolName() {
		return this.rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public List<FdiUsersRole> getFdiUsersRoles() {
		return this.fdiUsersRoles;
	}

	public void setFdiUsersRoles(List<FdiUsersRole> fdiUsersRoles) {
		this.fdiUsersRoles = fdiUsersRoles;
	}

	public FdiUsersRole addFdiUsersRole(FdiUsersRole fdiUsersRole) {
		getFdiUsersRoles().add(fdiUsersRole);
		fdiUsersRole.setFdiRol(this);

		return fdiUsersRole;
	}

	public FdiUsersRole removeFdiUsersRole(FdiUsersRole fdiUsersRole) {
		getFdiUsersRoles().remove(fdiUsersRole);
		fdiUsersRole.setFdiRol(null);

		return fdiUsersRole;
	}

}