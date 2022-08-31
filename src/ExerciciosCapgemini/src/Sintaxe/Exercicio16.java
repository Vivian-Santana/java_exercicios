package Sintaxe;
/*16. ESCREVA UM ALGORITMO QUE LEIA O NOME E AS TRÊS NOTAS OBTIDAS POR UM ALUNO DURANTE O SEMESTRE. CALCULAR A
SUA MÉDIA (ARITMÉTICA), INFORMAR O NOME E SUA MENÇÃO APROVADO (MEDIA >= 7), REPROVADO (MEDIA <= 5) E
RECUPERAÇÃO (MEDIA ENTRE 5.1 A 6.9);*/

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String aluno, aprovado, recuperacao, reprovado;
		float nota1, nota2, nota3, media;

		System.out.println("Digite o nome do aluno(a):");
		aluno = ler.next();

		System.out.println("nota da primeira nota:");
		nota1 = ler.nextFloat();

		System.out.println("nota da segunda nota:");
		nota2 = ler.nextFloat();

		System.out.println("nota da terceira nota:");
		nota3 = ler.nextFloat();

		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println(aluno + "\t" + "Aprovado(A)");
		} else {
			if (media >= 5.1 || media <= 6.9) {
				System.out.println(aluno + "\t" + "Recuperação");
			} else {
				System.out.println(aluno + "\t" + "Reprovado(a)");
			}
		}
	}

}
