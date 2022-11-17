package com.UD25_spring.ex4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UD25_spring.ex4.dto.Peliculas;
import com.UD25_spring.ex4.dto.Salas;
import com.UD25_spring.ex4.service.PeliculasServiceImpl;
import com.UD25_spring.ex4.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarelicula(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarelicula(@RequestBody Peliculas peliculas) {
		
		return peliculasServiceImpl.guardarPeliculas(peliculas);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas peliculaXID(@PathVariable(name="id") Long id) {
		
		Peliculas peliculas_xid = new Peliculas();
		
		peliculas_xid=peliculasServiceImpl.peliculasXID(id);
		
		System.out.println("Peliculas XID: "+peliculas_xid);
		
		return peliculas_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarelicula(@PathVariable(name="id")Long id,@RequestBody Peliculas peliculas) {
		
		Peliculas pelicula_seleccionado= new Peliculas();
		Peliculas pelicula_actualizado= new Peliculas();
		
		pelicula_seleccionado= peliculasServiceImpl.peliculasXID(id);
		
		pelicula_seleccionado.setClasificacionEdad(peliculas.getClasificacionEdad());
		pelicula_seleccionado.setNombre(peliculas.getNombre());
		pelicula_seleccionado.setSalas(peliculas.getSalas());
		
		pelicula_actualizado = peliculasServiceImpl.actualizarPeliculas(pelicula_seleccionado);
		
		System.out.println("la sala actualizada es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name="id")Long id) {
		peliculasServiceImpl.eliminarPeliculas(id);
	}
	
	
}
