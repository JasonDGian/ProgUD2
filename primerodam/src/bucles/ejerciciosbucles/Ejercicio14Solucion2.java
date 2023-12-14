package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio14Solucion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * 
		 * la anchura = (altura*2)-1;
		 */

		int altura = 0;
		String tree = "";

		System.out.println("introduce altura");
		Scanner sc = new Scanner(System.in);
		altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) {

			// bucle blancos
			for (int j = 1; j <= (altura - i); j++) {
				tree = tree + " ";
			}

			// bucle pintar negros
			for (int k = 1; k <= (2 * i) - 1; k++) {
				tree = tree + "*";
			}

			tree = tree + "\n";

		}

		System.out.print(tree);

	}

}
