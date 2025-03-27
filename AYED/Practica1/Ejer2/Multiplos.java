package Ejer2;

import java.util.Scanner;

public class Multiplos {

	public Multiplos(){}
	
	
	public void multiplicar(Integer n) {
		Integer[] arreglo = new Integer[n];
		for (int i = 0; i != n; i++) {
			arreglo[i] = n * (i+1);
		}
		
		for (int i = 0; i != n; i++) {
			System.out.println(arreglo[i]);
		}
		
	}
}
