package Lista01;

import java.util.Scanner;

/*33. A ESCOLA “APRENDER” FAZ O PAGAMENTO DE SEUS PROFESSORES POR HORA/AULA. FAÇA UM ALGORITMO QUE
CALCULE E EXIBA O SALÁRIO DE UM PROFESSOR. SABE-SE QUE O VALOR DA HORA/AULA SEGUE A TABELA ABAIXO:
A. PROFESSOR NÍVEL 1 R$12,00 POR HORA/AULA;
B. PROFESSOR NÍVEL 2 R$17,00 POR HORA/AULA;
C. PROFESSOR NÍVEL 3 R$25,00 POR HORA/AULA*/
public class Exercicio33 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float horaAula, salario = 0.0f;
		int nivelProf;

		System.out.println("Digite o nível de professor(a) (1, 2 ou 3):");
		nivelProf = ler.nextInt();
		if (nivelProf != 1 || nivelProf != 2 || nivelProf != 3) {
			System.out.println("Nível inválido!");
		} else {

			System.out.println("Digite as horas de aula lecionadas:");
			horaAula = ler.nextFloat();

			if (nivelProf == 1) {
				salario = horaAula * 12;
				System.out.println("Salário:" + salario + "R$");
			} else if (nivelProf == 2) {
				salario = horaAula * 17;
				System.out.println("Salário:" + salario + "R$");
			} else if (nivelProf == 3) {
				salario = horaAula * 25;
				System.out.println("Salário:" + salario + "R$");
			}
		}
	}
}