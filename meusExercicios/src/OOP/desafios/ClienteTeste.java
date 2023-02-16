package OOP.desafios;

public class ClienteTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Batata", 1.2);
        Produto produto2 = new Produto("Pão", 6.2);
        Produto produto3 = new Produto("Queijo", 18.2);

        Cliente cliente1 = new Cliente("Maike");
        cliente1.Compra(2, produto3);
        cliente1.Compra(1, produto1);
        /* cliente1.Compra(1, produto2); */

        System.out.print(cliente1.listaDeCompras());

        /*
         * for (Item item : itens.lista) {
         * System.out.println(item.produto.nome);
         * }
         * Cannot assign field "nomeCliente" because "this.compra" is null
         */

        /*
         * 
         * cliente.compra(2, produ1)
         * 
         * cliente.compra.valortotal() // valor total da compra é r$ xxxx
         * 
         * Produto produto1 = new Produto("nomes", 1.2);
         * 
         * Item itens = new Item(3, produto1);
         * 
         * System.out.println(itens);
         */

    }
}
