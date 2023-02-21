package polimorfismo;

public class Rato extends Mamifero{

	public String nome() {
		return "Stuart Little";
	}
	
	@Override
	public double cotaDiaritaLeite() {
		return 0.5;
	}
	
	@Override
	public double peso() {
		return 0.22;
	}
}
