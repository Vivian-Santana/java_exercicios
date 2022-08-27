package Sintaxe;

import java.util.Scanner;

/*9. FAÇA UM ALGORITMO QUE RECEBA UM VALOR QUE FOI DEPOSITADO E EXIBA O VALOR COM RENDIMENTO APÓS UM
MÊS.CONSIDERE FIXO O JURO DA POUPANÇA EM 0,07% A. M;*/
public class Excercicio09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float valorDepositado, rendimento, JUROS = 0.07f;
		
		System.out.println("Digite o valor depositado:");
		valorDepositado = ler.nextFloat();
		
		rendimento = (float) ((0.07 * valorDepositado)/100);
		System.out.println("Seu rendimento foi de:" + rendimento);

	}

}
