package com.medico.ModuloMedicoclient.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.medico.ModuloMedicoclient.serializer.Perfiles;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the fdi_persona database table.
 * 
 */
@Entity
@Table(name="fdi_persona")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FDI_PERSONA_ID_GENERATOR", sequenceName="FDI_PERSONA_PRS_ID_SEQ",allocationSize=1,initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FDI_PERSONA_ID_GENERATOR")
	@Column(name="prs_id")
	@JsonView(Perfiles.PublicView.class)
	private Integer id;

	@Column(name="prs_apellido")
	@JsonView(Perfiles.PublicView.class)
	private String apellido;

	@Column(name="prs_canton")
	private String canton;

	@Column(name="prs_cedula")
	@JsonView(Perfiles.PublicView.class)
	private String cedula;

	@Column(name="prs_correo")
	private String correo;

	@Column(name="prs_dir_recidencia")
	private String recidencia;

	@Column(name="prs_discapacidad")
	private Boolean discapacidad;

	@Column(name="prs_estado")
	private Boolean estado;

	@Column(name="prs_estado_civil")
	private String estadoCivil;

	@Column(name="prs_etnia")
	private String etnia;

	@Temporal(TemporalType.DATE)
	@Column(name="prs_fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name="prs_grupo_sanguineo")
	private String grupoSanguineo;

	@Column(name="prs_nacionalidad")
	private String nacionalidad;

	@Column(name="prs_nombre")
	@JsonView(Perfiles.PublicView.class)
	private String nombre;

	@Column(name="prs_nommadre")
	private String nommadre;

	@Column(name="prs_nompadre")
	private String nompadre;

	@Column(name="prs_ocupacion")
	private String ocupacion;

	@Column(name="prs_parroquia")
	private String parroquia;

	@Column(name="prs_provincia")
	private String provincia;

	@Column(name="prs_sexo")
	private String sexo;

	@Column(name="prs_telefono")
	private String telefono;

	@Column(name="prs_telpadres")
	private String telpadres;

	@Column(name="prs_tipodiscapacidad")
	private String tipodiscapacidad;

	//bi-directional many-to-one association to FdiDeportista
	@OneToMany(mappedBy="fdiPersona")
	@JsonView(Perfiles.PublicView.class)
	//@JsonIgnoreProperties(value= {"asistencias","atrPlanillamedidas","edDeportistaEntrenadors","edPremiosDeportistas","fdiPersona"})
	private List<FdiDeportista> fdiDeportistas;

	//bi-directional many-to-one association to FdiEntrenador
	@OneToMany(mappedBy="fdiPersona")
	@JsonIgnore
	private List<FdiEntrenador> fdiEntrenadors;

	//bi-directional many-to-one association to Parroquia
	@ManyToOne
	@JoinColumn(name="dpa_parr")
	@JsonIgnore
	private Parroquia parroquiaBean;

	//bi-directional many-to-one association to FdiUsersRole
	@OneToMany(mappedBy="fdiPersona")
	@JsonIgnore
	private List<FdiUsersRole> fdiUsersRoles;

	public Persona() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRecidencia() {
		return this.recidencia;
	}

	public void setRecidencia(String recidencia) {
		this.recidencia = recidencia;
	}

	public Boolean getDiscapacidad() {
		return this.discapacidad;
	}

	public void setDiscapacidad(Boolean discapacidad) {
		this.discapacidad = discapacidad;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEtnia() {
		return this.etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNommadre() {
		return this.nommadre;
	}

	public void setNommadre(String nommadre) {
		this.nommadre = nommadre;
	}

	public String getNompadre() {
		return this.nompadre;
	}

	public void setNompadre(String nompadre) {
		this.nompadre = nompadre;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelpadres() {
		return this.telpadres;
	}

	public void setTelpadres(String telpadres) {
		this.telpadres = telpadres;
	}

	public String getTipodiscapacidad() {
		return this.tipodiscapacidad;
	}

	public void setTipodiscapacidad(String tipodiscapacidad) {
		this.tipodiscapacidad = tipodiscapacidad;
	}

	public List<FdiDeportista> getFdiDeportistas() {
		return this.fdiDeportistas;
	}

	public void setFdiDeportistas(List<FdiDeportista> fdiDeportistas) {
		this.fdiDeportistas = fdiDeportistas;
	}

	public FdiDeportista addFdiDeportista(FdiDeportista fdiDeportista) {
		getFdiDeportistas().add(fdiDeportista);
		fdiDeportista.setFdiPersona(this);

		return fdiDeportista;
	}

	public FdiDeportista removeFdiDeportista(FdiDeportista fdiDeportista) {
		getFdiDeportistas().remove(fdiDeportista);
		fdiDeportista.setFdiPersona(null);

		return fdiDeportista;
	}

	public List<FdiEntrenador> getFdiEntrenadors() {
		return this.fdiEntrenadors;
	}

	public void setFdiEntrenadors(List<FdiEntrenador> fdiEntrenadors) {
		this.fdiEntrenadors = fdiEntrenadors;
	}

	public FdiEntrenador addFdiEntrenador(FdiEntrenador fdiEntrenador) {
		getFdiEntrenadors().add(fdiEntrenador);
		fdiEntrenador.setFdiPersona(this);

		return fdiEntrenador;
	}

	public FdiEntrenador removeFdiEntrenador(FdiEntrenador fdiEntrenador) {
		getFdiEntrenadors().remove(fdiEntrenador);
		fdiEntrenador.setFdiPersona(null);

		return fdiEntrenador;
	}

	public Parroquia getParroquiaBean() {
		return this.parroquiaBean;
	}

	public void setParroquiaBean(Parroquia parroquiaBean) {
		this.parroquiaBean = parroquiaBean;
	}

	public List<FdiUsersRole> getFdiUsersRoles() {
		return this.fdiUsersRoles;
	}

	public void setFdiUsersRoles(List<FdiUsersRole> fdiUsersRoles) {
		this.fdiUsersRoles = fdiUsersRoles;
	}

	public FdiUsersRole addFdiUsersRole(FdiUsersRole fdiUsersRole) {
		getFdiUsersRoles().add(fdiUsersRole);
		fdiUsersRole.setFdiPersona(this);

		return fdiUsersRole;
	}

	public FdiUsersRole removeFdiUsersRole(FdiUsersRole fdiUsersRole) {
		getFdiUsersRoles().remove(fdiUsersRole);
		fdiUsersRole.setFdiPersona(null);

		return fdiUsersRole;
	}

}