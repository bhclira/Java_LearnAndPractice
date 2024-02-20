public class TesteAnimais {
    public static void main(String[] args) {
        Animal animal = new Animal();


        Gato gato = new Gato();
        gato.emitirSom();
        gato.aranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}