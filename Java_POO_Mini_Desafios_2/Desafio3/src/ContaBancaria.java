public class ContaBancaria {

// atributos da classe-mãe
    private String numeroConta;
    protected double saldo;
    private String titular;
    private String banco;


// construtor da classe mãe para atributo saldo
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

// Métodos da Classe-Mãe
    // listar info da conta
    public void listarInfo() {
        System.out.println("\nBem Vindo ao " + this.banco);
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo inicial: " + this.saldo);
    }

    // mostrar menu de acesso
    public void mostarMenu() {
        System.out.println("""
                \n
                Selecione a opção desejada: 
                [1] Atualizar Saldo
                [2] Depositar Quantia
                [3] Transferir Quantia
                [4] Receber Quantia
                \n
                Digite a opcão desejada: 
                """);
    }

    // definir novo saldo da conta
    public void definirSaldo(double saldo) {
        this.saldo = saldo;
    }

    // depositar quantia na conta
    public void depositarQuantia(double valor) {
        saldo += valor;
        System.out.println("Depósito de valor " + valor + " realizado. Saldo Atual: " + saldo);
    }

    // transferir quantia para a conta
    public void transferirQuantia(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    // receber quantia na conta
    public void receberQuantia (double valor) {
        saldo = saldo + valor;
        System.out.println("Transferencia de " + valor + " realizada com sucesso. Saldo Atual: " + saldo);
    }
    // consultar o saldo da conta
    public void consutarSaldo(double valor) {
        System.out.println("Saldo Atual: " + saldo);
    }

    // GETTERS AND SETTERS DOS OUTROS ATRIBUTOS MENOS SALDO
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
