package CollectionsSet;

import java.util.*;

/*
CRIE UMA CONJUNTO CONTENDO AS CORES DO ARCO-ÍRIS E:
A) EXIBA TODAS AS CORES O ARCO-ÍRIS UMA ABAIXO DA OUTRA;
B) A QUANTIDADE DE CORES QUE O ARCO-ÍRIS TEM;
C) EXIBA AS CORES EM ORDEM ALFABÉTICA;
D) EXIBA AS CORES NA ORDEM INVERSA DA QUE FOI INFORMADA;
E) EXIBA TODAS AS CORES QUE COMEÇAM COM A LETRA ”V”;
F) REMOVA TODAS AS CORES QUE NÃO COMEÇAM COM A LETRA “V”;
G) LIMPE O CONJUNTO;
H) CONFIRA SE O CONJUNTO ESTÁ VAZIO;
 */
public class CoresDoArcoIris {

	public static void main(String[] args) {

		System.out.println("Crie uma conjunto contendo as cores do arco-íris:");
		Set<String> coresDoArcoIris = new HashSet<>();
		coresDoArcoIris.add("Vermelho");
		coresDoArcoIris.add("Verde");
		coresDoArcoIris.add("Violeta");
		coresDoArcoIris.add("Laranja");
		coresDoArcoIris.add("Amarelo");
		coresDoArcoIris.add("Azul");
		coresDoArcoIris.add("Anil");

		System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
		for (String cor : coresDoArcoIris) {
			System.out.println(cor);
		}
		System.out.println("");

		System.out.println("Exiba a quantidade de cores que o arco-íris tem: " + coresDoArcoIris.size());

		System.out.println("");

		System.out.println("Exiba as cores em ordem alfabética: ");
		Set<String> cores = new TreeSet<>(coresDoArcoIris);
		System.out.println(cores);

		System.out.println("");

		System.out.println("Exiba as cores na ordem inversa da que foi informada");
		Set<String> cores1 = new LinkedHashSet<>(
				Arrays.asList("Amarelo","Anil","Azul","Laranja","Verde","Vermelho","Violeta"));
		System.out.println(cores1);
		List<String> coresList = new ArrayList<>(cores1);
		Collections.reverse(coresList);
		System.out.println(coresList);

		System.out.println("");

		System.out.println("Exiba todas as cores que começam com a letra ”V”: ");
		for (String cor : coresDoArcoIris) {
			if (cor.startsWith("V"))
				System.out.println(cor);
		}

		System.out.println("");

		System.out.println("Remova todas as cores que não começam com a letra “V”: ");
		Iterator<String> iterator2 = coresDoArcoIris.iterator();
		while (iterator2.hasNext()) {
			if (!iterator2.next().startsWith("V"))
				iterator2.remove();
		}
		System.out.println(coresDoArcoIris);

		System.out.println("");
		
		System.out.println("Limpe o conjunto: ");
		coresDoArcoIris.clear();

		System.out.println("");

		System.out.println("Confira se o conjunto está vazio: " + coresDoArcoIris.isEmpty());

	}

}
