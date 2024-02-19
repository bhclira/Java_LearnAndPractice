import br.com.alura.screenmatch.modelos.Filme.Filme;

public class Principal {
    public static void main(String[] args) {
        // iniciando objeto e atributos
        Filme favorito = new Filme();

        // setando atributos
        favorito.setNome("Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        // evocando métodos
        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        // depois de alterar o acesso na classe e criar o metodo get altere como abaixo.
        // maneira segura e desejavel com MOD DE ACESSO OU VISIBILIDADE PRIVADO

        System.out.println("Media de Avaliações do Filme: " + favorito.pegaMedia());
    }
}
