package com.prueba.main;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		PersonaController personactrl = new PersonaController();
		Persona persona;

		int opcionmenu = 0;

		System.out.println("¡Bienvenido al sistema personas! \n");

		while (opcionmenu != -1) {

			System.out.println(">>> Menú <<< \n\n" + "1. Añadir Persona. \n" + "2. Listar Personas. \n"
					+ "3. Consultar Persona. \n" + "4. Modificar Persona. \n" + "5. Remover Persona. \n");

			System.out.println("\n Elige una opción del menú (-1 Para finalizar): ");
			opcionmenu = sc.nextInt();

			switch (opcionmenu) {
			case 1:
				System.out.println("Ingrese el Id: ");
				int id = sc.nextInt();

				System.out.println("Ingrese el Nombre: ");
				String nombre = sc.nextLine();

				System.out.println("Ingrese el Apellido: ");
				String apellido = sc.nextLine();

				System.out.println("Ingrese la Edad: ");
				int edad = sc.nextInt();

				persona = new Persona(id, nombre, apellido, edad);

				System.out.println(persona);

				personactrl.addPersona(persona);

				break;

			case 2:

				Iterator<Persona> it = personactrl.getAllPersonas().iterator();

				while (it.hasNext()) {

					Persona p = it.next();
					System.out.println(p);
				}

				break;
			case -1:
				System.out.println(">>> Aplicación terminada <<<");
				System.exit(0);
				break;

			default:
				break;
			}
		}

		System.out.println(">>> Aplicación terminada <<<");
		System.exit(0);
	}

}
