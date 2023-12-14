// Package the program belongs to.
package unidad3.ejercicioslibro;

//Importamos la clase Scanner para leer datos por CLI.
import java.util.Scanner;

public class ejercicio3p11 {

	public static void main(String[] args) {
		/* 
		 * Ejercicio 3.13: Escribe un programa que incremente la hora de un reloj. 
		 * Se pedirán por teclado la hora, minutos y segundos, asi como cuantos segundos 
		 * se desea incrementar la hora introducida. La aplicacion mostrará la nueva hora.
		 */
		
		// Scanner object instantiation for input reads.
		Scanner scan = new Scanner(System.in);
		
		// Declare variables.
		int hours, minutes, seconds,totalSeconds, incrementSeconds;
		
		// Prompt the user for the current hour.
		System.out.println("Input the hour: ");
		hours = scan.nextInt(); // Stores the value for the hours in a variable called 'hour'
		
		// Prompt the user for the current hour.
		System.out.println("Input the minutes: ");
		minutes = scan.nextInt(); // Stores the value for the minutes in a variable called 'minutes'
		
		// Prompt the user for the current hour.
		System.out.println("Input the seconds: ");
		seconds = scan.nextInt(); // Stores the value for the seconds in a variable called 'seconds'
		
		// User's raw input report.
		System.out.println("La hora introducida: " + hours +":"+minutes+":"+seconds);
		
		// Users reformatted input report.		
		System.out.println("La hora corregida: " + ((hours%24)+(minutes/60)) +":"+((minutes%60)+(seconds/60)) +":"+(seconds%60));
		
		// Prompt the user for the desired increment IN SECONDS.
		System.out.println("\nInput the seconds to increase the current time: ");
		
		// Stores the value for the seconds in a variable called 'incrementSeconds'
		incrementSeconds = scan.nextInt(); 

		totalSeconds = (hours*3600) + (minutes*60) + seconds + incrementSeconds;
		
		seconds = totalSeconds%60;
		totalSeconds = totalSeconds/60;
		minutes = totalSeconds%60;
		hours = totalSeconds/60;
		
		
		System.out.println("The resulting hour is :" + hours +":"+minutes+":"+seconds);
		
		scan.close(); // Close the scanner to calm the IDE error message.
		
	} // Close main entry point method.
 
} // Close program class
