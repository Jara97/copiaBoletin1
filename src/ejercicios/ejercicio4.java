package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
//		4.Realiza un programa que calcule el precio de un billete de ida y vuelta por avión, conociendo
//		la distancia a recorrer, el número de días de estancia y sabiendo que si la distancia es
//		superior a 1.000 Km y el número de días de estancia es superior a 7, la línea aérea le hace un
//		descuento del 30 %. (Precio por kilómetro = 0,35 €).
		
		Scanner keyboard = new Scanner(System.in);
		double d;
		int days;
		double precio;
		
		
		System.out.println("Distancia a recorrer");
		d=keyboard.nextInt();
		System.out.println("numero de dias");
		days=keyboard.nextInt();
		
		keyboard.close();
		
		if (d>=1000 && days>=7) {
			precio=(d*0.35)-(d*0.35)*30/100;
			System.out.println("Precio =" + precio);
		}
		else {
			precio=d*0.35;
			System.out.println("Precio =" + precio);
		}

	}

}
