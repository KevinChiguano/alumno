package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Universidad;
import com.uce.edu.demo.repository.IUniversidadRepository;

@Service
public class UniversidadServiceImpl implements IUniversidadService{

	@Autowired
	private IUniversidadRepository universidadRepository;
	
	@Override
	public void insertar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepository.insertar(universidad);
	}

	@Override
	public Universidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.universidadRepository.buscar(id);
	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepository.actualizar(universidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.universidadRepository.eliminar(id);
	}

}
