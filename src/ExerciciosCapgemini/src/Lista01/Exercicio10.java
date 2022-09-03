package Lista01;

import java.util.Scanner;

/*10. A LOJA MAMÃO COM AÇÚCAR ESTÁ VENDENDO SEUS PRODUTOS EM 5(CINCO)PRESTAÇÕES SEM JUROS. FAÇA UM
ALGORITMO QUE RECEBA UM VALOR DE UMA COMPRA E MOSTRE O VALOR DAS PRESTAÇÕES;*/
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float totalCompra, prestacoes;
		
		System.out.println("Digite o valor total da compra:");
		totalCompra = ler.nextFloat();
		
		prestacoes = (totalCompra / 5);
		
		System.out.println("5 parcelas fixas de:" + prestacoes);

	}

}
