package OOP.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String nome;
    int quantidade;
    Produto produto;

    List<Compra> compras = new ArrayList<>();

    Compra(String nome, int quantidade, Produto produto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.produto = produto;
        this.adicionarCompra(this);
    }

    void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

}
