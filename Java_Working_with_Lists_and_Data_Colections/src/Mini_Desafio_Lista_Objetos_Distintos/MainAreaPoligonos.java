package Mini_Desafio_Lista_Objetos_Distintos;

import Mini_Desafio_Lista_Objetos_Distintos.classes.Circulo;
import Mini_Desafio_Lista_Objetos_Distintos.classes.Forma;
import Mini_Desafio_Lista_Objetos_Distintos.classes.Quadrado;


import java.util.ArrayList;

public class MainAreaPoligonos {
    public static void main(String[] args) {

    /*
    EXERCÍCIO 05
    Crie uma interface Forma com um método calcularArea(). Implemente a interface
    em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de
    formas (objetos da interface Forma) e utilize um loop para calcular e imprimir
    a área de cada forma.
     */

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // criando lista de formas que contém os objetos referentes aos polígonos
        ArrayList<Forma>  listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        // calcular e imprimir área
        for (Forma forma : listaDeFormas) {
            System.out.println("Area: " + forma.calcularArea());

        }
    }



}

