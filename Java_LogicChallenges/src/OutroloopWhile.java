import java.util.Scanner;

public class OutroloopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double nota = 0;
        double media = 0;
        int contadorDeNotas = 0;

        // laços de repetição com parada tipo WHILE

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                contadorDeNotas++; // usar acumulador declare em zero no inicio
            }
        }

        System.out.println("Média de avaliações " + media/contadorDeNotas);
    }

}
