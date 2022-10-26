package com.cibertec.cl2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cl2.dao.GeneroDAO;
import com.cibertec.cl2.entity.Genero;

@Service
public class GeneroService {
	@Autowired
	private GeneroDAO repo;
	
	public List<Genero> listarGenero(){
		return repo.findAll();
	}
}
