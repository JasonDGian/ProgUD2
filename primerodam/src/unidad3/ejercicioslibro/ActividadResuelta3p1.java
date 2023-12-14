package unidad3.ejercicioslibro;

import java.util.Scanner;

public class ActividadResuelta3p1 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
		 * si es positivo y su cuadrado. El proceso se repatirá hasta que el número introducido sea 0.
		 */

		int numero = 1;
		boolean esPar = false; 
		boolean esPositivo = false;
		int cuadrado;
		
		Scanner scanner = new Scanner (System.in);


		while (numero != 0) {
			
			System.out.println("\n ------------------------------\n Introduce un numero a analizar.");
			numero = scanner.nextInt();
			
				if (numero !=0) {
					
				if (numero%2==0 ) { esPar=true; } else { esPar=false;}
				
				if (numero > 0 ) { esPositivo = true; } else { esPositivo = false; }	
				
				cuadrado=numero*numero; 
				System.out.println("El numero es par: " + esPar);
				System.out.println("El numero es positivo: " + esPositivo);
				System.out.println("El cuadrado del numero es: " + cuadrado);
			
			}
		}
			
		System.out.println("Saliendo del programa!");

		scanner.close();
	}

}

