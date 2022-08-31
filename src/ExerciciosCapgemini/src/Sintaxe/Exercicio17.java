package Sintaxe;

import java.util.Scanner;

//17. LEIA 80 NÚMEROS E AO FINAL INFORMAR QUANTOS NÚMERO(S) ESTÃO NO INTERVALO ENTRE 10 (INCLUSIVE) E 150(INCLUSIVE)
public class Exercicio17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float num = 0;
		int i = 1, contador = 0;

		for (; i <= 80; i++) {
			System.out.println("Digite um número:");
			num = ler.nextFloat();

			if (num >= 10 && num <= 150) {
				contador++;
			}
		}
		System.out.println("Os números que estão no intervalo entre 10 e 150 são:" + contador);
	}

}