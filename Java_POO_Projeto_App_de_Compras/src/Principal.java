import br.com.alura.classes.CartaoDeCredito;
import br.com.alura.classes.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Limite do Cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair!=0) {
            System.out.println("Digite a Descrição do Item da Compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o Valor da Compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo Insuficiente!");
                sair = 0;
            }

            System.out.println("************************");
            System.out.println("COMPRAS REALIZADAS:\n");

            Collections.sort(cartao.getCompras());
            // para usas Collections.sort()
            // precisa usar o implements comparable em compras

            for (Compra c : cartao.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }

            System.out.println("\n ************************");

            System.out.println("\n SAldo do Cartão: " + cartao.getSaldo());
        }

    }
}