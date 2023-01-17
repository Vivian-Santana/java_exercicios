package sobrescritaPolimorfismo;

public class ClasseFilha1 extends ClasseMae{
	
	@Override //ANOAÇÃO DE SOBRESCRITA
	void metodo1() {
		System.out.println("Eu sou o método 1 da classe filha 1");
	}

}
