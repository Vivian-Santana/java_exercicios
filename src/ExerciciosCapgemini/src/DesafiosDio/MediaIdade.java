package DesafiosDio;

import java.util.Scanner;

/* FAÇA UM PROGRAMA QUE PEÇA PARA 3 PESSOAS A SUA IDADE, AO FINAL O PROGRAMA DEVERÁ VERIFICAR 
 * SE A MÉDIA DE IDADE DA TURMA VARIA ENTRE 0 E 25, 26 E 60 E MAIOR QUE 60; E ENTÃO, 
 * DIZER SE A TURMA É JOVEM, ADULTA OU IDOSA, CONFORME A MÉDIA CALCULADA.*/
public class MediaIdade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a idade do aluno: ");
		int idade1 = leitor.nextInt();

		System.out.println("Digite a idade do aluno: ");
		int idade2 = leitor.nextInt();

		System.out.println("Digite a idade do aluno: ");
		int idade3 = leitor.nextInt();

		int media = (idade1 + idade2 + idade3) / 3;

		if (media >0 && media < 25) {
			System.out.println("A turma é jovem.");
		} else if (media > 26 && media < 60) {
			System.out.println("A turma é adulta.");
		} else if (media > 60) {
			System.out.println("A turma é idosa.");
		}else {
			System.out.println("digite idades válidas.");
		}
	}
}
