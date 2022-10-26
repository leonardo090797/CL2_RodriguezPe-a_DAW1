package com.cibertec.cl2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.cl2.dao.LibrosDAO;
import com.cibertec.cl2.entity.Libros;

@Service
public class LibrosService {
	@Autowired
	private LibrosDAO repo;
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
	public List<Libros> listarxAutor(int codAutor){
		return repo.listAllByAutor(codAutor);
	}
}
