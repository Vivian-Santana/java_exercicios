package LetsCode;
/*ESCREVA UM ALGORITMO QUE ARMAZENE UM VALOR X EM UMA VARIÁVEL A E UM VALOR Y EM UMA VARIÁVEL B. 
 * TROQUE OS VALORES DAS DUAS VARIÁVEIS SEM CRIAR UMA TERCEIRA E USANDO APENAS OPERAÇÕES MATEMÁTICAS.*/
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int a, b;

		System.out.println("Digite um número:");
		a = entrada.nextInt();

		System.out.println("Digite um número:");
		b = entrada.nextInt();

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("troca:" + "\n" + a + "\n" + b);
	}

}
