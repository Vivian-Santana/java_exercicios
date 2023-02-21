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

	/*public static void main(String[] args) {
		
		//System.out.println("Crie um conjunto com 3 linguagens:");
		Set<Linguagens> linguagensFavoritas = new HashSet<>();
		linguagensFavoritas.add(new Linguagens("JavaScript", 1995, "vs Code"));
        linguagensFavoritas.add(new Linguagens("Java", 1991, "eclipse"));
        linguagensFavoritas.add(new Linguagens("c#", 1999, "Visual Studio"));

        System.out.println("Exiba as linguagens por ordem de inserção: ");
        Set<Linguagens>linguagensFavoritas1 = new LinkedHashSet<>(){
        	{
                add(new Linguagens("Java", 1991, "eclipse"));
                add(new Linguagens("c#", 1999, "Visual Studio"));
                add(new Linguagens("JavaScript", 1995, "vs Code"));
        	}
        };
        for(Linguagens linguagem: linguagensFavoritas1)
        	System.out.println(linguagem.nome);

        System.out.println("");

       System.out.println("Exiba as linguagens por ordem natural - nome: ");
       Set<Linguagens> linguagensFavoritas2 = new TreeSet<>(linguagensFavoritas);
       for (Linguagens linguagem : linguagensFavoritas2) System.out.println(linguagem);
        	

	}*/

	
	
	
	public static void main (String[] args) {
        Set<Favorita>linguagens = new HashSet<>();
      
        linguagens.add(new Favorita("JavaScript", 1995, "eclipse"));
        linguagens.add(new Favorita("Java", 1991, "VS Code"));
        linguagens.add(new Favorita("c#", 1999, "Visual Studio"));

        System.out.println("*** tOrdem de Inserção ***");
        Set<Favorita> linguagens1 = new LinkedHashSet<>(){
        	{	
        		add(new Favorita("JavaScript", 1995, "eclipse"));
        		add(new Favorita("Java", 1991, "VS Code"));
        		add(new Favorita("c#", 1999, "Visual Studio"));
        	}
        };
        
        for (Favorita linguagem : linguagens1) System.out.println(linguagem);
        
        System.out.println("");

        System.out.println("*** tOrdem Natural: Nome ***");
        Set<Favorita> linguagensFavoritas2 = new TreeSet<>(linguagens1);
        for (Favorita linguagem : linguagensFavoritas2) System.out.println(linguagem);

        System.out.println("");
        
        System.out.println("*** tOrdem IDE ***");
        Set<Favorita> linguagensFavoritas3 = new TreeSet<Favorita>(new ComparatorIde());
       linguagensFavoritas3.addAll(linguagens1);
        for (Favorita linguagem : linguagensFavoritas3) System.out.println(linguagem);

        System.out.println("");
        
        System.out.println("*** Ordem Ano de Criacao e Nome ***");
        Set<Favorita> linguagensFavoritas4 = new TreeSet<Favorita>(new ComparatorAnoDeCriacaoENome());
        linguagensFavoritas4.addAll(linguagens1);
        for (Favorita linguagem : linguagensFavoritas4) System.out.println(linguagem);
        
        System.out.println("");

        System.out.println("*** Ordem Nome - Ano de Criacao - IDE ***");
        Set<Favorita> linguagensFavoritas5 = new TreeSet<Favorita>(new ComparatorNomeAnoDeCriacaoIde());
        linguagensFavoritas5.addAll(linguagensFavoritas3);
        for (Favorita linguagem : linguagensFavoritas5) System.out.println(linguagem);

    }
	
}

class Favorita implements Comparable<Favorita> {
	public String nome;
	public Integer anoDeCriacao;
	public String ide;

	public Favorita(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "{" + "nome='" + nome + '\'' + ", anoDeCriacao=" + anoDeCriacao + ", ide='" + ide + '\'' + '}';
	}

	@Override
	public int compareTo(Favorita Favorita) {
		return this.nome.compareTo(Favorita.nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Favorita that = (Favorita) obj;
		return nome.equals(that.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}

class ComparatorIde implements Comparator<Favorita> {

	@Override
	public int compare(Favorita lf1, Favorita lf2) {
		return lf1.ide.compareToIgnoreCase(lf2.ide);
	}
}

class ComparatorAnoDeCriacaoENome implements Comparator<Favorita> {

	@Override
	public int compare(Favorita lf1, Favorita lf2) {
		int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
		if (anoDeCriacao != 0)
			return anoDeCriacao;
		return lf1.nome.compareToIgnoreCase(lf2.nome);
	}
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<Favorita> {

	@Override
	public int compare(Favorita lf1, Favorita lf2) {
		int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
		int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
		if (nome != 0)
			return nome;
		if (anoDeCriacao != 0)
			return anoDeCriacao;
		return lf1.ide.compareToIgnoreCase(lf2.ide);
	}
}
