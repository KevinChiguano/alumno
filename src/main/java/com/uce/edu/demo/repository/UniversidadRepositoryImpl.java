package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Universidad;

@Repository
@Transactional
public class UniversidadRepositoryImpl implements IUniversidadRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(universidad);
	}

	@Override
	public Universidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Universidad.class, id);
	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.entityManager.merge(universidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Universidad universidad = this.buscar(id);
		this.entityManager.remove(universidad);
	}

}
