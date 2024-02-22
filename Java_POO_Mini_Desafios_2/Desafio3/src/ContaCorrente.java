public class ContaCorrente extends ContaBancaria {

    // atributos da classe-filha
    private double tarifaMensal;

    // construtor da classe-filha
    public ContaCorrente(double saldo, double tarifaMensal) {
        // chama a o construtor da classe-mãe
        super(saldo);
        // inicializa o atributo da classe-filha
        this.saldo = saldo;

        this.tarifaMensal = tarifaMensal;

    }



    public void mostrarAtributos() {
        System.out.println("Saldo da classe-mae: " + super.saldo);
        System.out.println("Saldo da classe-filha: " + this.saldo);
    }

     // GETTERS AND SETTERS

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    // Métodos da classe-filha

    public void cobrarTarifaBancaria(double tarifaMensal) {
        saldo = saldo - (saldo * tarifaMensal);
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. saldo atual: " + saldo);
    }

}
