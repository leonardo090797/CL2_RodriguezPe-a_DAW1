package com.cibertec.cl2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cl2.dao.AutoresDAO;
import com.cibertec.cl2.entity.Autores;

@Service
public class AutoresService {
	@Autowired
	private AutoresDAO repo;
	
	public List<Autores> listarAutores(){
		return repo.findAll();
	}
}
