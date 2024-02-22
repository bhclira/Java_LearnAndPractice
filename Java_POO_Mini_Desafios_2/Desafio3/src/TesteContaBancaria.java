import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {

    boolean continuar = true;
    Scanner scanner = new Scanner(System.in);
    /*
    intanciar objeto cb com os atributos setados na própria instanciação:
    <double saldo, String numeroConta, String titular, String banco>
    pq aprendi que um construtor rege o como o compilador deve instnaciar
    como ele deve instanciar nosso novo objeto. Isso evita setar os valores
    dos atributos da classe no main em sequência através de muitos SETTERS.
    */
        ContaBancaria cb1 = new ContaBancaria(2500);
        cb1.setTitular("James Gosling");
        cb1.setBanco("Banco da Praça");
        cb1.setNumeroConta("189.882-x");
        // chamar método para descrever os detalhes do objeto instanciado
        cb1.listarInfo();

        while(continuar == true) {

            // chamar o menu do banco
            cb1.mostarMenu();
            //escolher ação a ser realizada
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1: // atualizar saldo
                    System.out.println("Atualize seu saldo inicial: ");
                    double novoSaldo = scanner.nextDouble();
                    cb1.definirSaldo(novoSaldo);
                    break;
                case 2: // depositar quantia
                    System.out.println("Digite o valor do depósito: ");
                    double quantia = scanner.nextDouble();
                    cb1.depositarQuantia(quantia);
                    break;
                case 3: // transferir quantia
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valor = scanner.nextDouble();
                    cb1.transferirQuantia(valor);
                    break;
                case 4: // receber quantia
                    System.out.println("Digite o valor que irá receber: ");
                    double receber = scanner.nextDouble();
                    cb1.receberQuantia(receber);
            }

            System.out.println("""
                    \nSelecione a opção desejada:
                    [1] Fazer outra Operação
                    [2] Sair do Programa 
                    """);

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }
}

/*
        // inializar objeto da classe filha com os valores:
        // double Saldo e double tarifaMensal
        ContaCorrente cc = new ContaCorrente(5250, 0.02);

        // chamar método da classe-mãe através do objeto da classe filha
//        cc.mostrarSaldoMae();

        // chamar método da classe-filha que utiliza atributos da classe mãe
//        cc.mostrarAtributos();


//        cc.depositarQuantia(2000);
//        cc.depositarQuantia(750);
//
//        cc.depositarQuantia(500);
//        cc.cobrarTarifaBancaria(0.02);
*/

