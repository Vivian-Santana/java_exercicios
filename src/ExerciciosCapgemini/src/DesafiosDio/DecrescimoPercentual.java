package DesafiosDio;
/*O GERENTE DE UMA LOJA RESOLVEU APLICAR DESCONTOS EM TODOS OS SEUS PRODUTOS! 
 * A TAREFA É CALCULAR A PORCENTAGEM DE DESCONTO APLICADA A ESSES PRODUTOS.
 * A ENTRADA DEVERÁ SER FEITA POR DOIS VALORES M E D, ONDE A PRIMEIRA LINHA DEVERÁ RECEBER O VALOR MARCADO DO PRODUTO, 
 * E NA SEGUNDA LINHA O VALOR DO PRODUTO COM O DESCONTO JÁ APLICADO.
 * A SAÍDA DEVERÁ RETORNAR O PERCENTUAL DE DESCONTO QUE FOI APLICADO NO PRODUTO.*/
import java.util.Scanner;

public class DecrescimoPercentual {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do produto sem desconto e em seguida o valor com desconto:");
		int M = input.nextInt(); // VALOR DO PRODUTO
		int D = input.nextInt(); // VALOR DO PRODUTO COM O DESCONTO
		int V = M - D;
		int Z = (D * 100) / M;

		System.out.println("O desconto foi de " + (100 - Z) + "%");
	}

}
