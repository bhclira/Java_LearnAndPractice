// CLASSE-MÃE DE TODAS
package br.com.alura.minhasmusicas.modelos;

public class Audio {
    // atributos desta e de todas as classes (herança)
    private String titulo; // unico que vou deixar setar
    private int totalReproducoes;
    private int totalCurtidas;
    // posso querer sobrescrever isso no futuro
    private int classificacao;

    // MÉTODO dessa classe
    public void curte() {
        this.totalCurtidas++;
    }
    // MÉTODO dessa classe
    public void reproduz() {
        this.totalReproducoes++;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
