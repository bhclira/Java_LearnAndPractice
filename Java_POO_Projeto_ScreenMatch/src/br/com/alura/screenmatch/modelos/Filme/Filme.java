package br.com.alura.screenmatch.modelos.Filme;

public class Filme {
    // inicializando atributos
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // metodos

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duração em Minutos: " + duracaoEmMinutos);
        System.out.println("Inluido no Plano: " + incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    // fazendo os GETTERS & setters -  ALT + INSERT > GETTERS > ESCOLHA OS ATRIBUTOS DESEJADOS

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }
}

/*
aprenda a usar java doc ou documentação do JAVA:
java doc no google > technical documentation > api
 */

