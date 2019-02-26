package com.cice.concesionario.entidades;

public class Moto extends Vehiculo {

	private int cilindrada;
	private String color;
	
	public Moto(int bastidor, String marca, String matricula, String modelo, int cilindrada, String color) {
		super(bastidor, marca, matricula, modelo);
		this.cilindrada = cilindrada;
		this.color = color;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", color=" + color + "]" + 
	"Vehiculo [bastidor=" + this.getBastidor() + ", marca=" + this.getMarca() + ", matricula=" + this.getMatricula() + ", modelo=" + this.getModelo()
				+ "]";
		
		
	}
	
	
	
	
	
	
	
	
}
