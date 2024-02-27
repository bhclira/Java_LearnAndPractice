package br.com.alura.screenmatch.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    // atributos dessa classe
    private String host; // apresentador
    private String descricao; // preview do assunto

    // getters
    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    // setters
    public void setHost(String host) {
        this.host = host;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else return 8;
    }
}
