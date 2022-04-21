package cursoEmVideo;

import java.util.Scanner;

public class SuperCalculadora {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        // RESTO DA DIVISÃO
        int numerador = 0;

        System.out.println("Digite um número:");

        numerador = ler.nextInt();

        int resto = numerador % 2;

        // ELEVADO AO CUBO
        double cubo = Math.pow(numerador, 3);

        // RAIZ QUADRADA
        double rq = Math.sqrt(numerador);

        //RAIZ CUBICA
        double rc= Math.cbrt(numerador);

        // VALOR ABSOLUTO
        int abs = Math.abs(numerador);


        System.out.println("O resto da divisão por 2 é: "+ resto);

        System.out.println("Elevado ao cubo é: "+ cubo);

        System.out.println("A raiz quadrada é: "+ rq);

        System.out.printf("A raiz quadrada formatada é: %.2f",rq); // RESULTADO FORMATADO

        System.out.println();

        System.out.printf("A raiz cúbica é: %.2f",rc);

        System.out.println();

        System.out.printf("O valor absoluto é:"+ abs);
    }
}
