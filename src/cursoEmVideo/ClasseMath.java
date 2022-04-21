package cursoEmVideo;

import java.util.Scanner;

public class ClasseMath {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dividendo = 0;
        int divisor = 0;

        System.out.println ("Digite um número para obter a divisão:");
        dividendo= ler.nextInt();

        System.out.println ("Digite um divisor para o número:");
        divisor= ler.nextInt();

        float divisao = dividendo/divisor;
        System.out.println("o resultado da divisão é: "+ divisao);

        float resto = dividendo % divisor;
        System.out.println("o resto da divisão é: "+ resto);

        float raizquadrada = (float) Math.sqrt(dividendo);
        System.out.println("A raiz quandrada do número é:"+ raizquadrada);

    }
}
