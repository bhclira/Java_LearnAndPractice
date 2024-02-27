package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Matrix", 1999);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        filmeDoPaulo.avalia(10);
        lista.add(meuFilme);
        meuFilme.avalia(9);
        lista.add(outroFilme);
        outroFilme.avalia(6);
        lista.add(lost);

        Filme f1 = filmeDoPaulo; // referencia ao objeto ou variáveis de referência

        // para percorrer uma ArrayList utilize o laço <foreach>

        for (Titulo item: lista) {  // para cada variavel item dentro da lista
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { // se for filme: mostre.
                System.out.println("Classificação: " + filme.getClassificacao());
            } // else nao mostre

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); // metodo estatico nao precisa de new
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        // definindo outros criterios de comparação
        // é um comparador alguem que sabe comparar
        // comparar por data > função pronta
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        // :: sintaxe para lambdas
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

        // list


    }

}

