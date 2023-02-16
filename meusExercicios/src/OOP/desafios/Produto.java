package OOP.desafios;

public class Produto {

    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " R$ " + preco;
    }

}
