package Sintaxe;

import java.util.Scanner;

/*7. LEIA UMA TEMPERATURA EM GRAUS CELSIUS E APRESENTÁ-LA CONVERTIDA EM GRAUS FAHRENHEIT. AFÓRMULA DE
CONVERSÃO É:F=(9*C+160) / 5, SENDO F A TEMPERATURA EM FAHRENHEIT E C A TEMPERATURA EM CELSIUS; */
public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float grausC, grausF;
		
		System.out.println("Digite a temperatura em graus celsius:");
		grausC = ler.nextFloat();
		
		grausF = (9 * grausC + 160 )/ 5;
		
		System.out.println("Conversão para fahrenheit:" + grausF);
	}

}
