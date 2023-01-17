package DesafiosDio;
/*DADO UM INTEIRO POSITIVO N , RETORNE O MENOR INTEIRO POSITIVO QUE É UM MÚLTIPLO 2 DE E N .
 * A ENTRADA CONSISTE EM UM RETORNO, QUE SERÁ O MENOR MULTIPLO DIGITADO E 2.*/
import java.util.Scanner;

public class MinimoMultiplo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número positivo:");
		int numero = scanner.nextInt();
		int minimoMultiplo = 0;

		if (numero % 2 == 0) {
			minimoMultiplo = numero;
		} else {
			minimoMultiplo = numero * 2;
		}

		System.out.println("O resultado é:" + minimoMultiplo);

	}

}
