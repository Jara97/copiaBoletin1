package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
//		1.Hacer un programa que lea por teclado un número entero y nos diga si el número es positivo,
//		negativo o cero.
		Scanner keyboard = new Scanner(System.in);
		int i;
		
		System.out.println("Introduce un numero");
		i=keyboard.nextInt();
		
		if (i>0) {
			System.out.println(i + " Es positivo");
		}
		else if(i<0) {
			System.out.println(i + " Es negativo");
		}
		else if(i==0) {
			System.out.println(i + " es cero");
		}
		keyboard.close();
}
	}
