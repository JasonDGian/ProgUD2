// Paquete al que pertenece el ejercicio.
package unidad3.ejercicioslibro;

// Importamos la clase Scanner para leer input por CLI.
import java.util.Scanner;


public class Actividad3p1 {

	// Metodo de entrada principal a ejecución.
	public static void main(String[] args) {
		
		// Diseñar un programa que muestre, para cada numero introducido por teclado, 
        // si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el numero sea 0. 
		
		// Iniciamos el scanner.
		Scanner sc = new Scanner (System.in);
		
		// Declaramos las variables.
		int numeroUsuario;
		String controlPares = null;
		

				
		do  {
				// Informamos al usuario de que el programa atiende a una entrada por terminal.
			System.out.println("Introduce un numero para calcular si es par, si es positivo y mostrar su cuadrado.");
			
			// Almacenamos la entrada del usuario en una variable.
			numeroUsuario = sc.nextInt();
			
			// testeo de numeros pares.
			if (numeroUsuario%2==0) { controlPares = "si"; }
			else {controlPares = "no";}
			
			if (numeroUsuario!=0) { // Si el numero es distinto de 0 entonces informar al usuario del resultado.
			
			if (numeroUsuario>0) System.out.println("El numero es positivo.");
			System.out.println("El numero al cuadrado es " + (numeroUsuario*numeroUsuario) );					
			System.out.println("El numero " + controlPares + " es par.");
		}
		
		
		// Testeo de condición de bucle.
			} while (numeroUsuario!=0);
		
		System.out.println("Hasta pronto");
	
		// Cerramos el objeto Scanner para calmar el mensaje de error que genera de no cerrarse.
		sc.close();
			      
   } // Cerramos el metodo Main.
		
} // Cerramos clase Actividad3p1
