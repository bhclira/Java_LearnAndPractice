/*
Aproveitando o Modelo FILMES para Series:
Verifique o que o FILME ja tem e adicionar somente o que série tem
através das HERANÇAS.

classe MÃE Título > classes filhas : Filme e Serie

 1. colque extends Titulo par aque herde os
 atributos e tenha tudo que tem Titulo;
 2. crie um objeto <Serie serie = new Serie();> na Principal
 */

package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
// adicione atributos que pertence somente a essa classe
    int temporadas;
    int episodiosPorTemporada;
    boolean ativa;
    int minutosPorEpisodio;

// getters and setters

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //métodos


}

