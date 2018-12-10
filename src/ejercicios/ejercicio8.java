package ejercicios;

import java.util.Random;

public class ejercicio8 {

	public static void main(String[] args) {
		
//		8.Realiza un programa que saque una carta aleatoria de una baraja con 4 palos y 13 cartas por cada
//		palo. Los palos son Picas ♠, Corazones ♥, Diamantes ♦ y Tréboles ♣. Las 13 cartas por cada
//		palo irán del as al diez y además tres figuras: jota, reina y rey. Mostrar la carta incluyendo el
//		símbolo del palo(♠,♥,♦,♣).
		
		Random random=new Random();
		int i;
		int i2;
		
		i = (random.nextInt(4));
		i2 = (random.nextInt(13)+1);
		
		if (i2<11) {
			System.out.print("Tu carta es el "+ i2 );
		}
		else if (i2==11) {
			System.out.print("Tu carta es la jota");
		}
		else if (i2==12) {
			System.out.print("Tu carta es la reina");
		}
		else if (i2==13) {
			System.out.print("Tu carta es el rey");
		}
		
		if (i==0) {
			System.out.print(" de ♠");
		}
		else if (i==1) {
			System.out.print(" de ♥");
		}
		else if (i==2) {
			System.out.print(" de ♦");
		}
		else if (i==3) {
			System.out.print(" de ♣");
		}
	}
}
