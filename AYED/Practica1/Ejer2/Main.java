package Ejer2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Multiplos m = new Multiplos();
		System.out.print("Ingrese un número (-1 para salir): ");
		int n = scan.nextInt();
		while (n != -1) {
			m.multiplicar(n);
			System.out.print("\n");
			System.out.print("Ingrese un número (-1 para salir): ");
			n = scan.nextInt();
		}
		System.out.print("Cerrando Sistema...");
	}

}
