package DesafiosDeCodigo;

import java.util.Scanner;

public class FabricaDeCarros {

	/*O CUSTO DE UM CARRO NOVO AO CONSUMIDOR É A SOMA DO CUSTO DE FÁBRICA COM A PORCENTAGEM DO DISTRIBUIDOR E DOS IMPOSTOS (APLICADOS AO CUSTO DE FÁBRICA). 
	 * O GERENTE DE UMA LOJA DE CARROS GOSTARIA DE UM PROGRAMA PARA CALCULAR O PREÇO DE UM CARRO NOVO PARA OS CLIENTES. VOCÊ RECEBERÁ O CUSTO DE FÁBRICA 
	 * E AS PORCENTAGENS REFERENTES AO DISTRIBUIDOR E OS IMPOSTOS E DEVERÁ ESCREVER PROGRAMA PARA LER ESSES VALORES E IMPRIMIR O VALOR FINAL DO CARRO.
	*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o custo de fábrica: ");
		int custoFabrica = scan.nextInt();

		System.out.println("Digite o percentual do distribuidor: ");
		int porcentagemDistribuidor = scan.nextInt();

		System.out.println("Digite o percentual de impostos: ");
		int PercentualImpostos = scan.nextInt();

		// TODO: IMPLEMENTE UMA CONDIÇÃO QUE CALCULE A PORCENTAGEM DO DISTRIBUIDOR E DOS IMPOSTOS:

		int Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100,
				ValorImpostos = (custoFabrica * PercentualImpostos) / 100,
				custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

		System.out.println("Valor final: " + custoConsumidor);
	}

}
