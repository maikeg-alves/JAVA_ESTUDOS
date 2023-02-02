package ClassesEMetodos.Classe;

public class ProdutoTeste {
    public static void main(String[] args) {

           Produto p1 = new Produto();
           p1.nome = "Teste Produto";
           p1.preco = 1230;
           p1.desconto = 0.25;

           var p2 = new Produto();
           p2.nome = "Teste Produto 2";
           p2.preco = 120;
           p2.desconto = 0.25;

           

           System.out.println(p1.nome);
           System.out.println(p2.nome);

           double PrecoFinalP1 = p1.preco * (1 - p1.desconto);
           double PrecoFinalP2 = p2.preco * (1 - p2.desconto);

           System.out.printf("A média do carrinho é = R$ %.2f", (PrecoFinalP1 + PrecoFinalP2) / 2 ); 


    }
}
