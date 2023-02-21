package polimorfismo;

public class Elefante extends Mamifero{
	
	public String nome() {
		return "Dumbo";
	}
	
	@Override
	public double cotaDiaritaLeite() {
		return 30.0;
	}
	
	@Override
	public double peso() {
		return 90.0; //filhote
	}

}