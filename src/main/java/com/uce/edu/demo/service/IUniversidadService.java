package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Universidad;

public interface IUniversidadService {

	public void insertar(Universidad universidad);
	public Universidad buscar(Integer id);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);
	
}
