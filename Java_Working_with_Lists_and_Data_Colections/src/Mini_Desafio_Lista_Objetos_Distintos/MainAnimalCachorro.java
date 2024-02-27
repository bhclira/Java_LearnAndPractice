package Mini_Desafio_Lista_Objetos_Distintos;
import Mini_Desafio_Lista_Objetos_Distintos.classes.Animal;
import Mini_Desafio_Lista_Objetos_Distintos.classes.Cachorro;

import java.util.ArrayList;

public class MainAnimalCachorro {
    public static void main(String[] args) {
    //EXERCICIO 1
        // criando arraylist de strings
        ArrayList<String> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add("Bart");
        listaDeCachorros.add("Diana");
        listaDeCachorros.add("Judith");
        // foreach
        for (String item : listaDeCachorros) {
            System.out.println(item);
        }
    // EXERCÍCIO 2 *** Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida
    // crie um objeto da classe Cachorro e faça o casting para a classe Animal. ***

        Cachorro cachorro = new Cachorro();
        //Animal animal = (Animal) cachorro; // o animal que eu referenciei na vdd é um objeto cachorro

    // EXERCÍCIO 3 *** Modifique o Exercício 2 para incluir uma verificação usando instanceof para
    // garantir que o objeto seja do tipo correto antes de fazer o casting.

        Animal animal= new Cachorro();
        if (animal instanceof Cachorro) {
            Cachorro cachorro1 = (Cachorro) animal;
            // agora voce pode usar o objeto 'cachorro' como um Cachorro
        } else {
            System.out.println("O objeto não é um cachorro");
        }
    }
}
