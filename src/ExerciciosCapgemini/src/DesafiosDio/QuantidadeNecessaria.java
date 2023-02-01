package DesafiosDio;

import java.util.Scanner;

/*DESAFIO
CADA PIZZA É COMPOSTA POR 4 FATIAS. HÁ N AMIGOS E CADA AMIGO PRECISA DE EXATAMENTE X FATIAS.
VOCÊ DEVERÁ CRIAR UM CÓDIGO CAPAZ DE CALCULAR O NÚMERO MÍNIMO DE PIZZAS QUE ELES DEVEM PEDIR PARA SATISFAZER SEU APETITE.

ENTRADA 
A PRIMEIRA LINHA DE ENTRADA CONTERÁ UM ÚNICO INTEIRO T, INDICANDO O NÚMERO DE CASOS DE TESTE.
CADA CASO DE TESTE CONSISTE EM DOIS INTEIROS. N PARA O NÚMERO DE AMIGOS E X PARA A QUANTIDADE DE FATIA QUE CADA AMIGO DESEJA.

SAÍDA
PARA CADA CASO DE TESTE, PRODUZA O NÚMERO MÍNIMO DE PIZZAS NECESSÁRIO, CONFORME O EXEMPLO A BAIXO:

EXISTE APENAS 1 AMIGO QUE PRECISA 5 FATIAS. SE ELE MANDAR 1 PIZZA, ELE RECEBERÁ APENAS 4 FATIAS. ASSIM, PELO MENOS 2 PIZZAS DEVEM SER ENCOMENDADAS
PARA TER O NÚMERO NECESSÁRIO DE FATIAS.

ENTRADA:
1

1

5

SAÍDA:
2
*/
public class QuantidadeNecessaria {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		final int FATIAS = 4;
		
		System.out.println("Digite o número correspondente ao caso de teste: ");
		int T = scanner.nextInt();
		
		System.out.println("digite o numero de amigos: ");
		double amigos = scanner.nextInt();
		
		System.out.println("digite o número de fatia por pessoa: ");
		int fatiaPorPessoa = scanner.nextInt();
		
		for (int i = 1; i <= T; i++) {
			
			amigos =  amigos * fatiaPorPessoa;

			double pizzas = Math.ceil(amigos / FATIAS);

			System.out.println("Quantidade de pizzas necessárias: " +(int) pizzas);
		}
	}

}
