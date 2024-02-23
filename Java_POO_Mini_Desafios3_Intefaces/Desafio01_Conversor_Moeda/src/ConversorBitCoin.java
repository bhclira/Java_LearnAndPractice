public class ConversorBitCoin implements ConversaoFinanceira {
    // implementando Interfac


    // atributos desta classe
    private double valorBitCoin;
    private double valorEmReal;

    // Getters and setters
    public double getValorBitCoin() {
        return valorBitCoin;
    }

    public void setValorBitCoin(double valorBitCoin) {
        this.valorBitCoin = valorBitCoin;
    }

    public double getValorEmReal() {
        return valorEmReal;
    }

    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }

    @Override
    public double getTotalValor(ConversorMoeda convBitReal) {
        return this.valorEmReal / this.valorBitCoin;
    }
}