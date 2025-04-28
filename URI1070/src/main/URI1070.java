package main;

import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (X % 2 != 0) {
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);		
		}
		
		else {
			X += 1;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);
			X += 2;
			System.out.println(X);		
		}
		
		sc.close();
	}

}
