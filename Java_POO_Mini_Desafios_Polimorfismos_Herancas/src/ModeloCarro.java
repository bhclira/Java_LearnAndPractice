import org.w3c.dom.ls.LSOutput;

public class ModeloCarro extends Carro {
    private double somaPrecos;
    private double contadorDePrecos;
    private double media;

    public double someTodosPrecos(double preco1, double preco2, double preco3) {
        somaPrecos = preco1 + preco2 + preco3;
        return somaPrecos;
    }

    public double calculeMediaPreco() {
        media = somaPrecos / contadorDePrecos;
        return media;
    }

    public double getSomaPrecos() {
        return somaPrecos;
    }

    public void setContadorDePrecos(double contadorDePrecos) {
        this.contadorDePrecos = contadorDePrecos;
    }

    public double getContadorDePrecos() {
        return contadorDePrecos;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
