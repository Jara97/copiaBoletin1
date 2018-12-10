package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
//		7.Dada una cadena solicitada al usuario, obtener y mostrar uno de sus caracteres elegidos
//		aleatoriamente. Mostrar también en qué posición se encuentra dicho carácter.
		Random random=new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int i2;
		int i3;
		String string;
		
		System.out.println("Introduce una cadena");
		string=keyboard.nextLine();
		
		i3=string.length();
		i2 = (random.nextInt(i3));
		keyboard.close();
		
		
		System.out.println("1) " + string.charAt(i2));
		System.out.println("el caracter se encuentra en la posicion " +i2 );

	}

}
