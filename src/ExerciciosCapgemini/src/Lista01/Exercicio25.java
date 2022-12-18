package Lista01;

import java.util.Scanner;

/*25. FAÇA UM ALGORITMO QUE LEIA DOIS NÚMEROS E IDENTIFIQUE SE SÃO IGUAIS OU DIFERENTES. CASO ELES SEJAM IGUAIS
IMPRIMA UMA MENSAGEM DIZENDO QUE ELES SÃO IGUAIS. CASO SEJAM DIFERENTES, INFORME QUAL NÚMERO É O
MAIOR, E UMA MENSAGEM QUE SÃO DIFERENTES;*/
public class Exercicio25 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float num1, num2;

		System.out.println("Digite um número:");
		num1 = ler.nextFloat();

		System.out.println("Digite outro número:");
		num2 = ler.nextFloat();

		if (num1 == num2) {
			System.out.println("Os números são iguias!");
		} else if (num1 > num2) {
			System.out.println("Os números são diferentes!" + "\n " + num1 + "\t" + "é maior");
		} else {
			System.out.println("Os números são diferentes!" + "\n " + num2 + "\t" + "é maior");
		}
	}
}
