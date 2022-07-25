package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Alumno;
import com.uce.edu.demo.modelo.AlumnoContadorNombre;
import com.uce.edu.demo.repository.IAlumnoRepository;

@Service
public class AlumnoServiceImpl implements IAlumnoService{

	@Autowired
	private IAlumnoRepository alumnoRepository;
	
	@Override
	public void insertar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.insertar(alumno);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepository.buscar(id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.actualizar(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepository.eliminar(id);
	}

	@Override
	public List<AlumnoContadorNombre> buscarAlumnoPorNombre() {
		// TODO Auto-generated method stub
		return this.alumnoRepository.buscarAlumnoPorNombre();
	}

}
