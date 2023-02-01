package collectionsInterfaceMap;

/*DADAS AS SEGUINTES INFORMAÇÕES SOBRE MEUS LIVROS FAVORITOS E SEUS AUTORES,
CRIE UM DICIONÁRIO E ORDENE ESTE DICIONÁRIO:
EXIBINDO (NOME AUTOR - NOME LIVRO);
AUTOR = ANNELIES MARRIE FRANK  - LIVRO = NOME: O DIÁRIO DE ANNE FRANK. PÁGINAS: 373
AUTOR = SUSAN CAIN -             LIVRO = NOME: O PODER DOS QUIETOS,    PAGINAS: 336
AUTOR = ANA BEATRIZ BARBOSA -    LIVRO = MENTES PERIGOSAS,             PÁGINAS: 288
*/

import java.util.*;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {

		System.out.println("*** Ordem aleatória ***");
		Map<String, Livro> meusLivros = new HashMap<>() {
			{// TIPO DA CHAVE - STRING = AUTOR, VALOR DA CHAVE = LIVRO.
				put(" Annelies Marrie Frank", new Livro("O Diário de Anne Frank", 373));
				put(" Susan Cain", new Livro("O poder dos quietos", 336));
				put(" Ana Beatriz Barbosa", new Livro("Mentes perigosas", 288));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) // TRABALHA COM ELEMENTOS SEPARADAMENTE (CAHVE E
																		// VALOR).
			System.out.println(livro.getKey() + "  " + livro.getValue().getNome());

		System.out.println("");

		System.out.println("*** Ordem Inserção ***");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
			{
				put(" Annelies Marrie Frank", new Livro("O Diário de Anne Frank", 373));
				put(" Susan Cain", new Livro("O poder dos quietos", 336));
				put(" Ana Beatriz Barbosa", new Livro("Mentes perigosas", 288));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + "  " + livro.getValue().getNome());

		System.out.println("");

		System.out.println("*** Ordem alfabética autores ***");// ORDENAR DE ACORDO COM AS CHAVES (AUTORES).
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + "  " + livro.getValue().getNome());

		System.out.println("");

		System.out.println("*** Ordem alfabética nomes dos livros ***");// ORDENAR DE ACORDO COM O VALOR (NOMES DOS
																		// LIVROS), ORDEM ALFABÉTICA DOS LIVROS,
																		// TRABALHA COM "TREESET" PARA PASSAR O
																		// COMPARATOR.

		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros3) {
			System.out.println(livro.getKey() + "  " + livro.getValue().getNome());
		}
			System.out.println("");

			System.out.println("*** Ordem número de página ***");

			Set<Map.Entry<Integer, Livro>> set = new TreeSet<>(new ComparatorPaginas());
			set.addAll((Collection<? extends Entry<Integer, Livro>>) meusLivros.entrySet());
			for (Map.Entry<Integer, Livro> entrada : set) {
				System.out.println(entrada.getKey() + "  " + entrada.getValue().getPaginas() + ": "
						+ entrada.getValue().getNome());

			}

	}
}
