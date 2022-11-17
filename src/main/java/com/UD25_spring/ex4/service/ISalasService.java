package com.UD25_spring.ex4.service;

import java.util.List;

import com.UD25_spring.ex4.dto.Salas;



public interface ISalasService {
	public List<Salas> listarSalas(); //Listar All 
	
	public Salas guardarSalas(Salas salas);	//Guarda un Fabricantes CREATE
	
	public Salas SalasXID(Long id); //Leer datos de un Fabricantes READ
	
	public Salas actualizarSalas(Salas salas); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarSalass(Long id);// Elimina el Fabricantes DELETE
}
