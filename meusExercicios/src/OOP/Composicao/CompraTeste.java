package OOP.Composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.adicionarItem("Caneta", 20, 7.32);
        compra1.adicionarItem("Borracha", 12, 3.32);
        compra1.adicionarItem("Caderno", 3, 18.32);

        System.out.println(compra1.itens.size());

        System.out.printf("R$ %.2f", compra1.obterValorTotal());

    }
}
