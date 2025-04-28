package main;

import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		 int positivos = 0;
	        double soma = 0.0;

	        double valor1 = sc.nextDouble();
	        if (valor1 > 0) {
	            positivos++;
	            soma += valor1;
	        }

	        double valor2 = sc.nextDouble();
	        if (valor2 > 0) {
	            positivos++;
	            soma += valor2;
	        }

	        double valor3 = sc.nextDouble();
	        if (valor3 > 0) {
	            positivos++;
	            soma += valor3;
	        }

	        double valor4 = sc.nextDouble();
	        if (valor4 > 0) {
	            positivos++;
	            soma += valor4;
	        }

	        double valor5 = sc.nextDouble();
	        if (valor5 > 0) {
	            positivos++;
	            soma += valor5;
	        }

	        double valor6 = sc.nextDouble();
	        if (valor6 > 0) {
	            positivos++;
	            soma += valor6;
	        }

	        double media = soma / positivos;

	        System.out.println(positivos + " valores positivos");
	        System.out.printf("%.1f%n", media);

		        sc.close();
		    }			
}