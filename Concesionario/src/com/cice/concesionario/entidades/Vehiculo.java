package com.cice.concesionario.entidades;

public class Vehiculo {
	
	private int bastidor;
	private String marca;
	private String matricula;
	private String modelo;
	
	public Vehiculo(int bastidor, String marca, String matricula, String modelo) {
		super();
		this.bastidor = bastidor;
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
	}

	public int getBastidor() {
		return bastidor;
	}

	public void setBastidor(int bastidor) {
		this.bastidor = bastidor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [bastidor=" + bastidor + ", marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo
				+ "]";
	}
	
	public void venderVehiculo() {
		
		System.out.println("Vendido vehiculo:"+this.toString());
	}
	
	
	

}
