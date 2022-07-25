package com.uce.edu.demo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {

	@Id
	@Column(name = "alum_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alum_id_seq")
	@SequenceGenerator(name = "alum_id_seq", sequenceName = "alum_id_seq", allocationSize = 1)
	private Integer id;
	
	@Column(name = "alum_nombre")
	private String nombre;
	
	@Column(name = "alum_apellido")
	private String apellido;
	
	@Column(name = "alum_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "alum_id_universidad")
	private Universidad universidad;

	
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	

}
