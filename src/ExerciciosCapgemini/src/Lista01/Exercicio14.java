package Lista01;

import java.util.Scanner;

//14. ESCREVA UM ALGORITMO QUE LEIA DOIS VALORES INTEIRO DISTINTOS E INFORME QUAL É O MAIOR;
public class Exercicio14 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2;

		System.out.println("Digite um número inteiro:");
		num1 = ler.nextInt();

		System.out.println("Digite outro número inteiro:");
		num2 = ler.nextInt();

		if (num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo");
		} else if (num2 > num1) {
			System.out.println("O segundo número é maior que o primeiro");
		} else {
			System.out.println("Os dois números são iguais");
		}

	}
}