package Lista01;

import java.util.Scanner;

/*23. FAÇA UM ALGORITMO QUE RECEBA UM NÚMERO E MOSTRE UMA MENSAGEM CASO ESTE NÚMERO SEJA MAIOR QUE 80,
MENOR QUE 25 OU IGUAL A 40;*/
public class Exercicio23 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float num;

		System.out.println("Digite um número");
		num = ler.nextFloat();

		if (num > 80) {
			System.out.println("O número é maior que 80");
		} else {
			if (num < 25) {
				System.out.println("O número é menor que 25");
			} else {
				if (num == 40) {
					System.out.println("O número é 40");
				}
			}
		}

	}

}
