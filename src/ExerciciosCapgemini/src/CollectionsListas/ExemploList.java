package CollectionsListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	// MANEIRAS DE CRIAR LISTS:
	public static void main(String[] args) {

		List<Double> notas = new ArrayList<Double>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(7.0);
		notas.add(5d);
		notas.add(0d);
		notas.add(3.6);
		System.out.println("list de notas:" + notas); // OU PODE USAR "System.out.println(notas2.toString());" PARA IMPRIMIR A LIST DE
									// NOTAS.

		System.out.println("");
		
		System.out.println("Exiba a posição da nota 5.0:" + notas.indexOf(5d));// PASSANDO O OBJ PARA RETORNAR O
																				// IINDICE, A POSIÇÃO DELE.

		System.out.println("");

		System.out.println("Adicione na lista a nota 8.0 na posição 6:");
		notas.add(6, 8d);
		System.out.println(notas);

		System.out.println("");

		System.out.println("Substitua a nota 5.0 pela 6.0:"); // SUBSTITUINDO
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);

		System.out.println("");

		System.out.println("Confira se a nota 5.0 está na lista:" + notas.contains(5.0));// VERIFICA SE A NOTA 5.0 ESTÁ
																							// NA LISTA, A SAÍDA SERÁ
																							// FALSE PQ ELA FOI
																							// SUBSTITUIDA.

		System.out.println("");

		System.out.println("Exiba todas as notas na ordem em que foram informadas:");
		for (Double nota : notas)
			System.out.println(nota);

		System.out.println("");

		System.out.println("Exiba a terceira nota adicionada:" + notas.get(2));
		System.out.println(notas);

		System.out.println("");

		System.out.println("Exiba a menor nota:" + Collections.min(notas));// O MÉTODO "MIN" DA CLASSE COLLECTIONS BUSCA
																			// A MENOR NOTA. ATRAVÉS DA CLASSE "DOUBLE"
																			// Q IMPLEMENTA A INTERFACE "COMPARABLE" FAZ
																			// A COMPARAÇÃO DOS ELEMENTOS DA LIST E
																			// MOSTRA QUEM É MAIOR QUEM É MENOR, E A
																			// ORDENAÇÃO DELES.
																			// "INTERGER" "STRING" E "LONG" TBM
																			// IMPLEMENTAM A INTERFACE "COMPARABLE".
		System.out.println("");

		System.out.println("Exiba a maior nota:" + Collections.max(notas));

		System.out.println("");

		System.out.println("Exiba a soma dos valores:");
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) { // ENQUANTO O PRÓXIMO FOR IGUAL A TRUE (ENQUANTO TIVER PRÓXIMOS "HAS NEXT" ELEMENTOS)
			Double next = iterator.next();	//OS ELEMENTOS SERÃO SOMADOS E ARMAZENADOS A SOMA FINAL NA VARIÁVEL "SOMA".
			soma += next;				
		}
		
		System.out.println("Exiba a soma dos valores:" + soma);

		System.out.println("");

		System.out.println("Exiba a média das notas:" + (soma / notas.size()));

		System.out.println("");

		System.out.println("Remova a nota 0:"); // NO PARAMETRO DO REMOVE PODE SER PASSADO O ÍNDICE (POSIÇÃO) OU O
												// OBJETO Q SE QUER REMOVER.
		notas.remove(0.0); // PARA REMOVER O OBJ NO CASO O NÚMERO ZERO DEVE-SE PASSAR "0.0" OU "0d" O NUM E
							// O TIPO DA VARIÁVEL NO CASO DOUBLE.
		System.out.println(notas);

		System.out.println("");

		System.out.println("Remova a nota na posição 0:");
		notas.remove(0); // NO CASO DA REMOÇÃO PELO ÍNDICE É SÓ COLOCAR O NÚMERO CORRESPONDENTE A POSIÇÃO
							// QUE SE QUER REMOVER, NO CASO A POSIÇÃO ZERO.
		System.out.println(notas);

		System.out.println("");

		System.out.println("Remova as notas menores que 7 e exiba a lista:");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()){
			Double next = iterator1.next(); //O PRÓXIMO FICA ARMAZENADO NA VARIÁVEL NEXT.
			if (next < 7)iterator1.remove(); //O "IF" FILTRA TODOS OS MENORES Q 7 PARA SEREM REMOVIDOS.
		}
		System.out.println(notas);
		
		System.out.println("");
		System.out.println("Apague toda a lista:");
		notas.clear();				//LIMPA A LIST
		System.out.println(notas);
		
		System.out.println("Confira se a lista está vazia:" + notas.isEmpty());//OUTRA FORMA DE VVERIFICAR SE ESTÁ VAZIA.

		/*
		 * ArrayList<Double> notas1 = new ArrayList<>(); //TBM É UMA FORMA MAS MENOS
		 * RECOMENDADA POR SER VOLTADA MAIS PARA A INTERFACE E NÃO PARA A IMPLEMENTAÇÃO.
		 * 
		 * List<Double> notas2 = new ArrayList<>(); //"<>" É O DIAMOND OPERATOR AS
		 * ATUALIZAÇÕES ANTERIORES AO JAVA 5 NÃO TINHAM ESSE OPERADOR.
		 * 
		 * List<Double> notas3 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,
		 * 3.6));
		 * 
		 * List<Double> notas4 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);// ESSA
		 * FORMA É LIMITADA POIS NÃO SE PODE ADICIONAR NEM RETIRAR MAIS ELEMENTOS DENTRO
		 * DELA. notas.add(10d);// AQUI VAI DAR UM ERRO NA SAÍDA PQ ESTÁ TENTANDO
		 * ADICIONAR ESSE ELEMENTO "10D" System.out.println(notas4);
		 * 
		 * List<Double> notas5 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);//LISTA IMUTÁVEL
		 * TAL QUAL A DE CIMA NÃO PODENDO ADICIONAR OU REMOVER ELEMENTOS. notas.add(1d);
		 * notas.remove(5d); System.out.println(notas5);
		 */
	}
}
