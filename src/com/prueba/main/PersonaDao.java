package com.prueba.main;

import java.util.ArrayList;
import java.util.List;

public class PersonaDao {

	private static List<Persona> personaStorage = new ArrayList<Persona>();

	public PersonaDao() {
		personaStorage.add(new Persona(1, "Juan", "Alvarez", 21));
		personaStorage.add(new Persona(2, "Miguel", "Suaza", 17));
		personaStorage.add(new Persona(3, "Andres", "Jarramillo", 31));
	}

	public void addPersona(Persona persona) {
		personaStorage.add(persona);
	}

	public List<Persona> getAllPersonas() {

		return personaStorage;
	}

	public Persona getPersona(int id) {

		return personaStorage.get(id);
	}

	public void updatePersona(Persona persona) {

		personaStorage.set(persona.getId(), persona);
	}

	public void removePersona(int id) {

		personaStorage.remove(id);
	}

}
