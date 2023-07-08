package Dio;
import java.util.Scanner;
	public class MediaAritmetica {
	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 15;
	        int num3 = 20;

	        double media = (num1 + num2 + num3) / 3.0;

	        System.out.println("A média aritmética é: " + media);
	    }
	    
	    

	    public class TurmaIdade {
	        public static void main(String[] args) {
	            Scanner sc = new Scanner(System.in);

	            System.out.println("Digite a idade da primeira pessoa:");
	            int idade1 = sc.nextInt();

	            System.out.println("Digite a idade da segunda pessoa:");
	            int idade2 = sc.nextInt();

	            System.out.println("Digite a idade da terceira pessoa:");
	            int idade3 = sc.nextInt();

	            double mediaIdades = (idade1 + idade2 + idade3) / 3.0;

	            if (mediaIdades >= 0 && mediaIdades <= 25) {
	                System.out.println("A turma é jovem");
	            } else if (mediaIdades >= 26 && mediaIdades <= 60) {
	                System.out.println("A turma é adulta");
	            } else {
	                System.out.println("A turma é idosa");
	            }

	            sc.close();
	        }
	    }

	}
