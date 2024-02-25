package MIni_Desafio_ArrayLists;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "{nome = '" + this.nome + "'" +
                ", idade = " + this.idade + " anos}";
    }
}
