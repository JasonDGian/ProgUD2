package bucles.ejerciciosbucles;

import java.util.Scanner;

public class ejerciciosbucles13encurso {

	public static void main(String[] args) {
		// Ejercicio 13. Escribir un programa que pida al usuario un número entero y
		// muestre por pantalla un triángulo rectángulo como el de más abajo, de 
		// altura el número introducido.

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero entero; ");
		int altura = scan.nextInt();

		/*
		 * tomar un numero por la consola de ese numero,
		 */
		
		for (int i=1; i<=altura; i++) { // El bucle se repite tantas veces como definido en la variable.
		
			
			/* 
			 * El bucle ciclará hasta que 'j' llegue a 1.
			 * Cada ciclo decrementará 1 a 'j'.
			 * 'j' equivale a i, i va aumentando cada ciclo padre.
			 */ 
			for ( int j=i; j>=1; j-- ) { 
				
				System.out.print(2*j-1 + " ");

			}
			
			System.out.println(); //Introduce un retorno carro.
		
		}

		scan.close();
	}

}
