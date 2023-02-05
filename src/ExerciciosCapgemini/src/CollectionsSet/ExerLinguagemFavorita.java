package CollectionsSet;
import java.util.*;
/*
CRIE UMA CLASSE LINGUAGEMFAVORITA QUE POSSUA OS ATRIBUTOS NOME, ANODECRIACAO E IDE.
EM SEGUIDA, CRIE UM CONJUNTO COM 3 LINGUAGENS E FAÇA UM PROGRAMA QUE ORDENE ESSE CONJUNTO POR:
A) ORDEM DE INSERÇÃO;
B) ORDEM NATURAL(NOME);
C) IDE;
D) ANO DE CRIAÇÃO E NOME;
E) NOME, ANO DE CRIAÇÃO E IDE;
AO FINAL, EXIBA AS LINGUAGENS NO CONSOLE, UM ABAIXO DA OUTRA.
*/
public class ExerLinguagemFavorita {

	public static void main(String[] args) {
		
		//System.out.println("Crie um conjunto com 3 linguagens:");
		Set<Linguagens> linguagensFavoritas = new HashSet<>();
		linguagensFavoritas.add(new Linguagens("JavaScript", 1995, "vs Code"));
        linguagensFavoritas.add(new Linguagens("Java", 1991, "eclipse"));
        linguagensFavoritas.add(new Linguagens("c#", 1999, "Visual Studio"));


	}

}
