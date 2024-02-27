package br.com.alura.screenmatch.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    // atributos dessa classe
    private String album;
    private String artista;
    private String genero;

    // getters
    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    // setters
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else return 7;
        }
}

