package poo;

import java.util.*;

public class Punto_B_2 {

	String nombre;
	int edad;
	
	Scanner entrada = new Scanner(System.in);
	
	public void saberedad(String nombre,int edad){
		
		System.out.println("Ingresa tu nombre completo:");
		
		nombre = entrada.nextLine();
		
		System.out.println("Ingresa tu edad:");
		
		edad = entrada.nextInt();
		
		if(edad>=18){
			System.out.println("Su nombre es " + nombre + " y es mayor de edad");
		}else {
			System.out.println("Su nombre es " + nombre + " y es menor de edad");
		}
		
	}
}

