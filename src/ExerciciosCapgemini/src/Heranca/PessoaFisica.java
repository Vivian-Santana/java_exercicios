package Heranca;

public class PessoaFisica extends Pessoa {

	public String cpf, rg;

	@Override
	public String toString() {
		return "Pessoa Fisica cpf:" + cpf + "\n" + "Rg:" + rg + "\n" + "Nome:" + nome + "\n" + "SituacaoPessoa:" + situacaoPessoa;
	}

}
