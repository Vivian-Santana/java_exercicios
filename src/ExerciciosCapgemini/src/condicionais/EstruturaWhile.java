package condicionais;

import java.util.Scanner;

public class EstruturaWhile {
	
	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner (System.in);
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar ==  'S' || desejaContinuar == 's'){
			
			System.out.println("Digite um número");
			int numero = lerScanner.nextInt();
			
			if (numero == 0) {
				System.out.println("o número é zero");
			}else {
				if (numero > 0) {
					System.out.println("o número é maior que zero");
				}else {
					System.out.println("o número é menor que zero");
				}
			}
			
			System.out.println("Deseja continuar? S - Sim / N - Não");
			desejaContinuar = lerScanner.next().charAt(0);
		}

	}

}
