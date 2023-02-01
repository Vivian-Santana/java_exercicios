package DesafiosDio;

import java.util.Scanner;

/*VOCÊ E SEUS AMIGOS ESTÃO EM UMA AULA DE CRIAÇÃO DE JOGOS. PARA INSPIRAR OS ALUNOS E TREINAR, 
 * O PROFESSOR PEDIU PARA QUE VOCÊS FIZESSEM UM JOGO QUE JÁ EXISTE COM ALGUMA MODIFICAÇÃO. 
 * A ESCOLHA DE VOCÊS FOI "PEDRA, PAPEL E TESOURA" E A MODIFICAÇÃO FOI MUDAR PEDRA PARA FLECHA, PAPEL PARA ESCUDO E TESOURA PARA ESPADA.
 * ENTÃO, VOCÊS ESCOLHERAM UM NÚMERO PARA REPRESENTAR CADA UM DOS PARÂMETROS. SENDO:*/
//1 - FLECHA
//2 - ESCUDO
//3 - ESPADA
/*ENTRADA
A ENTRADA VÃO SER DOIS NÚMEROS REPRESENTANDO CADA UM DOS PARÂMETROS. SENDO A PRIMEIRA ENTRADA O JOGADOR E A SEGUNDA O INIMIGO.
SAÍDA
A SAÍDA DEVE SER SE O JOGADOR GANHOU, EMPATOU OU PERDEU APÓS A ANÁLISE DAS DUAS ENTRADAS. A SAÍDA DEVE SER SEM AS ASPAS.

*/
public class PedraPapelTesoura {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		int jogadaJogador = leitor.nextInt();
		int jogadaInimigo = leitor.nextInt();

		if (jogadaJogador == jogadaInimigo) {
			System.out.println("Empatou");
		}

		else if (jogadaJogador == 1 && jogadaInimigo == 3 || jogadaJogador == 2 && jogadaInimigo == 1
				|| jogadaJogador == 3 && jogadaInimigo == 2) {
			System.out.println("Ganhou");
		}

		else {
			System.out.println("Perdeu");
		}

	}
	/*
	 * O JOGADOR 1 CONSEGUE GANHAR EM 3 CASOS:
	 * 
	 * QUANDO J1=1 E J2 =3; QUANDO J1=2 E J2=1; QUANDO J1=3 E J2=2;
	 */
}
