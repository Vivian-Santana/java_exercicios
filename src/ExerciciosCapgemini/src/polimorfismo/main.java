package polimorfismo;

public class main {

	public static void main(String[] args) {
		
		Mamifero mamifero1 = new Elefante();
		System.out.println("nome: " + mamifero1.nome());
		System.out.println("Cota diária de leite: " + mamifero1.cotaDiaritaLeite()+ " litros");
		System.out.println("Peso: " + mamifero1.peso()+ " kg");
		
		System.out.println("");
		
		Mamifero mamifero2 = new Rato();
		System.out.println("nome: " + mamifero2.nome());
		System.out.println("Cota diária de leite: " + mamifero2.cotaDiaritaLeite()+ " litros");
		System.out.println("Peso: " + mamifero2.peso()+ " g");

	}

}


abstract class Mamifero {
	
	public abstract String nome();
	
	public abstract double cotaDiaritaLeite();
	
	public abstract double peso();

}
