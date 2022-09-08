package Lista01;

import java.util.Scanner;

/*35. FAÇA UM ALGORITMO QUE CALCULE O VALOR DA CONTA DE LUZ DE UMA PESSOA. SABE-SE QUE O CÁLCULO DA CONTA DE
LUZ SEGUE A TABELA ABAIXO:
TIPO DE CLIENTE VALOR DO KW/H
A. (RESIDÊNCIA) 0,60;
B. (COMÉRCIO) 0,48;
C. (INDÚSTRIA) 1,29.*/
public class Exercicio35 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float totalConta, consumo;
		String cliente;
		char a, b, c;

		System.out.println("Digite o tipo de cliente (A- Residência/ B - Comércio/ c - Indústria):");
		cliente = ler.next();

		System.out.println("Digite o consumo em KW/H:");
		consumo = ler.nextFloat();

		if (cliente.equalsIgnoreCase("a")) {
			totalConta = consumo * 0.60f;
			System.out.println("Valor da conta:" + totalConta + "R$");
		} else if (cliente.equalsIgnoreCase("b")) {
			totalConta = consumo * 0.48f;
			System.out.println("Valor da conta:" + totalConta + "R$");
		} else if (cliente.equalsIgnoreCase("c")) {
			totalConta = consumo * 1.29f;
			System.out.println("Valor da conta:" + totalConta + "R$");
		}
	}
}
