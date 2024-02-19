public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual;

    public Carro() {
    }

    void exibaFichaTecnica() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }

    int calculeIdade() {
        return this.anoAtual - this.ano;
    }
}
