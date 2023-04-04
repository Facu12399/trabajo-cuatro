package poo;

import java.util.Scanner;

public class Punto_A {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y apellido: ");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad: ");
		
		int edad=entrada.nextInt();
		
		System.out.println("Tu nombre es " + nombre + " y tenes " + edad + " años.");
		
	}

}

