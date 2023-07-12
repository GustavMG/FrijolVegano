package com.FrijolVegano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrijolVeganoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrijolVeganoApplication.class, args);
		System.out.println("Prueba para frijol vegano");
		System.out.println("Se debe apagar el servidor y luego correr el programa para ver los ultimos cambios");
	}

}
