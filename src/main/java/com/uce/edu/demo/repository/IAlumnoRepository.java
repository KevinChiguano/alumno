package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.modelo.Alumno;
import com.uce.edu.demo.modelo.AlumnoContadorNombre;

public interface IAlumnoRepository {

	public void insertar(Alumno alumno);
	public Alumno buscar(Integer id);
	public void actualizar(Alumno alumno);
	public void eliminar(Integer id);
	
	public List<AlumnoContadorNombre> buscarAlumnoPorNombre();

	
}
