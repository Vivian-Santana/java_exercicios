package Lista01;

//13. FAÇA UM ALGORITMO QUE RECEBA UM NÚMERO E MOSTRE UMA MENSAGEM CASO ESTE NÚMERO SEJA MAIOR QUE 10;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float num;

		System.out.println("Digite um número:");
		num = ler.nextFloat();

		if (num == 10) {
			System.out.println("O número é 10");
		} else if (num > 10) {
			System.out.println("O número é maior que 10");
		} else {
			System.out.println("O número é menor que 10");
		}

	}

}
