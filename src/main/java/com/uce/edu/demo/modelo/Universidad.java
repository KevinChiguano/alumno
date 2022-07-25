package com.uce.edu.demo.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {

	@Id
	@Column(name = "univ_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "univ_id_seq")
	@SequenceGenerator(name = "univ_id_seq", sequenceName = "univ_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "univ_nombre")
	private String nombre;
	
	@Column(name = "univ_direccion")
	private String direccion;
	
	@OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
	private List<Alumno> alumnos;
	
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}
