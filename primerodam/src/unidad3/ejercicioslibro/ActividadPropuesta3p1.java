package unidad3.ejercicioslibro;

import java.util.Scanner;

public class ActividadPropuesta3p1 {

	public static void main(String[] args) {
		/*
		 * Diseña una aplicacion que muestre la edad maxima y la edad minima de un grupo de alumnos.
		 * El prorgrama cierra al introducir -1.
		 */
		
		int edadAlumno = 0;
		int edadmax = 0;
		int edadmin = 0;
		
		Scanner scanner = new Scanner (System.in);


		while (edadAlumno != -1) {
			
			System.out.println("Introduce la edad del alumno.");
			edadAlumno = scanner.nextInt();
			
			if (edadAlumno > edadmax) {  edadmax = edadAlumno; }
			if (edadAlumno < edadmin && edadAlumno>0) {  edadmin = edadAlumno; }
			
			
		}
		
		System.out.println("La edad maxima: " + edadmax + "\nLa edad minima: " + edadmin );

		scanner.close();
	}

}
