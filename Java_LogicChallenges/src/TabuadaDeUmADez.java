import java.util.Scanner;

public class TabuadaDeUmADez {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;

        System.out.println("Bem vindo ao Tabuada de 1 a 10!");

        while (numero != 1) {
            System.out.println("Digite o número desejado para obter sua tabuada: ");
            numero = leitura.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.println(" : " + numero + " * " + i + " = " + (numero*i));
            }
        }
    }
}