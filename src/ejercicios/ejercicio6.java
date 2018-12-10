package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
//		6.Realiza un programa que dados tres números, los devuelva en orden ascendente.
		
		
		Scanner keyboard = new Scanner(System.in);
		int i;
		int i2;
		int i3;
		
		System.out.println("Introduce un numero");
		i=keyboard.nextInt();
		System.out.println("Introduce otro numero");
		i2=keyboard.nextInt();
		System.out.println("Introduce el ultimo numero");
		i3=keyboard.nextInt();
		keyboard.close();
		
		
		if(i>=i2 && i>=i3) {
			
			if (i>=i3) {
				System.out.println(i3 + " " + i2 + " " + i);
			}
			else if (i3>=i) {
				System.out.println(i2 + " " + i + " " + i3);
			}
		}
		else if(i2>=i && i2>=i3) {
			if (i>=i3) {
				System.out.println(i3 + " " + i + " " + i2);
			}
			else if (i3>=i) {
				System.out.println(i + " " + i3 + " " + i2);
			}
		
		}
		
		else if(i3>=i && i3>=i2) {
			if (i2>=i) {
				System.out.println(i + " " + i2 + " " + i3);
			}
			else if (i>=i2) {
				System.out.println(i2 + " " + i + " " + i3);
			}
		
		}
		

	}

}
