package Lista01;

import java.util.Scanner;
//24. FAÇA UM ALGORITMO QUE RECEBA “N” NÚMEROS E MOSTRE POSITIVO, NEGATIVO OU ZERO PARA CADA NÚMERO;
public class Exercicio24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = 0;

		while (num <= 0 || num >0) {

			System.out.println("Digite qualquer número:");
			num = ler.nextInt();

			if (num == 0) {
				System.out.println("O número é Zero");
				System.out.println("----------------------");
			} else {
				if (num < 0) {
					System.out.println("O número é negativo");
					System.out.println("----------------------");
				} else {
					System.out.println("O número é positivo");
					System.out.println("----------------------");
				}
			}

		}

	}

}
