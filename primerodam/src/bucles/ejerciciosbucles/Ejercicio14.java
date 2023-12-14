package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio14 {

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

			for (int j = 1; j <= altura - 1 + i; j++) {

				if (j <= altura - i) {
					tree = tree + " ";
				} else {
					tree = tree + "*";
				}

			}

			tree = tree + "\n";

		}

		System.out.print(tree);

	}

}
