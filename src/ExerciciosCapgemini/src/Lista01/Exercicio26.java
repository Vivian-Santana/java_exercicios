package Lista01;

import java.util.Scanner;

/*26. FAÇA UM ALGORITMO QUE LEIA UM NÚMERO DE 1 A 5 E ESCREVA POR EXTENSO. CASO O USUÁRIO DIGITE UM NÚMERO
QUE NÃO ESTEJA NESTE INTERVALO, EXIBIR A SEGUINTE MENSAGEM: NÚMERO INVÁLIDO;*/

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float num;

		System.out.println("Digite um número de 1 a 5 e aperte o enter");
		num = ler.nextFloat();

		if (num < 1 || num > 5) {
			System.out.println("Número inválido!");
		} else {
			if (num == 1) {
				System.out.println("Número um");
			} else {
				if (num == 2) {
					System.out.println("Número dois");
				} else {
					if (num == 3) {
						System.out.println("Número três");
					} else {
						if (num == 4) {
							System.out.println("Número quatro");
						} else {
							if (num == 5) {
								System.out.println("Número cinco");
							}
						}
					}
				}
			}
		}
	}
}