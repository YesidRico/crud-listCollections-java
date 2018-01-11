package com.prueba.main;

import java.util.List;

public class PersonaController {

	private PersonaDao personadao;

	public PersonaController() {
		personadao = new PersonaDao();
	}

	public void addPersona(Persona persona) {

		personadao.addPersona(persona);
	}

	public List<Persona> getAllPersonas() {

		return personadao.getAllPersonas();
	}

	public Persona getPersona(int id) {
		
		return personadao.getPersona(id);
	}
	
	public void updatePersona(Persona persona) {

		personadao.updatePersona(persona);
	}

	public void removePersona(int id) {
		personadao.removePersona(id);
	}
}
