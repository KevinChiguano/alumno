package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Alumno;
import com.uce.edu.demo.modelo.AlumnoContadorNombre;

@Repository
@Transactional
public class AlumnoRepositoryImpl implements IAlumnoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.persist(alumno);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Alumno.class, id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.merge(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Alumno alumno = this.buscar(id);
		this.entityManager.remove(alumno);
	}

	@Override
	public List<AlumnoContadorNombre> buscarAlumnoPorNombre() {
		// TODO Auto-generated method stub
		TypedQuery<AlumnoContadorNombre> myQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.modelo.AlumnoContadorNombre(a.nombre, COUNT(a.nombre)) FROM Alumno a GROUP BY a.nombre",AlumnoContadorNombre.class);
		
		return myQuery.getResultList();
	}

}
