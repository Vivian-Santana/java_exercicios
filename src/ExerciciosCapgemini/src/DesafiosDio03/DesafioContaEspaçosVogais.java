package DesafiosDio03;

import java.util.Scanner;

/*DESAFIO
JORGINHO É PROFESSOR DO PRIMÁRIO DE UMA DETERMINADA ESCOLA. ELE TEM 100000 ALUNOS E PRECISA CRIAR UM PROGRAMA QUE VERIFICA QUANTOS ESPAÇOS EM BRANCO E QUANTAS VOGAIS EXISTEM EM UMA DETERMINADA STRING DE ENTRADA QUE OS ALUNOS ENTREGARAM NA AVALIAÇÃO FINAL. AJUDE-O A REALIZAR ESSA TAREFA ANTES QUE O TEMPO PARA ENTREGA-LA NO FIM DO SEMESTRE ACABE!

ENTRADA
A ENTRADA SERÁ UMA FRASE NO FORMATO DE STRING. 

SAÍDA
A SAÍDA DEVERÁ RETORNAR QUANTOS ESPAÇOS EM BRANCO E QUANTAS VOGAIS EXISTEM NA DETERMINADA STRING, CONFORME EXEMPLO ABAIXO:

EXEMPLO DE ENTRADA:
 “AMO A DIO”
 
EXEMPLO DE SAÍDA:
ESPACOS EM BRANCO: 2 VOGAIS: 5 

EXEMPLO DE ENTRADA:
 “ESSE DESAFIO FOI FACIL” 
EXEMPLO DE SAÍDA:
 ESPACOS EM BRANCO: 3 VOGAIS: 10 
 
EXEMPLO DE ENTRADA:
 “NAVEGAR NAS AGUAS DO TEU MAR” 
EXEMPLO DE SAÍDA:
ESPACOS EM BRANCO: 5 VOGAIS: 11 */
//TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
//Dica: Você pode utilizar o Character.toLowerCase em sua condição:
public class DesafioContaEspaçosVogais {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();

	        String[] strSplit = str.split(" ");
	        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

	        for (String palavra : strSplit) {
	            for (char letra : palavra.toCharArray()) {
	                if (isVogal(letra)) {
	                    quantVogais++;
	                }
	            }   
	        }
	        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

	        sc.close();
	    }

	    static boolean isVogal(char letra) {
	        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
	        for (char vogal : vogais) {
	            if (Character.toLowerCase(letra) == vogal) {
	                return true;
	            }
	        }
	        return false;
	    }
	
}
