import java.util.Scanner;

public class LeituradeStringsInteiros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner (System.in);

        // leitura de String
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        // leitura de inteiros
        System.out.println("Qual o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        //
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}