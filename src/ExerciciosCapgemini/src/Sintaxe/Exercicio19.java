package Sintaxe;

/*19. ESCREVA UM ALGORITMO QUE LEIA O NOME E O SEXO DE 56 PESSOAS E INFORME O NOME E SE ELA É HOMEM OU
MULHER. NO FINAL INFORME TOTAL DE HOMENS E DE MULHERES;*/
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome = null, sexo = null;
		char f = 0, m;
		int i = 1, totalHomens = 0, totalMulheres = 0;

		for (; i <= 56; i++) {

			System.out.println("Digite seu nome:");
			nome = ler.next();

			System.out.println("Digite o seu sexo F- Feminino/ M - Masculino:");
			sexo = ler.next();

			if (sexo.equals("f") || sexo.equals("F")) {
				System.out.println(nome + "\t " + "É do sexo feminino");
				totalMulheres++;

			} else {
				if (sexo.equals("m") || sexo.equals("M")) {
					System.out.println(nome + "\t " + "É do sexo masculino");
					totalHomens++;
				}

			}

		}
		System.out.println("..........................................");
		System.out.println("o total de mulheres:" + totalMulheres++);
		System.out.println("o total de Homens:" + totalHomens++);
	}
}