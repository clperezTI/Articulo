package com.senati.articulo;

public class AppArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo Articulo1 = new Articulo("A0001","Azul","Basa",5.00f);
		Articulo Articulo2 = new Articulo("A0002","rojo","Decord",28f);
		Articulo Articulo3 = new Articulo("A0003","Morado","Channel",8000f);
		
		System.out.println(Articulo1.toString1());
		System.out.println(Articulo2.toString1());
		System.out.println(Articulo3.toString1());
		System.out.println(Articulo1.toString2());
		System.out.println(Articulo2.toString2());
		System.out.println(Articulo3.toString2());
	}

}
