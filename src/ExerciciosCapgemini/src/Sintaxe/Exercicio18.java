package Sintaxe;
/*FAÇA UM ALGORITMO QUE RECEBA A IDADE DE 75 PESSOAS E MOSTRE MENSAGEM INFORMANDO “MAIOR DE IDADE” E
“MENOR DE IDADE” PARA CADA PESSOA. CONSIDERE A IDADE A PARTIR DE 18 ANOS COMO MAIOR DE IDADE;*/

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		String nome;
		float idade;
		int i = 1, contador = 0;

		for (; i <= 70; i++) {

			System.out.println("Digite seu nome:");
			nome = ler.next();

			System.out.println("Digite sua idade:");
			idade = ler.nextFloat();

			if (idade >= 18) {
				System.out.println(nome + "\t " + "É maior de idade");
			} else {
				System.out.println(nome + "\t " + "É menor de idade");
			}
			System.out.println(".........................");
		}

	}

}