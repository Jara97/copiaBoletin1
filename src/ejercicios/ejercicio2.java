package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
//		2.Pedir dos números por teclado e indicar si el primero es múltiplo del segundo.
//		Nota: un número x es múltiplo de y, si al dividir x entre y, el resto es 0.
		
		Scanner keyboard = new Scanner(System.in);
		int i;
		int i2;
		
		System.out.println("Introduce un numero");
		i=keyboard.nextInt();
		System.out.println("Introduce otro numero");
		i2=keyboard.nextInt();
		keyboard.close();
		
		if (i%i2==0) {
			System.out.println(i + " es divisible entre " + i2);
		}
		else  {
			System.out.println(i + " no es disisible entre " + i2);
		}
	}

}
