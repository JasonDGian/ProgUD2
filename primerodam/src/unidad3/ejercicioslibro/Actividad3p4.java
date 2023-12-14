// Paquete al que pertenece la clase.
package unidad3.ejercicioslibro;

// Importamos el scanner para leer datos por terminal.
import java.util.Scanner;

// Clase del programa.
public class Actividad3p4 {

	// Metodo main de entrada principal a ejecución.
	public static void main(String[] args) {
		/*
		 * Un centro de investigación debe de registrar cual es el arbol mas alto.
		 * Para ello introducira la altura en centimetros de cada arbol.
		 * El programa termina al registrar un -1.
		 * Los arboles se identifican mediante etiquetas de numeros correlativos que comienzan en 0.
		 * 
		 * 
		 * Debemos: 
		 * Quedarnos con el arbol mas alto introducido y mostrar su etiqueta y altura por terminal.
		 * 
		 * Hacemos: 
		 * Un bucle que vaya generando una etiqueta basada en un contador que comienze en 0.
		 * Ademas vamos almacenando la altura maxima introducida.
		 * Es importante 'atar' la altura maxima a la etiqueta correspondiente: para ello en el mismo
		 * momento que actualizamos la altura máxima, indicaremos cual es la etiqueta correspondiente a otra variable
		 * que no debe de interferir con el generado de etiquetas secuenciales.
		 */

		// Declaramos las variables que vamos a usar.
		int inputAltura;  		// Variable de input de usuario.
		int maximaAltura=0; 	// Variable donde almacenamos la altura maxima registrada en el bucle.
		int etiqueta=0;       	// Variable que va generando un numero incrementado secuencialmente para la etiqueta.
		int etiquetaAlturaMaxima = 0; // Variable que almacena la etiqueta del arbol con mayor altura registrado.
		
		
		// Instaciamos un objeto de Scanner.
		Scanner sc =  new Scanner(System.in);
		
		// Indicamos al usuario que el programa atiende un input-
		System.out.println("Introduce una altura para el arbol en cm.");
		
		// Almacenamos el valor de la medida en una variable.		
		inputAltura=sc.nextInt();
		
		// Mientras que la medida no sea -1 seguiremos pidiendo medidas.
		while (inputAltura!=-1) {
			
			// Si el input del usuario supera la anterior altura maxima registrada, se actualiza el valor de altura maxima.
			// A la vez que se actualiza el valor de altura maxima, se almacena su etiqueta correspondiente.
			if (inputAltura>maximaAltura) { maximaAltura=inputAltura; etiquetaAlturaMaxima=etiqueta;		}
						
			// Comienzo siguiente loop. --------
			etiqueta++; // incremento de contador etiqueta.
			
			// Indicamos al usuario que el programa atiende un input-
			System.out.println("Introduce una altura para el arbol en cm.");
			
			// Almacenamos el valor de la medida en una variable.		
			inputAltura=sc.nextInt();
			
		} // Cierre while.
		
		// Informamos al usuario de los resultados.
		System.out.println("El arbol con etiqueta [" + etiquetaAlturaMaxima + "] es el arbol de mayor altura, que es de [" + maximaAltura + "] cm.");
		
		sc.close(); // Cerramos el scanner para evitar el mensaje de error del IDe.
	
	} // Cierre metodo main.

} // Cierre de clase.
