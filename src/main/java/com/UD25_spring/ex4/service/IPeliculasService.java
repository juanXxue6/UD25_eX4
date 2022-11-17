package com.UD25_spring.ex4.service;

import java.util.List;

import com.UD25_spring.ex4.dto.Peliculas;

public interface IPeliculasService {

	public List<Peliculas> listarPeliculas(); //Listar All 
	
	public Peliculas guardarPeliculas(Peliculas peliculas);	//Guarda un Fabricantes CREATE
	
	public Peliculas peliculasXID(Long id); //Leer datos de un Fabricantes READ
	
	public Peliculas actualizarPeliculas(Peliculas peliculas); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarPeliculas(Long id);// Elimina el Fabricantes DELETE
	
}
