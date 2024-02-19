// 1. use a extensão Extends Título apoós a declaração
// da calsse Filme para fazê-o HERDAR tudo da classe
// Título; leia-se todo filme é um título

package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    // inicializando atributos eclusivos de filme
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}

/*
aprenda a usar java doc ou documentação do JAVA:
java doc no google > technical documentation > api
 */

