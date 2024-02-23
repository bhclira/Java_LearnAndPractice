/*
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // CONVERSOR MOEDA
        ConversorMoeda convDolarReal = new ConversorMoeda();
        convDolarReal.setValorDolar(4.95);
        System.out.println("Digite o Valor em Reais a Ser convertido em Dolar: ");
        double valorRealDolar = scanner.nextDouble();
        convDolarReal.setValorEmReal(valorRealDolar);

        // chamando funcao da interface a partir do objeto da classe implementada
        convDolarReal.getTotalValor(convDolarReal);

    // BITCOIN
        ConversorBitCoin convBitReal = new ConversorBitCoin();
        convBitReal.setValorBitCoin(300000);
        System.out.println("Digite Valor em Reais a ser convertido em BTC: ");
        double valorRealBit = scanner.nextDouble();
        convBitReal.setValorBitCoin(valorRealBit);

        //chamando
        convBitReal.getTotalValor(convBitReal);


    }
}