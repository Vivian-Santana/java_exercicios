package DesafiosDeCodigo;

import java.util.Scanner;

/*DESAFIO
DAENERYS É A KHALEESI DOS DOTHRAKI. JUNTAMENTE COM DROGON, ELES VÃO ATRÁS DO TYRION, PARA TENTAR DOMINAR WESTEROS. 
ELA POSSUI, ALÉM DO SEU DRAGÃOZINHO, UM RASTREADOR QUE MEDE O NÍVEL DE ENERGIA DE QUALQUER SER VIVO. 
TODOS OS SERES COM O NÍVEL MENOR OU IGUAL A 8000, ELA CONSIDERA COMO SE FOSSE UM INSETO. QUANDO PASSA DESTE VALOR, 
QUE FOI O CASO DO DROGON, ELA SE ESPANTA E GRITA “MAIS DE 8000”. 
BASEADO NISSO, UTILIZE A MESMA TECNOLOGIA E ANALISE O NÍVEL DE ENERGIA DOS SERES VIVOS.

ENTRADA
A PRIMEIRA LINHA CONTÉM UM NÚMERO INTEIRO C RELATIVO AO NÚMERO DE CASOS DE TESTE. EM SEGUIDA, HAVERÁ C LINHAS, COM UM NÚMERO INTEIRO N (100 <= N <= 100000) RELATIVO AO NÍVEL DE ENERGIA DE UM SER VIVO.

SAÍDA
PARA CADA VALOR LIDO, IMPRIMA O TEXTO CORRESPONDENTE.

 
EXEMPLO DE ENTRADA
3
8001
100
200

EXEMPLO DE SAÍDA
MAIS DE 8000!
INSETO!
INSETO!
*/
public class Dragao {

	public static void main(String[] args) {

		int casos, poderDeLuta;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		casos = ler.nextInt();// SE FOR 3 CASOS ELE REPETE O LOOP 3 VEZES, AVALIANDO OS 3 PODERES DE LUTA
								// DIFERENTES.
		if (casos <= 0) {
			System.out.println("Digite um número válido!");
		}

		for (int i = 0; i < casos; i++) {

			System.out.println("Digite o poder de luta: ");
			poderDeLuta = ler.nextInt();

//TODO: IMPLEMENTE A CONDIÇÃO ADEQUADA PARA A IMPRESSÃO DOS TEXTOS CONFORME O SOLICITADO NO DESAFIO:

			if (poderDeLuta <= 8000) {
				System.out.println("Inseto!");
			} else {
				System.out.println("Mais de 8000!");
			}
		}
	}
}