import java.util.Scanner;

public class MyProject {
    public static void main(String[] args) {
        Scanner lerOpcao = new Scanner(System.in);
        System.out.println("\nBem vindo(a) à sua Conta Corrente no Banco JAVA!\n");

        System.out.println("Seu Saldo Atual é de R$2500,00");

        boolean continuar = true;
        String nomeDoCliente = "José Ricardo";
        String tipoDaConta = "Conta Corrente";
        double saldoDisponivel = 2500;
        double saldoAtualizado = saldoDisponivel;

        System.out.println(
                """
                        *****************************
                        Nome: José Ricardo
                        Tipo da Conta: Conta Corrente
                        Saldo Inicial: R$ 2500,00
                        *****************************
                        """);

        while (continuar = true) {
            System.out.println("Seu Saldo Atualizado = " + saldoDisponivel + "\n");

            System.out.println(
                    """
                            Escolha o Que Deseja fazer no menu abaixo:
                            [1] Sacar Quantia
                            [2] Receber Quantia
                            [3] Transferir Quantia
                            """);
            int opcao = lerOpcao.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o Valor a ser sacado: ");
                    double valorSaque = lerOpcao.nextDouble();
                    saldoAtualizado = (saldoDisponivel - valorSaque);
                    System.out.println("Seu Saldo Atualizado é de: R$ " + saldoAtualizado);
                    saldoDisponivel = saldoAtualizado;
                    break;
                case 2:
                    System.out.println("Digite o Valor Recebido: ");
                    double valorRecebido = lerOpcao.nextDouble();
                    saldoAtualizado = (saldoDisponivel + valorRecebido);
                    System.out.println("Seu Saldo Atualizado é de: R$ " + saldoAtualizado);
                    saldoDisponivel = saldoAtualizado;
                    break;
                case 3:
                    System.out.println("Digite o Valor a ser Transferido: ");
                    double valorTranfer = lerOpcao.nextDouble();
                    saldoAtualizado = (saldoDisponivel - valorTranfer);
                    System.out.println("Seu Saldo Atualizado é de: R$ " + saldoAtualizado);
                    saldoDisponivel = saldoAtualizado;
                    break;
                default:
                    System.out.println("Não existe um mês correspondente ao número escolhido! Digite um número entre 1 a 4.");
                    break;

            }
            System.out.println("Deseja Continuar com o programa? [1] Sim [2] Não");
            int desejaContinuar = lerOpcao.nextInt();

            if (desejaContinuar == 1) {
                continuar = true;
            } else {
                continuar = false;
                break;
            }
        }
    }
}