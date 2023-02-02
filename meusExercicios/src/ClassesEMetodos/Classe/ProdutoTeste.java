package ClassesEMetodos.Classe;

public class ProdutoTeste {
    public static void main(String[] args) {

           Produto p1 = new Produto();
           // criando estancias
           p1.nome = "Teste Produto";
           p1.preco = 1230;
         
           var p2 = new Produto();
           // criando estancias
           p2.nome = "Teste Produto 2";
           p2.preco = 120;
          
           /* APLOCANDO O DESCONTO A TODOS OS PRODUTOS */ 
           Produto.DESCONTO = 0.50;

           // assim podemos criar estancias sem precisar atribuir a cada uma separadamnete 
           var p3 = new Produto("Pc Gamer", 2500);

 
           System.out.println(p1.nome + " " + p1.precoComDesconto());
           System.out.println(p2.nome + " " + p2.precoComDesconto());
           System.out.println(p3.nome + " " + p3.precoComDesconto());

           double PrecoFinalP1 = p1.precoComDesconto(); // usando a metodo criado na classe produto

           /* aplicando deconsto acional */
           double PrecoFinalP2 = p2.precoComDesconto(0.1); // usando segundo metodo que exige parametro 

           System.out.println("preço com desconto metodo " + p1.precoComDesconto());

         

           System.out.printf("A média do carrinho é = R$ %.2f", (PrecoFinalP1 + PrecoFinalP2) / 2 ); 


    }
}
