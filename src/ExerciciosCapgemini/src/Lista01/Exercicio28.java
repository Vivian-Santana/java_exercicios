package Lista01;

import java.util.Scanner;

/*28. ESCREVA UM ALGORITMO PARA UMA EMPRESA QUE DECIDE DAR UM REAJUSTE A SEUS 584 FUNCIONÁRIOS DE ACORDO
COM OS SEGUINTES CRITÉRIOS:
A. 50% PARA AQUELES QUE GANHAM MENOS DO QUE TRÊS SALÁRIOS MÍNIMOS;
B. 20% PARA AQUELES QUE GANHAM ENTRE TRÊS ATÉ DEZ SALÁRIOS MÍNIMOS;
C. 15% PARA AQUELES QUE GANHAM ACIMA DE DEZ ATÉ VINTE SALÁRIOS MÍNIMOS;
D. 10% PARA OS DEMAIS FUNCIONÁRIOS.
LEIA O NOME DO FUNCIONÁRIO, SEU SALÁRIO E O VALOR DO SALÁRIO MÍNIMO. CALCULE O SEU NOVO SALÁRIO
REAJUSTADO. ESCREVER O NOME DO FUNCIONÁRIO, O REAJUSTE E SEU NOVO SALÁRIO. CALCULE QUANTO À EMPRESA
VAI AUMENTAR SUA FOLHA DE PAGAMENTO;*/
public class Exercicio28 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String funcionario;
		float salMinimo = 0.0f, salAtual = 0.0f;
		double novoSal = 0.0, aumento = 0, folha = 0;
		int i = 1;

		System.out.println("Digite o valor atual do salário mínimo:");
		salMinimo = ler.nextFloat();

		for (; i <= 584; i++) {

			System.out.println(".............................................................");
			System.out.println("Digite o nome do funcionário:");
			funcionario = ler.next();

			System.out.println("Digite o valor atual do salário do funcionário:");
			salAtual = ler.nextFloat();

			if (salAtual < salMinimo * 3) {
				aumento = salAtual * 0.50; // 50%
				novoSal = salAtual + aumento;
				System.out.println(funcionario + "\t" + "terá um reajuste de:" + aumento + "R$" + "\t" + "Totalizando:"
						+ novoSal + "R$");

			} else {
				if (salAtual > salMinimo * 3 && salAtual <= salMinimo * 10) {
					aumento = salAtual * 0.20; // 20%
					novoSal = salAtual + aumento;
					System.out.println(funcionario + "\t" + "terá um reajuste de:" + aumento + "R$" + "\t"
							+ "Totalizando:" + novoSal + "R$");
					

				} else {
					if (salAtual > salMinimo * 10 && salAtual <= salMinimo * 20) {
						aumento = salAtual * 0.15; // 15%
						novoSal = salAtual + aumento;
						System.out.println(funcionario + "\t" + "terá um reajuste de:" + aumento + "R$" + "\n"
								+ "Totalizando:" + novoSal + "R$");
						

					} else {
						aumento = salAtual * 0.10; // 10%
						novoSal = salAtual + aumento;
						System.out.println(funcionario + "\t" + "terá um reajuste de:" + aumento + "\t" + "Totalizando:"
								+ novoSal + "R$");
					
					}
				}
			}
			folha = folha + aumento;
		}
		System.out.println(".............................................................");
		System.out.println("Total de gastos com aumentos na folha de pagamento:" + folha);
	}
}
