package Sintaxe;

import java.util.Scanner;

/*21. ESCREVA UM ALGORITMO QUE LEIA OS DADOS DE “N” PESSOAS (NOME, SEXO, IDADE E SAÚDE) E INFORME SE ESTÁ APTA
OU NÃO PARA CUMPRIR O SERVIÇO MILITAR OBRIGATÓRIO. INFORME OS TOTAIS;*/
public class Exercicio21 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome = null, sexo = null, saude = null, fem, masc;
		char b, m, r;
		int i = 1, idade, totalSaudeBoa = 0, totalSaudeMedia = 0, totalSaudeRuim = 0, totalHomens = 0,
				totalMulheres = 0, totalPessoas = 0;

		for (; i <= 600; i++) {

			System.out.println("Digite seu nome:");
			nome = ler.next();
			totalPessoas++;
			
			//ENTRADA E CONTAGEM DE GÊNERO
			System.out.println("Digite o seu sexo Fem- Feminino/ Masc - Masculino:");
			sexo = ler.next();

			if (sexo.equals("f") || sexo.equals("F")) {
				totalMulheres++;

			} else {
				if (sexo.equals("m") || sexo.equals("M")) {
					totalHomens++;
				}

			}
			//ENTRADA E CONTAGEM DE ESTADOS DE SAÚDE 
			System.out.println("Qual é a sua saude? (b- bom/ m- médio/ r- ruim)");
			saude = ler.next();

			if (saude.equals("b") || saude.equals("B")) {
				totalSaudeBoa++;

			} else {
				if (saude.equals("m") || saude.equals("M")) {
					totalSaudeMedia++;
				} else {
					if (saude.equals("r") || saude.equals("R")) {
						totalSaudeRuim++;
					}
				}
			}

		}
		System.out.println("..........................................");
		System.out.println("Total com boa saúde:" + totalSaudeBoa++);
		System.out.println("Total com saúde média:" + totalSaudeMedia++);
		System.out.println("Total com saúde ruim:" + totalSaudeRuim++);
		System.out.println("Total de mulheres:" + totalMulheres);
		System.out.println("Total de homens:" + totalHomens);
		System.out.println("total de pessoas:" + totalPessoas++);
	}

}
