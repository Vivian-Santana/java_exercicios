package upcastDowncast;
//UPCAST E DOWNCAST
public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();//INSTANCIA DE UM OBJ NUMA CLASSE
		
		//3 UP CASTS, GERENTE, FAXINEIRO E VENDEDOR SÃO SUBTIPOS DE FUNCIONÁRIO (O SUPER TIPO OU CLASSE MÃE)
		Funcionario gerente = new Gerente(); 
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		//DOWN CAST EMBORA SEJA UM CONCEITO VÁLIDO EM POO DEVE SER EVITADO.
		//Gerente gerente = new Funcionario();
		Vendedor vendedor2 = (Vendedor) new Funcionario();
		
	}

}