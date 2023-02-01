package StreamAPIexercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
//ALGUMAS OPERAÇÕES Q COMPÕES A API STREAM
public class ExerciStreamAPI02 {

	  public static void main(String[] args) {
	  List<String> numerosAleatorios =
	   Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

	      /* System.out.println("Imprima todos os elementos dessa lista de String: ");
	      numerosAleatorios.stream().forEach(new Consumer<String> (){    //CONSUMER É UMA INTERFACE FUNCIONAL.
	        															//A OPERAÇÃO FOREACH USA O MÉTODO ACCEP PARA IMORIMIR OS ELEMENTOS DA LIST
	    @Override
	    public void accept(String s) {      //O ACCEPT PEGA CADA ELEMENTO TIPO STRING DA LISTA E IMPRIME
	        
	        //SE A SAÍDA FOSSE IMPRESSA AQUI DENTRO DO MÉTODO ACCEPT IRIA IMPRIMIR A MESMA RESPOSTA 10X (Q É A QUANTIDADE DE ELEMENTOS DA LIST).
	       }
	        	
	    });
	    System.out.println(numerosAleatorios);*/
	  
	   //LAMBDA:
	   /*List<String> numerosAleatorios =
	            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

	   System.out.println("Imprima todos os elementos dessa lista de String: ");
	       numerosAleatorios.stream().forEach(s -> System.out.println(s)); {
	   }*/
	   
	  /*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
	   	
	   numerosAleatorios.stream()
	   .limit(5)
	   .collect(Collectors.toSet())
	   .forEach(System.out::println); //A SAÍDA SERÁ APENAS 4 ANUMEROS PQ O "SET" NÃO VAI IMPRIMIR NÚMEROS REPETIDOS.*/
	   
	   System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
		  
	   List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
		   .map(Integer::parseInt)								//REFERENCE METHOD.
		   .collect(Collectors.toList());
	   System.out.println(numerosAleatorios);
	   
	   /*System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");//TRANSFPORMAR A LIST EM LIST DE INTEGER.
       List <Integer>ListParesMaioresQue2 = numerosAleatorios.stream()
	       .map(Integer::parseInt)
	       .filter(i -> i %2 ==0 && i > 2)//FILTRO PEGA TDS OS NUM PARES MAIORES Q 2. COM O LAMBDA
	       .collect(Collectors.toList());
       System.out.println(ListParesMaioresQue2);*/
	   
	   /*System.out.println("Mostre a média dos números: ");
	   numerosAleatorios.stream()         //O MESMO SERVE PARA SOMA, MAIOR VALOR, MENOR VALOR.
       .mapToInt(Integer::parseInt)
       .average()
       .ifPresent(System.out::println);*/
	   
	   /*System.out.println("Remova os valores ímpares: ");
	   
	   List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
			   .map(Integer::parseInt)
			   .collect(Collectors.toList());
	   
       numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
       System.out.println(numerosAleatoriosInteger);*/
  
	  }
	   
}

