package DesafiosDio;

import java.util.Scanner;

/*O GERENTE DE UMA LOJA RESOLVEU APLICAR DESCONTOS EM TODOS OS SEUS PRODUTOS! 
 * A TAREFA É CALCULAR A PORCENTAGEM DE DESCONTO APLICADA A ESSES PRODUTOS.
 * A ENTRADA DEVERÁ SER FEITA POR DOIS VALORES M E D, 
 * ONDE A PRIMEIRA LINHA DEVERÁ RECEBER O VALOR MARCADO DO PRODUTO, 
 * E NA SEGUNDA LINHA O VALOR DO PRODUTO COM O DESCONTO JÁ APLICADO. 
 * A SAÍDA DEVERÁ RETORNAR O PERCENTUAL DE DESCONTO QUE FOI APLICADO NO PRODUTO, 
 * CONFORME EXEMPLO ABAIXO.*/
public class PercentualDesconto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor do produto:");
		double m = input.nextInt();

		System.out.println("Digite o valor do produto com desconto aplicado:");
		double d = input.nextInt();

		double decréscimoPercentual = (m - d) / m;

		System.out.println("O desconto foi de:" + decréscimoPercentual * 100 + "%");

	}

}
