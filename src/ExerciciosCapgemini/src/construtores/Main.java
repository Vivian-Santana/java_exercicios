package construtores;

import construtores.Aluno.MATRICULA;
import construtores.Aluno.STATUS;

public class Main{
	
	public static void main(String[] args) {
		
		// PASSANDO OS DADOS ATRAV�S DO CONSTRUTOR COM SOBRECARGA
		Aluno alu = new Aluno(8.0, 8.0, 8.0);
		
		// CALCULANDO A MÉDIA
		double mediaAlunoFinal = alu.calcularMediaAluno();

		
		// DEFININDO SITUAÇÃO DO ALUNO
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}

		// IMPRIMINDO SITUAÇÃO DO ALUNO
		System.out.println("A média do aluno é : " + alu.calcularMediaAluno() + " e o aluno está " + alu.situacaoAluno);
		
		//USA ENUM MATRICULA
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno está: " + alu.situacaoMatricula);
	}
}
