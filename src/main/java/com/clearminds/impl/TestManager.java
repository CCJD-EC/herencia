package com.clearminds.impl;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager persManager;
		try {
			persManager = new PersonaManager();
			persManager.insertarPersona(new Persona("marcos", "milano", 10));
		} catch (InstanceException e) {
			e.printStackTrace();
		}
		
	}
}
