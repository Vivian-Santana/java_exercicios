package Dio;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Nome: ");
			nome = scr.next();

			if (nome.equals("0"))break;

			System.out.println("Idade");
			idade = scr.nextInt();
		}

		System.out.println("Fim do programa");
	}
}
