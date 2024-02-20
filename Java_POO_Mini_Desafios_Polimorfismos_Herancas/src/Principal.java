public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.definirModelo("Honda Fit");
        meuCarro.definirPrecos(60000, 65000,70000);
        meuCarro.lerFichaTecnica();


        ModeloCarro carro = new ModeloCarro();
        carro.setContadorDePrecos(3);
        carro.someTodosPrecos(60000, 65000, 70000);

        System.out.println("Soma de todos os Preços: " + carro.getSomaPrecos());
        System.out.println("Contador: " + carro.getContadorDePrecos());
        System.out.println("Media de Preços dos carros: " + carro.calculeMediaPreco());





    }
}
