// nome, modelo
// metodos: preço medio, menor maior

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    // MÉTODOS
    public void definirModelo (String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
        // precisa setar antes para nao precisar pegar com get
    }

    public void lerFichaTecnica(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço ano 1: " + preco1);
        System.out.println("Preço ano 2: " + preco2);
        System.out.println("Preço ano 3: " + preco3);
        System.out.println("Maior preço encontrado: " + calculeMaiorPreco());
        System.out.println("Menor preço encontrado: " + calculeMenorPreco());
    }

    public double calculeMenorPreco () {
        double menorPreco = preco1;

        if(preco2 < menorPreco){
            menorPreco = preco2;
        } if (preco3 < menorPreco) {
            menorPreco = preco3;
        }
        return menorPreco;
    }

    public double calculeMaiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > maiorPreco) {
            maiorPreco = preco2;
        } if (preco3 > maiorPreco) {
            maiorPreco = preco3;
        }
        return maiorPreco;
    }

    // GETTERS AND SETTERS


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }
}


