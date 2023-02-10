package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carla"));

        System.out.println(lista.get(0).nome); // pegando item 3 da lista e imprimindo o nome

        for (Usuario u : lista) {
            System.out.println(u); // imprimindo a lista dos usuarios
        }

        // verificando se tem usuario a lista

        System.out.println("Tem ? " + lista.contains(new Usuario("Pietrio"))); // false

    }

}
