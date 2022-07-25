package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Universidad;

public interface IUniversidadRepository {
	
	public void insertar(Universidad universidad);
	public Universidad buscar(Integer id);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);

}
