package estruturaDeDados_AULA7;

import java.util.LinkedList;

//AULA 7.E
public class LinkedListCarros {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);
		
		//INCLUI O DADO NO INÍCIO DA LISTA
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		//INCLUI O DADO NO FIM DA LISTA
		cars.addLast("New Beetle");
		System.out.println(cars);
		
		//MOSTRA O ELEMENTO NA POSIÇÃO PASSADA COMO PARÂMETRO
		String carro;
		carro = cars.get(3);
		System.out.println("O 3° item é: " + carro);
		
		//REMOVENDO O 1° ITEM DA LISTA
		cars.removeFirst();
		System.out.println(cars);
		
		//REMOVENDO O ULTIMO ITEM DA LISTA
		cars.removeLast();
		System.out.println(cars);
		
		// MOSTRANDO O 1° ITEM
		System.out.println("O 1° item é: "+ cars.getFirst());
		
		// MOSTRA O ULTIMO ITEM
		System.out.println("O ultimo item é: "+ cars.getLast());

		cars.clear(); // LIMPANDO A LISTA
		
		if (cars.isEmpty()) {
			System.out.println("A LinkedList está vazia.");
		}
	}

}
