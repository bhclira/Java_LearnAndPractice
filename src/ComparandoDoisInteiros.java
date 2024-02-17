
import java.util.Scanner;

public class ComparandoDoisInteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um Primeiro Número para a comparação: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite um Segundo Número para a comparação: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("O Primeiro é Igual ao Segundo Número!");
        } else if (primeiroNumero != segundoNumero) {
            if (primeiroNumero > segundoNumero) {
                System.out.println("O primeiro número: " + primeiroNumero + ", é maior que o segundo: " + segundoNumero + ".");
            } else {
                System.out.println("O primeiro número: " + primeiroNumero + " é menor que o segundo: " + segundoNumero + ".");
            }

        }
    }
}
