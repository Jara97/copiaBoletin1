package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
//		5.Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno. Se desea calcular el
//		jornal diario de acuerdo con los siguientes tarifas: la tarifa de las horas diurnas es de 3 € por
//		hora, mientras que el de las nocturnas es de 4,80 € por hora. Cuando se trata de un día
//		festivo, la tarifa se incrementa en 1,20 € por hora en el turno diurno y 1,80 € por hora en el
//		nocturno.
		
		Scanner keyboard = new Scanner(System.in);
		double h;
		boolean t;
		double h1;
		
		double total;
		
		
		System.out.println("¿Trabajas por la noche?");
		t=keyboard.nextBoolean();
		System.out.println("Horas trabajadas dias ordinarios");
		h=keyboard.nextInt();
		System.out.println("Horas trabajadas dias festivos");
		h1=keyboard.nextInt();
		
		
		
		keyboard.close();
		
		
		if(t==false) {
			total=h*3+h1*4.20;
			System.out.println("Sueldo total =" + total);
		}
		else if(t==true) {
			total=h*4.80+h1*6.60;
			System.out.println("Sueldo total =" + total);
		}
		
		
	}

}
