package DesafiosDeCodigo;

import java.io.IOException;
import java.util.Scanner;

/*DESAFIO
A SEGUINTE SEQUÊNCIA DE NÚMEROS 0 1 1 2 3 5 8 13 21... É CONHECIDA COMO SÉRIE DE FIBONACCI. NESSA SEQUÊNCIA, CADA NÚMERO, DEPOIS DOS 2 PRIMEIROS, É IGUAL À SOMA DOS 2 ANTERIORES. ESCREVA UM ALGORITMO QUE LEIA UM INTEIRO N (N < 46) E MOSTRE OS N PRIMEIROS NÚMEROS DESSA SÉRIE.

ENTRADA
O ARQUIVO DE ENTRADA CONTÉM UM VALOR INTEIRO N (0 < N < 46).

SAÍDA
OS VALORES DEVEM SER MOSTRADOS NA MESMA LINHA, SEPARADOS POR UM ESPAÇO EM BRANCO. NÃO DEVE HAVER ESPAÇO APÓS O ÚLTIMO VALOR.

 
EXEMPLO DE ENTRADA	
5

EXEMPLO DE SAÍDA
0 1 1 2 3*/
public class FibonacciFacil {

	public static void main(String[] args) throws IOException {
		
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int N = leitor.nextInt(); //SE N FOR = 10 A SAÍDA SERÁ OS 10 PRIMIEROS NÚMEROS DA SEQUÊNCIA DE FIBONACCI.
        							//SE FOR 40 SERÁ OS 40 PRIMEIROS NÚMEROS...
        
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
          if (i == N) System.out.println(anterior);
          else System.out.print(anterior + " "); //TODO: IMPLEMENTE A CONDIÇÃO IDEAL PARA QUE POSSAMOS OBTER OS VALORES SOLICITADOS
        	proximo = anterior + atual;
        	anterior = atual;          
        	atual = proximo ; 
        }
    }
	
}
