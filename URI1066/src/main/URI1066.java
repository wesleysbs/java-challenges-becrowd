package main;

import java.util.Scanner;

public class URI1066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        int valor1 = sc.nextInt();
        if (valor1 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        
        
        if (valor1 > 0) {
            positivos++;
        } else if (valor1 < 0) {
            negativos++;
        }

        
        int valor2 = sc.nextInt();
        if (valor2 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        
        
        if (valor2 > 0) {
            positivos++;
        } else if (valor2 < 0) {
            negativos++;
        }

        
        int valor3 = sc.nextInt();
        if (valor3 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        
        if (valor3 > 0) {
            positivos++;
        } else if (valor3 < 0) {
            negativos++;
        }

        
        
        int valor4 = sc.nextInt();
        if (valor4 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        
        if (valor4 > 0) {
            positivos++;
        } else if (valor4 < 0) {
            negativos++;
        }

        
        
        int valor5 = sc.nextInt();
        if (valor5 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        
        if (valor5 > 0) {
            positivos++;
        } else if (valor5 < 0) {
            negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        sc.close();
    }
}