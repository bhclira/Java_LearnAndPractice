public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    //atributos
    private boolean abanaRabo;

    //metodo abanarRabo
    public void abanarRabo() {
        System.out.println("Cachorro Abanando o Rabo");
    }
}