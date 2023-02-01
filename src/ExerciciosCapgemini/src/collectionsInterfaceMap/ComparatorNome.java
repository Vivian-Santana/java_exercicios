package collectionsInterfaceMap;

import java.util.Comparator;
import java.util.Map;
//CLASSE PARA ORDENAR POR NOMES DOS LIVROS.

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {// PEGA OS VALORES DOS LIVROS E COMPARA.
		return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
	}
}

class ComparatorPaginas implements Comparator<Map.Entry<Integer, Livro>>{
	
	@Override
	public int compare(Map.Entry<Integer, Livro> livro1, Map.Entry<Integer, Livro> livro2) {//COMPARA O NUMERO DE PAG DOS LIVROS.
		return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
	}
}