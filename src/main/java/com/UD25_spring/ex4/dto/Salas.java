package com.UD25_spring.ex4.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="salas")
public class Salas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name="pelicula_id")
    private Peliculas pelicula;

	public Salas(Long id, String nombre, Peliculas pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}
	
	public Salas() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}
	
	
	
	
}
