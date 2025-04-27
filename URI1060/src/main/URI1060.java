package main;

import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		 int positivos = 0;

		 double valor1 = sc.nextDouble();
		 if (valor1 > 0) positivos++;

		 double valor2 = sc.nextDouble();
		 if (valor2 > 0) positivos++;

		 double valor3 = sc.nextDouble();
		 if (valor3 > 0) positivos++;

		 double valor4 = sc.nextDouble();
		 if (valor4 > 0) positivos++;

		 double valor5 = sc.nextDouble();
		 if (valor5 > 0) positivos++;

		 double valor6 = sc.nextDouble();
		 if (valor6 > 0) positivos++;

		 System.out.println(positivos + " valores positivos");

		        sc.close();
		    }
				
}
