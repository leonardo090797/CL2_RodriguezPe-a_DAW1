package com.cibertec.cl2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_supervisor")
public class Autores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_supervisor")
	private Integer codigo;
	@Column(name = "nom_supervisor")
	private String nombre;
	@Column(name = "ape_supervisor")
	private String apellido;
	@Column(name = "dni_supervisor")
	private Integer dni;
	@Column(name = "num_hijos")
	private Integer numHijos;
	@Column(name = "sueldo")
	private double sueldo;
	@ManyToOne
	@JoinColumn(name="cod_sucursal")
	private Libros sucursal;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getNumHijos() {
		return numHijos;
	}
	public void setNumHijos(Integer numHijos) {
		this.numHijos = numHijos;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Libros getSucursal() {
		return sucursal;
	}
	public void setSucursal(Libros sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
