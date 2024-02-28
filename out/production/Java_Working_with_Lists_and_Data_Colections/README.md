# Para solidificar esses conceitos, sugerimos atividades práticas (não obrigatórias)  
# que aprimorarão sua compreensão desses princípios fundamentais. Está preparado  
# para aplicar essas ideias?

## Mini_Desafio_Arraylist
- Crie uma classe Pessoa com atributos como nome, idade, e um método toString  
que represente esses atributos;
- No método main da classe br.com.alura.screenmatch.principal.Principal, crie um ArrayList de Pessoa chamado listaDePessoas;
- Adicione pelo menos três pessoas à lista utilizando o método add;
- Imprima o tamanho da lista utilizando o método size;
- Imprima a primeira pessoa da lista utilizando o método get;
- Imprima a lista completa.  
   
## Mini_Desafio_Construtores
- Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista  
de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista  
e recupere um produto pelo índice;  
- Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.  
Em seguida, imprima a lista de produtos utilizando o método System.out.println(); 
- Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os  
atributos. Em seguida, crie objetos Produto utilizando esse novo construtor;  
- Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor  
que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto  
ProdutoPerecivel e imprima seus valores.
  
# Mini_Desafio_Lista_de_Objetos_Distintos  
- Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista;  
- Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe  
Cachorro e faça o casting para a classe Animal;  
- Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do  
tipo correto antes de fazer o casting;  
- Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize  
um loop para calcular e imprimir o preço médio dos produtos;  
- Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,  
Circulo e Quadrado;  
- Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir  
a área de cada forma;  
- Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de  
contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

# Nesse Curso, você aprendeu: 

1. Como representar listas de objetos no Java, com a utilização da classe ArrayList;  
2. A manipular um ArrayList com seus métodos add, size e get;  
3. Os diferentes tipos de classes do Java para representar uma lista;  
4. Como funciona o método toString(), utilizado para representar um objeto em texto;  
5. A passar parâmetros ao instanciar objetos, com a utilização de construtores;  
6. Como funciona o construtor default (padrão) no Java;  
7. Como declarar construtores em uma classe;  
8. A chamar o construtor da classe mãe, com a palavra reservada super;  
9. Como ordenar uma lista no Java, via método Collections.sort;  
10. Que para ordenar objetos que são de classes do nosso projeto, com a classe
Titulo, devemos implementar nela a interface Comparable;  
11. Como implementar corretamente o método compareTo, da interface Comparable,  
para que o Java faça a ordenação correta dos elementos de uma lista;  
12. Que podemos flexibilizar a ordenação de uma lista, via método sort da própria  
interface List, passando como parâmetro um critério de ordenação;  
13. Que a classe ArrayList implementa a interface List, sendo que essa interface  
possui outras implementações, como a classe LinkedList;  
14. Que podemos declarar a variável de uma lista utilizando a interface List,  
ganhando com isso o polimorfismo com a flexibilidade de trocar facilmente a  
implementação sendo instanciada.  
