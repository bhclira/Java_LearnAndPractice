package Mini_Desafio_Lista_Objetos_Distintos.classes;

public class Circulo implements Forma {
    public double raio;

    @Override
    public double calcularArea() {
        return  3.14 * (raio * raio);
    }
}
