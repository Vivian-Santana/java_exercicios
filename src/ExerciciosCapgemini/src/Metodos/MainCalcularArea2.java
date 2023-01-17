package Metodos;

public class MainCalcularArea2 {
//RETORNOS
	public static void main(String[] args) {
		
		System.out.println("Exercicío retornos:");

		double areaQuadrado = CalcularArea2.area (3);
		System.out.println("Área do quadrado:" + areaQuadrado);
		
		double areaRetangulo = CalcularArea2.area(5);
		System.out.println("Área do retângulo:" + areaRetangulo);
		
		double areaTrapesio = CalcularArea2.area(7, 8, 9);
		System.out.println("Área do trapésio:" + areaTrapesio);
		
		float areaLosango = CalcularArea2.area(5f, 5f);
		System.out.println("Área do losango:" + areaLosango);
	}

}
