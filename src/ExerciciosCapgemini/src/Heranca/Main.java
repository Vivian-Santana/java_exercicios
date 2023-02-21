package Heranca;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisica fis = new PessoaFisica();
		fis.nome = "Maria";
		fis.cpf = "1111111111- 11";
		fis.rg = "2222222-2";
		fis.situacaoPessoa = "Ativa";
		
		PessoaJuridica jur = new PessoaJuridica();
		jur.nome = "Casa Verde";
		jur.cnpj = "3333333-33";
		jur.incricaoEstadual = "444444";
		jur.situacaoPessoa = "Inativa";
		
		System.out.println("*** Dados da Pessoa Física ***");
		System.out.println(fis.toString());
		System.out.println();
		System.out.println("*** Dados da Pessoa Jurídica ***");
		System.out.println(jur.toString());

	}

}
