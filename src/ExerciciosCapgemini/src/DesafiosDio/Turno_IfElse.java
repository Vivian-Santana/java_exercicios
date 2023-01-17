package DesafiosDio;
/*FAÇA UM PROGRAMA QUE PERGUNTE EM QUE TURNO VOCÊ ESTUDA. PEÇA PARA DIGITAR M-MATUTINO OU V-VESPERTINO OU N- NOTURNO. 
 * IMPRIMA A MENSAGEM "BOM DIA!", "BOA TARDE!" OU "BOA NOITE!" OU "VALOR INVÁLIDO!", CONFORME O CASO.
 * A ENTRADA CONSISTE EM UM CARACTERE(CHAR) M , N OU V QUE INFORMARÁ O TURNO EM QUE VOCÊ ESTUDA.*/
import java.util.Scanner;

public class Turno_IfElse {

	public class Turno {

		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);

			System.out.println("Em que turno você estuda? M- matutino, V-Vespertino, N- Noturno");
			char turno = leitor.next().toUpperCase().charAt(0);

			if (turno == 'M') {
				System.out.println("Bom Dia!");
			} else if (turno == 'V') {
				System.out.println("Boa Tarde!");
			} else if (turno == 'N') {
				System.out.println("Boa Noite!");
			} else {
				System.out.println("Valor inválido!");
			}
		}

	}

}
