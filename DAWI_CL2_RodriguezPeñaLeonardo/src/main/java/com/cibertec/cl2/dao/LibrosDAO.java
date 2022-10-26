package com.cibertec.cl2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.cl2.entity.Libros;

public interface LibrosDAO extends JpaRepository<Libros, Integer>{
	@Query("select l from Libros l where l.autor.codigo=?1")
	public List<Libros> listAllByAutor(int codAutor);
}
