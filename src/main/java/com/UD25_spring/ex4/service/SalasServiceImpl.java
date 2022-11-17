package com.UD25_spring.ex4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex4.dao.IPeliculasDAO;
import com.UD25_spring.ex4.dao.ISalasDAO;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;
	
	
	@Override
	public List<com.UD25_spring.ex4.dto.Salas> listarSalas() {
		// TODO Auto-generated method stub
		return iSalasDAO.findAll();
	}

	@Override
	public com.UD25_spring.ex4.dto.Salas guardarSalas(com.UD25_spring.ex4.dto.Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public com.UD25_spring.ex4.dto.Salas SalasXID(Long id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public com.UD25_spring.ex4.dto.Salas actualizarSalas(com.UD25_spring.ex4.dto.Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public void eliminarSalass(Long id) {
		// TODO Auto-generated method stub
		iSalasDAO.deleteById(id);
	}

}
