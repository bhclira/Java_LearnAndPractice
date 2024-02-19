public class MediaDouble {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 7.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        // média calculada pelas 3 notas da jaque, paulo e suelen.
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento         
                """ + anoDeLancamento
        ;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2); // fazer casting explicito
        System.out.println(classificacao);
    }
}