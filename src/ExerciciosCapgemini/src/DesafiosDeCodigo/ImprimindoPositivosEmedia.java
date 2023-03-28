package DesafiosDeCodigo;

import java.io.IOException;
import java.util.Scanner;

/*LEIA 6 VALORES. EM SEGUIDA, MOSTRE QUANTOS DESTES VALORES DIGITADOS FORAM POSITIVOS. 
 * NA PRÓXIMA LINHA, DEVE-SE MOSTRAR A MÉDIA DE TODOS OS VALORES POSITIVOS DIGITADOS, COM UM DÍGITO APÓS O PONTO DECIMAL.*/
public class ImprimindoPositivosEmedia {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int cont = 0;
		double media = 0, x = 0, soma = 0.0;

		for (x = 0; x < 6; x++) {

			System.out.println("Digite um número: ");
			double N = leitor.nextDouble();
			if (N > 0.0) {
				cont++;
				soma = soma + N;
			}
		}
		media = soma / cont;
		System.out.println("....................");
		System.out.println(cont + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}
	
}
