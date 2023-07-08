package DesafiosDio03;
/*NESTE PROBLEMA, VOCÊ DEVERÁ LER 3 PALAVRAS QUE DEFINEM O TIPO DE ANIMAL POSSÍVEL SEGUNDO O ESQUEMA ABAIXO, DA ESQUERDA PARA A DIREITA.  EM SEGUIDA CONCLUA QUAL DOS ANIMAIS SEGUINTES FOI ESCOLHIDO, ATRAVÉS DAS TRÊS PALAVRAS FORNECIDAS.

ENTRADA
A ENTRADA CONTÉM 3 PALAVRAS, UMA EM CADA LINHA, NECESSÁRIAS PARA IDENTIFICAR O ANIMAL SEGUNDO A FIGURA ACIMA, COM TODAS AS LETRAS MINÚSCULAS.

SAÍDA
IMPRIMA O NOME DO ANIMAL CORRESPONDENTE À ENTRADA FORNECIDA.

 
EXEMPLOS DE ENTRADA:
VERTEBRADO
MAMIFERO
ONIVORO
EXEMPLOS DE SAÍDA:
HOMEM

 

EXEMPLOS DE ENTRADA:
VERTEBRADO
AVE
CARNIVORO
EXEMPLOS DE SAÍDA:
AGUIA

EXEMPLOS DE ENTRADA:
INVERTEBRADO
ANELIDEO
ONIVORO
EXEMPLOS DE SAÍDA:
MINHOCA
*/
import java.util.Scanner;

public class DesafioAnimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String an1, an2, an3;

		System.out.println("O animal é vertebrado ou invertebrado?");
		an1 = sc.nextLine();

		System.out.println("Digite a classe do animal:");
		an2 = sc.nextLine();

		System.out.println("O animal é onívoro, carnívoro, herbívoro ou hematofago? ");
		an3 = sc.nextLine();

		if (an1.equalsIgnoreCase("vertebrado") && an2.equalsIgnoreCase("ave") && an3.equalsIgnoreCase("carnivoro")) {
			System.out.println("águia");
		} else if (an1.equalsIgnoreCase("vertebrado") && an2.equalsIgnoreCase("ave")
				&& an3.equalsIgnoreCase("onivoro")) {
			System.out.println("pomba");
		}
		if (an1.equalsIgnoreCase("vertebrado") && an2.equalsIgnoreCase("mamifero") && an3.equalsIgnoreCase("onivoro")) {
			System.out.println("homem");
		} else if (an1.equalsIgnoreCase("vertebrado") && an2.equalsIgnoreCase("mamifero")
				&& an3.equalsIgnoreCase("herbivoro")) {
			System.out.println("vaca");
		}
		if (an1.equalsIgnoreCase("invertebrado") && an2.equalsIgnoreCase("inseto")
				&& an3.equalsIgnoreCase("hematofago")) {
			System.out.println("pulga");
		} else if (an1.equalsIgnoreCase("invertebrado") && an2.equalsIgnoreCase("inseto")
				&& an3.equalsIgnoreCase("herbivoro")) {
			System.out.println("lagarta");
		}
		if (an1.equalsIgnoreCase("invertebrado") && an2.equalsIgnoreCase("anelideo")
				&& an3.equalsIgnoreCase("hematofago")) {
			System.out.println("sanguessuga");
		} else if (an1.equalsIgnoreCase("invertebrado") && an2.equalsIgnoreCase("anelideo")
				&& an3.equalsIgnoreCase("onivoro")) {
			System.out.println("minhoca");
		}
	}

}