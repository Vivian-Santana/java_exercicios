package CollectionsInterfaceMap;

/*
FAÇA UM PROGRAMA QUE SIMULE UM LANÇAMENTO DE DADOS. LANCE O DADO 100 VEZES E ARMAZENE.
DEPOIS, MOSTRE QUANTAS VEZES CADA VALOR FOI CONSEGUIDO.
 */
import java.util.*;

public class DesafioDado {

	public static void main(String[] args) {
		int numeroLancamentos = 100;

		List<Integer> valores = new ArrayList<>();
		Random lancador = new Random();
		for (int i = 0; i < numeroLancamentos; i++) {
			int numero = lancador.nextInt(6) + 1;
			valores.add(numero);
		}

		Map<Integer, Integer> lancamentos = new HashMap<>();
		for (Integer saida : valores) {
			if (lancamentos.containsKey(saida))
				lancamentos.put(saida, (lancamentos.get(saida) + 1));
			else
				lancamentos.put(saida, 1);
		}

		System.out.print("Jogando");

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(3000);
				System.out.print(".");
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("\nValores " + " Número de vezes");
		for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
			System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
		}
	}
}
