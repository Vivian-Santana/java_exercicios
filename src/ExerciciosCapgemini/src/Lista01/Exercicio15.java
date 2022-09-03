package Lista01;

import java.util.Scanner;

//15. FAÇA UM ALGORITMO QUE RECEBA UM NÚMERO E DIGA SE ESTE NÚMERO ESTÁ NO INTERVALO ENTRE 100 e 200;
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float num;

		System.out.println("Digite um número:");
		num = ler.nextFloat();

		if (num > 100 && num < 200) {
			System.out.println("O número está entre 100 e 200");
		} else {
			System.out.println("O número não está entre 100 e 200");
		}
	}

}
