package com.clearminds.impl;

import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	
	public boolean insertar(Persona persona) {
		System.out.println("insertando persona en la bdd " + persona.toString());
		return true;
	}
	
	public boolean actualizar(Persona persona) {
		System.out.println("actualizando persona en la bdd"+ persona.toString() );
		return true;
	}
	
	public boolean eliminar(Persona persona) {
		System.out.println("eliminar persona en la bdd"+ persona.toString());
		return true;
		
	}
}
