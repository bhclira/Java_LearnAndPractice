
import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para saber se é Par ou Ímpar: ");
        int numero = leitura.nextInt();

        if (numero%2 != 0) {
            System.out.println("O número digitado é ÍMPAR!");
        } else {
            System.out.println("O número digitado é PAR!");
        }
    }
}
