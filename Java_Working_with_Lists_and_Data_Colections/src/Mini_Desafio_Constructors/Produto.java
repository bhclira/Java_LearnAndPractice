package Mini_Desafio_Constructors;

public class Produto {
    private String nome;
    private double preco;

    // 3. criando construtor que permita valores ao instanciar o objeto produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "nome = '" + nome + '\'' +
                ", preço = " + preco + " reais}";
    }

}
