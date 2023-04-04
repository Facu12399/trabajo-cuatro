package poo;

import java.util.*;

public class Punto_C_2 {
	String producto;
	int cantidad;
	double precio, total, descuento;
	
	Scanner entrada=new Scanner(System.in);
	
	public void Supermercado(String producto, String opcion, int cantidad, double precio, double total, double descuento) {
		
		System.out.println("Ingrese el nombre del area de productos a comprar: ");
		
		System.out.println("1. Frutas ");
		System.out.println("2. Verduras ");
		System.out.println("3. Gaseosas ");
		
		opcion = entrada.nextLine();
		
		if(opcion.equalsIgnoreCase("Frutas")) {
			System.out.println("Ingrese el nombre del producto: ");
			producto=entrada.nextLine();
			System.out.println("Ingrese el precio del producto: ");
			precio=entrada.nextDouble();
			System.out.println("Ingrese la cantidad a comprar: ");
			cantidad=entrada.nextInt();
		}else if (opcion.equalsIgnoreCase("Verduras")){
			System.out.println("Ingrese el nombre del producto: ");
			producto=entrada.nextLine();
			System.out.println("Ingrese el precio del producto: ");
			precio=entrada.nextDouble();
			System.out.println("Ingrese la cantidad a comprar: ");
			cantidad=entrada.nextInt();
		}else if (opcion.equalsIgnoreCase("Gaseosas")){
			System.out.println("Ingrese el nombre del producto: ");
			producto=entrada.nextLine();
			System.out.println("Ingrese el precio del producto: ");
			precio=entrada.nextDouble();
			System.out.println("Ingrese la cantidad a comprar: ");
			cantidad=entrada.nextInt();
		}else{
			System.out.println("La opción ingresada es incorrecta");
		}
		System.out.println("------------------------------------------");
		
		total=precio*cantidad;
		
		System.out.println("Producto        Cantidad         Total");
		System.out.println(producto + "         " + cantidad + "                 " + total);
		System.out.println("------------------------------------------");
		
		if(total>1000){
			descuento=total*20/100;
			total=total*0.80;
			System.out.println("Debido a que su compra supera los $1000. Usted tiene un descuento de $" 
					+ descuento + ". Por lo tanto debera abonar $" + total);
		} else {
			System.out.println("No tiene ningun descuento. Debe abonar $" + total);
		}
		
	}
	
}