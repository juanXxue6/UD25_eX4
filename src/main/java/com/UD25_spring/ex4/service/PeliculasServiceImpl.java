package com.UD25_spring.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex4.dao.IPeliculasDAO;
import com.UD25_spring.ex4.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	@Autowired
	IPeliculasDAO iPeliculasDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public Peliculas peliculasXID(Long id) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public void eliminarPeliculas(Long id) {
		iPeliculasDAO.deleteById(id);
		
	}

}
