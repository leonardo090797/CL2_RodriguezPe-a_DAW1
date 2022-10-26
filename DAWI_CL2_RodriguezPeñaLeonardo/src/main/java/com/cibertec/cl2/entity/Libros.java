package com.cibertec.cl2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_sucursal")
public class Libros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_sucursal")
	private Integer codigo;
	@Column(name = "nom_sucursal")
	private String nombre;

	@JsonIgnore
	@OneToMany(mappedBy = "sucursal")
	private List<Autores> listaSupervisor;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Autores> getListaSupervisor() {
		return listaSupervisor;
	}

	public void setListaSupervisor(List<Autores> listaSupervisor) {
		this.listaSupervisor = listaSupervisor;
	}

	
	
	
}
