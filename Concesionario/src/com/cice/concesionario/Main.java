package com.cice.concesionario;

import java.util.List;

import com.cice.concesionario.dao.DataSource;
import com.cice.concesionario.entidades.Vehiculo;


public class Main {

	public static void main(String[] args) {
		

		
		
		DataSource datasource = new DataSource();
		
		List<Vehiculo> list = datasource.getBbdd();
		
		for (Vehiculo vehiculo : list) {
			System.out.println(vehiculo.toString());
		}
		

	}

}
