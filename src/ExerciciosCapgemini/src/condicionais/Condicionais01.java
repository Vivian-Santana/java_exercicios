package capgemini;

import java.util.Scanner;

public class Condicionais01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        float velocidade = 0, vMedia = 70, vGrave = 90,vGravissima = 110;
        double vLeve = 50 * 1.1; //acrécimo de 10% de tolerância do radar

        System.out.println("Informe a velocidade do veículo:");
        velocidade = ler.nextFloat();

        if (velocidade <= vLeve) {
            System.out.println("Isento");
        }
        else if (velocidade <= vMedia) {
            System.out.println("Três pontos na carteira");
        }
        else if(velocidade <= vGrave) {
            System.out.println("Quatro pontos na carteira");
        }
        else if (velocidade <= vGravissima){
            System.out.println("Cinco pontos na carteira");
        }
        else{
            System.out.println("Sete pontos na carteira");
        }
    }
}
