package MIni_Desafio_Ordenacao_Eficiente_De_Dados;

public class Titulo implements Comparable <Titulo>{
    public String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do título: " + nome;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    public String getNome() {
        return nome;
    }
}
