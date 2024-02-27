package Mini_Desafio_Lista_Objetos_Distintos.classes;

public class ContaBancaria {
    public int numeroDaConta;
    public double saldo;

    public ContaBancaria(double numeroDaConta, double saldo) {
        this.numeroDaConta = (int) numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
