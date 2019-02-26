package com.cice.concesionario.entidades;

public class Coche extends Vehiculo{
	
	private int numeroDePuertas;
	private String combustible;
	
	
	//constructor de una superclase
	
	public Coche(int bastidor, String marca, String matricula, String modelo, int numeroDePuertas, String combustible) {
		super(bastidor, marca, matricula, modelo);
		this.numeroDePuertas = numeroDePuertas;
		this.combustible = combustible;
	}


	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}


	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}


	public String getCombustible() {
		return combustible;
	}


	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	@Override
	public String toString() {
		return "Coche [numeroDePuertas=" + numeroDePuertas + ", combustible=" + combustible + "]" + 
	"Vehiculo [bastidor=" + this.getBastidor() + ", marca=" + this.getMarca() + ", matricula=" + this.getMatricula() + ", modelo=" + this.getModelo()
				+ "]";
	}


	
	
	
	
	
	

}
