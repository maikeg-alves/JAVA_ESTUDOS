package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {
    public static void main(String[] args) {


        // aqui definimos o tipo da listDeAprovaos <tipo string > 
        // o Hashset recebe o operador daimon "<>" que é a mesma coisa que o set está recebendo 


        /* Set<String> listDeAprovaos  = new HashSet<>(); */ // lista não ordenada
        SortedSet <String> listDeAprovaos = new TreeSet<>(); // lista ordenada    

        listDeAprovaos.add("valor");
        listDeAprovaos.add("João");
        listDeAprovaos.add("Paulo");
        listDeAprovaos.add("Maria");


        for (String candidatos: listDeAprovaos) {
            System.out.println(candidatos);
        }

        // usando outro tipo e em uma lista não ordenada 

        Set<Integer> nums  = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(444); // vai carregar por ultimo por conta do seu peso 
        nums.add(3);
        nums.add(4);


        System.out.println("\nContando");
        for (int contando: nums) {
            System.out.println(contando);
        }

    }
}
