package Sintaxe;
/*5. ESCREVA UM ALGORITMO QUE LEIA O NOME DE UM ALUNO E AS NOTAS DAS TRÊS PROVAS QUE ELE OBTEVE NO SEMESTRE.
NO FINAL INFORMAR O NOME DO ALUNO E A SUA MÉDIA (ARITMÉTICA);*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String aluno;
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite o nome do aluno(a):");
		aluno = ler.next();
		
		System.out.println("nota da primeira prova:");
		nota1 = ler.nextFloat();
		
		System.out.println("nota da segunda prova:");
		nota2 = ler.nextFloat();
		
		System.out.println("nota da terceira prova:");
		nota3 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média de" + "\t" + aluno + "\t" + "é" + "\t"+ media);
	}

}
