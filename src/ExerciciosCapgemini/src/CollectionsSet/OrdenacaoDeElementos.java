package CollectionsSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//DADAS AS SEGUINTES INFORMAÇÕES SOBRE MINHAS SÉRIES FAVORITAS, 
//CRIE UM CONJUNTO E ORDENE ESTE CONJUNTO EXIBINDO: (NOME - GENERO - TEMPO DE EPISODIO);
//SÉRIE 1 - NOME: EU, A PATROA E AS CRIANÇAS   GENERO: HUMOR  TEMPO EPISODIO: 21 MIN;
//SÉRIE 1 - NOME: THE GOOD DOCTOR  , GENERO: DRAMA, TEMPO EPISODIO: 43 MIN;
//SÉRIE 1 - NOME: bATES MOTEL, GENERO: SUSPENSE , TEMPO EPISODIO: 43 MIN ;
public class OrdenacaoDeElementos {

	public static void main(String[] args) {

		System.out.println("**Ordem aleatória**"); // ORDEM ALEATÓRIA
		Set<Serie> minhasSeries = new HashSet<Serie>() {
			{

				add(new Serie("Eu, a patroa e as crianças", "Humor", 21));
				add(new Serie("The good doctor", "Drama", 43));
				add(new Serie("Bates motel", "Suspense", 43));
			}
		};

		for (Serie serie : minhasSeries)
			System.out.println(serie.getNome() + "   " + serie.getGenero() + "   " + serie.getTempoEpisodio());

		System.out.println("");

		System.out.println("***Ordem de inserção***");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
			{
				add(new Serie("Eu, a patroa e as crianças", "Humor", 21));
				add(new Serie("The good doctor", "Drama", 43));
				add(new Serie("Bates motel", "Suspense", 43));
			}
		};
		for (Serie serie : minhasSeries1)
			System.out.println(serie.getNome() + "   " + serie.getGenero() + "   " + serie.getTempoEpisodio());

		System.out.println("");

		System.out.println("***Ordem natural (duração dos episódios)***"); //A ORDENAÇÃO LEVA EM CONTA PRIMEIRO A DURAÇÃO DOS EPISÓDIOS, SE FOREM IGUAIS ORDENARÁ POR GENERO.
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2)
			System.out.println(serie.getNome() + "   " + serie.getGenero() + "   " + serie.getTempoEpisodio());

		System.out.println("");

		System.out.println("***Ordem nome/genero/duração dos episódios***"); //A ORDENAÇÃO VAI DAR PRIORIDADE DE ORDENAR PRIMEIRO POR NOME,
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); //SÓ DEPOIS LEVA EM CONTA GENERO E DURAÇÃO DE EPISÓDIO.
		minhasSeries3.addAll(minhasSeries); //METODO "ADDALL" RECEBE A COLLECTION MINHAS SERIES.
		for (Serie serie : minhasSeries3)
			System.out.println(serie.getNome() + "   " + serie.getGenero() + "   " + serie.getTempoEpisodio());

	}

}
