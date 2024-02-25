package Mini_Desafio_Constructors;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Samsung Galaxy S24", 5000);
        Produto produto2 = new Produto("Tablet Sanmsung Galaxy Tab S6", 3800);
        Produto produto3 = new Produto("Laptop Samsung Galaxy 360", 7000);

    // 1.
        // crie lista com os produtos
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        // imprima o tamanho da lista
        System.out.println("Tamanho da listaDeProdutos " + listaDeProdutos.size() + " produtos.\n");
        // recupere um produto pelo indice
        System.out.println("Recupere produto pelo índice 2: " + listaDeProdutos.get(2));

    // 2.
        // implemente o método toString() na classe Produto
        // imprima lista de produtos
        System.out.println(listaDeProdutos.toString());

    // 3. crie construtor que permita parametros para inicializar os atributos direto na instanciação do objeto:
    // criado na classe Produto

    // 4.
        // crie classe produtoPerecivel que herde de produto: feito
        // adicionar atributo dataDeValidade: feito
        // crie construtor que utilize construtor da classe-mãe (super): feito.
        // criar objeto produtoPerecivel.
        ProdutoPerecivel produtoPer = new ProdutoPerecivel("Geleia de Morango", 20, "23/02/2024");
        // imprima seus valores
        System.out.println(produtoPer.toString());






    }
}
