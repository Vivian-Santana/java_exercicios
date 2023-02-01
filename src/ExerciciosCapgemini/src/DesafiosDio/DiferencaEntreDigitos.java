package DesafiosDio;

import java.util.Arrays;
import java.util.Scanner;

/*O DESAFIO CONSISTE EM UM NÚMERO INTEIRO N, ONDE SERÁ NECESSÁRIO CALCULAR 
 A DIFERENÇA ENTRE O PRODUTO E A SOMA DOS SEUS DIGITOS.
 ENTRADA 
• PARA ENCONTRAR O PRODUTO DO VALOR, OS DÍGITOS DEVERÃO SER MULTIPLICADOS.

• A SOMA, BASTA REALIZAR UMA ADIÇÃO ENTRE OS DÍGITOS.

• A DIFERENÇA, É NECESSÁRIO SUBSTRAIR O RESULTADO FINAL DOS DOIS VALORES.

SAÍDA
A SAÍDA DEVERÁ RETORNAR O VALOR FINAL DA DIFERENÇA ENTRE O PRODUTO E A SOMA DOS DIGITOS.

/*TESTES:
ENTRADA: 512  SAIDA:2

ENTRADA 1726  SAIDA: 68

ENTRADA: 243  SAÍDA: 15

EXPLICAÇÃO:
PRODUTO DE DÍGITOS = 2 * 3 * 4 = 24
SOMA DOS DÍGITOS = 2 + 3 + 4 = 9
RESULTADO = 24 - 9 = 15
*/
public class DiferencaEntreDigitos {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro com mais de um dígito: ");
		int numero = scan.nextInt();
		int soma = 0, produto = 1;

		String arrayDedigitos = String.valueOf(numero);
		String[] split = arrayDedigitos.split("");

		for (int i = 0; i < split.length; i++) {
			int digitos = Integer.parseInt(split[i]);
			soma = soma + digitos;
			produto = produto * digitos;
		}
		System.out.println("A diferença entre o produto e a soma dos digitos é: " + (produto - soma));
	}
	
	//COM REFERENCE METHOD:

	/*public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro com mais de um dígito: ");
		int numero = scan.nextInt();
		int soma = 0, produto = 1;

		String arrayDenumeros = String.valueOf(numero);

		String[] split = arrayDenumeros.split("");
		int[] digitos = Arrays.stream(split).mapToInt(Integer::new).toArray();

		for (int i = 0; i < digitos.length; i++) {
			produto *= digitos[i];
			soma += digitos[i];

		}
		 System.out.println("A diferença entre o produto e a soma dos digitos é: " + (produto - soma));
	}*/

}