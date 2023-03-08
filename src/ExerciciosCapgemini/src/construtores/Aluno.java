package construtores;

public class Aluno {
	
		private double nota1;
		private double nota2;
		private double nota3;
		STATUS situacaoAluno;
		MATRICULA situacaoMatricula;
			
		public Aluno(double nota1, double nota2, double nota3) { //CONSTRUTOR COM SOBRECARGA
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		}

		public enum MATRICULA { //O ENUM DÁ A POSSIBILIDADE DE ESCOLHER ENTRE ESSAS TRÊS OPÇÕES 
			                    //SEM PRECISAR CRIAR TRÊS VALORES NUMA TABLE NO BANCO DE DADOS.
			MATRICULADO,
			PENDENTE,
			RECUSADO
		}
		// DEFININDO UM ENUMERADOR
		public enum STATUS {
			 APROVADO,
		     REPROVADO
		}

		// METODO PARA CALCULAR MÉDIA DO ALUNO
		public double calcularMediaAluno() {//MÉTODO FAZ O CALCULO DA MÉDIA USANDO O THIS
			double mediaAluno = 0;
			// CALCULO DA MEDIA
			mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
			return mediaAluno;
		}
}
