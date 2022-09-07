package Lista01;

import java.util.Scanner;

/*32. ESCREVA UM ALGORITMO QUE LEIA TRÊS VALORES INTEIROS E VERIFIQUE SE ELES PODEM SER OS LADOS DE UM TRIÂNGULO.
SE FOREM, INFORMAR QUAL O TIPO DE TRIÂNGULO QUE ELES FORMAM: EQUILÁTERO, ISÓSCELE OU ESCALENO.
PROPRIEDADE: O COMPRIMENTO DE CADA LADO DE UM TRIÂNGULO É MENOR DO QUE A SOMA DOS COMPRIMENTOS DOS
OUTROS DOIS LADOS.
A. TRIÂNGULO EQUILÁTERO: AQUELE QUE TEM OS COMPRIMENTOS DOS TRÊS LADOS IGUAIS;
B. TRIÂNGULO ISÓSCELE: AQUELE QUE TEM OS COMPRIMENTOS DE DOIS LADOS IGUAIS.
C. TRIÂNGULO ESCALENO: AQUELE QUE TEM OS COMPRIMENTOS DE SEUS TRÊS LADOS DIFERENTES;*/
public class Exercicio32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float lado1, lado2, lado3;
		String tEquilátero, tIsóscele, tEscaleno;

		System.out.println("Digite o valor do primeiro lado:");
		lado1 = ler.nextFloat();

		System.out.println("Digite o valor do segundo lado:");
		lado2 = ler.nextFloat();

		System.out.println("Digite o valor do terceiro lado:");
		lado3 = ler.nextFloat();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("É um triângulo equilátero");
		} else if (lado1 == lado2 || lado3 == lado1 || lado3 == lado2) {
			System.out.println("É um triângulo isóscele");
		} else if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("É um triângulo escaleno");
		}
	}

}
