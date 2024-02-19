import java.util.Scanner;
import java.util.Random;

public class JogoDaAdvinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numeroGerado = new Random().nextInt(100);

        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        while (tentativas < 5) {

            System.out.println("Digite um Número de 1 a 100 e tente advinhá-lo: ");
            int palpite = leitor.nextInt();

            if (palpite < numeroGerado) {
                System.out.println("Você digitou um número menor que o número SECRETO! Tente utra vez!");
            } else if (palpite > numeroGerado) {
                System.out.println("Você digitou um número maior que o número SECRETO! Tente outra vez!");
            } else {
                System.out.println("Você acertou o número SECRETO em " + tentativas + " tentativas.");
                System.out.println("Fim do Jogo!");
                break;
            }

            tentativas++;

        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu advinha o número Secreto em 5 tentativas! O número Secreto era: " + numeroGerado);
        }

    }
}

/*
Agora é com você! Pratique os conceitos que foram ensinados
ao longo dessa aula com o seguinte desafio:

Crie um programa que simula um jogo de adivinhação, que deve gerar
um número aleatório entre 0 e 100 e pedir para que o usuário tente
adivinhar o número, em até 5 tentativas. A cada tentativa, o programa
deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

 */