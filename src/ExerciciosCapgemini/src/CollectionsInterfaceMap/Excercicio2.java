package CollectionsInterfaceMap;
import java.util.*;
public class Excercicio2 {
	/*
	FAÇA UM PROGRAMA QUE SIMULE UM LANÇAMENTO DE DADOS. LANCE O DADO 100 VEZES E ARMAZENE.
	DEPOIS, MOSTRE QUANTAS VEZES CADA VALOR FOI CONSEGUIDO.
	 */
	    public static void main(String[] args) {
	        int quantLancamentos = 100;

	        List<Integer> valores = new ArrayList<>();
	        Random geradorDeLancamento = new Random();
	        for (int i = 0; i < quantLancamentos; i++) {
	            int number = geradorDeLancamento.nextInt(6) + 1;
	            valores.add(number);
	        }

	        Map<Integer, Integer> lancamentos = new HashMap<>();
	        for (Integer resultado : valores) {
	            if (lancamentos.containsKey(resultado))
	                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
	            else lancamentos.put(resultado, 1);
	        }

	        System.out.print("Jogando");
	        //CONTEÚDO DO FOR + TRY/CATH - TOTALMENTE OPCIONAL
	        for (int i = 0; i < 3; i++) {
	            try {
	                Thread.sleep(3000);
	                System.out.print(".");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("\nValor " + " Quant. de vezes");
	        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
	            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
	        }
	    }
}

