package unidad3.ejercicioslibro;

import java.util.Random;
import java.util.Scanner;

public class Actividad3p3 {

	public static void main(String[] args) {
		/* Codificar el juego "el numero secreto". Conssiste en acertar un numero entre 1 y 100
		* generando aleatoriamente la cifra. Para ello se introduce por teclado una serie de 
		* numeros para los que se indica "mayor" o "menor" segun sean respecto al numero secreto. 
		* El proceso termina cuando el usuario acierte o cuando se rinde mediante el input de un -1 */
		
		
		/* 
		 *  generar un numero aleatorio
		 * 
		 * Mientras que el input de usuario no sea -1 y no sea == al numero aleatorio.
			 * solicitar un numero
			 * almacenar el numero en una variable
			 * comparar la variable al numero aleatorio y decir si es mas baja o mas alta.
			 * volver a solicitar el numero
		 */
		
		Scanner sc =  new Scanner(System.in);
		Random aleatorio = new Random();
		int numeroSecreto = aleatorio.nextInt(1,100);
		int numeroUsuario;
		int contadorIntento=0;
	
		
		
		System.out.println("Introduce un numero;");
				
		do {
			
			numeroUsuario = sc.nextInt();
			
			if ((numeroUsuario!=-1) && (numeroUsuario>numeroSecreto)) System.out.println("Es menor.");
			
			if ((numeroUsuario!=-1) && (numeroUsuario<numeroSecreto)) System.out.println("Es mayor.");
			
			contadorIntento++;
			
		} while((numeroUsuario!=-1) && (numeroUsuario != numeroSecreto));
		
		if (numeroUsuario == numeroSecreto)	System.out.println("¡Enhorabuena! Lo conseguiste en " + contadorIntento + " intentos.");
		if (numeroUsuario == -1)	System.out.println("Más suerte la proxima vez!");
		
		// Cerramos el objeto Scanner para calmar el mensaje de error que genera de no cerrarse.
		sc.close();
			      
	} // Cerramos el metodo Main.
				
} // Cerramos clase Actividad3p3
