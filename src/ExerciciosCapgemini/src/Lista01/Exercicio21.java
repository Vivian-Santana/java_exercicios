package Lista01;

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
		char desejaRepetir = 's';

		while (desejaRepetir == 's') {

			System.out.println("Digite seu nome:");
			nome = ler.next();
			totalPessoas++;

			// ENTRADA E CONTAGEM DE GÊNERO
			System.out.println("Digite o seu sexo Fem- Feminino/ Masc - Masculino:");
			sexo = ler.next();

			if (sexo.equalsIgnoreCase("fem")) {
				totalMulheres++;

			} else {
				if (sexo.equals("masc")) {
					totalHomens++;
				}

			}
			// ENTRADA E CONTAGEM DE ESTADO DE SAÚDE
			System.out.println("Qual é a sua saude? (b- bom/ m- médio/ r- ruim)");
			saude = ler.next();

			if (saude.equalsIgnoreCase("b")) {
				System.out.println(nome + "\t" + "Está apto para o serviço militar obrigatório");
				totalSaudeBoa++;

			} else if (saude.equalsIgnoreCase("m")) {
				System.out.println(nome + "\t" + "Não está apto para o serviço militar obrigatório");
				totalSaudeMedia++;
			} else if (saude.equalsIgnoreCase("r")) {
				System.out.println(nome + "\t" + "Não está apto para o serviço militar obrigatório");
				totalSaudeRuim++;
			}

			// PARADA
			System.out.println("...........................................................");
			System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
			desejaRepetir = ler.next().charAt(0);
		}
		// TOTAIS
		System.out.println("...............................................................");
		System.out.println("Total com boa saúde:" + totalSaudeBoa++);
		System.out.println("Total com saúde média:" + totalSaudeMedia++);
		System.out.println("Total com saúde ruim:" + totalSaudeRuim++);
		System.out.println("Total de mulheres:" + totalMulheres);
		System.out.println("Total de homens:" + totalHomens);
		System.out.println("total de pessoas:" + totalPessoas++);
	}

}
