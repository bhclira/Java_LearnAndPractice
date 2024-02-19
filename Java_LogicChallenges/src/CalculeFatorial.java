import java.util.Scanner;

public class CalculeFatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Vamos calcular o FATORIAL de um número escolhido por você: ");
        int numero = leitura.nextInt();
        int multiplicador = 1;

        for (int i = numero; i > 0; i--) {
            multiplicador *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + multiplicador);
    }
}
