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

import com.UD25_spring.ex4.dto.Salas;
import com.UD25_spring.ex4.service.SalasServiceImpl;



@RestController
@RequestMapping("/api")
public class SalasController {
	
	@Autowired
	SalasServiceImpl salaserviceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salaserviceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarSalas(@RequestBody Salas salas) {
		
		return salaserviceImpl.guardarSalas(salas);
	}
	
	@GetMapping("/salas/{id}")
	public Salas SalasXID(@PathVariable(name="id") Long id) {
		
		Salas cliente_xid= new Salas();
		
		cliente_xid=salaserviceImpl.SalasXID(id);
		
		System.out.println("fabricantes XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSalas(@PathVariable(name="id")Long id,@RequestBody Salas salas) {
		
		Salas sala_seleccionado= new Salas();
		Salas sala_actualizado= new Salas();
		
		sala_seleccionado= salaserviceImpl.SalasXID(id);
		
		sala_seleccionado.setNombre(salas.getNombre());
		sala_seleccionado.setPelicula(salas.getPelicula());
		
		sala_actualizado = salaserviceImpl.actualizarSalas(sala_seleccionado);
		
		System.out.println("la sala actualizada es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSalas(@PathVariable(name="id")Long id) {
		salaserviceImpl.eliminarSalass(id);
	}
	

}
