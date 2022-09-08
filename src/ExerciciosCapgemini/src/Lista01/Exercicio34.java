package Lista01;

import java.util.Scanner;

/*34. ELABORE UM ALGORITMO QUE, DADA A IDADE DE UM NADADOR. CLASSIFIQUE-O EM UMA DAS SEGUINTES CATEGORIAS:
A. INFANTIL A = 5 - 7 ANOS;
B. INFANTIL B = 8 - 10 ANOS;
C. JUVENIL A = 11- 13 ANOS;
D. JUVENIL B = 14 - 17 ANOS;
E. SÊNIOR = 18 - 25 ANOS.
APRESENTAR MENSAGEM “IDADE FORA DA FAIXA ETÁRIA” QUANDO FOR OUTRO ANO NÃO CONTEMPLADO;*/
public class Exercicio34 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Digite a idade do nadador:");
		idade = ler.nextInt();

		if (idade <= 5 || idade > 25) {
			System.out.println("Idade fora da faixa etária! digite uma idade que esteja dentro das categorias.");
		} else {

			if (idade >= 5 && idade <= 7) {
				System.out.println("Categoria: infantil A");
			} else if (idade >= 8 && idade <= 10) {
				System.out.println("Categoria: infantil B");
			} else if (idade >= 11 && idade <= 13) {
				System.out.println("Categoria: juvenil A");
			} else if (idade >= 14 && idade <= 17) {
				System.out.println("Categoria: juvenil B");
			} else if (idade >= 18 && idade <= 25) {
				System.out.println("Categoria: sênior");
			}
		}
	}
}
