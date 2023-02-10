package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {


   
    public static void main(String[] args) {

        HashSet consjunto = new HashSet();

        /* ⚠️ ele está dando erro pq não foi definido um unico tipo mas sim varios  ⚠️ */

        consjunto.add(1.2); // -> double > Double
        consjunto.add(true); // -> boolean -> Boolean
        consjunto.add("teste"); // -> String
        consjunto.add(1); // -> int -> Integer
        consjunto.add('x'); // -> char -> caracher

        System.out.println("tamanho é " +consjunto.size()); // 5

        consjunto.add("teste"); // -> String 

        System.out.println("tamanho é " +consjunto.size()); // 5 -> ele não adiciona elementos repetidos 

        consjunto.add("Teste"); // -> String 
        
        System.out.println("tamanho é " +consjunto.size()); // 6 -> ele diferencia caixa baixa de caixa alta 

        System.out.println("tamanho é " +consjunto.remove("teste")); // 5 -> removendo item da lista  

        System.out.println("tamanho é " +consjunto.contains(1)); // true -> procurando valores dentro da lista   


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);


        System.out.println(nums); // [1, 2, 3]
        System.out.println(consjunto); // [1.2, 1, x, Teste, true]

        consjunto.addAll(nums); // junstando dois sets em um 


        System.out.println(consjunto); // [1.2, 1, 2, 3, x, Teste, true]

        consjunto.clear(); // [] -> limpa o cojunto 

        System.out.println(consjunto); // []
    }
}
