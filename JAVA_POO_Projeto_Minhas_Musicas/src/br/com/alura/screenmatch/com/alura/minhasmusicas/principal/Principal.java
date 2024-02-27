package br.com.alura.screenmatch.com.alura.minhasmusicas.principal;
import br.com.alura.screenmatch.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.screenmatch.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.screenmatch.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Limelight");
        minhamusica.setArtista("Rush");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("Hipsters Podcast");
        meupodcast.setHost("Paulo");
        meupodcast.setDescricao("blablabla");

        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meupodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);

    }
}
