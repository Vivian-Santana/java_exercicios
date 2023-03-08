package interfaces;

public class main {

	public static void main(String[] args) {
		
		Gato g = new Gato();
		g.nome();
		g.som();
		g.agir();
		g.comer();
		
		System.out.println("");
		
		Cachorro c = new Cachorro();
		c.nome();
		c.som();
		c.agir();
		c.comer();
	}

}
