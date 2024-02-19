import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        Pessoa1.nome = "Breno Henrique";
        Pessoa1.idade = 43;
        Pessoa1.exibaMensagem();
        Calculadora Calculo1 = new Calculadora();
        System.out.println("Digite o número que deseja calcular o dobro: ");
        Scanner num = new Scanner(System.in);
        Calculo1.numero = num.nextInt();
        System.out.println("O resultado do calculo foi: " + Calculo1.calculeDobro());
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Money For Nothing";
        minhaMusica.artista = "Dire Straits";
        minhaMusica.anoLancamento = 1981;
        minhaMusica.nota = 9.5;
        minhaMusica.somaDasAvaliacoes = 0.0;
        minhaMusica.numeroDeAvaliacoes = 0;
        minhaMusica.exibaFichaTecnica();
        minhaMusica.avalia(8.0);
        minhaMusica.avalia(7.0);
        minhaMusica.avalia(10.0);
        System.out.println("Valor da Media: " + minhaMusica.calculeMedia());
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Honda Fit";
        meuCarro.cor = "Branca";
        meuCarro.ano = 2019;
        meuCarro.anoAtual = 2024;
        meuCarro.exibaFichaTecnica();
        System.out.println("A idade do carro é: " + meuCarro.calculeIdade());
        Aluno novoAluno = new Aluno();
        novoAluno.nome = "Astrogildo Orleans e Bragança";
        novoAluno.idade = 17;
        novoAluno.exibaInfoAluno();
    }
}