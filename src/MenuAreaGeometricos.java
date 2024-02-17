import java.util.Scanner;

public class MenuAreaGeometricos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Para calcular, em metros, a área digite: [1] quadrado ou [2] círculo: ");
        int escolha = leitura.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu calcular a área do Quadrado! ");
                System.out.println("Digite, primeiro, a medida da sua Base do Quadrado: ");
                double base = leitura.nextDouble();
                System.out.println("Digite, agora, a medida da altura do quadrado: ");
                double altura = leitura.nextDouble();
                double areaQuad = base * altura;
                System.out.println("A área do quadrado calculada é de: " + (int) (areaQuad)); // converter pra int

            case 2:
                System.out.println("Você escolheu calcular a área do Círculo!");
                System.out.println("Digite a medida do raio do Círculo: ");
                double raio = leitura.nextDouble();
                double areaCirc = 3.14 * (Math.pow(raio,2));

                System.out.println("A área do Círculo calculada é de: " + (int) (areaCirc));
        }

        System.out.println("Fim do Programa!");
    }
}
