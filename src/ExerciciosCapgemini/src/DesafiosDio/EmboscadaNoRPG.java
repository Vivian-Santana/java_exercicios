package DesafiosDio;

import java.util.Scanner;

/*DESAFIO
VOCÊ E SEUS AMIGOS ESTÃO JOGANDO UMA PARTIDA DE RPG (ROLE-PLAYING GAME) UTILIZANDO UM DADO DE 10 LADOS. EM UM DETERMINADO MOMENTO, 
EM UMA MASMORRA ESCURA, O SEU PERSONAGEM FOI EMBOSCADO POR UM TERRÍVEL GOBLIN. COMO EM TODO BOM RPG, 
TEMOS ALGUNS PARÂMETROS QUE DEFINEM OS STATUS DOS PERSONAGENS:

VIDA: PONTOS QUE DEVEM SER MAIORES QUE 0, SE NÃO O PERSONAGEM MORRE.
ATAQUE: PONTOS QUE DEFINEM QUANTO DE DANO ELE INFLINGIRÁ NOS OUTROS PERSONAGENS.
DEFESA: PONTOS QUE DEFINEM QUANTO DANO SERÁ MITIGADO QUANDO ELE LEVAR UM ATAQUE.

O DADO É UM MODIFICADOR DESSES PARÂMETROS. QUANDO VOCÊ JOGA O DADO O VALOR DELE DEVE SER SOMADO AO SEU ATAQUE OU A SUA DEFESA. 
QUANDO O VALOR DO DADO FOR MAIOR QUE 8 E MENOR QUE 10, O JOGADOR TIRA UM CRÍTICO E ESSA SOMA DEVE SER DOBRADA.

O DANO CAUSADO AO JOGADOR É CALCULADO DESSA FORMA:
VIDADOJOGADOR - (ATAQUEINIMIGO - (DEFESADOJOGADOR + DADOS))

O DANO CAUSADO AO INIMIGO É CALCULADO DESSA FORMA:
VIDADOINIMIGO - (ATAQUEDOJOGADOR + DADOS)

CASO O JOGADOR SOBREVIVA A EMBOSCADA, ELE CONTRA-ATACA.

PARA DEIXAR A JOGATINA MAIS RÁPIDA, FAZENDO O COMPUTADOR REALIZAR AS CONTAS MATEMÁTICAS, 
VOCÊ DECIDIU CRIAR ESSE PROGRAMA PARA VERIFICAR SE SEU PERSONAGEM VAI SOBREVIVER E CONTRA-ATACAR OU MORRER.

ENTRADA
A ENTRADA SERÃO SEIS PARÂMETROS NESSA ORDEM:
DADOS;
VIDA DO JOGADOR;
ATAQUE DO JOGADOR;
DEFESA DO JOGADOR
VIDA DO INIMIGO;
ATAQUE DO INIMIGO;

SAÍDA
A SAÍDA DEVE SER VERIFICADO SE O JOGADOR SOBREVIVEU AO ATAQUE OU NÃO. CASO ELE TENHA SOBREVIVIDO, 
VERIFICAR SE O CONTRA-ATAQUE DELE FOI EFICAZ E MATOU O INIMIGO OU NÃO. 
EM SEGUIDA, PARA CADA CASO, IMPRIMA NA TELA AS RESPECTIVAS OCORRÊNCIAS.

EXEMPLO 1:

    ENTRADA     

                              SAÍDA 

2

6

6

4

5

14

                "JOGADOR NAO SOBREVIVEU" 

8

6

6

4

5

14

 "JOGADOR SOBREVIVEU E DERROTOU O INIMIGO" 

EXEMPLO 2:

    ENTRADA     

                                SAÍDA 

6

12

6

8

14

7

 "JOGADOR SOBREVIVEU E NAO DERROTOU O INIMIGO" */

public class EmboscadaNoRPG {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o número do dado:");
		int dado = leitor.nextInt();

		System.out.println("Digite o número correspondente a vida do jogador:");
		int vidaDoJogador = leitor.nextInt();

		System.out.println("Digite o número correspondente ao ataque do jogador:");
		int ataqueDoJogador = leitor.nextInt();

		System.out.println("Digite o número correspondente a defesa do jogador:");
		int defesaDoJogador = leitor.nextInt();

		System.out.println("Digite o número correspondente a vida do inimigo:");
		int vidaDoInimigo = leitor.nextInt();

		System.out.println("Digite o número correspondente ao ataque do inimigo:");
		int ataqueDoInimigo = leitor.nextInt();

		if (dado == 9) {
			ataqueDoJogador = (ataqueDoJogador + dado) * 2;
			defesaDoJogador = (defesaDoJogador + dado) * 2;
		}

		vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dado));// DANO AO JOGADOR
		vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dado);// DANO AO INIMIGO

		if (vidaDoJogador > 0 && vidaDoInimigo > 0) {
			System.out.println("Jogador sobreviveu e nao derrotou o inimigo :-(");

		} else if (vidaDoJogador > 0 && vidaDoInimigo < 0) {
			System.out.println("Jogador sobreviveu e derrotou o inimigo :-D");

		} else {
			System.out.println("Jogador nao sobreviveu :-C");

		}
	}
}
