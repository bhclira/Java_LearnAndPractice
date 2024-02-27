package MIni_Desafio_Ordenacao_Eficiente_De_Dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /* EXERCÍCIO 1
    Crie uma lista de números inteiros e utilize o método Collections.
    sort para ordená-la em ordem     crescente. Em seguida, imprima a
    lista ordenada.
     */
    public static void main(String[] args) {
        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(0, 5);
        listaDeInteiros.add(1, 2);
        listaDeInteiros.add(2, 8);
        listaDeInteiros.add(3, 1);

        Collections.sort(listaDeInteiros);
        System.out.println("Exercício 01 - Lista ordenada: " + listaDeInteiros);

/* EXERCÍCIO 2:
Crie uma classe Titulo com um atributo nome do tipo String. Implemente
a interface Comparable na classe para que seja possível ordenar uma lista
de objetos Titulo.
 */
        Titulo titulo1 = new Titulo("Fuga das Galinhas");
        Titulo titulo2 = new Titulo("O Rei Leão");
        Titulo titulo3 = new Titulo("Suburra, sangue em Roma");
        Titulo titulo4 = new Titulo("Stranger Things");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        Collections.sort(listaDeTitulos);

        for (Titulo item : listaDeTitulos) {
            System.out.println(item);
        }

/* EXERCÍCIO 3
No Exercício 2, crie alguns objetos da classe Titulo e adicione-os
a uma lista. Utilize o método Collections.sort para ordenar a lista e,
em seguida, imprima os títulos ordenados.
 */
        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(new Titulo("D"));
        listaTitulo.add(new Titulo("A"));
        listaTitulo.add(new Titulo("B"));

        Collections.sort(listaTitulo);

        for (Titulo titulo : listaTitulo) {
            System.out.println(titulo.nome);
        }

/* EXERCÍCIO 4
Crie uma lista utilizando a interface List e instancie-a tanto como
ArrayList quanto como LinkedList. Adicione elementos e imprima a lista,
mostrando que é possível trocar facilmente a implementação.
 */
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");
        listaArrayList.add("Elemento 3");

        List<String> listaLinkedList = new LinkedList<>();

        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("Exercício 4: \n");
        System.out.println("Arraylist: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

/* EXERCÍCIO 5
Modifique o Exercício 4 para declarar a variável de lista como a interface
List, demonstrando o uso de polimorfismo.
 */
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("Exercício 05: ");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
