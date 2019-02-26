package com.cice.concesionario.dao;

import java.util.List;
import java.util.ArrayList;

import com.cice.concesionario.entidades.Coche;
import com.cice.concesionario.entidades.Moto;
import com.cice.concesionario.entidades.Vehiculo;



public class DataSource {
	
	public List<Vehiculo> bbdd ;
	
	
	//constructor
	public DataSource() {
		super();
		Coche coche = new Coche(111, "Tesla", "jj11ss", "model-3", 4, "Diesel");
		Coche coche2 = new Coche(222, "Seat", "aa22ss", "Ibiza", 5, "Gasolina");
		Coche coche3 = new Coche(333, "Ford", "aa33ss", "Mondeo", 5, "Gasolina");
		
		Moto moto = new Moto(11,"HONDA","KLK5678","RS6",450,"Blanco");     
		Moto moto2 = new Moto(12,"Ducati","AAA5678","MONSTER",1000,"Rojo"); 
		Moto moto3 = new Moto(13,"Yamaha","BBB5678","F1",600,"Verde");
		this.bbdd = new ArrayList<>() ;
		bbdd.add(coche);
		bbdd.add(coche2);
		bbdd.add(coche3);
		
		bbdd.add(moto);
		bbdd.add(moto2);
		bbdd.add(moto3);
		
	}


	public List<Vehiculo> getBbdd() {
		return bbdd;
	}


	public void setBbdd(List<Vehiculo> bbdd) {
		this.bbdd = bbdd;
	} 
	
	
	
	
	

}
