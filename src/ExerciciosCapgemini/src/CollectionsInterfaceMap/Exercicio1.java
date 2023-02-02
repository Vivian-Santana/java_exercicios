package CollectionsInterfaceMap;

import java.util.*;
import java.util.Set;

/*
DADA A POPULAÇÃO ESTIMADA DE ALGUNS ESTADOS DO NORDESTE BRASILEIRO, FAÇA:
 ESTADO = PE - POPULAÇÃO = 9.616.621
 ESTADO = AL - POPULAÇÃO = 3.351.543
 ESTADO = CE - POPULAÇÃO  = 9.187.103
 ESTADO = RN - POPULAÇÃO = 3.534.265
 - CRIE UM DICIONÁRIO E ADICIONE OS ESTADOS E SUAS POPULAÇÕES;
 - SUBSTITUA A POPULAÇÃO DO ESTADO DO RN POR 3.534.165;
 - CONFIRA SE O ESTADO PB ESTÁ NO DICIONÁRIO, CASO NÃO ADICIONE: PB - 4.039.277;
 - EXIBA A POPULAÇÃO PE;
 - EXIBA TODOS OS ESTADOS E SUAS ´-POPULAÇÕES EM ORDEM ALFABÉTICA;
 - EXIBA O ESTADO COM MENOR POPULAÇÃO E SUA QAUNTIDADE;
 - EXIBA O ESTADO COM MAIOR POPULAÇÃO E SUA QUANTIDADE;
 - EXIBA A SOMA DA POPULAÇÃO DESSES ESTADOS;
 - EXIBA A MÉDIA DA POPULAÇÃO DESTE DICIONÁRIO DE ESTADOS;
 - REMOVA OS ESTADOS COM A POPULAÇÃO MENOR QUE 4.000.000;
 - APAGUE O DICIONÁRIO DE ESTADOS;
 - CONFIRA SE O DICIONÁRIO ESTÁ VAZIO.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("*** Ordem aleatória ***");
		Map<String, Double> estados = new HashMap<>() {

			{
				put("PE", 9.616621);
				put("AL", 3.351543);
				put("CE", 9.187103);
				put("RN", 9.187103);
			}
		};
		System.out.println(estados);

		System.out.println("");

		System.out.println("*** Substitua a população do Ceará por 8.936.431 habitantes ***: ");
		estados.put("RN", 3.534165);
		System.out.println(estados);

		System.out.println("");

		System.out.print("*** Confira se 'Paraíba' está na coleção ***" + '\n' + estados.containsKey("PB"));

		System.out.println("");

		System.out.println("*** ADICIONE: PB - 4.039.277 ****");
		estados.put("PB", 4.039277);
		Map<String, Double> estados1 = new HashMap<>(estados);
		System.out.println(estados);

		System.out.println("");

		System.out.println("*** Exiba a população do Pernambuco ***" + '\n' + estados1.get("PE"));

		System.out.println("");

		System.out.println("*** Exiba os Estados em oredem alfabética ***");
		Map<String, Double> estados2 = new TreeMap<>(estados);
		System.out.println(estados2);

		System.out.println("");

		System.out.println("*** Exiba o estado com menor população e sua qauntidade ***");
		Double menorPopulacao = Collections.min(estados.values());
		Set<Map.Entry<String, Double>> entradas = estados.entrySet();
		String estadoMenorPopulacao = ""; // VARIÁVEL DE CONTROLE

		for (Map.Entry<String, Double> entrada : entradas) {
			if (entrada.getValue().equals(menorPopulacao)) {
				estadoMenorPopulacao = entrada.getKey();
				System.out.println(estadoMenorPopulacao);
			}
		}
		System.out.println("");

		System.out.println("*** Exiba o estado com maior população e sua quantidade ***");
		Double maiorPopulacao = Collections.max(estados.values());
		Set<Map.Entry<String, Double>> input = estados.entrySet();
		String estadoMaiorPopulacao = "";

		for (Map.Entry<String, Double> entrada : input) {
			if (entrada.getValue().equals(maiorPopulacao)) {
				estadoMaiorPopulacao = entrada.getKey();
				System.out.println(estadoMaiorPopulacao);
			}
		}
		System.out.println("");

		System.out.println("*** Exiba a soma da população desses estados ***");
		Iterator<Double> iterador = estados.values().iterator();
		Double soma = 0.0;
		while (iterador.hasNext()) {
			soma += iterador.next();
		}
		System.out.println("Soma dos habitantes: " + soma);

		System.out.println("");

		System.out.println("*** Exiba a média da população deste dicionário de estados ***" + '\n' + "média = "
				+ (soma / estados.size()));

		System.out.println("");

		System.out.println("*** Remova os estados com a população menor que 4.000.000 ***");
		Iterator<Double> iterador1 = estados.values().iterator();
		while (iterador1.hasNext()) {
			Double next = iterador1.next();
			if (next < 4.000000)
				iterador1.remove();
		}
		System.out.println(estados);

		System.out.println("");

		System.out.println("*** Apague o dicionário de estados e confira se o dicionário está vazio ***");
		estados.clear();
		System.out.println(estados.isEmpty());
	}
}
