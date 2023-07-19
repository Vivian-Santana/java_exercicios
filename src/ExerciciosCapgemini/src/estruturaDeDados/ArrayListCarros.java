package estruturaDeDados;

//AULA 7.C
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {

		ArrayList<String> carros = new ArrayList<>();

		// add carros no arrayList
		carros.add("Kombi");
		carros.add("Jaguar");
		carros.add("BMW");
		carros.add("Mercedes");
		carros.add("Fusca");
		carros.add("Vectra");
		carros.add("Fluence");

		// ALTERA E RESGATA COM BASE NA POSIÇÃO E ALTERA COM BASE NO CONTEÚDO.

		// MOSTRA ARRAY
		System.out.println(carros);

		carros.set(4, "Mitsubishi"); // SUBSTITUI O QUE ESTIVER NA POSIÇÃO 4 POR MITSUBISHI
		System.out.println(carros);

		carros.remove("Vectra"); // REMOVE PASSANDO O VALOR DO CONTEÚDO
		System.out.println(carros);

		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));// INCLUI NO FINAL DA LISTA O QUE FOR
																			// PASSADO NO INPUT.
		System.out.println(carros);

		// carros.clear(); //LIMPA O ARRAY
		// System.out.println(carros);

		/*
		 * if (carros.isEmpty()) { System.out.println("O vetor está vazio"); }
		 */
		System.out.println(carros.size());

		if (carros.contains("BMW M3")) { // SUBSTITUINDO QUANDO NÃAO SE SABE A POSIÇÃO
			for (int i = 0; i < carros.size(); i++) {// PERCORRE O ARRAY ATÉ ACHAR A BMW
				if ("BMW".equals(carros.get(i))) {// QUANDO ACHAR TROCA PARA BUGATTI
					carros.set(i, "Bugatti");
					break; // E PARA A EXECUÇÃO DO LAÇO
				}
			}
		} else {
			System.out.println("Não encontrei o argumento pesquisado.");
		}
		System.out.println(carros);

	}

}
