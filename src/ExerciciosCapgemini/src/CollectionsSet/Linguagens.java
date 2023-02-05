package CollectionsSet;

import java.util.Objects;

public class Linguagens<LinguagemFavorita> implements Comparable<LinguagemFavorita>{

	public String nome;
    public Integer anoDeCriacao;
    public String ide;
    
	public Linguagens(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	@Override
	public int compareTo(LinguagemFavorita linguagemFavorita) {
		return this.nome.compareTo((String) linguagemFavorita);
	}
    
	@Override
	public String toString() {
		return "Linguagens [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linguagens other = (Linguagens) obj;
		return Objects.equals(anoDeCriacao, other.anoDeCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	
	
    
}
