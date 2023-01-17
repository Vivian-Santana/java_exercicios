package Metodos;
//EXEMPLO DE COMO OS MÉTODOS PODEM SER USADOS EM CONJUNTO.
public class MainEmprestimo {

	public static void main(String[] args) {
		System.out.println("Exercicio empréstimo");

		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());//O RETORNO DO METODO GET TRê PARCELAS SERÁ PASSADO COMO PARÂMETRO PARA O METODO CALCULAR.
		Emprestimo.calcular(1000, 3); //ACONTECE A MESMA COISA SE EU PASSAR ESSE VALOR DIRETAMENTE AO INVÉS DE PASSAR POR MEIO DE UM METODO.
		Emprestimo.calcular(1000, 5);
		
	}

}
