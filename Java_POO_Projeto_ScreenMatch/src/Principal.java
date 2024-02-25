import br.alura.screematch.calculos.CalculadoraDeTempo;
import br.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        // iniciando objeto e atributos
        Filme meuFilme = new Filme("Matrix", 1999);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        // evocando métodos
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        // depois de alterar o acesso na classe e criar o metodo get altere como abaixo.
        // maneira segura e desejavel com MOD DE ACESSO OU VISIBILIDADE PRIVADO

        System.out.println("Media de Avaliações do Filme: " + meuFilme.pegaMedia());
        System.out.println("Duração do Filme: "+ meuFilme.getDuracaoEmMinutos());

    // setando Series
        // esse construtor chama os construtores da Mãe: títulos
            // chame construtores nas categorias filhas alusindo ao super(args)
            // na categoria, mae: crie construtor dos atributos selecionados nome e anoDeLançamento
        Serie lost = new Serie("Lost", 2000); // Classe objeto = new Objeto
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: "+ lost.getDuracaoEmMinutos());

        //setando a calculadora de tempo

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        // a maneira como os métodos se conectam costumam ser chamadas de DESIGN DAS CLASSES
        // o design quando é bonito diz-se que a dependencia é leve, que existe um bom acoplamento

    // CLASSIFICAVEL IMPLEMENTACAO
        // instancia um novo filtro de recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme); // meu filme que está já implementado na Classificavel
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003); // a variavel var faz uma inferencia do tipo declarado
        // filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        //arraylist
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        // pegue e mostre o tamanho da lista
        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        // pegar a primeira posição (de 0 a ?) e nome (lista metodos de fimle na segunda querry.)
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        // sobrescreva o toString na classe Filme
        System.out.println(listaDeFilmes.toString());

        // curso 2 - conceito de construtor: método que tem como função a criação de um objeto em memória
        // posso ja passar alguns parametros para inicializar ele

        // como serie e filme herdam de título faça um construtor em título para usar a herança




            // chamar o java doc pra saber como funciona
            // operaçoes e métodos
            // multithread
            // class object do java.lang - todas as classes sao filhas de object


    }
}

/*
SOBRESCRITA DE MÉTODOS
leia-se: apesar de ter um mesmo metodo com o mesmo nome
na superclasse eu vou usar o da especialização (classe filha)

GLOSSÁRIO:
1. SUPER CLASSE VS. SUBCLASSE
2. CLASSE MÃE VS. CLASSE FILHA
 */
