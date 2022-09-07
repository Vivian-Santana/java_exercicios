package Lista01;

import java.util.Scanner;

//30. ESCREVA UM ALGORITMO QUE LEIA TRÊS VALORES INTEIROS DISTINTOS E OS ESCREVA EM ORDEM CRESCENTE;
public class Exercicio30 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Digite um número:");
		num1 = ler.nextInt();

		System.out.println("Digite outro número:");
		num2 = ler.nextInt();

		System.out.println("Digite mais um número:");
		num3 = ler.nextInt();

		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num1 + "\t" + "\t" + num2 + "\t" + num3);
		} else if (num2 > num1 && num2 > num3 && num1 > num3) { 
			System.out.println(num3 + "\t" + num1 + "\t" + num2); 
		} else if (num3 < num1 && num3 < num2 && num2 < num1) { 
			System.out.println(num3 + "\t" + num2 + "\t" + num1);
		} else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println(num2 + "\t" + num3 + "\t" + num1);
		} else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println(num1 + "\t" + num3 + "\t" + num2);
		}
	}

}
