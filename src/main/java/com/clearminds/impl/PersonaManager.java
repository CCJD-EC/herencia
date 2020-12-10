package com.clearminds.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.clearminds.excepciones.InstanceException;
import com.clearminds.interfaces.ServicioPersona;
import com.clearminds.model.Persona;

public class PersonaManager {

		private ServicioPersona serv;
		public static String directorio = "./config.properties";
		
		public PersonaManager(String propiedad) throws InstanceException {
			Class<?> clase = null;
			String claseElegida = leerPropiedad(propiedad);
			try {
				clase = Class.forName("com.clearminds.impl."+claseElegida);
				this.serv = (ServicioPersona)clase.newInstance();
			} catch (Exception e) {
				throw new InstanceException("Error al obtener una instancia de ServicioPersona");
			}
			
		}
		
		public void insertarPersona(Persona persona) {
			serv.insertar(persona);
		}
	

		public static String leerPropiedad(String nombre) {

			File f = new File(directorio);

			BufferedReader br = null;
			FileReader fr = null;
			try {
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String linea = "";
				String valor = "";

				while ((linea = br.readLine()) != null) {
					
					String[] propiedad = linea.split(":", 2);
					if (propiedad[0].equals(nombre))
						return propiedad[1];
				}

			} catch (FileNotFoundException e) {
				System.out.println("No se encontro el archivo " + directorio);
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Problema al leer el archivo");
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
}
