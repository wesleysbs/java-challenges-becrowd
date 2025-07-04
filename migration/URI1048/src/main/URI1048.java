package main;

import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salarioInicial = sc.nextDouble();
		double novoSalario;
		double reajuste;
		
		if (salarioInicial <= 400.00) {
			 reajuste = (salarioInicial * 0.15);
			 novoSalario = salarioInicial + reajuste;
			 System.out.printf("Novo salario: %.2f%n", novoSalario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			 System.out.println("Em percentual: 15%");		
		}
		
		else if (salarioInicial > 400.00 && salarioInicial <= 800.00) {
			 reajuste = (salarioInicial * 0.12);
			 novoSalario = salarioInicial + reajuste;
			 System.out.printf("Novo salario: %.2f%n", novoSalario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			 System.out.println("Em percentual: 12%");		
		}
		
		else if (salarioInicial > 800.00 && salarioInicial <= 1200.00) {
			 reajuste = (salarioInicial * 0.10);
			 novoSalario = salarioInicial + reajuste;
			 System.out.printf("Novo salario: %.2f%n", novoSalario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			 System.out.println("Em percentual: 10%");			
		}
		
		else if (salarioInicial > 1200.00 && salarioInicial <= 2000.00) {
			 reajuste = (salarioInicial * 0.07);
			 novoSalario = salarioInicial + reajuste;
			 System.out.printf("Novo salario: %.2f%n", novoSalario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			 System.out.println("Em percentual: 7%");	
		}
		
		else {
			 reajuste = (salarioInicial * 0.04);
			 novoSalario = salarioInicial + reajuste;
			 System.out.printf("Novo salario: %.2f%n", novoSalario);
			 System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			 System.out.println("Em percentual: 4%");				
		}
		
		sc.close();

	}

}
