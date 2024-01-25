package classeWrapper;
// AULA 8.C
public class Aula8C {

	public static void main(String[] args) {
		// UM TIPO PRIMITIVO NÃO PODE TRANFORMAR EM OBJETO SEM USAR UMA CLASSE WRAPPER

		// AUTOBOXING - EXEMPLOS
		
		Boolean bolWrapped = true;
		System.out.println(bolWrapped.getClass());
		
		Character chWrapped = 'a';
		System.out.println(chWrapped.getClass());
		
		Byte byteWrapped = 1;
		System.out.println(byteWrapped.getClass());
		
		Short shortWrapped = 'B';
		System.out.println(shortWrapped.getClass());
		
		Integer intWrapped = 5215;
		System.out.println(intWrapped.getClass());
		
		Long longWrapped = 46213681357L;
		System.out.println(longWrapped.getClass());
		
		Float floatWrapped = 3.14159f;
		System.out.println(floatWrapped.getClass());
		
		Double doubleWrapped = 5.86912;
		System.out.println(doubleWrapped.getClass());
		
		// CONVERÇÃO DA STRING 1 EM INTEIRO
		int numero = Integer.parseInt("1"); //AUTOBOXING E 
		numero = numero + 2; //UNBOXING
		System.out.println(numero);

	}

}
