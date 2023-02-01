package DesafiosDio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*UM NÚMERO FELIZ É UM NÚMERO DEFINIDO PELO SEGUINTE PROCESSO:

• COMEÇANDO COM QUALQUER NÚMERO INTEIRO POSITIVO, SUBSTITUA O NÚMERO PELA SOMA DOS QUADRADOS DE SEUS DÍGITOS.
• REPITA O PROCESSO ATÉ QUE O NÚMERO SEJA IGUAL A 1 (ONDE FICARÁ), OU FAÇA UM LOOP INFINITO EM UM CICLO QUE NÃO INCLUA 1.
• AQUELES NÚMEROS PARA OS QUAIS ESSE PROCESSO TERMINA EM 1 SÃO FELIZES.
• RETORNA TRUE SE N FOR UM NÚMERO FELIZ E FALSE SE NÃO FOR.

ESCREVA UM ALGORITMO PARA DETERMINAR SE O NÚMERO N É FELIZ.

ENTRADA
A ENTRADA SERÁ FEITA POR UM NÚMERO INTEIRO, CORREPONDENTE AO VALOR DE ENTRADA PARA VERIFICAR SE  O NÚMERO É FELIZ OU NÃO.

SAÍDA
RETORNE TRUE, CASO O NÚMERO SEJA FELIZ, E RETORNE FALSE, CASO O NÚMERO NÃO SEJA FELIZ.

CONFIRA EXEMPLO ABAIXO:

EXEMPLO 1:

ENTRADA	19 
SAÍDA TRUE
	       
EXPLICAÇÃO:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1

EXEMPLO 2:

ENTRADA	2 
SAÍDA FALSE*/

public class DesafioNumeroFeliz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int n = scan.nextInt();

		boolean Feliz = false;

		Set<Integer> result = new HashSet<>();

		result.add(n);

		while (n != 1) {

			n = somaRaizDigito(n);

			if (result.contains(n)) {
				n = 0;
				break;
			}
			result.add(n);
		}

		if (n == 1) {
			Feliz = true;
			
		} else if (n == 0) {

			Feliz = false;
		}
		System.out.println(Feliz);
	}

	private static int somaRaizDigito(int n) {

		int quadradoDosDigitos = 0;

		String num = Integer.toString(n);

		char[] dig = num.toCharArray();

		for (int i = 0; i < dig.length; i++) {

			int digito = n % 10;

			quadradoDosDigitos += digito * digito;

			n = n / 10;
		}
		return quadradoDosDigitos;
	}

}
