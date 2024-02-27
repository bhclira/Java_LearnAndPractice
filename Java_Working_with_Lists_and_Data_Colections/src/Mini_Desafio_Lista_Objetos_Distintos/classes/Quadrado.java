package Mini_Desafio_Lista_Objetos_Distintos.classes;

public class Quadrado implements Forma {
    public double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

// sobrescrevendo o método do comportamento CalcularArea() que vem da Interface Forma

}
