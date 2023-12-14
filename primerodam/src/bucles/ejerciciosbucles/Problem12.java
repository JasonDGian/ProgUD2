package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int cont = 1;
		String tree = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the tree height;");

		int height = sc.nextInt();

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= i; j++) {
				// el bucle interno genera las filas.
				tree = tree + cont + " ";
				cont++;

			}

			// el bucle externo salta linea.
			tree = tree + "\n";

		}

		System.out.print(tree);

		sc.close();

	}

}
