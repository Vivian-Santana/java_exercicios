package Heranca;

public class PessoaJuridica extends Pessoa {

	public String cnpj, incricaoEstadual;

	@Override
	public String toString() {
		return "cnpj: " + cnpj + "\n" + "Incricao Estadual:" + incricaoEstadual + "\n" + "Nome:" + nome
				+ "\n" + "Situacão:" + situacaoPessoa;
	}
}
