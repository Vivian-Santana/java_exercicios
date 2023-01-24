package CollectionsSet;
//SET É UM MÉTODO QUE IMPLEMENA A INTERFACE COLLECTION.
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//DADA UMA LISTA COM 7 NOTAS DE UM ALUNO [7, 8.5, 9.3, 5, 7, 0 ,3.6] FAÇA:
public class exemplosSet {

	public static void main(String[] args) {

		System.out.println("Crie um conjunto e adicione as notas:");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString()); // NA SAÍDA OS ELEMENTOS FICAM EM ORDEM ALEATÓRIA E OS ELEMENTOS Q ESTÃO DUPLICADOS SÓ SÃO IMPRESSOS UMA VEZ.
												// NO MÉTODO SET NÃO É PERMITIDO FAZER BUSCAS DE ELEMENTOS DE ACORDO COM A POSIÇÃO (ÍNDICE) NÃO DÁ PARA USAR O GET.
													//TBM NÃO DÁ PARA ADICIONAR ELEMENTOS (TRABALHAR COM POSIÇÃO, ADICIONAR ELEMENTOS NUMA POSIÇÃO)OU SUBSTIUIR ALGUM ELEMENTO.
		
		System.out.println("");
		
		System.out.println("Confira se a nota 5.0 está no conjunto:" + notas.contains(5d));	//FAZERNDO UMA BUSCA.	
		
		System.out.println("");
		
		System.out.println("Exiba a menor nota:" + Collections.min(notas));
		
		System.out.println("");
		
		System.out.println("Exiba a maior nota:" + Collections.max(notas));
		
		System.out.println("");
		
		//SOMANDO VALORES:
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while (iterator.hasNext()) {
			Double proximo = iterator.next();
			soma += proximo;
		}
		System.out.println("Exiba a soma dos valores:" + soma);
		
		System.out.println("");
		
		System.out.println("Exiba a média das notas:" + soma/ notas.size()); //MÉDIA DAS NOTAS.
		
		System.out.println("");
		
		System.out.println("Remova a nota 0:");//REMOVENDO UM ELEMENTO.
		notas.remove(0d);
		
		System.out.println(notas);//OUTPUT EM ORDEM ALEATÓROIA
		
		System.out.println("");
		
		System.out.println("Remova as notas menores que 7 e exiba a lista:");//REMOVENDO ELEMENTOS A PARTIR DE UM PRÉ REQUISITO.
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double proximo = iterator1.next();
			if (proximo < 7) iterator1.remove();
		}
		System.out.println(notas);
	
		System.out.println("");
		
		System.out.println("Exiba as notas NA ORDEM em que foram informadas:"); //ISSO NÃO PODE SER FEITO COM "HASH SET" MAS DÁ PRA FAZER COM "LINKED HASH SET"											
		
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas2);
	
		System.out.println("");
		
		System.out.println("Exiba as notas na ordem crescente:");//OUTPUT SAI EM ORDEM CRESCENTE SE FOREM NÚMEROS (EM ORDEM NUMÉRICA) SE FOR STRING (EM ORDEM ALFABÉTICA). 
		Set<Double> notas3 = new TreeSet<> (notas2);
		System.out.println(notas3); //A PASSAGEM DO NOTAS2 COMO PARAMETRO SÓ DÁ CERTO PQ É DO MESMO TIPO DOUBLE E PQ A CLASSE TEM O COMPARABLE E PASSAMOS UM COMPARATOR. 
		
		System.out.println("");
		
		System.out.println("Apague todo o conjunto:");//DELETANDO OS ELEMENTOS.
		notas.clear();
		
		System.out.println("Confira se o conjunto está vazio:" + notas.isEmpty());
		System.out.println("Confira se o conjunto 2 está vazio:" + notas2.isEmpty());
		System.out.println("Confira se o conjunto 2 está vazio:" + notas3.isEmpty());
	}

}