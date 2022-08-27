package Sintaxe;

import java.util.Scanner;

/* 20. A CONCESSIONÁRIA DE VEÍCULOS “CARANGO VELHO” ESTÁ VENDENDO OS SEUS VEÍCULOS COM DESCONTO. FAÇA
UM ALGORITMO QUE CALCULE E EXIBA O VALOR DO DESCONTO E O VALOR A SER PAGO PELO CLIENTE DE VÁRIOS CARROS. O
DESCONTO DEVERÁ SER CALCULADO DE ACORDO COM O ANO DO VEÍCULO. ATÉ 2000 - 12% E ACIMA DE 2000 - 7%. O
SISTEMA DEVERÁ PERGUNTAR SE DESEJA CONTINUAR CALCULANDO DESCONTO ATÉ QUE A RESPOSTA SEJA: “(N) NÃO”.
INFORMAR TOTAL DE CARROS COM ANO ATÉ 2000 E TOTAL GERAL;*/

public class Exercicio20 {

	public static void main(String[] args) {
		
		
		float valorVeiculo = 0.0f, porcentagemDesconto = 0.0f, valorDesconto = 0.0f;
		int anoFabricacao = 0, totalCarrosSemiNovos = 0, totalCarros =0;
		
		Scanner ler = new Scanner(System.in);
		
		char desejaRepetir = 's';
		
		while (desejaRepetir == 's') {
			System.out.println("Didigite o ano de fabricação do veículo");
			anoFabricacao = ler.nextInt();
			
			System.out.println("Didigite o valor do veículo");
			valorVeiculo = ler.nextFloat();
			
			if (anoFabricacao <= 2000) {
				porcentagemDesconto = 0.12f;
			}else {
				porcentagemDesconto = 0.07f;
				totalCarrosSemiNovos++;
			}
			totalCarros++;
			
			valorDesconto = valorVeiculo * porcentagemDesconto;
			float valorFinal = valorVeiculo - valorDesconto;
			
			System.out.println("Desconto:" + valorDesconto);
			System.out.println("O valor final:" + valorFinal);
			
			System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
			desejaRepetir = ler.next().charAt(0);
		}
		
		System.out.println("Total de carros semi novos:" + totalCarrosSemiNovos);
		System.out.println("Total de carros:" + totalCarros);
	}

}
