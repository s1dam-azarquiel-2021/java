package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		int espacios = n - 1;

		for (int i = 1; i <= n; i++ ) {
			int actual = 1;
			boolean centroHecho = false;
			
			for (int j = 1; j <= n * 2 + 1; j++) {
				if (j > espacios && j < n * 2 - espacios) {
					if (j == n) {
						centroHecho = true;
						System.out.print(actual + " ");
						actual--;
					} else if (!centroHecho) {
						System.out.print(actual + " ");
						actual++;
					} else {
						System.out.print(actual + " ");
						actual--;
					}
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
			espacios--;
		}
	}
}
