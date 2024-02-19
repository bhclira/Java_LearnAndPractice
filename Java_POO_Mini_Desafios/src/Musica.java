public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double nota;
    double somaDasAvaliacoes;
    int numeroDeAvaliacoes;
    double mediaDeAvaliacoes;

    public Musica() {
    }

    void exibaFichaTecnica() {
        System.out.println("Nome do Filme: " + this.titulo);
        System.out.println("Nome do Artista: " + this.artista);
        System.out.println("Ano do Lançamento" + this.anoLancamento);
        System.out.println("Avaliação: " + this.nota);
        System.out.println("Media das Avaliações: " + this.mediaDeAvaliacoes);
    }

    void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        ++this.numeroDeAvaliacoes;
    }

    double calculeMedia() {
        this.mediaDeAvaliacoes = this.somaDasAvaliacoes / (double)this.numeroDeAvaliacoes;
        return this.mediaDeAvaliacoes;
    }
}