package interfaces;

public class Cachorro implements Animal{
	
	@Override
	public void nome() {
		System.out.println("Bituca");
		
	}

	@Override
	public void som() {
		System.out.println("Au, au, au...");
		
	}

	@Override
	public void agir() {
		System.out.println("balança o rabo");
		
	}

	@Override
	public void comer() {
		System.out.println("magnus adulto");
		
	}

}
