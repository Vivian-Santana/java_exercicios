package Sintaxe;

import java.util.Scanner;

/*12. O CUSTO DE UM CARRO NOVO AO CONSUMIDOR É A SOMA DO CUSTO DE FÁBRICA MAIS O PERCENTUAL DO DISTRIBUIDOR E
DOS IMPOSTOS APLICADOS (PRIMEIRO OS IMPOSTOS SÃO APLICADOS SOBRE O CUSTO DE FÁBRICA, E DEPOIS O PERCENTUAL
DO DISTRIBUIDOR SOBRE O RESULTADO). SUPONDO QUE O PERCENTUAL DO DISTRIBUIDOR SEJA DE 28% E OS IMPOSTOS
45%, ESCREVA UM ALGORITMO QUE LEIA O CUSTO DE FÁBRICA DE UM CARRO E INFORME O CUSTO AO CONSUMIDOR DO
MESMO;*/
public class Exercicio12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float custoFabrica, impostos = 1.45f, percentualDistribuidor = 1.28f, custoVenda;

		System.out.println("Digite o custo de fábrica:");
		custoFabrica = ler.nextFloat();

		custoVenda = (custoFabrica * impostos) * percentualDistribuidor;

		System.out.println("Custo de venda: " + custoVenda);

	}

}
