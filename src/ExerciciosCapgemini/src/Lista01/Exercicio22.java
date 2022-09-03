package Lista01;

import java.util.Scanner;

public class Exercicio22 {
/*22- FAÇA UM ALGORITMO QUE RECEBA O PREÇO DE CUSTO E O PREÇO DE VENDA DE 40 PRODUTOS. MOSTRE COMO RESULTADO
	SE HOUVE LUCRO, PREJUÍZO OU EMPATE PARA CADA PRODUTO. INFORME O VALOR DE CUSTO DE CADA PRODUTO, O VALOR
	DE VENDA DE CADA PRODUTO, AMÉDIA DE PREÇO DE CUSTO E DO PREÇO DE VENDA;*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String produto;
		float precoCusto, precoVenda, totalCusto = 0, totalVenda = 0;
		
		int i = 0; //VARIÁVEL Q É CONTROLE DO FOR TEM QUE ESTAR FORA DO () PARA VALER DENTRO DO MÉTODO INTEIRO NÃO APENAS DENTRO DO FOR.
		for (; i < 40; i++) {
			
			System.out.println("Digite o nome do produto");
			produto = ler.next();
			
			System.out.println("Digite o preço de custo do produto");
			precoCusto = ler.nextFloat();
			
			System.out.println("Digite o preço de venda do produto");
			precoVenda =ler.nextFloat();
			
			totalCusto = totalCusto + precoCusto;// ACUMULADORES
			totalVenda = totalVenda + precoVenda;
			
			if (precoCusto == precoVenda) {
				System.out.println("Houve um empate entre o preço de custo e o preço de venda");
			}else {
				if (precoCusto > precoVenda) {
					System.out.println("Houve Prejuízo");
				}else {
					System.out.println("Houve Lucro");
				}
				
			}
			System.out.println(produto +  "___Preço de custo...." + precoCusto + ", preço de venda...." + precoVenda);
			System.out.println("A média do preço de custo é de....." + (totalCusto / i));
			System.out.println("A média do preço de venda é de....." + (totalVenda / i));
		}
		

	}

}
