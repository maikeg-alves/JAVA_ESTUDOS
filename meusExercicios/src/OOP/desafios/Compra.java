package OOP.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> compras = new ArrayList<>();

    Compra() {
    }

    Compra(int quantidade, Produto produto) {
        this.adicionarCompra(new Item(quantidade, produto));
    }

    void adicionarCompra(Item item) {
        compras.add(item);
        item.compra = this;
    }

    double valortotal() {
        double total = 0;
        for (Item item : compras) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

    String lista(String nome) {
        String lista = String.format("%s, essa é sua lista de compras:\n\n", nome);
        for (Item item : compras) {
            lista += String.format("%s %d  %.2f \n", item.produto.nome, item.quantidade, item.produto.preco);
        }
        return lista;
    }

}
