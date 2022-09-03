package Lista01;

import java.util.Scanner;

/*11. FAÇA UM ALGORITMO QUE RECEBA O PREÇO DE CUSTO DE UM PRODUTO E MOSTRE O VALOR DE VENDA. SABE-SE QUE O
PREÇO DE CUSTO RECEBERÁ UM ACRÉSCIMO DE ACORDO COM UM PERCENTUAL INFORMADO PELO USUÁRIO;*/
public class Exercicio11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String produto;
		float precoCusto, precoVenda, acrescimo, porcentagemAcrescimo;

		System.out.println("Digite o preço de custo do produto");
		precoCusto = ler.nextFloat();

		System.out.println("Digite valor de acréscimo do produto");
		acrescimo = ler.nextFloat();

		porcentagemAcrescimo = (acrescimo * precoCusto) / 100;

		precoVenda = (porcentagemAcrescimo + precoCusto);
		System.out.println("O Preço de venda é:" + precoVenda);

	}

}
