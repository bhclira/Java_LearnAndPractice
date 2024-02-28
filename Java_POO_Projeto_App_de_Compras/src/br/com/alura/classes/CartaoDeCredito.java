package br.com.alura.classes;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // depois voce precisa ir decrementando o limite
        this.compras = new ArrayList<>();
    }
    public boolean lancaCompra (Compra compra) {
        if (this.saldo > compra.getValor()) { // se verdadeiro
            this.saldo -= compra.getValor(); // diminua do saldo o valor da compra
            this.compras.add(compra); // adicione na lista compras o objeto compra
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }


}

