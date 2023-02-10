package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // add e offer -> adiciona elementos a fila

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Paulo");
        fila.offer("Carlos");
        fila.add("Henrique");
        fila.offer("Maria");

        System.out.println(fila.peek()); // pega o primeiro elemento da fila
        System.out.println(fila.element()); // pega o primeiro elemento da fila

        System.out.println(fila.poll()); // pega o primeiro e remove ele // ANA
        System.out.println(fila.poll()); // pega o primeiro e remove ele // BIA

    }
}
