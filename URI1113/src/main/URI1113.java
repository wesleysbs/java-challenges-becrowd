package main;

import java.util.Scanner;

public class URI1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int y = 0;
		
		while (x != y) {
			 x = sc.nextInt();
			 y = sc.nextInt();
			 
			 if (x > y) {
				 System.out.println("Decrescente");
			 }
			 
			 else {
				 System.out.println("Crescente");
			 }		
		}
		
		sc.close();

	}

}
