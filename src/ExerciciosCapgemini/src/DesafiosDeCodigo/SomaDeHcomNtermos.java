package DesafiosDeCodigo;
/*DESAFIO
NESTE DESAFIO, FAÇA UM PROGRAMA QUE CALCULE O VALOR DE H COM N TERMOS. 

SENDO, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

ENTRADA 
A ENTRADA CONSISTE EM UM NÚMERO INTEIRO POSITIVO. 

SAÍDA 
NA SAÍDA SERÁ IMPRESSO O VALOR QUE REPRESENTA A SOMA DOS TERMOS.

ENTRADA	SAÍDA
4	2
8	3
3	2
*/

import java.util.Scanner;

public class SomaDeHcomNtermos {
	
	public static void main(String[] Args) {

		double h = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		double n = sc.nextDouble();

		for (int i = 1; i <= n; i++) { // TODO: CALCULE O VALOR DE H DE FORMA QUE RESULTE NA SOMA DOS TERMOS:
			if (i < 1) {
				h = 1;
			} else {
				h += 1.0 / i;
			}
		}
		System.out.println(String.format("%.0f", h));
	}
}