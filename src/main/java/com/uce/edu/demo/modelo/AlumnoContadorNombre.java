package com.uce.edu.demo.modelo;

import java.io.Serializable;

public class AlumnoContadorNombre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private Long numero;
	
	public AlumnoContadorNombre() {
		
	}
	
	public AlumnoContadorNombre(String nombre, Long numero) {
		this.nombre = nombre;
		this.numero = numero;
	}

	//SET y GET 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "AlumnoContadorNombre [nombre=" + nombre + ", numero=" + numero + "]";
	}
	
	

}
