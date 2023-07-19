package Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aula6D {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// DECLARANDO ARRAYS
		String[] paises = new String[4];

		for (int i = 0; i < 4; i++) {

			// System.out.println("Digite o nome de um país");
			// paises[i]= input.next();
			paises[i] = JOptionPane.showInputDialog("Informe um país");// JOPTIONPANE FUNCIONA COMO INPUT POR MEIO DA
																		// JAVA SWING, UMA OPÇÃO ALEM DO SCANNER.
		}

		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
	}

}