package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Ejercicio 12 ALTERNATIVO. Escribir un programa que pida al usuario un número entero y muestre por
		// pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero entero; ");
		int alturaArbol = scan.nextInt();
		

		String arbol="";
		
		for (int i=1; i<=alturaArbol; i++) {

			for (int j=1; j<=i; j++) {

				arbol=arbol+"* ";
			}

			arbol=arbol+"\n";
			
		}
		
		System.out.println(arbol);

		scan.close();
	}


}
