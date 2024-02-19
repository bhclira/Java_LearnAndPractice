import br.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // iniciando objeto e atributos
        Filme meuFilme = new Filme();
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
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
        Serie lost = new Serie(); // Classe objeto = new Objeto
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: "+ lost.getDuracaoEmMinutos());

        //setando a calculadora de tempo

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        // a maneira como os métodos se conectam costumam ser chamadas de DESIGN DAS CLASSES
        // o design quando é bonito diz-se que a dependencia é leve, que existe um bom acoplamento

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
