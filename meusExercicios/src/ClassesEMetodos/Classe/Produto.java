package ClassesEMetodos.Classe;

public class Produto {

    // ATRIBUTOS

    String nome;
    double preco;
    // instancia estatica 
    static double DESCONTO = 0.25;

    // CONSTRUTORES

    // normalmente com o mesmo nome da classe

    // podem ser chamdados quantos quiser e se aplica a mesma logica de repetição de
    // nome dos metodos

    /* construtores não possuem tipos pq ele não retorn nada */
    /*
     * ao definir parametros nos contrutores, toda vez que a classe é chamda esse
     * parametro deve ser preenchido se não tem parametro não é necessario
     */

    Produto() {
        // assim faz o parametro não ser exigo e assim preendico se caso necessario
    }

    // assim podemos criar o prduto sem precisar chamar um por uma
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial; // esse parametro será exigido na chamda do metodo na outra classe
        preco = precoInicial;
    }


    // METODOS 

    double precoComDesconto() {
        return preco * (1 - DESCONTO);
    }

    /* os metodos podem ter o mesmo nome e tipo mas devem ter difrença de entrada */
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - DESCONTO + descontoDoGerente);
    }


}
