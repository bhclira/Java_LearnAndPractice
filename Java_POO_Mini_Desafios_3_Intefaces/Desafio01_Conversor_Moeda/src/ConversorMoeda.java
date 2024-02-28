public class ConversorMoeda implements ConversaoFinanceira {
    // atributos dessa classe
    private double valorDolar;
    private double valorEmReal;

    //Getters and Setters
    public double getValorDolar() {
        return valorDolar;
    }
    public double getValorEmReal() {
        return valorEmReal;
    }
    public void setValorEmReal(double valorEmReal) {
        this.valorEmReal = valorEmReal;
    }
    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    // implementacao da interface Conversão Financeira
    @Override
    public double getTotalValor(ConversorMoeda convDolarReal) {
        return this.valorDolar * this.valorEmReal;
    }
}
