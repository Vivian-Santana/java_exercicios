package Arrays;

import javax.swing.JOptionPane;

// MATRIZ (VETOR DE VETORES)
public class Aula6E {

	public static void main(String[] args) {
		
		//VETOR DE ALUNOS
		String [] alunos = {"João", "José", "Maria"};
		
		//MATRIZ DE NOTAS
		float notas [][]= new float[3][4];
		
		//CONTROLANDO A SOMA DE NOTAS E CALCULANDO A MÉDIA
		float somaNotas, mediaAluno;
		
		//ARMAZENA O STATUS DO ALUNO E USA PARA IMPRIMIR BOLETINS
		String statusAluno = null;
		
		//INFORMANDO AS NOTAS DOS ALUNOS
		//LAÇO EXTERNO ASSOCIA O ALUNO À NOTA
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno:" + alunos[i]);
			
			//LAÇO INTERNO INFORMA AS NOTAS DE CADA ALUNO
			somaNotas = 0;	//SOMA NOTAS É ZERADO PARA A NOTA DE UM ALUNO NÃO INTERFERIR NA NOTA DE OUTRO ALUNO.
			mediaAluno = 0;
			for (int j = 0; j < notas.length; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota n°" + (j+1)+ "do aluno"));//PARSE FLOAT CONVERT A STRING PARA FLOAT.
				somaNotas = somaNotas + notas[i][j];
			}
			//CONDIÇÕES QUE VERIFICA A MÉDIA E DEFINE O STATUS DO ALUNO
			mediaAluno = somaNotas / 4;
			if (mediaAluno < 5.5) {
				statusAluno = "Reprovado";
			} else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
				statusAluno = "Aprovado";
			}
			//IMPRESSÃO DO BOLETIM
			System.out.println("\n************ BOLETIM ************");
			System.out.println("Aluno:" + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < notas.length; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Média: " + mediaAluno + " - " + statusAluno);
 		}
		

	}

}
