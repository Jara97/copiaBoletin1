package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
//		3.Realiza un programa que lea tres números positivos y compruebe si son iguales. Por ejemplo:
//			Si la entrada fuese 5 5 5, la salida debería ser “hay tres números iguales a 5”. Si la entrada
//			fuese 4 6 4, la salida debería ser “hay dos números iguales a 4”. Si la entrada fuese 0 1 2, la
//			salida debería ser “no hay números iguales”.
		
		
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
		
		
		if(i==i2 && i==i3) {
			System.out.println("hay 3 numeros iguales");
		}
		else if(i==i2 || i==i3  || i2==i3) {
			if (i==i2) {
				System.out.println("hay 2 numeros iguales a " + i);
			}
			else if (i==i3) {
				System.out.println("hay 2 numeros iguales a " + i);
			}
			else if (i2==i3) {
				System.out.println("hay 2 numeros iguales a " + i2);
			}
		}
		else {
			System.out.println("No hay numeros iguales");
		}
	}
			
}


