package com.example.demo.pojo;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;

	public Cliente( String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
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

}
