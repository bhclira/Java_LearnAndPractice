package Mini_Desafio_Lista_Objetos_Distintos;

import Mini_Desafio_Lista_Objetos_Distintos.classes.ContaBancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(200300, 1000);
        ContaBancaria conta2 = new ContaBancaria(200100, 1500);
        ContaBancaria conta3 = new ContaBancaria(200050, 2100);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        System.out.println(listaContas);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("O maior saldo é: " + contaMaiorSaldo.getSaldo() +
                "\nNumero da Conta: " + contaMaiorSaldo.getNumeroDaConta());


    }



}

