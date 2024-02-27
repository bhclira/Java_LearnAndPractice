// 1. use a extensão Extends Título apoós a declaração
// da calsse Filme para fazê-o HERDAR tudo da classe
// Título; leia-se todo filme é um título

package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // precisa criar o metodo  getClassificacao()
// inicializando atributos eclusivos de filme
    private String nome;
    private String diretor;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // construtores recebe no principal da função na hora de criar objeto
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Duração em Minutos: " + this.duracaoEmMinutos);
        System.out.println("Incluído no Plano: " + this.incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia () {
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    @Override
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    @Override
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public int getClassificacao() { // implementavel
        return (int) pegaMedia() / 2;
    }

    // sobrescrever toString() da classe object mão-de-todas
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

/*
aprenda a usar java doc ou documentação do JAVA:
java doc no google > technical documentation > api
 */

