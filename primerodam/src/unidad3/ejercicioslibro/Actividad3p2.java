// Nombre del paquete en el que se encuentra la clase.
package unidad3.ejercicioslibro;

// Importamos la clase Scanner para utilizarla más adelante.
import java.util.Scanner;

public class Actividad3p2 {

	// Punto de entrada a ejecución principal.
	public static void main(String[] args) {
		/* 
		* Implementar una aplicacion para calcular datos estadisticos de las edades de los alumnos de un centro educativo
		* Se introduciran datos hasta que uno de ellos sea negativo y se mostrará; la suma de todas las edades introducidas. 
		* La media, el numero de alumnos y cuantos son mayores de edad.El bucle se interrumpirá cuando la edad intrnoducida será negativo.
		*/
		
		/*
		 * Mientras que la edad sea mayor que 0.
		 * Mostrar suma de todas las  edades.
		 * Media de todas las edades.
		 * Numero de alumnos cuya edad ha sido introducida.
		 * Numero de alumnoso cuya edad  introducida super o equivale a la mayoria de edad
		 */
		
		// Instanciamos el objeto de clase Scanner en una variable. 
		Scanner sc =  new Scanner(System.in);
		
		// Inicializamos las variables a utilizar en los calculos.
		int inputEdad=0;  					 // Variable de input de datos por parte del usuario.
		int contadorAlumnos=0; 				 // Contador de alumnos totales introducidos.
		int contadorAlumnosMayoresEdad=0; 	 // Contador de alumnos que superan o alcanzan los 18 años.
		int sumaTotalEdadesIntroducidas = 0; // Variable acumuladora de edades de alumnos.
		double mediaEdadAlumnos = 0;  		 // Variable para el calculo de la media.
		
		// Mostramos un mensaje al usuario para que sepa que la consola espera una entrada por su parte.
		System.out.println("Introduce la edad del alumno.");
		// Almacenamos la entrada del usuario en una variable.
		inputEdad= sc.nextInt();
		
		
		// Si la edad introducida por el usuario es mayor o igual a 0.
		while(inputEdad>=0) {

			// Segun la edad introducida actualizamos el contador de alumnos mayores de edad.
			if (inputEdad>=18) {contadorAlumnosMayoresEdad++; contadorAlumnos++;}
			// Si la edad es superior a 0 actualizamos el contador de alumnos introducidos.			
			else if (inputEdad>=0) {contadorAlumnos++;} // Hacemos esto para obviar el input -1
			
			// Acumulador de inputs de edades.
			sumaTotalEdadesIntroducidas+= inputEdad;
			
			
			// Mostramos un mensaje al usuario para que sepa que la consola espera una entrada por su parte.
			System.out.println("Introduce la edad de otro alumno.");
			// Almacenamos la entrada del usuario en una variable.
			inputEdad= sc.nextInt();
			
			}
		
		// Calculo de la media. Para almacenar el resultado de este calculo usamos una variable de tipo doble.
		mediaEdadAlumnos = (sumaTotalEdadesIntroducidas/contadorAlumnos);
	
		// Mensajes que informan al usuario del resultado.
		System.out.println("La suma de todas las edades es " + sumaTotalEdadesIntroducidas);
		System.out.println("La cantidad de alumnos totales introducidos es " + contadorAlumnos);
		System.out.println("La cantidad de alumnos mayores de edad introducidos es " + contadorAlumnosMayoresEdad);
		System.out.println("La media de todas las edades es " + mediaEdadAlumnos);
		 
		// Cerramos el objeto Scanner para calmar el mensaje de error que genera de no cerrarse.
		sc.close();
	      
	   } // Cerramos el metodo Main.
		
	} // Cerramos clase Actividad3p2
