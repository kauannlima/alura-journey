import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhação {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Restam "+ (5 - i) + " tentativas");

            System.out.println("Qual número foi sorteado?");

           int numInformado = leitura.nextInt();

           if (numAleatorio > numInformado){
               System.out.println("Número Informado menor que o Número Sorteado");
           } else if (numAleatorio < numInformado) {
               System.out.println("Número Informado maior que o Número Sorteado");
           }else {
               System.out.println("Número correto!!!");
               break;
           }


        }
    }
}
