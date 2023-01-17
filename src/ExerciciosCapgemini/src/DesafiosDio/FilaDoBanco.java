package DesafiosDio;

import java.util.Scanner;

/*ELABORE UM PROGRAMA QUE SIMULE UMA FILA DE ATENDIMENTO BANCÁRIO. 
*O PROGRAMA DEVE LER O NOME DE 3 PESSOAS (CLIENTES DO BANCO), ARMAZENANDO-OS EM UMA FILA.
import java.util.Scanner;*/

public class FilaDoBanco {

	public static void main(String[] args) {
		String[] nomesFila = new String[3];
		Scanner nome = new Scanner(System.in);
		System.out.println("Digite os nomes dos clientes:");
		
		for (int i = 0; i < nomesFila.length; i++) {

			nomesFila[i] = nome.next();

		}

		for (int i = 0; i < nomesFila.length; i++) {

			int posicao = i + 1;

			System.out.println(nomesFila[i] + " - esta na posicao: " + posicao);

		}
	}

}
