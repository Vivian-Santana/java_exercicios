package interfaces;

public class Gato implements Animal{
	
	@Override
	public void nome() {
		System.out.println("Tom");
		
	}

	@Override
	public void som() {
		System.out.println("miau...");
		
	}

	@Override
	public void agir() {
		System.out.println("se lambe");
		
	}

	@Override
	public void comer() {
		System.out.println("ração whiskas");
		
	}
	
}
