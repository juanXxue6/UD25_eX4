package com.UD25_spring.ex4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="peliculas")
public class Peliculas {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "clasificacion_edad")//no hace falta si se llama igual	
	private int clasificacionEdad;
	
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Salas> salas;


	public Peliculas(Long id, String nombre, int clasificacionEdad, List<Salas> salas) {
		this.id = id;
		this.nombre = nombre;
		this.clasificacionEdad = clasificacionEdad;
		this.salas = salas;
	}


	public Peliculas() {
		// TODO Auto-generated constructor stub
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


	public int getClasificacionEdad() {
		return clasificacionEdad;
	}


	public void setClasificacionEdad(int clasificacionEdad) {
		this.clasificacionEdad = clasificacionEdad;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajas")
	public List<Salas> getSalas() {
		return salas;
	}


	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}
	
	
	
}
