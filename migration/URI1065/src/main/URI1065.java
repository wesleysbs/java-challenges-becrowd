package main;

import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pares = 0;
		
		int valor1 = sc.nextInt();
		if (valor1 % 2 == 0) {
			pares++;
		}
		
		int valor2 = sc.nextInt();
		if (valor2 % 2 == 0) {
			pares++;
		}
		
		int valor3 = sc.nextInt();
		if (valor3 % 2 == 0) {
			pares++;
		}
		
		int valor4 = sc.nextInt();
		if (valor4 % 2 == 0) {
			pares++;
		}
		
		int valor5 = sc.nextInt();
		if (valor5 % 2 == 0) {
			pares++;
		}
		
		 System.out.println(pares + " valores pares");
		
		sc.close();
	}

}
