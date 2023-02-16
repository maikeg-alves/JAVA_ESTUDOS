package OOP.desafios;

public class Cliente {

    String nome;
    Compra compra = new Compra();

    Cliente(String nome) {
        this.nome = nome;
    }

    void Compra(int quantidade, Produto produto) {
        compra.adicionarCompra(new Item(quantidade, produto));
    }

    String verValorTotal() {
        return String.format("Esse é o valor de todos os itens R$ %.2f", compra.valortotal());
    }

    String verListaDeCompras() {
        return compra.lista(this.nome);
    }

}
