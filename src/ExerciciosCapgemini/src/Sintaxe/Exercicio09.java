package Sintaxe;

import java.util.Scanner;

/*9. FAÇA UM ALGORITMO QUE RECEBA UM VALOR QUE FOI DEPOSITADO E EXIBA O VALOR COM RENDIMENTO APÓS UM
MÊS.CONSIDERE FIXO O JURO DA POUPANÇA EM 0,07% A. M;*/
public class Exercicio09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float valorDepositado, rendimento, juros;

		System.out.println("Digite o valor depositado:");
		valorDepositado = ler.nextFloat();

		juros = (float) ((0.07 * valorDepositado) / 100);
		rendimento = valorDepositado + juros;

		System.out.println("Seu rendimento foi de:" + rendimento);

	}

}
