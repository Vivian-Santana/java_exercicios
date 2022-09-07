package Lista01;

import java.util.Scanner;

/*31. DADOS TRÊS VALORES A, B E C, EM QUE A E B SÃO NÚMEROS REAIS E C É UM CARACTERE, PEDE-SE PARA IMPRIMIR O
RESULTADO DA OPERAÇÃO DE A POR B SE C FOR UM SÍMBOLO DE OPERADOR ARITMÉTICO; CASO CONTRÁRIO DEVE SER
IMPRESSA UMA MENSAGEM DE OPERADOR NÃO DEFINIDO. TRATAR ERRO DE DIVISÃO POR ZERO;*/
public class Exercicio31 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float a, b, resultado;
		char c;

		System.out.println("Digite um número real:");
		a = ler.nextFloat();

		System.out.println("Digite outro número real:");
		b = ler.nextFloat();

		System.out.println("Digite um operador aritmético:");
		c = ler.next().charAt(0);

		if (c == '+') {
			resultado = a + b;
			System.out.println("O resultado da operação é:" + resultado);
		} else if (c == '-') {
			resultado = a - b;
			System.out.println("O resultado da operação é:" + resultado);
		} else if (c == '*') {
			resultado = a * b;
			System.out.println("O resultado da operação é:" + resultado);
		} else if (c == '/' && a == 0 || c == '/' && b == 0) {
			System.out.println("O Não é possível dividir por zero!");
		} else if (c == '/') {
			resultado = a / b;
			System.out.println("O resultado da operação é:" + resultado);
		} else {
			System.out.println("operador não definido");
		}
	}

}