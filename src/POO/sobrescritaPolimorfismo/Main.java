package sobrescritaPolimorfismo;

public class Main {

	public static void main(String[] args) {
		// VETOR DE CLASSES COM 3 OBJTS RELACIONADOS AS CLASSES.
		ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), new ClasseFilha2(), new ClasseMae() };
		
		//SOBRESCRITA COM POLIMORFISMO
		for (ClasseMae classe : classes) {// O METODO CLASSE MAE PASSOU PELO POLIMORFISMO E SE TORNOU CLASSE FILHA 1
			classe.metodo1();
		}

		System.out.println("");

		for (ClasseMae classe : classes) {
			classe.metodo2();
		}

		System.out.println("");

		//SOBRESCRITA PURA
		ClasseFilha2 classeFilha2 = new ClasseFilha2(); //TRABALHANDO DIRETAMENTE COM O TIPO: CLASSE FILHA2 NÃO É PLOMORFISMO É SÓ SOBRESCRITA.
		classeFilha2.metodo2();
	}
//PRIMEIRA SAÍDA SERÁ DOIS COMPORTAMENTOS POLIMORFICOS A SEGUNDA TERÁ UM E A TERCEIRA TERÁ APENAS A SOBRESCRITA.
}
