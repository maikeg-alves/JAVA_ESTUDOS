package OOP.desafios;

public class ClienteTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Batata", 1.2);
        Produto produto2 = new Produto("Pão", 6.2);
        Produto produto3 = new Produto("Queijo", 18.2);

        Cliente cliente1 = new Cliente("Maike");

        cliente1.Compra(2, produto3);
        cliente1.Compra(1, produto1);
        cliente1.Compra(1, produto2);

        System.out.println(cliente1.verListaDeCompras());
        System.out.println(cliente1.verValorTotal());

        Cliente cliente2 = new Cliente("Paula");

        cliente2.Compra(3, produto2);
        cliente2.Compra(2, produto1);

        System.out.println(cliente2.verListaDeCompras());
        System.out.println(cliente2.verValorTotal());

    }
}
