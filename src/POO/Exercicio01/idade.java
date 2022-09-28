package Exercicio01;

public class idade {
	private String nome;
	private int ano, anoNasc;
	private float altura;
	
	public idade(String nome, int ano, int anoNasc, float altura) {
		
		this.nome = nome;
		this.ano = ano;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAnoNasc() {
		return this.ano - this.anoNasc; //CALCULO DENTRO DO MÉTODO GET
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void dadosPessoa() {
		System.out.println("Nome:"+ this.getNome());
		System.out.println("ano nascimento:" + this.anoNasc);
		System.out.println("altura:" + this.getAltura());
		System.out.println("idade:" + this.getAnoNasc());
	}

}
