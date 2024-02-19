import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite um número para ver se é Positivo ou Negativo: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado < 0) {
            System.out.println("O número digitado é NEGATIVO.");
        } else {
            System.out.println("O número digitado é POSISTIVO.");
        }

    }
}
