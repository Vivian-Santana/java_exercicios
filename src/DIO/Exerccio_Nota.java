package Dio;

import java.util.Scanner;

/* FAÇA UM PROGRAMA QUE PEÇA UMA NOTA ENTRE ZERO E DEZ. 
 * MOSTRE UMA MENSAGEM CASO O VALOR SEJA INVÁLIDO
 * E CONTINUE PEDINdO ATÉ QUE O USUÁRIO INFORME UM VALOR VÁLIDO.*/

public class Exerccio_Nota {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int nota;

		System.out.println("Nota: ");
		nota = scr.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("a nota é inválida! digite novamente:");
			nota = scr.nextInt();
		}
	}

}
