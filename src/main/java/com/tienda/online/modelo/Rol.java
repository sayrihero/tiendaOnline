package com.tienda.online.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Rol {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String rol;
private String descripcion;

//Siempre colocar el constructor por default
public Rol() {
	
}

public Rol(Integer id, String rol, String descripcion) {
	super();
	this.id = id;
	this.rol = rol;
	this.descripcion = descripcion;
}

/**
 * @return the id
 */
public Integer getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}

/**
 * @return the rol
 */
public String getRol() {
	return rol;
}

/**
 * @param rol the rol to set
 */
public void setRol(String rol) {
	this.rol = rol;
}

/**
 * @return the descripcion
 */
public String getDescripcion() {
	return descripcion;
}

/**
 * @param descripcion the descripcion to set
 */
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}






}
