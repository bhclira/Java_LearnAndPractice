package MIni_Desafio_ArrayLists;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // 3. Adicionando 3 pessoas objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro Cardoso");
        pessoa1.setIdade(22);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Rodolfo Linhares");
        pessoa2.setIdade(38);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Sóstenes da Silva");
        pessoa3.setIdade(29);

        // 2. Criando Arraylist listaDePessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        // 3. Adicionando 3 pessoas a minha lista criada acima utilizando o método .add
        System.out.println(listaDePessoas.add(pessoa1));
        System.out.println(listaDePessoas.add(pessoa2));
        System.out.println(listaDePessoas.add(pessoa3));

        // 4. imprimindo o tamanho da lista pelo método size()
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // 5. imprimindo a primeira pessoa da lista utilizando os métodos conjuntos .get() e .toString()
            // antes, é preciso sobrescrever o método .toString na classe desejada
        System.out.println("Primeira pessoa da lista " + listaDePessoas.get(0).toString());

        // 6. imprimindo a lista completa
        System.out.println("Lista Completa de Pessoas: \n" + listaDePessoas.toString());

    }
}