package com.tienda.online.modelo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Articulo {
@Id
private Integer id;
private String nombre;
private String descripcion;
private BigDecimal precio;
private Integer cantidad;
private Integer descuento;
@ManyToOne
@JoinColumn(name="categoria_id")
private Categoria categoria;
private Date fecha;
private String url;

//Siempre colocar el constructor por default
public Articulo() {
	
}

public Articulo(Integer id, String nombre, String descripcion, BigDecimal precio, Integer cantidad, Integer descuento,
		Categoria categoria, Date fecha, String url) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.cantidad = cantidad;
	this.descuento = descuento;
	this.categoria = categoria;
	this.fecha = fecha;
	this.url = url;
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
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
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

/**
 * @return the precio
 */
public BigDecimal getPrecio() {
	return precio;
}

/**
 * @param precio the precio to set
 */
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}

/**
 * @return the cantidad
 */
public Integer getCantidad() {
	return cantidad;
}

/**
 * @param cantidad the cantidad to set
 */
public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}

/**
 * @return the descuento
 */
public Integer getDescuento() {
	return descuento;
}

/**
 * @param descuento the descuento to set
 */
public void setDescuento(Integer descuento) {
	this.descuento = descuento;
}

/**
 * @return the categoria
 */
public Categoria getCategoria() {
	return categoria;
}

/**
 * @param categoria the categoria to set
 */
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

/**
 * @return the fecha
 */
public Date getFecha() {
	return fecha;
}

/**
 * @param fecha the fecha to set
 */
public void setFecha(Date fecha) {
	this.fecha = fecha;
}

/**
 * @return the url
 */
public String getUrl() {
	return url;
}

/**
 * @param url the url to set
 */
public void setUrl(String url) {
	this.url = url;
}


	
}
