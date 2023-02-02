package StreamApiRefatoracaoDeCodigo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import CollectionsInterfaceMap.Contato;

public class RefatoracaoOrdenacaoMap {

	public static void main(String[] args) {
		System.out.println("--   Ordem aleatória   --");
		Map<Integer, Contato> agenda = new HashMap<>() {
			{
				put(1, new Contato("Maria", 330133));
				put(4, new Contato("Ana", 101010));
				put(3, new Contato("Joana", 602602));
			}
		};
		System.out.println(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("");
		
		System.out.println("--   Ordem Inserção   --");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
			{
				put(1, new Contato("Maria", 330133));
				put(4, new Contato("Ana", 101010));
				put(3, new Contato("Joana", 602602));
			}
		};
		System.out.println(agenda1);
		for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		System.out.println("");
		
		System.out.println("--    Ordem id   --"); // 
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		System.out.println(agenda2);
		for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		System.out.println("");
		
		/*System.out.println("--    Ordem número telefone   --");
		// ORGANIZANDO OS VALORES USANDO CLASSE ANÔNIMA:
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){
			@Override // CLASSE ANÔNIMA
			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
			}
			  
		}); 
	
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + 
					": " + entry.getValue().getNome());
		}
	}*/
	
		System.out.println("--    Ordem número telefone   --");
		// ORGANIZANDO OS VALORES USANDO EXPRESSÃO LAMBDA:
	
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				cont -> cont.getValue().getNumero()));//LAMBDA			
				
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + 
					": " + entry.getValue().getNome());
	}
}
	
		//INTERFACE FUNFIONAL: USA UM "COMPARATOR" Q USA O MÉTODO "COMPARING" Q PERMITE FAZER COMPARAÇÕES USANDO A INTERFACE FUNCIONAL "FUNCTION".
		/*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				new Function<Map.Entry<Integer, Contato>, Integer>(){

					@Override
					public Integer apply(Entry<Integer, Contato> cont) {
						return cont.getValue().getNumero();//RETORNO É O NUM DE TELEFONE.
					}
				
		}));*/
		

		/*System.out.println("--   Ordem nome contato   --");//ORGANIZANDO POR NOME DO CONTATO USANDO TREESET
			PRECISAMOS ORGANIZAR OS VALORES. LOGO:
			Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
			set1.addAll(agenda.entrySet());
			set1.forEach(entry -> System.out.println(entry.getKey()+ "  " + entry.getValue().getNome()));//USANDO FOREACH PARA IMPRIMIR.
		}*/
		
		
		/*System.out.println("--   Ordem nome contato   --"); //ORGANIZANDO POR NOME DO CONTATO USANDO LAMBDA
		
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
				cont -> cont.getValue().getNome()));
				
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set1) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}*/
    
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
	@Override
	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
		return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
	}
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
	@Override
	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
		return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
	}
}*/
