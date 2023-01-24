package exerciciosCollections;

import java.util.Comparator;
//COMPARANDO POR NOME, GENERO OU TEMPO DE DURAÇÃO DO EPISODIO.
public class ComparatorNomeGeneroTempoEpisodio implements Comparator <Serie>{

	@Override
	public int compare(Serie serie1, Serie serie2) { //SE OS NOMES FOREM DIFERENTES ORDENA POR NOME
		int nome = serie1.getNome().compareTo(serie2.getNome()); //SE OS NOMES FOR IGUAIS, ORDENA COM O GENERO
		if (nome != 0)
			return nome;

		int genero = serie1.getGenero().compareTo(serie2.getGenero());
		if (genero != 0)                                                 //SE O GENERO FOR DIFERENTE ORDENA COM O GENERO
			return genero;                                                //SE NOME E GENERO FOREM IGUAIS ORDENA POR TEMPO DE EPISODIO
                                                                           //SE O TEMPO DOS EPISODIOS FOREM IGUAIS ORDENA POR GENERO
		return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
	}

}
