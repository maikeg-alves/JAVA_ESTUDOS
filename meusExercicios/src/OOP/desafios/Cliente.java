package OOP.desafios;

public class Cliente {

    String nome;
    Compra compra;

    Cliente(String nome) {
        this.nome = nome;
    }

    void Compra(int quantidade, Produto produto) {
        compra = new Compra(nome, quantidade, produto);
    }

    double valorTotal() {
        double total = 0;
        for (Compra lista : compra.compras) {
            return total = total + (lista.quantidade * lista.produto.preco);
        }
        return total;
    }

    String listaDeCompras() {
        for (Compra lista : compra.compras) {
            return lista.quantidade + " " + lista.produto.preco;
        }

        return null;
    }

}
