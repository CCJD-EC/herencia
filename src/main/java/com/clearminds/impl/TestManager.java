package com.clearminds.impl;

import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager persManager = new PersonaManager();
		
		persManager.insertarPersona(new Persona("marcos", "milano", 10));
		
		
		/*Al intentar ejecutar este codigo produce un nullPointerException
		 * debido a que en el constructor se instancia el objeto de tipo
		 * ServicioPersonaBDD pero la funcion toma el atributo de la clase para realizar la 
		 * operacion y como no tiene valor queda en null.
		 * 
		 * ServicioPersonaBDD este objeto al ser una variable local su ciclo 
		 * solo es dentro del metodo en este caso el constructor y muere cuando
		 * se termina de usar el constructor y sus valores se pierden
		 * 
		 * */
	}
}
