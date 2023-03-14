package org.bedu.java.backend.Postwork;

import org.bedu.java.backend.Postwork.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		Persona persona = new Persona(nombre, telefono);

		System.out.println(persona);
	}
}

