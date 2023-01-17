package objetosManipulacao;

//CRIAÇÃO E MANIPULAÇÃO DE OBJETOS
public class MainCarro {

	public static void main(String[] args) {

		//CRIAÇÃO DO OBJ VAZIO
		Carro carro1 = new Carro(); // CONSTRUTOR DEFAULT TEM O MESMO NOME DA CLASSE E NÃO POSSUI PARÂMETRO.

		//SETANDO (COLOCANDO)OS VALORES NO OBJ
		carro1.setCor("rosa");
		carro1.setModelo("fusca");
		carro1.setCapacidadeTanque(40);

		//PEGANDO E MOSTRANDO OS VALORES
		System.out.println("Carro 1");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println("Capacidade do tanque:");
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println("Custo para encher o tanque:");
		//CHAMANDO O MÉTODO PARA TRAZER O VALOR DO TANQUE CHEIO
		System.out.println(carro1.totalValorTanque(3.39));
		System.out.println("..............................");
		
		// SOBRECARGA DO CONSTRUTOR
		Carro carro2 = new Carro("vermelho", "new beetle", 55); //SETEI DENTRO DOS PARÂMETROS

		System.out.println("Carro 2");
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println("Capacidade do tanque:");
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println("Custo para encher o tanque:");
		System.out.println(carro2.totalValorTanque(5.39));

	}

}
