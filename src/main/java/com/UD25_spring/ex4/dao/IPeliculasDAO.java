package com.UD25_spring.ex4.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.UD25_spring.ex4.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas, Long> {

}
