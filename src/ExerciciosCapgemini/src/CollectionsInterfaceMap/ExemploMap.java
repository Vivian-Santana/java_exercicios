package CollectionsInterfaceMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*AULA COLLECTIONS: COLEÇÃO DE PARES MAP - (O MAP NÃO EXTENDE DA INTERFACE COLLECTION, MAP É UM OBJ Q PODE RECEBER MULTIPLOS ELEMENTOS)
 *  CADA ELEMENTO DENTRO DO MAP TEM UMA CHAVE E UM VALOR, AS CHAVES PODEM SE REPSTIR OS VALORES NÃO.*/

// A SEGUIR VEJA A IMPLEMENTAÇÃO DE MÉTODOS DA INTERFACE MAP:

public class ExemploMap {
/*DADO OS MODELOS DOA CARROS E SEUS RESPECTIVOS CONSUMO POR KM/L, FAÇA:
 * MODELO= CHAVE, CONSUMO= VALOR
MODELO = GOL - CONSUMO = 14,4 KM/L
MODELO = UNO - CONSUMO = 15,6 KM/L
MODELO = MOBI - CONSUMO = 16,1 KM/L
MODELO = HB20 - CONSUMO = 14,5 KM/L
MODELO = KWID - CONSUMO = 15,6 KM/L
*/
	public static void main(String[] args) {
		
		System.out.println("*** Crie uma coleção de carros que relacione os modelos e seus respectivos valores ***");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("Gol", 14.4); //EM MAP AS CHAVES SÃO DE VALORES ÚNICOS MAS OS VALORES PODEM SER DUPLICADOS.
			put("Uno", 15.6);
			put("Mobi", 16.1);
			put("Hb20", 14.5);
			put("Kwid", 15.6);
		}};
		System.out.println(carrosPopulares);//O HASHMAP MOSTRARÁ OS VALORES EM ORDEM ALEATÓRIA.
		
		System.out.println("");
		
		System.out.println("*** Substitua o consumo do gol por 15.2 km/l ***");
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("");
		
		System.out.println("Confira se o modelo 'Tucson' está na coleção: " + carrosPopulares.containsKey("Tucson"));
		
		System.out.println("");
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));
		
		System.out.println("");

		//System.out.println("EXIBA O TERCEIRO MODELO ADICIONADO:" + ); NÃO DÁ PARA FAZER COM MAP.
		
		System.out.println("Exiba os modelos:" );
		Set<String> modelos =  carrosPopulares.keySet();//O METODO "KEYSET" RETORNA UM "SET". NO EXEMPLO SET SERÁ DO TIPO STRING PQ AS CHAVES SÃO DO TIPO STRING.
		System.out.println(modelos);
		
		System.out.println("");

		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("");
		
		System.out.println("*** Exiba o modelo mais eficiente e seu consumo ***");
		
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); //"COLLECTIONS.MAX" RECEBE UMA COLLECTION E TRÁS O VALOR MAXIMO DELA. "CARROS POUPULARES.VALUES" RETORNA A COLLECTION" COM TDS OS CONSUMOS.
		
		//TRABALHANDO COM CHAVE E VALOR DE FORMA SEPARADA ENCONTRA-SE O CARRO COM O CONSUMO MAIS EFICIENTE:
		Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet(); //O MÉTODO "ENTRY SET" RETORNA UM SET E OS ELEMENTOS DENTRO DESSE SET É
																				//DO TIPO "ENTRY" (Q TEM COMO PARAMENTRO OS TIPOS DA CHAVE E DO VALOR DOS ELEMENTOS.
		String modeloMaisEficiente = ""; //VARIÁVEL DE CONTROLE.
		
		for(Map.Entry<String, Double> entrada: entradas) {
			if (entrada.getValue().equals(consumoMaisEficiente)){ //SE O PRIMEIRO ELEMENTO PEGO DENTRO DO SET DE ENTRADA TIVER VALOR IGUAL AO CONSUMO MAIS EFICIENTE,
				modeloMaisEficiente = entrada.getKey();				//O MODELO MAIS EFICIENTE É IGUAL A CHAVE REFERENTE A ESSE VALOR DE ENTRADA.
			System.out.println("modelo mais econômico: " + modeloMaisEficiente + " - consumo: " + consumoMaisEficiente );
				} //A SAÍDA SERÁ TODOS OS CARROS Q TEM UM CONSUMO EFICIENTE.
			}
			System.out.println("");
			
			System.out.println("*** Exiba o modelo menos econômico e seu consumo ***");//TRABALHAR COM CHAVE E VALOR SEPARADAMENTE, MAS LIGA-LOS, BEM PARECIDO COM O DE CIMA.
			
			//PRIMEIRO ACHAR O MENOR CONSUMO:
			Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
			String modeloMenosEficiente ="";
			for (Map.Entry<String, Double> entrada1: carrosPopulares.entrySet()) {
				if(entrada1.getValue().equals(consumoMenosEficiente)){ 
					modeloMenosEficiente = entrada1.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente +  " - consumo: " + consumoMenosEficiente);
				}
			}
			System.out.println("");
		
			System.out.println("*** Exiba a soma dos consumos ***");
			Iterator <Double> iterador = carrosPopulares.values().iterator();//DÁ PRA USA O "ITERATOR" AQUI PQ O RETORNO DESSA VARIÁVEL É UMA COLLECTION.
			Double soma = 0d;
			while(iterador.hasNext()) {
				soma += iterador.next();
			}
			System.out.println("Soma dos consumos: " + soma);
			
			System.out.println("");
			
			System.out.println("Exiba a média dos consumos desta coleção de carros: " +(soma/carrosPopulares.size()));
			
			System.out.println("");
			System.out.println(carrosPopulares);
			System.out.println("");
			
			System.out.println("*** Remova os modelos com o consumo igual a 15.6 km/l ***");
			Iterator <Double> iterador1 = carrosPopulares.values().iterator();//DÁ PRA USA O "ITERATOR" AQUI PQ O RETORNO DESSA VARIÁVEL É UMA COLLECTION.
			while(iterador1.hasNext()) {
				if(iterador1.next().equals(15.6)) iterador1.remove();	
			}
			System.out.println(carrosPopulares);
			
			System.out.println("");
			
			System.out.println("*** Exiba todos os carros na ordem que foram informados ***");
			Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{//USANDO LINKED HASH MAP.
				put("Gol", 14.4);
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 15.6);
			}};
			System.out.println(carrosPopulares1);
			
			System.out.println("");
			
			System.out.println("*** Exiba a coleção ordenada pelo modelo ***"); //NESSE CASO ORDEM ALFABÉTICA
			Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
			System.out.println(carrosPopulares2);
			
			System.out.println("");
			
			System.out.println("*** Apague a coleção de carros ***");
			carrosPopulares.clear();
			
			System.out.println("Confira se a coleção está vazia: " + carrosPopulares.isEmpty());
			
	}
}
