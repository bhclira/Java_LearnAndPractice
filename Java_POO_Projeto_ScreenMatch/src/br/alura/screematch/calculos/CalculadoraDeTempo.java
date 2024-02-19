package br.alura.screematch.calculos;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // incremento puxando  direto da classe mae e descartando
    // os metodos comentados em bloco de abaixo

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    // titulo.getDur >>> importado da CLASSE MAE
    // seja serie seja filme ele chama da subclasse especifica dependente do titulo
    // se for serie ele usa o calculo de serie se filme usa o calculo de filme
    // chamam isso de POLIMORFISMO

    }


}


/* MÉTODOS DESCARTADOS DE CLASSE FILHA PARA INCLUIR @OVERRIDE
public void inclui(Filme f) {
    this.tempoTotal += f.getDuracaoEmMinutos();

public void inclui(Serie s) {
    this.tempoTotal += s.getDuracaoEmMinutos();
*/

/*
aqui temos uma sobrecarga permitida no java. Dois metodos com mesmo nome.
para diferentes classes
Use o Alt + ENTER para fazer o import da classe
 */


// quando o nome é roxo voce pode usar <this.>
// como se trata de um atributo presente nesta classe
// é opcional

// use o CTRL + / para comentar um bloco
// use o CTRL + ALT + O para remover import nao mais utilizados