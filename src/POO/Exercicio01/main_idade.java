package Exercicio01;
/*CRIE UMA CLASSE PARA REPRESENTAR UMA PESSOA COM OS ATRIBUTOS PRIVADOS DE NOME, DATA DE NASCIMENTO E
ALTURA. CRIE OS MÉTODOS PÚBLICOS NECESSÁRIOS PARA GETTERS E SETTERS E TAMBÉM UM MÉTODO PARA IMPRIMIR
TODOS DADOS DE UMA PESSOA. CRIE UM MÉTODO PARA CALCULAR A IDADE DA PESSOA.*/

public class main_idade {

	public static void main(String[] args) {
		
		idade pessoa = new idade ("Lídia Lacerda", 2022, 1988, 1.70f);
		pessoa.dadosPessoa();
	}

}
