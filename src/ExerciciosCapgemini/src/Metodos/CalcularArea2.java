package Metodos;
//USANDO RETURN PARA RETORNAR VALORES.
public class CalcularArea2 {

	public static double area(double lado) { //QUADRADO

		return lado * lado;
	}

	public static double area(double lado1, double lado2) {//RETÂNGULO

		return lado1 * lado2;
	}

	public static double area(double baseMaior, double baseMenor, double altura) {//TRAPÉSIO

		return ((baseMaior + baseMenor)) * altura / 2;
	}

	public static float area(float diagonal1, float diagonal2) {//LOSANGO

		return ((diagonal1 * diagonal2))/ 2;
	}
}
