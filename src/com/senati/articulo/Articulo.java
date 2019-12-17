package com.senati.articulo;

public class Articulo {
	//------------ declaracion de los atributos-----------//
	
	String codigo;
	String descripcion;
	String marca;
	float Precio;
	

	//------declaracion de los constructores----------//

	public Articulo(String codigo, String descripcion, String marca, float precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		Precio = precio;
	}
	
	//------Declarar los Getters y Setters -------//
	
	public Articulo() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}


	
	// ------Metodo tostring()------//
	
	// @Override
	public String toString1() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", Precio=" + Precio
				+ "]";
	}
	public String toString2() {
		return "Articulo [descripcion="+ descripcion + " , marca = "+ marca +" ]";
	}
	
}
